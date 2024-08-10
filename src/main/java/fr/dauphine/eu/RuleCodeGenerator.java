package fr.dauphine.eu;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class RuleCodeGenerator {



        public void generateCode(String rulesFilePath, String outputPath) throws Exception {
            // Read the rules from the file
            String ruleText = new String(Files.readAllBytes(Paths.get(rulesFilePath)));
            CharStream input = CharStreams.fromString(ruleText);
            farmLexer lexer = new farmLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            farmParser parser = new farmParser(tokens);
            ParseTree tree = parser.frl();

            RuleVisitor visitor = new RuleVisitor();
            String javaCode = visitor.visit(tree);

            // Dynamically determine the attributes used in the rules
            Set<String> attributes = visitor.getAttributes();

            // Generate context input code
            StringBuilder contextCode = new StringBuilder("Context context = new Context();\n");
            contextCode.append("java.util.Scanner scanner = new java.util.Scanner(System.in);\n");
            for (String attribute : attributes) {
                contextCode.append("System.out.print(\"Entrez la valeur de '").append(attribute).append("': \");\n")
                        .append("context.set").append(capitalize(attribute)).append("(scanner.nextInt());\n");
            }

            // Generate the final Java code
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
