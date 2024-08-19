package fr.dauphine.eu.RulesBuilder;// Generated from src/main/resources/antlr4/Farm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FarmLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "EQUALS_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", 
			"GREATER_THAN_EQUALS_OPERATOR", "LESS_THAN_EQUALS_OPERATOR", "NOT_EQUALS_OPERATOR", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ISC", "IC", 
			"PLUS", "MINUS", "DIV", "MUL", "MOD", "DOT", "SEMICOLON", "LR_BRACE", 
			"RR_BRACE", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", "RULE", 
			"WHEN", "THEN", "AND", "OR", "TRUE", "FALSE", "NIL_LITERAL", "NEGATION", 
			"SALIENCE", "EQUALS", "ASSIGN", "PLUS_ASIGN", "MINUS_ASIGN", "DIV_ASIGN", 
			"MUL_ASIGN", "GT", "LT", "GTE", "LTE", "NOTEQUALS", "BITAND", "BITOR", 
			"SIMPLENAME", "DQUOTA_STRING", "SQUOTA_STRING", "DECIMAL_FLOAT_LIT", 
			"DECIMAL_EXPONENT", "HEX_FLOAT_LIT", "HEX_MANTISA", "HEX_EXPONENT", "DEC_LIT", 
			"HEX_LIT", "OCT_LIT", "HEX_DIGITS", "DEC_DIGITS", "OCT_DIGITS", "DEC_DIGIT", 
			"OCT_DIGIT", "HEX_DIGIT", "SPACE", "COMMENT", "LINE_COMMENT"
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


	public FarmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Farm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u024b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\5&\u014d\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A"+
		"\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\7K\u01bc\nK\fK\16K\u01bf\13K\3L\3L\3L\3L\3L\3L\7L\u01c7\nL\fL\16"+
		"L\u01ca\13L\3L\3L\3M\3M\3M\3M\3M\3M\7M\u01d4\nM\fM\16M\u01d7\13M\3M\3"+
		"M\3N\3N\3N\3N\5N\u01df\nN\3N\3N\3N\3N\3N\3N\5N\u01e7\nN\5N\u01e9\nN\3"+
		"O\3O\3O\5O\u01ee\nO\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\5Q\u01fa\nQ\3Q\3Q\3"+
		"Q\3Q\5Q\u0200\nQ\3R\3R\3R\5R\u0205\nR\3R\3R\3S\3S\3S\5S\u020c\nS\5S\u020e"+
		"\nS\3T\3T\3T\3T\3U\3U\3U\3V\6V\u0218\nV\rV\16V\u0219\3W\6W\u021d\nW\r"+
		"W\16W\u021e\3X\6X\u0222\nX\rX\16X\u0223\3Y\3Y\3Z\3Z\3[\3[\3\\\6\\\u022d"+
		"\n\\\r\\\16\\\u022e\3\\\3\\\3]\3]\3]\3]\7]\u0237\n]\f]\16]\u023a\13]\3"+
		"]\3]\3]\3]\3]\3^\3^\3^\3^\7^\u0245\n^\f^\16^\u0248\13^\3^\3^\3\u0238\2"+
		"_\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G"+
		"\2I\2K\2M\fO\rQ\16S\17U\20W\21Y\22[\23]\24_\25a\26c\27e\30g\31i\32k\33"+
		"m\34o\35q\36s\37u w!y\"{#}$\177%\u0081&\u0083\'\u0085(\u0087)\u0089*\u008b"+
		"+\u008d,\u008f-\u0091.\u0093/\u0095\60\u0097\61\u0099\62\u009b\63\u009d"+
		"\64\u009f\65\u00a1\2\u00a3\66\u00a5\67\u00a78\u00a99\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7:\u00b9;\u00bb<\3\2&\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\17\2C\\c|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\7\2\62;aa\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\4\2$$^^\4\2))^^\3\2\63;\3\2\62;\3\2\62"+
		"9\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0242\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2"+
		"\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2"+
		"\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2"+
		"\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2"+
		"\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\3\u00bd\3\2\2\2\5\u00c1"+
		"\3\2\2\2\7\u00c4\3\2\2\2\t\u00c6\3\2\2\2\13\u00cd\3\2\2\2\r\u00da\3\2"+
		"\2\2\17\u00e4\3\2\2\2\21\u00f8\3\2\2\2\23\u0109\3\2\2\2\25\u0114\3\2\2"+
		"\2\27\u0116\3\2\2\2\31\u0118\3\2\2\2\33\u011a\3\2\2\2\35\u011c\3\2\2\2"+
		"\37\u011e\3\2\2\2!\u0120\3\2\2\2#\u0122\3\2\2\2%\u0124\3\2\2\2\'\u0126"+
		"\3\2\2\2)\u0128\3\2\2\2+\u012a\3\2\2\2-\u012c\3\2\2\2/\u012e\3\2\2\2\61"+
		"\u0130\3\2\2\2\63\u0132\3\2\2\2\65\u0134\3\2\2\2\67\u0136\3\2\2\29\u0138"+
		"\3\2\2\2;\u013a\3\2\2\2=\u013c\3\2\2\2?\u013e\3\2\2\2A\u0140\3\2\2\2C"+
		"\u0142\3\2\2\2E\u0144\3\2\2\2G\u0146\3\2\2\2I\u0148\3\2\2\2K\u014c\3\2"+
		"\2\2M\u014e\3\2\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0154\3\2\2\2U\u0156"+
		"\3\2\2\2W\u0158\3\2\2\2Y\u015a\3\2\2\2[\u015c\3\2\2\2]\u015e\3\2\2\2_"+
		"\u0160\3\2\2\2a\u0162\3\2\2\2c\u0164\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2"+
		"\2\2i\u016d\3\2\2\2k\u0172\3\2\2\2m\u0177\3\2\2\2o\u017a\3\2\2\2q\u017d"+
		"\3\2\2\2s\u0182\3\2\2\2u\u0188\3\2\2\2w\u018c\3\2\2\2y\u018e\3\2\2\2{"+
		"\u0197\3\2\2\2}\u019a\3\2\2\2\177\u019c\3\2\2\2\u0081\u019f\3\2\2\2\u0083"+
		"\u01a2\3\2\2\2\u0085\u01a5\3\2\2\2\u0087\u01a8\3\2\2\2\u0089\u01aa\3\2"+
		"\2\2\u008b\u01ac\3\2\2\2\u008d\u01af\3\2\2\2\u008f\u01b2\3\2\2\2\u0091"+
		"\u01b5\3\2\2\2\u0093\u01b7\3\2\2\2\u0095\u01b9\3\2\2\2\u0097\u01c0\3\2"+
		"\2\2\u0099\u01cd\3\2\2\2\u009b\u01e8\3\2\2\2\u009d\u01ea\3\2\2\2\u009f"+
		"\u01f1\3\2\2\2\u00a1\u01ff\3\2\2\2\u00a3\u0201\3\2\2\2\u00a5\u020d\3\2"+
		"\2\2\u00a7\u020f\3\2\2\2\u00a9\u0213\3\2\2\2\u00ab\u0217\3\2\2\2\u00ad"+
		"\u021c\3\2\2\2\u00af\u0221\3\2\2\2\u00b1\u0225\3\2\2\2\u00b3\u0227\3\2"+
		"\2\2\u00b5\u0229\3\2\2\2\u00b7\u022c\3\2\2\2\u00b9\u0232\3\2\2\2\u00bb"+
		"\u0240\3\2\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7f\2"+
		"\2\u00c0\4\3\2\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\6\3\2\2"+
		"\2\u00c4\u00c5\7.\2\2\u00c5\b\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7"+
		"s\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\n\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7a\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7j\2\2"+
		"\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\f\3\2\2\2\u00da\u00db\7n"+
		"\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7u\2\2\u00de\u00df"+
		"\7a\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\16\3\2\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7j\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7a\2\2\u00f1"+
		"\u00f2\7g\2\2\u00f2\u00f3\7s\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\20\3\2\2\2\u00f8\u00f9\7"+
		"n\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd"+
		"\7a\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7c\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7a\2\2\u0102\u0103\7g\2\2\u0103\u0104\7s\2\2"+
		"\u0104\u0105\7w\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7u\2\2\u0108\22\3\2\2\2\u0109\u010a\7p\2\2\u010a\u010b\7q\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7a\2\2\u010d\u010e\7g\2\2\u010e\u010f\7s\2\2\u010f"+
		"\u0110\7w\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2"+
		"\u0113\24\3\2\2\2\u0114\u0115\t\2\2\2\u0115\26\3\2\2\2\u0116\u0117\t\3"+
		"\2\2\u0117\30\3\2\2\2\u0118\u0119\t\4\2\2\u0119\32\3\2\2\2\u011a\u011b"+
		"\t\5\2\2\u011b\34\3\2\2\2\u011c\u011d\t\6\2\2\u011d\36\3\2\2\2\u011e\u011f"+
		"\t\7\2\2\u011f \3\2\2\2\u0120\u0121\t\b\2\2\u0121\"\3\2\2\2\u0122\u0123"+
		"\t\t\2\2\u0123$\3\2\2\2\u0124\u0125\t\n\2\2\u0125&\3\2\2\2\u0126\u0127"+
		"\t\13\2\2\u0127(\3\2\2\2\u0128\u0129\t\f\2\2\u0129*\3\2\2\2\u012a\u012b"+
		"\t\r\2\2\u012b,\3\2\2\2\u012c\u012d\t\16\2\2\u012d.\3\2\2\2\u012e\u012f"+
		"\t\17\2\2\u012f\60\3\2\2\2\u0130\u0131\t\20\2\2\u0131\62\3\2\2\2\u0132"+
		"\u0133\t\21\2\2\u0133\64\3\2\2\2\u0134\u0135\t\22\2\2\u0135\66\3\2\2\2"+
		"\u0136\u0137\t\23\2\2\u01378\3\2\2\2\u0138\u0139\t\24\2\2\u0139:\3\2\2"+
		"\2\u013a\u013b\t\25\2\2\u013b<\3\2\2\2\u013c\u013d\t\26\2\2\u013d>\3\2"+
		"\2\2\u013e\u013f\t\27\2\2\u013f@\3\2\2\2\u0140\u0141\t\30\2\2\u0141B\3"+
		"\2\2\2\u0142\u0143\t\31\2\2\u0143D\3\2\2\2\u0144\u0145\t\32\2\2\u0145"+
		"F\3\2\2\2\u0146\u0147\t\33\2\2\u0147H\3\2\2\2\u0148\u0149\t\34\2\2\u0149"+
		"J\3\2\2\2\u014a\u014d\5I%\2\u014b\u014d\t\35\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014dL\3\2\2\2\u014e\u014f\7-\2\2\u014fN\3\2\2\2\u0150"+
		"\u0151\7/\2\2\u0151P\3\2\2\2\u0152\u0153\7\61\2\2\u0153R\3\2\2\2\u0154"+
		"\u0155\7,\2\2\u0155T\3\2\2\2\u0156\u0157\7\'\2\2\u0157V\3\2\2\2\u0158"+
		"\u0159\7\60\2\2\u0159X\3\2\2\2\u015a\u015b\7=\2\2\u015bZ\3\2\2\2\u015c"+
		"\u015d\7}\2\2\u015d\\\3\2\2\2\u015e\u015f\7\177\2\2\u015f^\3\2\2\2\u0160"+
		"\u0161\7*\2\2\u0161`\3\2\2\2\u0162\u0163\7+\2\2\u0163b\3\2\2\2\u0164\u0165"+
		"\7]\2\2\u0165d\3\2\2\2\u0166\u0167\7_\2\2\u0167f\3\2\2\2\u0168\u0169\5"+
		"\67\34\2\u0169\u016a\5=\37\2\u016a\u016b\5+\26\2\u016b\u016c\5\35\17\2"+
		"\u016ch\3\2\2\2\u016d\u016e\5A!\2\u016e\u016f\5#\22\2\u016f\u0170\5\35"+
		"\17\2\u0170\u0171\5/\30\2\u0171j\3\2\2\2\u0172\u0173\5;\36\2\u0173\u0174"+
		"\5#\22\2\u0174\u0175\5\35\17\2\u0175\u0176\5/\30\2\u0176l\3\2\2\2\u0177"+
		"\u0178\7(\2\2\u0178\u0179\7(\2\2\u0179n\3\2\2\2\u017a\u017b\7~\2\2\u017b"+
		"\u017c\7~\2\2\u017cp\3\2\2\2\u017d\u017e\5;\36\2\u017e\u017f\5\67\34\2"+
		"\u017f\u0180\5=\37\2\u0180\u0181\5\35\17\2\u0181r\3\2\2\2\u0182\u0183"+
		"\5\37\20\2\u0183\u0184\5\25\13\2\u0184\u0185\5+\26\2\u0185\u0186\59\35"+
		"\2\u0186\u0187\5\35\17\2\u0187t\3\2\2\2\u0188\u0189\5/\30\2\u0189\u018a"+
		"\5%\23\2\u018a\u018b\5+\26\2\u018bv\3\2\2\2\u018c\u018d\7#\2\2\u018dx"+
		"\3\2\2\2\u018e\u018f\59\35\2\u018f\u0190\5\25\13\2\u0190\u0191\5+\26\2"+
		"\u0191\u0192\5%\23\2\u0192\u0193\5\35\17\2\u0193\u0194\5/\30\2\u0194\u0195"+
		"\5\31\r\2\u0195\u0196\5\35\17\2\u0196z\3\2\2\2\u0197\u0198\7?\2\2\u0198"+
		"\u0199\7?\2\2\u0199|\3\2\2\2\u019a\u019b\7?\2\2\u019b~\3\2\2\2\u019c\u019d"+
		"\7-\2\2\u019d\u019e\7?\2\2\u019e\u0080\3\2\2\2\u019f\u01a0\7/\2\2\u01a0"+
		"\u01a1\7?\2\2\u01a1\u0082\3\2\2\2\u01a2\u01a3\7\61\2\2\u01a3\u01a4\7?"+
		"\2\2\u01a4\u0084\3\2\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a7\7?\2\2\u01a7\u0086"+
		"\3\2\2\2\u01a8\u01a9\7@\2\2\u01a9\u0088\3\2\2\2\u01aa\u01ab\7>\2\2\u01ab"+
		"\u008a\3\2\2\2\u01ac\u01ad\7@\2\2\u01ad\u01ae\7?\2\2\u01ae\u008c\3\2\2"+
		"\2\u01af\u01b0\7>\2\2\u01b0\u01b1\7?\2\2\u01b1\u008e\3\2\2\2\u01b2\u01b3"+
		"\7#\2\2\u01b3\u01b4\7?\2\2\u01b4\u0090\3\2\2\2\u01b5\u01b6\7(\2\2\u01b6"+
		"\u0092\3\2\2\2\u01b7\u01b8\7~\2\2\u01b8\u0094\3\2\2\2\u01b9\u01bd\5I%"+
		"\2\u01ba\u01bc\5K&\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u0096\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01c8\7$\2\2\u01c1\u01c2\7^\2\2\u01c2\u01c7\13\2\2\2\u01c3\u01c4\7$\2"+
		"\2\u01c4\u01c7\7$\2\2\u01c5\u01c7\n\36\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7$"+
		"\2\2\u01cc\u0098\3\2\2\2\u01cd\u01d5\7)\2\2\u01ce\u01cf\7^\2\2\u01cf\u01d4"+
		"\13\2\2\2\u01d0\u01d1\7)\2\2\u01d1\u01d4\7)\2\2\u01d2\u01d4\n\37\2\2\u01d3"+
		"\u01ce\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01d9\7)\2\2\u01d9\u009a\3\2\2\2\u01da\u01db\5\u00a5"+
		"S\2\u01db\u01dc\5W,\2\u01dc\u01de\5\u00adW\2\u01dd\u01df\5\u009dO\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e9\3\2\2\2\u01e0\u01e1\5\u00a5"+
		"S\2\u01e1\u01e2\5\u009dO\2\u01e2\u01e9\3\2\2\2\u01e3\u01e4\5W,\2\u01e4"+
		"\u01e6\5\u00adW\2\u01e5\u01e7\5\u009dO\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01da\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8"+
		"\u01e3\3\2\2\2\u01e9\u009c\3\2\2\2\u01ea\u01ed\5\35\17\2\u01eb\u01ee\5"+
		"M\'\2\u01ec\u01ee\5O(\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\5\u00adW\2\u01f0\u009e"+
		"\3\2\2\2\u01f1\u01f2\7\62\2\2\u01f2\u01f3\5C\"\2\u01f3\u01f4\5\u00a1Q"+
		"\2\u01f4\u01f5\5\u00a3R\2\u01f5\u00a0\3\2\2\2\u01f6\u01f7\5\u00abV\2\u01f7"+
		"\u01f9\5W,\2\u01f8\u01fa\5\u00abV\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3"+
		"\2\2\2\u01fa\u0200\3\2\2\2\u01fb\u0200\5\u00abV\2\u01fc\u01fd\5W,\2\u01fd"+
		"\u01fe\5\u00abV\2\u01fe\u0200\3\2\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01fb"+
		"\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200\u00a2\3\2\2\2\u0201\u0204\5\63\32\2"+
		"\u0202\u0205\5M\'\2\u0203\u0205\5O(\2\u0204\u0202\3\2\2\2\u0204\u0203"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\5\u00adW"+
		"\2\u0207\u00a4\3\2\2\2\u0208\u020e\7\62\2\2\u0209\u020b\t \2\2\u020a\u020c"+
		"\5\u00adW\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2"+
		"\2\u020d\u0208\3\2\2\2\u020d\u0209\3\2\2\2\u020e\u00a6\3\2\2\2\u020f\u0210"+
		"\7\62\2\2\u0210\u0211\5C\"\2\u0211\u0212\5\u00abV\2\u0212\u00a8\3\2\2"+
		"\2\u0213\u0214\7\62\2\2\u0214\u0215\5\u00afX\2\u0215\u00aa\3\2\2\2\u0216"+
		"\u0218\5\u00b5[\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u00ac\3\2\2\2\u021b\u021d\5\u00b1Y"+
		"\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u00ae\3\2\2\2\u0220\u0222\5\u00b3Z\2\u0221\u0220\3\2\2"+
		"\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u00b0"+
		"\3\2\2\2\u0225\u0226\t!\2\2\u0226\u00b2\3\2\2\2\u0227\u0228\t\"\2\2\u0228"+
		"\u00b4\3\2\2\2\u0229\u022a\t#\2\2\u022a\u00b6\3\2\2\2\u022b\u022d\t$\2"+
		"\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\b\\\2\2\u0231\u00b8\3\2\2\2\u0232"+
		"\u0233\7\61\2\2\u0233\u0234\7,\2\2\u0234\u0238\3\2\2\2\u0235\u0237\13"+
		"\2\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0239\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7,"+
		"\2\2\u023c\u023d\7\61\2\2\u023d\u023e\3\2\2\2\u023e\u023f\b]\2\2\u023f"+
		"\u00ba\3\2\2\2\u0240\u0241\7\61\2\2\u0241\u0242\7\61\2\2\u0242\u0246\3"+
		"\2\2\2\u0243\u0245\n%\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0249\u024a\b^\2\2\u024a\u00bc\3\2\2\2\30\2\u014c\u01bd\u01c6\u01c8"+
		"\u01d3\u01d5\u01de\u01e6\u01e8\u01ed\u01f9\u01ff\u0204\u020b\u020d\u0219"+
		"\u021e\u0223\u022e\u0238\u0246\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}