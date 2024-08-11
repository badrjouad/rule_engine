package fr.dauphine.eu.generated_sources;// Generated from src/main/resources/antlr4/Farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FarmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FarmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FarmParser#frl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrl(FarmParser.FrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#ruleEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleEntry(FarmParser.RuleEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#salience}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalience(FarmParser.SalienceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(FarmParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#ruleDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDescription(FarmParser.RuleDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#whenScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenScope(FarmParser.WhenScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#thenScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenScope(FarmParser.ThenScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#thenExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenExpressionList(FarmParser.ThenExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#thenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenExpression(FarmParser.ThenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FarmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FarmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#mulDivOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOperators(FarmParser.MulDivOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#addMinusOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinusOperators(FarmParser.AddMinusOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(FarmParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#andLogicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLogicOperator(FarmParser.AndLogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#orLogicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLogicOperator(FarmParser.OrLogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(FarmParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FarmParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FarmParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#arrayMapSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMapSelector(FarmParser.ArrayMapSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#memberVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberVariable(FarmParser.MemberVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FarmParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(FarmParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(FarmParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(FarmParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalFloatLiteral(FarmParser.DecimalFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalFloatLiteral(FarmParser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(FarmParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(FarmParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(FarmParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#octalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalLiteral(FarmParser.OctalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FarmParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FarmParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(FarmParser.BooleanLiteralContext ctx);
}