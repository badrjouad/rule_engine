package fr.dauphine.eu;// Generated from src/main/resources/antlr4/farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link farmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface farmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link farmParser#frl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrl(farmParser.FrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#ruleEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleEntry(farmParser.RuleEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#salience}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalience(farmParser.SalienceContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(farmParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#ruleDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDescription(farmParser.RuleDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#whenScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenScope(farmParser.WhenScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#thenScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenScope(farmParser.ThenScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenExpressionList(farmParser.ThenExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#thenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenExpression(farmParser.ThenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(farmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(farmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOperators(farmParser.MulDivOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinusOperators(farmParser.AddMinusOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(farmParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLogicOperator(farmParser.AndLogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLogicOperator(farmParser.OrLogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(farmParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(farmParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(farmParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMapSelector(farmParser.ArrayMapSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#memberVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberVariable(farmParser.MemberVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(farmParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(farmParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(farmParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(farmParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalFloatLiteral(farmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalFloatLiteral(farmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(farmParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(farmParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(farmParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#octalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalLiteral(farmParser.OctalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(farmParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link farmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(farmParser.BooleanLiteralContext ctx);
}