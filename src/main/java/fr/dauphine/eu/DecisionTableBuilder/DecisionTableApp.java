package fr.dauphine.eu.DecisionTableBuilder;

public class DecisionTableApp {
    public static void main(String[] args) throws Exception {
        DecisionTableCodeGeneration generator = new DecisionTableCodeGeneration();
        generator.generateCode(
                "src/main/resources/decision_table/decision_table.csv",
                "C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java\\fr\\dauphine\\eu\\GeneratedDecisionTableRule.java"
        );
    }
}
