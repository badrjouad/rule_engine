package fr.dauphine.eu;

import java.util.List;
import java.util.Map;

public class DecisionTableVisitor {

    private final List<Map<String, String>> decisionTable;

    public DecisionTableVisitor(List<Map<String, String>> decisionTable) {
        this.decisionTable = decisionTable;
    }

    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        int conditionIndex = 1;
        int actionIndex = 1;

        // Generate conditions
        for (Map<String, String> row : decisionTable) {
            sb.append("private boolean condition").append(conditionIndex).append("(Context context) {\n")
                    .append("    return ").append(row.get("Condition1")).append(" && ")
                    .append(row.get("Condition2")).append(" && ")
                    .append(row.get("Condition3")).append(";\n")
                    .append("}\n");

            sb.append("private void action").append(actionIndex).append("(Context context) {\n")
                    .append("    ").append(row.get("Action1")).append(";\n")
                    .append("    ").append(row.get("Action2")).append(";\n")
                    .append("}\n");

            sb.append("if (condition").append(conditionIndex).append("(context)) {\n")
                    .append("    action").append(actionIndex).append("(context);\n")
                    .append("}\n");

            conditionIndex++;
            actionIndex++;
        }

        return sb.toString();
    }
}
