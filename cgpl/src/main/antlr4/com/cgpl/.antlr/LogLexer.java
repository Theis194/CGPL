// Generated from d://Programming//CGPL//cgpl//src//main//antlr4//com//cgpl//Log.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DATE=5, TIME=6, TEXT=7, CRLF=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DIGIT", "TWODIGIT", "LETTER", "DATE", 
			"TIME", "TEXT", "CRLF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'ERROR'", "'INFO'", "'DEBUG'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "DATE", "TIME", "TEXT", "CRLF"
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


	public LogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Log.g4"; }

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
		"\u0004\u0000\bL\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tB\b\t\u000b\t\f\tC\u0001\n\u0003"+
		"\nG\b\n\u0001\n\u0001\n\u0003\nK\b\n\u0000\u0000\u000b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000\r\u0000\u000f\u0005"+
		"\u0011\u0006\u0013\u0007\u0015\b\u0001\u0000\u0002\u0001\u000009\u0002"+
		"\u0000AZazK\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000"+
		"\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000"+
		"\u0000\t*\u0001\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r/\u0001"+
		"\u0000\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000"+
		"\u0000\u0013A\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005 \u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005E\u0000\u0000\u001a\u001b\u0005R\u0000\u0000\u001b\u001c\u0005R"+
		"\u0000\u0000\u001c\u001d\u0005O\u0000\u0000\u001d\u001e\u0005R\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005I\u0000\u0000 !\u0005"+
		"N\u0000\u0000!\"\u0005F\u0000\u0000\"#\u0005O\u0000\u0000#\u0006\u0001"+
		"\u0000\u0000\u0000$%\u0005D\u0000\u0000%&\u0005E\u0000\u0000&\'\u0005"+
		"B\u0000\u0000\'(\u0005U\u0000\u0000()\u0005G\u0000\u0000)\b\u0001\u0000"+
		"\u0000\u0000*+\u0007\u0000\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0003"+
		"\t\u0004\u0000-.\u0003\t\u0004\u0000.\f\u0001\u0000\u0000\u0000/0\u0007"+
		"\u0001\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0003\u000b\u0005"+
		"\u000023\u0003\u000b\u0005\u000034\u0005-\u0000\u000045\u0003\r\u0006"+
		"\u000056\u0003\r\u0006\u000067\u0003\r\u0006\u000078\u0005-\u0000\u0000"+
		"89\u0003\u000b\u0005\u00009\u0010\u0001\u0000\u0000\u0000:;\u0003\u000b"+
		"\u0005\u0000;<\u0005:\u0000\u0000<=\u0003\u000b\u0005\u0000=>\u0005:\u0000"+
		"\u0000>?\u0003\u000b\u0005\u0000?\u0012\u0001\u0000\u0000\u0000@B\u0003"+
		"\r\u0006\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0014\u0001\u0000\u0000"+
		"\u0000EG\u0005\r\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HK\u0005\n\u0000\u0000IK\u0005\r\u0000"+
		"\u0000JF\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0016\u0001"+
		"\u0000\u0000\u0000\u0004\u0000CFJ\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}