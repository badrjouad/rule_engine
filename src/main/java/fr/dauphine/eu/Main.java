package fr.dauphine.eu;

import fr.dauphine.eu.context.Context;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Lire les règles à partir du fichier
        String ruleText = new String(Files.readAllBytes(Paths.get("src/main/resources/rules.txt")));
        CharStream input = CharStreams.fromString(ruleText);
        farmLexer lexer = new farmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        farmParser parser = new farmParser(tokens);
        ParseTree tree = parser.frl();

        RuleVisitor visitor = new RuleVisitor();
        String javaCode = visitor.visit(tree);

        // Lecture des valeurs d'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        System.out.print("Entrez la valeur de 'amount': ");
        context.setAmount(scanner.nextInt());

        System.out.print("Entrez la valeur de 'montantGPC': ");
        context.setMontantGPC(scanner.nextInt());

        scanner.close();

        // Ajouter les valeurs des attributs au code Java
        String contextCode = "Context context = new Context();\n" +
                "context.setAmount(" + context.getAmount() + ");\n" +
                "context.setMontantGPC(" + context.getMontantGPC() + ");\n";

        // Générer le code Java final
        String fullJavaCode = "package fr.dauphine.eu;\n" +
                "import fr.dauphine.eu.context.Context;\n" +
                "public class GeneratedRule {\n" +
                "    public static void main(String[] args) {\n" +
                contextCode +
                javaCode + "\n" +
                "        System.out.println(\"Amount après les règles: \" + context.getAmount());\n" +
                "    }\n" +
                "}\n";

        // Enregistrer le code généré dans un fichier
        String outputPath = "C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java\\fr\\dauphine\\eu\\GeneratedRule.java";
        Files.write(Paths.get(outputPath), fullJavaCode.getBytes());

        // Compiler et exécuter le code généré
        compileAndRun(outputPath);
    }

    private static void compileAndRun(String filePath) throws Exception {
        // Compiler le fichier Java généré
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, filePath);
        if (result != 0) {
            throw new RuntimeException("Compilation failed.");
        }

        // Exécuter la classe compilée
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "fr.dauphine.eu.GeneratedRule");
        pb.directory(new java.io.File("C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java"));
        Process process = pb.start();
        process.waitFor();
    }
}
