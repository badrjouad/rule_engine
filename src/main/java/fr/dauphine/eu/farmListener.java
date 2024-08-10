package fr.dauphine.eu;// Generated from src/main/resources/antlr4/farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link farmParser}.
 */
public interface farmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link farmParser#frl}.
	 * @param ctx the parse tree
	 */
	void enterFrl(farmParser.FrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#frl}.
	 * @param ctx the parse tree
	 */
	void exitFrl(farmParser.FrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void enterRuleEntry(farmParser.RuleEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void exitRuleEntry(farmParser.RuleEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#salience}.
	 * @param ctx the parse tree
	 */
	void enterSalience(farmParser.SalienceContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#salience}.
	 * @param ctx the parse tree
	 */
	void exitSalience(farmParser.SalienceContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(farmParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(farmParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void enterRuleDescription(farmParser.RuleDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void exitRuleDescription(farmParser.RuleDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#whenScope}.
	 * @param ctx the parse tree
	 */
	void enterWhenScope(farmParser.WhenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#whenScope}.
	 * @param ctx the parse tree
	 */
	void exitWhenScope(farmParser.WhenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#thenScope}.
	 * @param ctx the parse tree
	 */
	void enterThenScope(farmParser.ThenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#thenScope}.
	 * @param ctx the parse tree
	 */
	void exitThenScope(farmParser.ThenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterThenExpressionList(farmParser.ThenExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitThenExpressionList(farmParser.ThenExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void enterThenExpression(farmParser.ThenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void exitThenExpression(farmParser.ThenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(farmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(farmParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(farmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(farmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOperators(farmParser.MulDivOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOperators(farmParser.MulDivOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusOperators(farmParser.AddMinusOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusOperators(farmParser.AddMinusOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(farmParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(farmParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndLogicOperator(farmParser.AndLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndLogicOperator(farmParser.AndLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrLogicOperator(farmParser.OrLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrLogicOperator(farmParser.OrLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(farmParser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(farmParser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(farmParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(farmParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(farmParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(farmParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void enterArrayMapSelector(farmParser.ArrayMapSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void exitArrayMapSelector(farmParser.ArrayMapSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void enterMemberVariable(farmParser.MemberVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void exitMemberVariable(farmParser.MemberVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(farmParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(farmParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(farmParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(farmParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(farmParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(farmParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(farmParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(farmParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalFloatLiteral(farmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalFloatLiteral(farmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalFloatLiteral(farmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalFloatLiteral(farmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(farmParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(farmParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(farmParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(farmParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(farmParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(farmParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(farmParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(farmParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(farmParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(farmParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link farmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(farmParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link farmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(farmParser.BooleanLiteralContext ctx);
}