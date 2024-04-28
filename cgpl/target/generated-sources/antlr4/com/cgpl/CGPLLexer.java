// Generated from com\cgpl\CGPL.g4 by ANTLR 4.7.1
package com.cgpl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, NOT=7, RETURN=8, FUNCTION=9, 
		LCURLY=10, RCURLY=11, LPAREN=12, RPAREN=13, IF=14, ELSE=15, VAR=16, FOR=17, 
		WHILE=18, IN=19, NUMBER=20, STRING=21, BOOLEAN=22, IDENTIFIER=23, EQUAL=24, 
		LT=25, GT=26, LT_OR_EQUAL=27, GT_OR_EQUAL=28, OP_INC=29, OP_DEC=30, OP_DIV=31, 
		OP_MULT=32, OP_MOD=33, OP_ADD=34, OP_SUB=35, CRLF=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "AND", "OR", "NOT", "RETURN", "FUNCTION", 
		"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "FOR", "WHILE", 
		"IN", "NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", "EQUAL", "LT", "GT", 
		"LT_OR_EQUAL", "GT_OR_EQUAL", "OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", 
		"OP_MOD", "OP_ADD", "OP_SUB", "CRLF", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'['", "']'", "'and'", "'or'", "'not'", "'return'", 
		"'function'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'for'", 
		"'while'", "'in'", null, null, null, null, "'=='", "'<'", "'>'", "'<='", 
		"'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", "'-'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "AND", "OR", "NOT", "RETURN", "FUNCTION", 
		"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "FOR", "WHILE", 
		"IN", "NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", "EQUAL", "LT", "GT", 
		"LT_OR_EQUAL", "GT_OR_EQUAL", "OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", 
		"OP_MOD", "OP_ADD", "OP_SUB", "CRLF", "WS"
	};
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


	public CGPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CGPL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7"+
		"\25\u0094\n\25\f\25\16\25\u0097\13\25\3\25\5\25\u009a\n\25\3\26\3\26\7"+
		"\26\u009e\n\26\f\26\16\26\u00a1\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00ae\n\27\3\30\3\30\7\30\u00b2\n\30\f\30"+
		"\16\30\u00b5\13\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\6&\u00d7\n&\r&\16&\u00d8\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"\3\2\b\3\2\63;\3\2\62;\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q"+
		"\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21`\3\2\2\2\23"+
		"g\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2"+
		"\37{\3\2\2\2!\u0080\3\2\2\2#\u0084\3\2\2\2%\u0088\3\2\2\2\'\u008e\3\2"+
		"\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b6"+
		"\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00c0\3\2"+
		"\2\2;\u00c3\3\2\2\2=\u00c6\3\2\2\2?\u00c9\3\2\2\2A\u00cb\3\2\2\2C\u00cd"+
		"\3\2\2\2E\u00cf\3\2\2\2G\u00d1\3\2\2\2I\u00d3\3\2\2\2K\u00d6\3\2\2\2M"+
		"N\7?\2\2N\4\3\2\2\2OP\7.\2\2P\6\3\2\2\2QR\7]\2\2R\b\3\2\2\2ST\7_\2\2T"+
		"\n\3\2\2\2UV\7c\2\2VW\7p\2\2WX\7f\2\2X\f\3\2\2\2YZ\7q\2\2Z[\7t\2\2[\16"+
		"\3\2\2\2\\]\7p\2\2]^\7q\2\2^_\7v\2\2_\20\3\2\2\2`a\7t\2\2ab\7g\2\2bc\7"+
		"v\2\2cd\7w\2\2de\7t\2\2ef\7p\2\2f\22\3\2\2\2gh\7h\2\2hi\7w\2\2ij\7p\2"+
		"\2jk\7e\2\2kl\7v\2\2lm\7k\2\2mn\7q\2\2no\7p\2\2o\24\3\2\2\2pq\7}\2\2q"+
		"\26\3\2\2\2rs\7\177\2\2s\30\3\2\2\2tu\7*\2\2u\32\3\2\2\2vw\7+\2\2w\34"+
		"\3\2\2\2xy\7k\2\2yz\7h\2\2z\36\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177"+
		"\7g\2\2\177 \3\2\2\2\u0080\u0081\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7t\2\2\u0083\"\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7t\2\2\u0087$\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d&\3\2\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7p\2\2\u0090(\3\2\2\2\u0091\u0095\t\2\2\2\u0092\u0094"+
		"\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\t\3"+
		"\2\2\u0099\u0091\3\2\2\2\u0099\u0098\3\2\2\2\u009a*\3\2\2\2\u009b\u009f"+
		"\7$\2\2\u009c\u009e\n\4\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\7$\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00ae\7g\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ae\7g\2\2"+
		"\u00ad\u00a4\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae.\3\2\2\2\u00af\u00b3\t"+
		"\5\2\2\u00b0\u00b2\t\6\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\60\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00b7\7?\2\2\u00b7\u00b8\7?\2\2\u00b8\62\3\2\2\2\u00b9\u00ba"+
		"\7>\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7>\2\2\u00be\u00bf\7?\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\u00c5\7-\2\2\u00c5<\3"+
		"\2\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7/\2\2\u00c8>\3\2\2\2\u00c9\u00ca"+
		"\7\61\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7,\2\2\u00ccB\3\2\2\2\u00cd\u00ce"+
		"\7\'\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0F\3\2\2\2\u00d1\u00d2"+
		"\7/\2\2\u00d2H\3\2\2\2\u00d3\u00d4\7=\2\2\u00d4J\3\2\2\2\u00d5\u00d7\t"+
		"\7\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b&\2\2\u00dbL\3\2\2\2\t"+
		"\2\u0095\u0099\u009f\u00ad\u00b3\u00d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}