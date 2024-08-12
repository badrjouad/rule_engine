package fr.dauphine.eu.RulesBuilder;

import fr.dauphine.eu.generated_sources.FarmBaseVisitor;
import fr.dauphine.eu.generated_sources.FarmParser;

import java.util.HashSet;
import java.util.Set;


public class RuleVisitor extends FarmBaseVisitor<String> {
    private final Set<String> attributes = new HashSet<>();

    public Set<String> getAttributes() {
        return attributes;
    }

    @Override
    public String visitFrl(FarmParser.FrlContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (FarmParser.RuleEntryContext ruleCtx : ctx.ruleEntry()) {
            sb.append(visit(ruleCtx)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitRuleEntry(FarmParser.RuleEntryContext ctx) {
        String when = visit(ctx.whenScope());
        String then = visit(ctx.thenScope());

        if (when == null || then == null) {
            System.err.println("Erreur lors de la génération de la règle: 'when' ou 'then' est null.");
            return "";
        }

        return "if (" + when + ") {\n" + then + "}\n";
    }

    @Override
    public String visitWhenScope(FarmParser.WhenScopeContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public String visitThenScope(FarmParser.ThenScopeContext ctx) {
        return visit(ctx.thenExpressionList());
    }

    @Override
    public String visitThenExpressionList(FarmParser.ThenExpressionListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (FarmParser.ThenExpressionContext exprCtx : ctx.thenExpression()) {
            String expr = visit(exprCtx);
            if (expr != null && !expr.isEmpty()) {
                sb.append(expr).append(";\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitThenExpression(FarmParser.ThenExpressionContext ctx) {
        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else if (ctx.expressionAtom() != null) {
            return visit(ctx.expressionAtom());
        } else {
            System.err.println("ThenExpression non reconnu: " + ctx.getText());
            return "";
        }
    }

    @Override
    public String visitAssignment(FarmParser.AssignmentContext ctx) {
        String varName = visit(ctx.variable());
        String expr = visit(ctx.expression());
        String operator = ctx.getChild(1).getText(); // ASSIGN | PLUS_ASSIGN | etc.

        if (varName == null || expr == null) {
            System.err.println("Erreur dans l'affectation: variable ou expression est null.");
            return "";
        }

        // Convert the assignment to use the setter method instead of the getter
        String setterMethod = "context.set" + capitalize(ctx.variable().getText());
        attributes.add(ctx.variable().getText()); // Track attributes dynamically

        if (operator.equals("=")) {
            return setterMethod + "(" + expr + ")";
        } else {

            return setterMethod + "(context.get" + capitalize(ctx.variable().getText()) + "()" + operator.charAt(0) + expr + ")";
        }
    }

    @Override
    public String visitExpression(FarmParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            String left = visit(ctx.getChild(0));
            String operator = ctx.getChild(1).getText();
            String right = visit(ctx.getChild(2));

            if (left == null || right == null) {
                System.err.println("Expression incomplète: " + ctx.getText());
                return "";
            }

            return left + " " + operator + " " + right;
        } else if (ctx.getChildCount() == 2) {
            // Handle negation
            String operator = ctx.getChild(0).getText();
            String expr = visit(ctx.getChild(1));
            if (expr == null) {
                System.err.println("Expression après négation est null: " + ctx.getText());
                return "";
            }
            return operator + expr;
        } else if (ctx.getChildCount() == 1) {
            return visit(ctx.getChild(0));
        } else {
            System.err.println("Expression non reconnue: " + ctx.getText());
            return "";
        }
    }

    @Override
    public String visitExpressionAtom(FarmParser.ExpressionAtomContext ctx) {
        if (ctx.constant() != null) {
            return visit(ctx.constant());
        } else if (ctx.variable() != null) {
            return visit(ctx.variable());
        } else if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        } else {
            System.err.println("ExpressionAtom non reconnue: " + ctx.getText());
            return "";
        }
    }

    @Override
    public String visitVariable(FarmParser.VariableContext ctx) {
        if (ctx.SIMPLENAME() != null) {
            String varName = ctx.SIMPLENAME().getText();
            attributes.add(varName); // Track attributes dynamically
            return "context.get" + capitalize(varName) + "()";
        } else if (ctx.variable() != null && ctx.memberVariable() != null) {
            String parentVar = visit(ctx.variable());
            String memberVar = ctx.memberVariable().SIMPLENAME().getText();
            return parentVar + ".get" + capitalize(memberVar) + "()";
        } else {
            System.err.println("Variable non reconnue: " + ctx.getText());
            return "";
        }
    }

    @Override
    public String visitConstant(FarmParser.ConstantContext ctx) {
        if (ctx.integerLiteral() != null) {
            return ctx.integerLiteral().getText();
        } else if (ctx.floatLiteral() != null) {
            return ctx.floatLiteral().getText();
        } else if (ctx.stringLiteral() != null) {
            return ctx.stringLiteral().getText();
        } else if (ctx.booleanLiteral() != null) {
            return ctx.booleanLiteral().getText();
        } else if (ctx.NIL_LITERAL() != null) {
            return "null";
        } else {
            System.err.println("Constant non reconnue: " + ctx.getText());
            return "";
        }
    }

    @Override
    public String visitFunctionCall(FarmParser.FunctionCallContext ctx) {
        String functionName = ctx.SIMPLENAME().getText();
        String arguments = "";
        if (ctx.argumentList() != null) {
            arguments = visit(ctx.argumentList());
        }
        return functionName + "(" + arguments + ")";
    }

    @Override
    public String visitArgumentList(FarmParser.ArgumentListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.expression().size(); i++) {
            sb.append(visit(ctx.expression(i)));
            if (i < ctx.expression().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
