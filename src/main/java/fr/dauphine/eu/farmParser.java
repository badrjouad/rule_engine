package fr.dauphine.eu;// Generated from src/main/resources/antlr4/farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class farmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, MOD=6, DOT=7, SEMICOLON=8, LR_BRACE=9, 
		RR_BRACE=10, LR_BRACKET=11, RR_BRACKET=12, LS_BRACKET=13, RS_BRACKET=14, 
		RULE=15, WHEN=16, THEN=17, AND=18, OR=19, TRUE=20, FALSE=21, NIL_LITERAL=22, 
		NEGATION=23, SALIENCE=24, EQUALS=25, ASSIGN=26, PLUS_ASIGN=27, MINUS_ASIGN=28, 
		DIV_ASIGN=29, MUL_ASIGN=30, GT=31, LT=32, GTE=33, LTE=34, NOTEQUALS=35, 
		BITAND=36, BITOR=37, SIMPLENAME=38, DQUOTA_STRING=39, SQUOTA_STRING=40, 
		DECIMAL_FLOAT_LIT=41, DECIMAL_EXPONENT=42, HEX_FLOAT_LIT=43, HEX_EXPONENT=44, 
		DEC_LIT=45, HEX_LIT=46, OCT_LIT=47, SPACE=48, COMMENT=49, LINE_COMMENT=50;
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
			null, "','", "'+'", "'-'", "'/'", "'*'", "'%'", "'.'", "';'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", null, null, null, "'&&'", "'||'", 
			null, null, null, "'!'", null, "'=='", "'='", "'+='", "'-='", "'/='", 
			"'*='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "MOD", "DOT", "SEMICOLON", 
			"LR_BRACE", "RR_BRACE", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", 
			"RULE", "WHEN", "THEN", "AND", "OR", "TRUE", "FALSE", "NIL_LITERAL", 
			"NEGATION", "SALIENCE", "EQUALS", "ASSIGN", "PLUS_ASIGN", "MINUS_ASIGN", 
			"DIV_ASIGN", "MUL_ASIGN", "GT", "LT", "GTE", "LTE", "NOTEQUALS", "BITAND", 
			"BITOR", "SIMPLENAME", "DQUOTA_STRING", "SQUOTA_STRING", "DECIMAL_FLOAT_LIT", 
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
	public String getGrammarFileName() { return "farm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public farmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FrlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(farmParser.EOF, 0); }
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterFrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitFrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitFrl(this);
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
		public TerminalNode RULE() { return getToken(farmParser.RULE, 0); }
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public TerminalNode LR_BRACE() { return getToken(farmParser.LR_BRACE, 0); }
		public WhenScopeContext whenScope() {
			return getRuleContext(WhenScopeContext.class,0);
		}
		public ThenScopeContext thenScope() {
			return getRuleContext(ThenScopeContext.class,0);
		}
		public TerminalNode RR_BRACE() { return getToken(farmParser.RR_BRACE, 0); }
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterRuleEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitRuleEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitRuleEntry(this);
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

			setState(82);
			match(LR_BRACE);
			setState(83);
			whenScope();
			setState(84);
			thenScope();
			setState(85);
			match(RR_BRACE);
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
		public TerminalNode SALIENCE() { return getToken(farmParser.SALIENCE, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public SalienceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salience; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterSalience(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitSalience(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitSalience(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalienceContext salience() throws RecognitionException {
		SalienceContext _localctx = new SalienceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_salience);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SALIENCE);
			setState(88);
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
		public TerminalNode SIMPLENAME() { return getToken(farmParser.SIMPLENAME, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleName);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(SIMPLENAME);
				}
				break;
			case DQUOTA_STRING:
			case SQUOTA_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
		public TerminalNode DQUOTA_STRING() { return getToken(farmParser.DQUOTA_STRING, 0); }
		public TerminalNode SQUOTA_STRING() { return getToken(farmParser.SQUOTA_STRING, 0); }
		public RuleDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterRuleDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitRuleDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitRuleDescription(this);
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
			setState(94);
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
		public TerminalNode WHEN() { return getToken(farmParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterWhenScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitWhenScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitWhenScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenScopeContext whenScope() throws RecognitionException {
		WhenScopeContext _localctx = new WhenScopeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whenScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WHEN);
			setState(97);
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
		public TerminalNode THEN() { return getToken(farmParser.THEN, 0); }
		public ThenExpressionListContext thenExpressionList() {
			return getRuleContext(ThenExpressionListContext.class,0);
		}
		public ThenScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterThenScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitThenScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitThenScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenScopeContext thenScope() throws RecognitionException {
		ThenScopeContext _localctx = new ThenScopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_thenScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(THEN);
			setState(100);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(farmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(farmParser.SEMICOLON, i);
		}
		public ThenExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterThenExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitThenExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitThenExpressionList(this);
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
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				thenExpression();
				setState(103);
				match(SEMICOLON);
				}
				}
				setState(107); 
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterThenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitThenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitThenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenExpressionContext thenExpression() throws RecognitionException {
		ThenExpressionContext _localctx = new ThenExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thenExpression);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		public TerminalNode ASSIGN() { return getToken(farmParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASIGN() { return getToken(farmParser.PLUS_ASIGN, 0); }
		public TerminalNode MINUS_ASIGN() { return getToken(farmParser.MINUS_ASIGN, 0); }
		public TerminalNode DIV_ASIGN() { return getToken(farmParser.DIV_ASIGN, 0); }
		public TerminalNode MUL_ASIGN() { return getToken(farmParser.MUL_ASIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitAssignment(this);
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
			setState(113);
			variable(0);
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PLUS_ASIGN) | (1L << MINUS_ASIGN) | (1L << DIV_ASIGN) | (1L << MUL_ASIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
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
		public TerminalNode LR_BRACKET() { return getToken(farmParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(farmParser.RR_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(farmParser.NEGATION, 0); }
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATION) {
					{
					setState(118);
					match(NEGATION);
					}
				}

				setState(121);
				match(LR_BRACKET);
				setState(122);
				expression(0);
				setState(123);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(125);
				expressionAtom(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(129);
						mulDivOperators();
						setState(130);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(133);
						addMinusOperators();
						setState(134);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
						comparisonOperator();
						setState(138);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						andLogicOperator();
						setState(142);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						orLogicOperator();
						setState(146);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode MUL() { return getToken(farmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(farmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(farmParser.MOD, 0); }
		public MulDivOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterMulDivOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitMulDivOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitMulDivOperators(this);
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
			setState(153);
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
		public TerminalNode PLUS() { return getToken(farmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public TerminalNode BITAND() { return getToken(farmParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(farmParser.BITOR, 0); }
		public AddMinusOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMinusOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterAddMinusOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitAddMinusOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitAddMinusOperators(this);
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
			setState(155);
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
		public TerminalNode GT() { return getToken(farmParser.GT, 0); }
		public TerminalNode LT() { return getToken(farmParser.LT, 0); }
		public TerminalNode GTE() { return getToken(farmParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(farmParser.LTE, 0); }
		public TerminalNode EQUALS() { return getToken(farmParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(farmParser.NOTEQUALS, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitComparisonOperator(this);
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
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE) | (1L << NOTEQUALS))) != 0)) ) {
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
		public TerminalNode AND() { return getToken(farmParser.AND, 0); }
		public AndLogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andLogicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterAndLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitAndLogicOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitAndLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndLogicOperatorContext andLogicOperator() throws RecognitionException {
		AndLogicOperatorContext _localctx = new AndLogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andLogicOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(AND);
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
		public TerminalNode OR() { return getToken(farmParser.OR, 0); }
		public OrLogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orLogicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterOrLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitOrLogicOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitOrLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrLogicOperatorContext orLogicOperator() throws RecognitionException {
		OrLogicOperatorContext _localctx = new OrLogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orLogicOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(OR);
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
		public TerminalNode NEGATION() { return getToken(farmParser.NEGATION, 0); }
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitExpressionAtom(this);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(164);
				constant();
				}
				break;
			case 2:
				{
				setState(165);
				variable(0);
				}
				break;
			case 3:
				{
				setState(166);
				functionCall();
				}
				break;
			case 4:
				{
				setState(167);
				match(NEGATION);
				setState(168);
				expressionAtom(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(171);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(172);
						methodCall();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						memberVariable();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionAtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						arrayMapSelector();
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode NIL_LITERAL() { return getToken(farmParser.NIL_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				integerLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				booleanLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
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
		public TerminalNode SIMPLENAME() { return getToken(farmParser.SIMPLENAME, 0); }
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitVariable(this);
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
			setState(190);
			match(SIMPLENAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						memberVariable();
						}
						break;
					case 2:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						arrayMapSelector();
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode LS_BRACKET() { return getToken(farmParser.LS_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RS_BRACKET() { return getToken(farmParser.RS_BRACKET, 0); }
		public ArrayMapSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMapSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterArrayMapSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitArrayMapSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitArrayMapSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMapSelectorContext arrayMapSelector() throws RecognitionException {
		ArrayMapSelectorContext _localctx = new ArrayMapSelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayMapSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LS_BRACKET);
			setState(202);
			expression(0);
			setState(203);
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
		public TerminalNode DOT() { return getToken(farmParser.DOT, 0); }
		public TerminalNode SIMPLENAME() { return getToken(farmParser.SIMPLENAME, 0); }
		public MemberVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterMemberVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitMemberVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitMemberVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberVariableContext memberVariable() throws RecognitionException {
		MemberVariableContext _localctx = new MemberVariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DOT);
			setState(206);
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
		public TerminalNode SIMPLENAME() { return getToken(farmParser.SIMPLENAME, 0); }
		public TerminalNode LR_BRACKET() { return getToken(farmParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(farmParser.RR_BRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitFunctionCall(this);
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
			setState(208);
			match(SIMPLENAME);
			setState(209);
			match(LR_BRACKET);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LR_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << NIL_LITERAL) | (1L << NEGATION) | (1L << SIMPLENAME) | (1L << DQUOTA_STRING) | (1L << SQUOTA_STRING) | (1L << DECIMAL_FLOAT_LIT) | (1L << HEX_FLOAT_LIT) | (1L << DEC_LIT) | (1L << HEX_LIT) | (1L << OCT_LIT))) != 0)) {
				{
				setState(210);
				argumentList();
				}
			}

			setState(213);
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
		public TerminalNode DOT() { return getToken(farmParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DOT);
			setState(216);
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitArgumentList(this);
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
			setState(218);
			expression(0);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(219);
				match(T__0);
				setState(220);
				expression(0);
				}
				}
				setState(225);
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatLiteral);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				decimalFloatLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		public TerminalNode DECIMAL_FLOAT_LIT() { return getToken(farmParser.DECIMAL_FLOAT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public DecimalFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterDecimalFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitDecimalFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitDecimalFloatLiteral(this);
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(230);
				match(MINUS);
				}
			}

			setState(233);
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
		public TerminalNode HEX_FLOAT_LIT() { return getToken(farmParser.HEX_FLOAT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public HexadecimalFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterHexadecimalFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitHexadecimalFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitHexadecimalFloatLiteral(this);
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
			if ( listener instanceof farmListener ) ((farmListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integerLiteral);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				decimalLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				hexadecimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
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
		public TerminalNode DEC_LIT() { return getToken(farmParser.DEC_LIT, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitDecimalLiteral(this);
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
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(245);
				match(MINUS);
				}
			}

			setState(248);
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
		public TerminalNode HEX_LIT() { return getToken(farmParser.HEX_LIT, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public HexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitHexadecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitHexadecimalLiteral(this);
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
		public TerminalNode OCT_LIT() { return getToken(farmParser.OCT_LIT, 0); }
		public TerminalNode MINUS() { return getToken(farmParser.MINUS, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitOctalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitOctalLiteral(this);
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
		public TerminalNode DQUOTA_STRING() { return getToken(farmParser.DQUOTA_STRING, 0); }
		public TerminalNode SQUOTA_STRING() { return getToken(farmParser.SQUOTA_STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitStringLiteral(this);
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
			setState(260);
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
		public TerminalNode TRUE() { return getToken(farmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(farmParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof farmListener ) ((farmListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof farmVisitor ) return ((farmVisitor<? extends T>)visitor).visitBooleanLiteral(this);
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
			setState(262);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\5\3P\n\3\3"+
		"\3\5\3S\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5_\n\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\6\tl\n\t\r\t\16\tm\3\n\3\n\5\nr\n\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\fz\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ac\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00be\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00c7\n\24\f\24\16\24\u00ca\13\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u00d6\n\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\7\31\u00e0\n\31\f\31\16\31\u00e3\13\31\3\32\3\32\5\32\u00e7"+
		"\n\32\3\33\5\33\u00ea\n\33\3\33\3\33\3\34\5\34\u00ef\n\34\3\34\3\34\3"+
		"\35\3\35\3\35\5\35\u00f6\n\35\3\36\5\36\u00f9\n\36\3\36\3\36\3\37\5\37"+
		"\u00fe\n\37\3\37\3\37\3 \5 \u0103\n \3 \3 \3!\3!\3\"\3\"\3\"\2\5\26\""+
		"&#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"+
		"\b\3\2)*\3\2\34 \3\2\6\b\4\2\4\5&\'\4\2\33\33!%\3\2\26\27\2\u010c\2G\3"+
		"\2\2\2\4L\3\2\2\2\6Y\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16e\3\2"+
		"\2\2\20k\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26\u0080\3\2\2\2\30\u009b\3\2"+
		"\2\2\32\u009d\3\2\2\2\34\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2\2\2"+
		"\"\u00ab\3\2\2\2$\u00bd\3\2\2\2&\u00bf\3\2\2\2(\u00cb\3\2\2\2*\u00cf\3"+
		"\2\2\2,\u00d2\3\2\2\2.\u00d9\3\2\2\2\60\u00dc\3\2\2\2\62\u00e6\3\2\2\2"+
		"\64\u00e9\3\2\2\2\66\u00ee\3\2\2\28\u00f5\3\2\2\2:\u00f8\3\2\2\2<\u00fd"+
		"\3\2\2\2>\u0102\3\2\2\2@\u0106\3\2\2\2B\u0108\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3"+
		"\2\2\2LM\7\21\2\2MO\5\b\5\2NP\5\n\6\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS"+
		"\5\6\4\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\13\2\2UV\5\f\7\2VW\5\16\b\2"+
		"WX\7\f\2\2X\5\3\2\2\2YZ\7\32\2\2Z[\58\35\2[\7\3\2\2\2\\_\7(\2\2]_\5@!"+
		"\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\t\2\2\2a\13\3\2\2\2bc\7\22\2\2cd"+
		"\5\26\f\2d\r\3\2\2\2ef\7\23\2\2fg\5\20\t\2g\17\3\2\2\2hi\5\22\n\2ij\7"+
		"\n\2\2jl\3\2\2\2kh\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2o"+
		"r\5\24\13\2pr\5\"\22\2qo\3\2\2\2qp\3\2\2\2r\23\3\2\2\2st\5&\24\2tu\t\3"+
		"\2\2uv\5\26\f\2v\25\3\2\2\2wy\b\f\1\2xz\7\31\2\2yx\3\2\2\2yz\3\2\2\2z"+
		"{\3\2\2\2{|\7\r\2\2|}\5\26\f\2}~\7\16\2\2~\u0081\3\2\2\2\177\u0081\5\""+
		"\22\2\u0080w\3\2\2\2\u0080\177\3\2\2\2\u0081\u0098\3\2\2\2\u0082\u0083"+
		"\f\t\2\2\u0083\u0084\5\30\r\2\u0084\u0085\5\26\f\n\u0085\u0097\3\2\2\2"+
		"\u0086\u0087\f\b\2\2\u0087\u0088\5\32\16\2\u0088\u0089\5\26\f\t\u0089"+
		"\u0097\3\2\2\2\u008a\u008b\f\7\2\2\u008b\u008c\5\34\17\2\u008c\u008d\5"+
		"\26\f\b\u008d\u0097\3\2\2\2\u008e\u008f\f\6\2\2\u008f\u0090\5\36\20\2"+
		"\u0090\u0091\5\26\f\7\u0091\u0097\3\2\2\2\u0092\u0093\f\5\2\2\u0093\u0094"+
		"\5 \21\2\u0094\u0095\5\26\f\6\u0095\u0097\3\2\2\2\u0096\u0082\3\2\2\2"+
		"\u0096\u0086\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\27\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\t\4\2\2\u009c\31\3\2\2\2\u009d"+
		"\u009e\t\5\2\2\u009e\33\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\35\3\2\2\2\u00a1"+
		"\u00a2\7\24\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\7\25\2\2\u00a4!\3\2\2\2\u00a5"+
		"\u00a6\b\22\1\2\u00a6\u00ac\5$\23\2\u00a7\u00ac\5&\24\2\u00a8\u00ac\5"+
		",\27\2\u00a9\u00aa\7\31\2\2\u00aa\u00ac\5\"\22\3\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b5\3\2"+
		"\2\2\u00ad\u00ae\f\6\2\2\u00ae\u00b4\5.\30\2\u00af\u00b0\f\5\2\2\u00b0"+
		"\u00b4\5*\26\2\u00b1\u00b2\f\4\2\2\u00b2\u00b4\5(\25\2\u00b3\u00ad\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\u00be\5@!\2\u00b9\u00be\58\35\2\u00ba\u00be\5\62\32\2\u00bb\u00be"+
		"\5B\"\2\u00bc\u00be\7\30\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be%\3\2\2\2"+
		"\u00bf\u00c0\b\24\1\2\u00c0\u00c1\7(\2\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3"+
		"\f\5\2\2\u00c3\u00c7\5*\26\2\u00c4\u00c5\f\4\2\2\u00c5\u00c7\5(\25\2\u00c6"+
		"\u00c2\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\'\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc"+
		"\7\17\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\7\20\2\2\u00ce)\3\2\2\2\u00cf"+
		"\u00d0\7\t\2\2\u00d0\u00d1\7(\2\2\u00d1+\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3"+
		"\u00d5\7\r\2\2\u00d4\u00d6\5\60\31\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\16\2\2\u00d8-\3\2\2\2\u00d9\u00da"+
		"\7\t\2\2\u00da\u00db\5,\27\2\u00db/\3\2\2\2\u00dc\u00e1\5\26\f\2\u00dd"+
		"\u00de\7\3\2\2\u00de\u00e0\5\26\f\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\61\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\5\64\33\2\u00e5\u00e7\5\66\34\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\63\3\2\2\2\u00e8\u00ea\7\5\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7+"+
		"\2\2\u00ec\65\3\2\2\2\u00ed\u00ef\7\5\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\67\3\2\2\2\u00f2"+
		"\u00f6\5:\36\2\u00f3\u00f6\5<\37\2\u00f4\u00f6\5> \2\u00f5\u00f2\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f69\3\2\2\2\u00f7\u00f9"+
		"\7\5\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\7/\2\2\u00fb;\3\2\2\2\u00fc\u00fe\7\5\2\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\60\2\2\u0100=\3\2\2\2"+
		"\u0101\u0103\7\5\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\7\61\2\2\u0105?\3\2\2\2\u0106\u0107\t\2\2\2\u0107"+
		"A\3\2\2\2\u0108\u0109\t\7\2\2\u0109C\3\2\2\2\33GOR^mqy\u0080\u0096\u0098"+
		"\u00ab\u00b3\u00b5\u00bd\u00c6\u00c8\u00d5\u00e1\u00e6\u00e9\u00ee\u00f5"+
		"\u00f8\u00fd\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}