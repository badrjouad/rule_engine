package fr.dauphine.eu;

import fr.dauphine.eu.context.Context;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DecisionTableApp {
    public static void main(String[] args) throws Exception {
        DecisionTableCodeGeneration generator = new DecisionTableCodeGeneration();
        generator.generateCode(
                "src/main/resources/decision_table.csv",
                "C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java\\fr\\dauphine\\eu\\GeneratedRule.java"
        );
    }
}
