package fr.dauphine.eu;

import org.antlr.v4.runtime.tree.TerminalNode;

public class RuleVisitor extends farmBaseVisitor<String> {

    @Override
    public String visitFrl(farmParser.FrlContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (farmParser.RuleEntryContext ruleCtx : ctx.ruleEntry()) {
            sb.append(visit(ruleCtx)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitRuleEntry(farmParser.RuleEntryContext ctx) {
        String when = visit(ctx.whenScope());
        String then = visit(ctx.thenScope());

        if (when == null || then == null) {
            System.err.println("Erreur lors de la génération de la règle: 'when' ou 'then' est null.");
            return "";
        }

        return "if (" + when + ") {\n" + then + "}\n";
    }

    @Override
    public String visitWhenScope(farmParser.WhenScopeContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public String visitThenScope(farmParser.ThenScopeContext ctx) {
        return visit(ctx.thenExpressionList());
    }

    @Override
    public String visitThenExpressionList(farmParser.ThenExpressionListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (farmParser.ThenExpressionContext exprCtx : ctx.thenExpression()) {
            String expr = visit(exprCtx);
            if (expr != null && !expr.isEmpty()) {
                sb.append(expr).append(";\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitThenExpression(farmParser.ThenExpressionContext ctx) {
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
    public String visitAssignment(farmParser.AssignmentContext ctx) {
        String varName = visit(ctx.variable());
        String expr = visit(ctx.expression());
        String operator = ctx.getChild(1).getText(); // ASSIGN | PLUS_ASSIGN | etc.

        if (varName == null || expr == null) {
            System.err.println("Erreur dans l'affectation: variable ou expression est null.");
            return "";
        }

        // Convert the assignment to use the setter method instead of the getter
        if (operator.equals("=")) {
            return "context.set" + capitalize(ctx.variable().getText()) + "(" + expr + ")";
        } else {
            // Handle other assignment operators (+=, -=, etc.) if needed
            return "context.set" + capitalize(ctx.variable().getText()) + "(context.get" + capitalize(ctx.variable().getText()) + "()" + operator.charAt(0) + expr + ")";
        }
    }


    @Override
    public String visitExpression(farmParser.ExpressionContext ctx) {
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
            // Gestion du négation
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
    public String visitExpressionAtom(farmParser.ExpressionAtomContext ctx) {
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
    public String visitVariable(farmParser.VariableContext ctx) {
        if (ctx.SIMPLENAME() != null) {
            return "context.get" + capitalize(ctx.SIMPLENAME().getText()) + "()";
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
    public String visitConstant(farmParser.ConstantContext ctx) {
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
    public String visitFunctionCall(farmParser.FunctionCallContext ctx) {
        String functionName = ctx.SIMPLENAME().getText();
        String arguments = "";
        if (ctx.argumentList() != null) {
            arguments = visit(ctx.argumentList());
        }
        return functionName + "(" + arguments + ")";
    }

    @Override
    public String visitArgumentList(farmParser.ArgumentListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.expression().size(); i++) {
            sb.append(visit(ctx.expression(i)));
            if (i < ctx.expression().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // Autres méthodes de visite selon les besoins...

    // Méthode utilitaire pour capitaliser la première lettre
    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
