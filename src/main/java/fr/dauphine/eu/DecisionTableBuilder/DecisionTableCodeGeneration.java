package fr.dauphine.eu.DecisionTableBuilder;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DecisionTableCodeGeneration {

    public void generateCode(String decisionTablePath, String outputPath) throws Exception {

        List<Map<String, String>> decisionTable = DecisionTableParser.parseDecisionTable(decisionTablePath);

        StringBuilder conditions = new StringBuilder();
        StringBuilder actions = new StringBuilder();
        Set<String> attributes = new HashSet<>();

        // Extract conditions, actions, and attributes
        for (int i = 0; i < decisionTable.size(); i++) {
            Map<String, String> row = decisionTable.get(i);

            conditions.append("private boolean condition").append(i + 1).append("(Context context) {\n")
                    .append("    return ").append(replaceAttributesWithGetters(row.get("Condition1"))).append(" && ")
                    .append(replaceAttributesWithGetters(row.get("Condition2"))).append(" && ")
                    .append(replaceAttributesWithGetters(row.get("Condition3"))).append(";\n}\n");

            actions.append("private void action").append(i + 1).append("(Context context) {\n")
                    .append("    ").append(replaceAttributesWithSetters(row.get("Action1"))).append(";\n")
                    .append("    ").append(replaceAttributesWithSetters(row.get("Action2"))).append(";\n}\n");

            attributes.add(row.get("Action1").split(" ")[0]);
            attributes.add(row.get("Action2").split(" ")[0]);
        }

        StringBuilder contextCode = new StringBuilder("Context context = new Context();\n");
        contextCode.append("java.util.Scanner scanner = new java.util.Scanner(System.in);\n");
        for (String attribute : attributes) {
            contextCode.append("System.out.print(\"Entrez la valeur de '").append(attribute).append("': \");\n")
                    .append("context.set").append(capitalize(attribute)).append("(scanner.nextInt());\n");
        }

        String generatedCode = "package fr.dauphine.eu;\n" +
                "import fr.dauphine.eu.context.Context;\n" +
                "public class GeneratedDecisionTableRule {\n" +
                "    public static void main(String[] args) {\n" +
                contextCode.toString() +
                "        GeneratedDecisionTableRule ruleExecutor = new GeneratedDecisionTableRule();\n" +
                "        // Execute conditions and actions\n";

        for (int i = 0; i < decisionTable.size(); i++) {
            generatedCode += "        if (ruleExecutor.condition" + (i + 1) + "(context)) {\n" +
                    "            ruleExecutor.action" + (i + 1) + "(context);\n" +
                    "        }\n";
        }

        generatedCode += "        System.out.println(\"Results after rules:\");\n";
        for (String attribute : attributes) {
            generatedCode += "        System.out.println(\"" + capitalize(attribute) + " après les règles: \" + context.get" + capitalize(attribute) + "());\n";
        }

        generatedCode += "    }\n" +
                conditions.toString() +
                actions.toString() +
                "}\n";

        // Save and compile generated code
        saveToFile(outputPath, generatedCode);
        compileAndRun(outputPath);
    }

    private String replaceAttributesWithGetters(String condition) {
        String[] parts = condition.split(" ");
        if (parts.length == 3) {
            return "context.get" + capitalize(parts[0]) + "() " + parts[1] + " " + parts[2];
        }
        return condition;
    }

    private String replaceAttributesWithSetters(String action) {
        String[] parts = action.split("=");
        if (parts.length == 2) {
            String attribute = parts[0].trim();
            return "context.set" + capitalize(attribute) + "(" + replaceAttributesWithGetters(parts[1].trim()) + ")";
        }
        return action;
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
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "fr.dauphine.eu.GeneratedDecisionTableRule");
        pb.directory(new java.io.File("C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java"));
        Process process = pb.start();
        process.waitFor();
    }
}
