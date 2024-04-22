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
		IN=18, NUMBER=19, STRING=20, BOOLEAN=21, IDENTIFIER=22, EQUAL=23, LT=24, 
		GT=25, LT_OR_EQUAL=26, GT_OR_EQUAL=27, OP_INC=28, OP_DEC=29, OP_DIV=30, 
		OP_MULT=31, OP_MOD=32, OP_ADD=33, OP_SUB=34, CRLF=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "AND", "OR", "NOT", "RETURN", "FUNCTION", 
		"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "FOR", "IN", 
		"NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", "EQUAL", "LT", "GT", "LT_OR_EQUAL", 
		"GT_OR_EQUAL", "OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", "OP_MOD", "OP_ADD", 
		"OP_SUB", "CRLF", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'['", "']'", "'and'", "'or'", "'not'", "'return'", 
		"'function'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'for'", 
		"'in'", null, null, null, null, "'=='", "'<'", "'>'", "'<='", "'>='", 
		"'++'", "'--'", "'/'", "'*'", "'%'", "'+'", "'-'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "AND", "OR", "NOT", "RETURN", "FUNCTION", 
		"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "FOR", "IN", 
		"NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", "EQUAL", "LT", "GT", "LT_OR_EQUAL", 
		"GT_OR_EQUAL", "OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", "OP_MOD", "OP_ADD", 
		"OP_SUB", "CRLF", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u008c\n\24\f\24\16\24\u008f\13\24"+
		"\3\24\5\24\u0092\n\24\3\25\3\25\7\25\u0096\n\25\f\25\16\25\u0099\13\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a6\n\26"+
		"\3\27\3\27\7\27\u00aa\n\27\f\27\16\27\u00ad\13\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00cf\n%\r%\16%"+
		"\u00d0\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\3\2\63;\3\2\62;\5\2\f\f\17\17$"+
		"$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K"+
		"\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rW\3\2\2\2\17Z\3"+
		"\2\2\2\21^\3\2\2\2\23e\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33"+
		"t\3\2\2\2\35v\3\2\2\2\37y\3\2\2\2!~\3\2\2\2#\u0082\3\2\2\2%\u0086\3\2"+
		"\2\2\'\u0091\3\2\2\2)\u0093\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00ae"+
		"\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00bb\3\2\2\2;\u00be\3\2\2\2=\u00c1\3\2\2\2?\u00c3\3\2\2\2A\u00c5"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00c9\3\2\2\2G\u00cb\3\2\2\2I\u00ce\3\2\2\2K"+
		"L\7?\2\2L\4\3\2\2\2MN\7.\2\2N\6\3\2\2\2OP\7]\2\2P\b\3\2\2\2QR\7_\2\2R"+
		"\n\3\2\2\2ST\7c\2\2TU\7p\2\2UV\7f\2\2V\f\3\2\2\2WX\7q\2\2XY\7t\2\2Y\16"+
		"\3\2\2\2Z[\7p\2\2[\\\7q\2\2\\]\7v\2\2]\20\3\2\2\2^_\7t\2\2_`\7g\2\2`a"+
		"\7v\2\2ab\7w\2\2bc\7t\2\2cd\7p\2\2d\22\3\2\2\2ef\7h\2\2fg\7w\2\2gh\7p"+
		"\2\2hi\7e\2\2ij\7v\2\2jk\7k\2\2kl\7q\2\2lm\7p\2\2m\24\3\2\2\2no\7}\2\2"+
		"o\26\3\2\2\2pq\7\177\2\2q\30\3\2\2\2rs\7*\2\2s\32\3\2\2\2tu\7+\2\2u\34"+
		"\3\2\2\2vw\7k\2\2wx\7h\2\2x\36\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7"+
		"g\2\2} \3\2\2\2~\177\7x\2\2\177\u0080\7c\2\2\u0080\u0081\7t\2\2\u0081"+
		"\"\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085"+
		"$\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088&\3\2\2\2\u0089\u008d"+
		"\t\2\2\2\u008a\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0092\t\3\2\2\u0091\u0089\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"(\3\2\2\2\u0093\u0097\7$\2\2\u0094\u0096\n\4\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7$\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a6\7g\2\2\u00a0"+
		"\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2"+
		"\u00a4\u00a6\7g\2\2\u00a5\u009c\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6,\3\2"+
		"\2\2\u00a7\u00ab\t\5\2\2\u00a8\u00aa\t\6\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac.\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0\60\3"+
		"\2\2\2\u00b1\u00b2\7>\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\64"+
		"\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7\66\3\2\2\2\u00b8"+
		"\u00b9\7@\2\2\u00b9\u00ba\7?\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc"+
		"\u00bd\7-\2\2\u00bd:\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4"+
		"@\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"D\3\2\2\2\u00c9\u00ca\7/\2\2\u00caF\3\2\2\2\u00cb\u00cc\7=\2\2\u00ccH"+
		"\3\2\2\2\u00cd\u00cf\t\7\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b%"+
		"\2\2\u00d3J\3\2\2\2\t\2\u008d\u0091\u0097\u00a5\u00ab\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}