package fr.dauphine.eu.RulesBuilder;

import fr.dauphine.eu.context.Context;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.lang.reflect.Field;

public class RuleCodeGenerator {

    public void generateCode(String rulesFilePath, String outputPath) throws Exception {
        // Read the rules from the file
        String ruleText = new String(Files.readAllBytes(Paths.get(rulesFilePath)));
        CharStream input = CharStreams.fromString(ruleText);
        FarmLexer lexer = new FarmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FarmParser parser = new FarmParser(tokens);
        ParseTree tree = parser.frl();

        RuleVisitor visitor = new RuleVisitor();
        String javaCode = visitor.visit(tree);

        Set<String> attributes = visitor.getAttributes();

        StringBuilder contextCode = new StringBuilder("Context context = new Context();\n");
        contextCode.append("java.util.Scanner scanner = new java.util.Scanner(System.in);\n");

        // Reflectively determine the type of each attribute in the Context class
        Class<?> contextClass = Context.class;
        for (String attribute : attributes) {
            Field field = contextClass.getDeclaredField(attribute);
            String fieldType = field.getType().getSimpleName();

            contextCode.append("System.out.print(\"Entrez la valeur de '").append(attribute).append("': \");\n");

            switch (fieldType) {
                case "int":
                    contextCode.append("context.set").append(capitalize(attribute)).append("(scanner.nextInt());\n");
                    break;
                case "double":
                    contextCode.append("context.set").append(capitalize(attribute)).append("(scanner.nextDouble());\n");
                    break;
                case "boolean":
                    contextCode.append("context.set").append(capitalize(attribute)).append("(scanner.nextBoolean());\n");
                    break;
                case "String":
                    contextCode.append("context.set").append(capitalize(attribute)).append("(scanner.nextLine());\n");
                    break;
                default:
                    throw new IllegalArgumentException("Type non supporté: " + fieldType);
            }
        }

        String fullJavaCode = "package fr.dauphine.eu;\n" +
                "import fr.dauphine.eu.context.Context;\n" +
                "public class GeneratedRule {\n" +
                "    public static void main(String[] args) {\n" +
                contextCode.toString() +
                "        GeneratedRule ruleExecutor = new GeneratedRule();\n" +
                javaCode +
                "        System.out.println(\"Results after rules:\");\n";

        for (String attribute : attributes) {
            fullJavaCode += "        System.out.println(\"" + capitalize(attribute) + " après les règles: \" + context.get" + capitalize(attribute) + "());\n";
        }

        fullJavaCode += "    }\n" +
                "}\n";

        // Save and compile the generated code
        saveToFile(outputPath, fullJavaCode);
        compileAndRun(outputPath);
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private void saveToFile(String fileName, String content) throws Exception {
        Files.write(Paths.get(fileName), content.getBytes());
    }

    private void compileAndRun(String filePath) throws Exception {
        // Compile the generated Java file
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, filePath);
        if (result != 0) {
            throw new RuntimeException("Compilation failed.");
        }

        // Execute the compiled class
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "fr.dauphine.eu.GeneratedRule");
        pb.directory(new java.io.File("C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java"));
        Process process = pb.start();
        process.waitFor();
    }
}
