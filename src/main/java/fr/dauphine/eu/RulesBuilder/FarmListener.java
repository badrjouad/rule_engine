package fr.dauphine.eu.RulesBuilder;// Generated from src/main/resources/antlr4/Farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FarmParser}.
 */
public interface FarmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FarmParser#frl}.
	 * @param ctx the parse tree
	 */
	void enterFrl(FarmParser.FrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#frl}.
	 * @param ctx the parse tree
	 */
	void exitFrl(FarmParser.FrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void enterRuleEntry(FarmParser.RuleEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void exitRuleEntry(FarmParser.RuleEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#salience}.
	 * @param ctx the parse tree
	 */
	void enterSalience(FarmParser.SalienceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#salience}.
	 * @param ctx the parse tree
	 */
	void exitSalience(FarmParser.SalienceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(FarmParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(FarmParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void enterRuleDescription(FarmParser.RuleDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void exitRuleDescription(FarmParser.RuleDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#whenScope}.
	 * @param ctx the parse tree
	 */
	void enterWhenScope(FarmParser.WhenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#whenScope}.
	 * @param ctx the parse tree
	 */
	void exitWhenScope(FarmParser.WhenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#thenScope}.
	 * @param ctx the parse tree
	 */
	void enterThenScope(FarmParser.ThenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#thenScope}.
	 * @param ctx the parse tree
	 */
	void exitThenScope(FarmParser.ThenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterThenExpressionList(FarmParser.ThenExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitThenExpressionList(FarmParser.ThenExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void enterThenExpression(FarmParser.ThenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void exitThenExpression(FarmParser.ThenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FarmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FarmParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FarmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FarmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOperators(FarmParser.MulDivOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOperators(FarmParser.MulDivOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusOperators(FarmParser.AddMinusOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusOperators(FarmParser.AddMinusOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(FarmParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(FarmParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndLogicOperator(FarmParser.AndLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndLogicOperator(FarmParser.AndLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrLogicOperator(FarmParser.OrLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrLogicOperator(FarmParser.OrLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(FarmParser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(FarmParser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FarmParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FarmParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FarmParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FarmParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void enterArrayMapSelector(FarmParser.ArrayMapSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void exitArrayMapSelector(FarmParser.ArrayMapSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void enterMemberVariable(FarmParser.MemberVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void exitMemberVariable(FarmParser.MemberVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FarmParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FarmParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(FarmParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(FarmParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(FarmParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(FarmParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(FarmParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(FarmParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalFloatLiteral(FarmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalFloatLiteral(FarmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalFloatLiteral(FarmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalFloatLiteral(FarmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(FarmParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(FarmParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(FarmParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(FarmParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(FarmParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(FarmParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(FarmParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(FarmParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FarmParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FarmParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FarmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(FarmParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FarmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(FarmParser.BooleanLiteralContext ctx);
}