package fr.dauphine.eu.RulesBuilder;// Generated from src/main/resources/antlr4/Farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FarmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQUALS_OPERATOR=4, GREATER_THAN_OPERATOR=5, LESS_THAN_OPERATOR=6, 
		GREATER_THAN_EQUALS_OPERATOR=7, LESS_THAN_EQUALS_OPERATOR=8, NOT_EQUALS_OPERATOR=9, 
		PLUS=10, MINUS=11, DIV=12, MUL=13, MOD=14, DOT=15, SEMICOLON=16, LR_BRACE=17, 
		RR_BRACE=18, LR_BRACKET=19, RR_BRACKET=20, LS_BRACKET=21, RS_BRACKET=22, 
		RULE=23, WHEN=24, THEN=25, AND=26, OR=27, TRUE=28, FALSE=29, NIL_LITERAL=30, 
		NEGATION=31, SALIENCE=32, EQUALS=33, ASSIGN=34, PLUS_ASIGN=35, MINUS_ASIGN=36, 
		DIV_ASIGN=37, MUL_ASIGN=38, GT=39, LT=40, GTE=41, LTE=42, NOTEQUALS=43, 
		BITAND=44, BITOR=45, SIMPLENAME=46, DQUOTA_STRING=47, SQUOTA_STRING=48, 
		DECIMAL_FLOAT_LIT=49, DECIMAL_EXPONENT=50, HEX_FLOAT_LIT=51, HEX_EXPONENT=52, 
		DEC_LIT=53, HEX_LIT=54, OCT_LIT=55, SPACE=56, COMMENT=57, LINE_COMMENT=58;
	public static final int
		RULE_frl = 0, RULE_ruleEntry = 1, RULE_salience = 2, RULE_ruleName = 3, 
		RULE_ruleDescription = 4, RULE_whenScope = 5, RULE_thenScope = 6, RULE_thenExpressionList = 7, 
		RULE_thenExpression = 8, RULE_assignment = 9, RULE_expression = 10, RULE_mulDivOperators = 11, 
		RULE_addMinusOperators = 12, RULE_comparisonOperator = 13, RULE_andLogicOperator = 14, 
		RULE_orLogicOperator = 15, RULE_expressionAtom = 16, RULE_constant = 17, 
		RULE_variable = 18, RULE_arrayMapSelector = 19, RULE_memberVariable = 20, 
		RULE_functionCall = 21, RULE_methodCall = 22, RULE_argumentList = 23, 
		RULE_floatLiteral = 24, RULE_decimalFloatLiteral = 25, RULE_hexadecimalFloatLiteral = 26, 
		RULE_integerLiteral = 27, RULE_decimalLiteral = 28, RULE_hexadecimalLiteral = 29, 
		RULE_octalLiteral = 30, RULE_stringLiteral = 31, RULE_booleanLiteral = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"frl", "ruleEntry", "salience", "ruleName", "ruleDescription", "whenScope", 
			"thenScope", "thenExpressionList", "thenExpression", "assignment", "expression", 
			"mulDivOperators", "addMinusOperators", "comparisonOperator", "andLogicOperator", 
			"orLogicOperator", "expressionAtom", "constant", "variable", "arrayMapSelector", 
			"memberVariable", "functionCall", "methodCall", "argumentList", "floatLiteral", 
			"decimalFloatLiteral", "hexadecimalFloatLiteral", "integerLiteral", "decimalLiteral", 
			"hexadecimalLiteral", "octalLiteral", "stringLiteral", "booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "','", "'equals'", "'greater_than'", "'less_than'", 
			"'greater_than_equals'", "'less_than_equals'", "'not_equals'", "'+'", 
			"'-'", "'/'", "'*'", "'%'", "'.'", "';'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", null, null, null, "'&&'", "'||'", null, null, null, "'!'", 
			null, "'=='", "'='", "'+='", "'-='", "'/='", "'*='", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", 
			"GREATER_THAN_EQUALS_OPERATOR", "LESS_THAN_EQUALS_OPERATOR", "NOT_EQUALS_OPERATOR", 
			"PLUS", "MINUS", "DIV", "MUL", "MOD", "DOT", "SEMICOLON", "LR_BRACE", 
			"RR_BRACE", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", "RULE", 
			"WHEN", "THEN", "AND", "OR", "TRUE", "FALSE", "NIL_LITERAL", "NEGATION", 
			"SALIENCE", "EQUALS", "ASSIGN", "PLUS_ASIGN", "MINUS_ASIGN", "DIV_ASIGN", 
			"MUL_ASIGN", "GT", "LT", "GTE", "LTE", "NOTEQUALS", "BITAND", "BITOR", 
			"SIMPLENAME", "DQUOTA_STRING", "SQUOTA_STRING", "DECIMAL_FLOAT_LIT", 
			"DECIMAL_EXPONENT", "HEX_FLOAT_LIT", "HEX_EXPONENT", "DEC_LIT", "HEX_LIT", 
			"OCT_LIT", "SPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Farm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FarmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FrlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FarmParser.EOF, 0); }
		public List<RuleEntryContext> ruleEntry() {
			return getRuleContexts(RuleEntryContext.class);
		}
		public RuleEntryContext ruleEntry(int i) {
			return getRuleContext(RuleEntryContext.class,i);
		}
		public FrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterFrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitFrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitFrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrlContext frl() throws RecognitionException {
		FrlContext _localctx = new FrlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_frl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RULE) {
				{
				{
				setState(66);
				ruleEntry();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleEntryContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(FarmParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public WhenScopeContext whenScope() {
			return getRuleContext(WhenScopeContext.class,0);
		}
		public ThenScopeContext thenScope() {
			return getRuleContext(ThenScopeContext.class,0);
		}
		public TerminalNode LR_BRACE() { return getToken(FarmParser.LR_BRACE, 0); }
		public TerminalNode RR_BRACE() { return getToken(FarmParser.RR_BRACE, 0); }
		public RuleDescriptionContext ruleDescription() {
			return getRuleContext(RuleDescriptionContext.class,0);
		}
		public SalienceContext salience() {
			return getRuleContext(SalienceContext.class,0);
		}
		public RuleEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterRuleEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitRuleEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitRuleEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleEntryContext ruleEntry() throws RecognitionException {
		RuleEntryContext _localctx = new RuleEntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(RULE);
			setState(75);
			ruleName();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DQUOTA_STRING || _la==SQUOTA_STRING) {
				{
				setState(76);
				ruleDescription();
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALIENCE) {
				{
				setState(79);
				salience();
				}
			}

			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				{
				setState(82);
				whenScope();
				setState(83);
				thenScope();
				}
				break;
			case LR_BRACE:
				{
				setState(85);
				match(LR_BRACE);
				setState(86);
				whenScope();
				setState(87);
				thenScope();
				setState(88);
				match(RR_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SalienceContext extends ParserRuleContext {
		public TerminalNode SALIENCE() { return getToken(FarmParser.SALIENCE, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public SalienceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salience; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterSalience(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitSalience(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitSalience(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalienceContext salience() throws RecognitionException {
		SalienceContext _localctx = new SalienceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_salience);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SALIENCE);
			setState(93);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(FarmParser.SIMPLENAME, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleName);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(SIMPLENAME);
				}
				break;
			case DQUOTA_STRING:
			case SQUOTA_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleDescriptionContext extends ParserRuleContext {
		public TerminalNode DQUOTA_STRING() { return getToken(FarmParser.DQUOTA_STRING, 0); }
		public TerminalNode SQUOTA_STRING() { return getToken(FarmParser.SQUOTA_STRING, 0); }
		public RuleDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterRuleDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitRuleDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitRuleDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleDescriptionContext ruleDescription() throws RecognitionException {
		RuleDescriptionContext _localctx = new RuleDescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==DQUOTA_STRING || _la==SQUOTA_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenScopeContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(FarmParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterWhenScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitWhenScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitWhenScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenScopeContext whenScope() throws RecognitionException {
		WhenScopeContext _localctx = new WhenScopeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whenScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(WHEN);
			setState(102);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenScopeContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(FarmParser.THEN, 0); }
		public ThenExpressionListContext thenExpressionList() {
			return getRuleContext(ThenExpressionListContext.class,0);
		}
		public ThenScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterThenScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitThenScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitThenScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenScopeContext thenScope() throws RecognitionException {
		ThenScopeContext _localctx = new ThenScopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_thenScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(THEN);
			setState(105);
			thenExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenExpressionListContext extends ParserRuleContext {
		public List<ThenExpressionContext> thenExpression() {
			return getRuleContexts(ThenExpressionContext.class);
		}
		public ThenExpressionContext thenExpression(int i) {
			return getRuleContext(ThenExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FarmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FarmParser.SEMICOLON, i);
		}
		public ThenExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterThenExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitThenExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitThenExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenExpressionListContext thenExpressionList() throws RecognitionException {
		ThenExpressionListContext _localctx = new ThenExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_thenExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				thenExpression();
				setState(108);
				match(SEMICOLON);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NIL_LITERAL) | (1L << NEGATION) | (1L << SIMPLENAME) | (1L << DQUOTA_STRING) | (1L << SQUOTA_STRING) | (1L << DECIMAL_FLOAT_LIT) | (1L << HEX_FLOAT_LIT) | (1L << DEC_LIT) | (1L << HEX_LIT) | (1L << OCT_LIT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public ThenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterThenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitThenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitThenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenExpressionContext thenExpression() throws RecognitionException {
		ThenExpressionContext _localctx = new ThenExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thenExpression);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				expressionAtom(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FarmParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASIGN() { return getToken(FarmParser.PLUS_ASIGN, 0); }
		public TerminalNode MINUS_ASIGN() { return getToken(FarmParser.MINUS_ASIGN, 0); }
		public TerminalNode DIV_ASIGN() { return getToken(FarmParser.DIV_ASIGN, 0); }
		public TerminalNode MUL_ASIGN() { return getToken(FarmParser.MUL_ASIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			variable(0);
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PLUS_ASIGN) | (1L << MINUS_ASIGN) | (1L << DIV_ASIGN) | (1L << MUL_ASIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FarmParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FarmParser.RR_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(FarmParser.NEGATION, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public MulDivOperatorsContext mulDivOperators() {
			return getRuleContext(MulDivOperatorsContext.class,0);
		}
		public AddMinusOperatorsContext addMinusOperators() {
			return getRuleContext(AddMinusOperatorsContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public AndLogicOperatorContext andLogicOperator() {
			return getRuleContext(AndLogicOperatorContext.class,0);
		}
		public OrLogicOperatorContext orLogicOperator() {
			return getRuleContext(OrLogicOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATION) {
					{
					setState(123);
					match(NEGATION);
					}
				}

				setState(126);
				match(LR_BRACKET);
				setState(127);
				expression(0);
				setState(128);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(130);
				expressionAtom(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						mulDivOperators();
						setState(135);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						addMinusOperators();
						setState(139);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						comparisonOperator();
						setState(143);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						andLogicOperator();
						setState(147);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
						orLogicOperator();
						setState(151);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulDivOperatorsContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(FarmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FarmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FarmParser.MOD, 0); }
		public MulDivOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterMulDivOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitMulDivOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitMulDivOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOperatorsContext mulDivOperators() throws RecognitionException {
		MulDivOperatorsContext _localctx = new MulDivOperatorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mulDivOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddMinusOperatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FarmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public TerminalNode BITAND() { return getToken(FarmParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(FarmParser.BITOR, 0); }
		public AddMinusOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMinusOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterAddMinusOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitAddMinusOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitAddMinusOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddMinusOperatorsContext addMinusOperators() throws RecognitionException {
		AddMinusOperatorsContext _localctx = new AddMinusOperatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addMinusOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << BITAND) | (1L << BITOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS_OPERATOR() { return getToken(FarmParser.EQUALS_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(FarmParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(FarmParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUALS_OPERATOR() { return getToken(FarmParser.GREATER_THAN_EQUALS_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUALS_OPERATOR() { return getToken(FarmParser.LESS_THAN_EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUALS_OPERATOR() { return getToken(FarmParser.NOT_EQUALS_OPERATOR, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << GREATER_THAN_EQUALS_OPERATOR) | (1L << LESS_THAN_EQUALS_OPERATOR) | (1L << NOT_EQUALS_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndLogicOperatorContext extends ParserRuleContext {
		public AndLogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andLogicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterAndLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitAndLogicOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitAndLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndLogicOperatorContext andLogicOperator() throws RecognitionException {
		AndLogicOperatorContext _localctx = new AndLogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andLogicOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrLogicOperatorContext extends ParserRuleContext {
		public OrLogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orLogicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterOrLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitOrLogicOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitOrLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrLogicOperatorContext orLogicOperator() throws RecognitionException {
		OrLogicOperatorContext _localctx = new OrLogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orLogicOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAtomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(FarmParser.NEGATION, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MemberVariableContext memberVariable() {
			return getRuleContext(MemberVariableContext.class,0);
		}
		public ArrayMapSelectorContext arrayMapSelector() {
			return getRuleContext(ArrayMapSelectorContext.class,0);
		}
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		return expressionAtom(0);
	}

	private ExpressionAtomContext expressionAtom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, _parentState);
		ExpressionAtomContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expressionAtom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(169);
				constant();
				}
				break;
			case 2:
				{
				setState(170);
				variable(0);
				}
				break;
			case 3:
				{
				setState(171);
				functionCall();
				}
				break;
			case 4:
				{
				setState(172);
				match(NEGATION);
				setState(173);
				expressionAtom(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177);
						methodCall();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						memberVariable();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						arrayMapSelector();
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode NIL_LITERAL() { return getToken(FarmParser.NIL_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				integerLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				booleanLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(NIL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(FarmParser.SIMPLENAME, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MemberVariableContext memberVariable() {
			return getRuleContext(MemberVariableContext.class,0);
		}
		public ArrayMapSelectorContext arrayMapSelector() {
			return getRuleContext(ArrayMapSelectorContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			match(SIMPLENAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						memberVariable();
						}
						break;
					case 2:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						arrayMapSelector();
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayMapSelectorContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(FarmParser.LS_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RS_BRACKET() { return getToken(FarmParser.RS_BRACKET, 0); }
		public ArrayMapSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMapSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterArrayMapSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitArrayMapSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitArrayMapSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMapSelectorContext arrayMapSelector() throws RecognitionException {
		ArrayMapSelectorContext _localctx = new ArrayMapSelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayMapSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LS_BRACKET);
			setState(207);
			expression(0);
			setState(208);
			match(RS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberVariableContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FarmParser.DOT, 0); }
		public TerminalNode SIMPLENAME() { return getToken(FarmParser.SIMPLENAME, 0); }
		public MemberVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterMemberVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitMemberVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitMemberVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberVariableContext memberVariable() throws RecognitionException {
		MemberVariableContext _localctx = new MemberVariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DOT);
			setState(211);
			match(SIMPLENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(FarmParser.SIMPLENAME, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FarmParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FarmParser.RR_BRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SIMPLENAME);
			setState(214);
			match(LR_BRACKET);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LR_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << NIL_LITERAL) | (1L << NEGATION) | (1L << SIMPLENAME) | (1L << DQUOTA_STRING) | (1L << SQUOTA_STRING) | (1L << DECIMAL_FLOAT_LIT) | (1L << HEX_FLOAT_LIT) | (1L << DEC_LIT) | (1L << HEX_LIT) | (1L << OCT_LIT))) != 0)) {
				{
				setState(215);
				argumentList();
				}
			}

			setState(218);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FarmParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(DOT);
			setState(221);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(224);
				match(T__2);
				setState(225);
				expression(0);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public DecimalFloatLiteralContext decimalFloatLiteral() {
			return getRuleContext(DecimalFloatLiteralContext.class,0);
		}
		public HexadecimalFloatLiteralContext hexadecimalFloatLiteral() {
			return getRuleContext(HexadecimalFloatLiteralContext.class,0);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatLiteral);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				decimalFloatLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				hexadecimalFloatLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalFloatLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_FLOAT_LIT() { return getToken(FarmParser.DECIMAL_FLOAT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public DecimalFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterDecimalFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitDecimalFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitDecimalFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalFloatLiteralContext decimalFloatLiteral() throws RecognitionException {
		DecimalFloatLiteralContext _localctx = new DecimalFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decimalFloatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(235);
				match(MINUS);
				}
			}

			setState(238);
			match(DECIMAL_FLOAT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalFloatLiteralContext extends ParserRuleContext {
		public TerminalNode HEX_FLOAT_LIT() { return getToken(FarmParser.HEX_FLOAT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public HexadecimalFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterHexadecimalFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitHexadecimalFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitHexadecimalFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalFloatLiteralContext hexadecimalFloatLiteral() throws RecognitionException {
		HexadecimalFloatLiteralContext _localctx = new HexadecimalFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_hexadecimalFloatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(240);
				match(MINUS);
				}
			}

			setState(243);
			match(HEX_FLOAT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public HexadecimalLiteralContext hexadecimalLiteral() {
			return getRuleContext(HexadecimalLiteralContext.class,0);
		}
		public OctalLiteralContext octalLiteral() {
			return getRuleContext(OctalLiteralContext.class,0);
		}
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integerLiteral);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				decimalLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				hexadecimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				octalLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DEC_LIT() { return getToken(FarmParser.DEC_LIT, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(250);
				match(MINUS);
				}
			}

			setState(253);
			match(DEC_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralContext extends ParserRuleContext {
		public TerminalNode HEX_LIT() { return getToken(FarmParser.HEX_LIT, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public HexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitHexadecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitHexadecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralContext hexadecimalLiteral() throws RecognitionException {
		HexadecimalLiteralContext _localctx = new HexadecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hexadecimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(255);
				match(MINUS);
				}
			}

			setState(258);
			match(HEX_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OctalLiteralContext extends ParserRuleContext {
		public TerminalNode OCT_LIT() { return getToken(FarmParser.OCT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(FarmParser.MINUS, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitOctalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitOctalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_octalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(260);
				match(MINUS);
				}
			}

			setState(263);
			match(OCT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode DQUOTA_STRING() { return getToken(FarmParser.DQUOTA_STRING, 0); }
		public TerminalNode SQUOTA_STRING() { return getToken(FarmParser.SQUOTA_STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==DQUOTA_STRING || _la==SQUOTA_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FarmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FarmParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FarmListener ) ((FarmListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FarmVisitor ) return ((FarmVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return expressionAtom_sempred((ExpressionAtomContext)_localctx, predIndex);
		case 18:
			return variable_sempred((VariableContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionAtom_sempred(ExpressionAtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\5\3P\n\3\3"+
		"\3\5\3S\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\4\3\5\3"+
		"\5\5\5d\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\6\tq\n\t\r\t\16"+
		"\tr\3\n\3\n\5\nw\n\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\177\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0086\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b1\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b9\n\22\f"+
		"\22\16\22\u00bc\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c3\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u00cc\n\24\f\24\16\24\u00cf\13\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00db\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00e5\n\31\f\31\16\31\u00e8\13"+
		"\31\3\32\3\32\5\32\u00ec\n\32\3\33\5\33\u00ef\n\33\3\33\3\33\3\34\5\34"+
		"\u00f4\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u00fb\n\35\3\36\5\36\u00fe\n"+
		"\36\3\36\3\36\3\37\5\37\u0103\n\37\3\37\3\37\3 \5 \u0108\n \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\2\5\26\"&#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@B\2\b\3\2\61\62\3\2$(\3\2\16\20\4\2\f\r./\3\2\6\13"+
		"\3\2\36\37\2\u0112\2G\3\2\2\2\4L\3\2\2\2\6^\3\2\2\2\bc\3\2\2\2\ne\3\2"+
		"\2\2\fg\3\2\2\2\16j\3\2\2\2\20p\3\2\2\2\22v\3\2\2\2\24x\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00a6\3"+
		"\2\2\2 \u00a8\3\2\2\2\"\u00b0\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3\2\2\2(\u00d0"+
		"\3\2\2\2*\u00d4\3\2\2\2,\u00d7\3\2\2\2.\u00de\3\2\2\2\60\u00e1\3\2\2\2"+
		"\62\u00eb\3\2\2\2\64\u00ee\3\2\2\2\66\u00f3\3\2\2\28\u00fa\3\2\2\2:\u00fd"+
		"\3\2\2\2<\u0102\3\2\2\2>\u0107\3\2\2\2@\u010b\3\2\2\2B\u010d\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\7\2\2\3K\3\3\2\2\2LM\7\31\2\2MO\5\b\5\2NP\5\n\6\2ON\3\2\2\2OP\3\2\2"+
		"\2PR\3\2\2\2QS\5\6\4\2RQ\3\2\2\2RS\3\2\2\2S\\\3\2\2\2TU\5\f\7\2UV\5\16"+
		"\b\2V]\3\2\2\2WX\7\23\2\2XY\5\f\7\2YZ\5\16\b\2Z[\7\24\2\2[]\3\2\2\2\\"+
		"T\3\2\2\2\\W\3\2\2\2]\5\3\2\2\2^_\7\"\2\2_`\58\35\2`\7\3\2\2\2ad\7\60"+
		"\2\2bd\5@!\2ca\3\2\2\2cb\3\2\2\2d\t\3\2\2\2ef\t\2\2\2f\13\3\2\2\2gh\7"+
		"\32\2\2hi\5\26\f\2i\r\3\2\2\2jk\7\33\2\2kl\5\20\t\2l\17\3\2\2\2mn\5\22"+
		"\n\2no\7\22\2\2oq\3\2\2\2pm\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\21"+
		"\3\2\2\2tw\5\24\13\2uw\5\"\22\2vt\3\2\2\2vu\3\2\2\2w\23\3\2\2\2xy\5&\24"+
		"\2yz\t\3\2\2z{\5\26\f\2{\25\3\2\2\2|~\b\f\1\2}\177\7!\2\2~}\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082\5\26\f\2\u0082"+
		"\u0083\7\26\2\2\u0083\u0086\3\2\2\2\u0084\u0086\5\"\22\2\u0085|\3\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u009d\3\2\2\2\u0087\u0088\f\t\2\2\u0088\u0089"+
		"\5\30\r\2\u0089\u008a\5\26\f\n\u008a\u009c\3\2\2\2\u008b\u008c\f\b\2\2"+
		"\u008c\u008d\5\32\16\2\u008d\u008e\5\26\f\t\u008e\u009c\3\2\2\2\u008f"+
		"\u0090\f\7\2\2\u0090\u0091\5\34\17\2\u0091\u0092\5\26\f\b\u0092\u009c"+
		"\3\2\2\2\u0093\u0094\f\6\2\2\u0094\u0095\5\36\20\2\u0095\u0096\5\26\f"+
		"\7\u0096\u009c\3\2\2\2\u0097\u0098\f\5\2\2\u0098\u0099\5 \21\2\u0099\u009a"+
		"\5\26\f\6\u009a\u009c\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008b\3\2\2\2"+
		"\u009b\u008f\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\t\5\2"+
		"\2\u00a3\33\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7"+
		"\3\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9!\3\2\2\2\u00aa\u00ab"+
		"\b\22\1\2\u00ab\u00b1\5$\23\2\u00ac\u00b1\5&\24\2\u00ad\u00b1\5,\27\2"+
		"\u00ae\u00af\7!\2\2\u00af\u00b1\5\"\22\3\u00b0\u00aa\3\2\2\2\u00b0\u00ac"+
		"\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2"+
		"\u00b3\f\6\2\2\u00b3\u00b9\5.\30\2\u00b4\u00b5\f\5\2\2\u00b5\u00b9\5*"+
		"\26\2\u00b6\u00b7\f\4\2\2\u00b7\u00b9\5(\25\2\u00b8\u00b2\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c3"+
		"\5@!\2\u00be\u00c3\58\35\2\u00bf\u00c3\5\62\32\2\u00c0\u00c3\5B\"\2\u00c1"+
		"\u00c3\7 \2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c5"+
		"\b\24\1\2\u00c5\u00c6\7\60\2\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\f\5\2\2"+
		"\u00c8\u00cc\5*\26\2\u00c9\u00ca\f\4\2\2\u00ca\u00cc\5(\25\2\u00cb\u00c7"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\'\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\27\2"+
		"\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3\7\30\2\2\u00d3)\3\2\2\2\u00d4\u00d5"+
		"\7\21\2\2\u00d5\u00d6\7\60\2\2\u00d6+\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8"+
		"\u00da\7\25\2\2\u00d9\u00db\5\60\31\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\26\2\2\u00dd-\3\2\2\2\u00de"+
		"\u00df\7\21\2\2\u00df\u00e0\5,\27\2\u00e0/\3\2\2\2\u00e1\u00e6\5\26\f"+
		"\2\u00e2\u00e3\7\5\2\2\u00e3\u00e5\5\26\f\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\61\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\5\64\33\2\u00ea\u00ec\5\66\34\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\63\3\2\2\2\u00ed\u00ef\7\r\2"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7\63\2\2\u00f1\65\3\2\2\2\u00f2\u00f4\7\r\2\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\65\2\2\u00f6\67\3\2\2"+
		"\2\u00f7\u00fb\5:\36\2\u00f8\u00fb\5<\37\2\u00f9\u00fb\5> \2\u00fa\u00f7"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb9\3\2\2\2\u00fc"+
		"\u00fe\7\r\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\7\67\2\2\u0100;\3\2\2\2\u0101\u0103\7\r\2\2\u0102\u0101"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\78\2\2\u0105"+
		"=\3\2\2\2\u0106\u0108\7\r\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\79\2\2\u010a?\3\2\2\2\u010b\u010c\t\2"+
		"\2\2\u010cA\3\2\2\2\u010d\u010e\t\7\2\2\u010eC\3\2\2\2\34GOR\\crv~\u0085"+
		"\u009b\u009d\u00b0\u00b8\u00ba\u00c2\u00cb\u00cd\u00da\u00e6\u00eb\u00ee"+
		"\u00f3\u00fa\u00fd\u0102\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}