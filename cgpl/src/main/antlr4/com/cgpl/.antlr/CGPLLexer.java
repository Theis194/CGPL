// Generated from c://Users//theis//Programmering//CGPL//cgpl//src//main//antlr4//com//cgpl//CGPL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CGPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, STRING=6, BOOLEAN=7, IDENTIFIER=8, 
		RETURN=9, FUNCTION=10, LCURLY=11, RCURLY=12, LPAREN=13, RPAREN=14, IF=15, 
		ELSE=16, VAR=17, FOR=18, IN=19, EQUAL=20, LT=21, GT=22, LT_OR_EQUAL=23, 
		GT_OR_EQUAL=24, AND=25, OR=26, NOT=27, OP_ADD=28, OP_SUB=29, OP_DIV=30, 
		OP_MULT=31, OP_MOD=32, OP_INC=33, OP_DEC=34, CRLF=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", 
			"RETURN", "FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", 
			"VAR", "FOR", "IN", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
			"AND", "OR", "NOT", "OP_ADD", "OP_SUB", "OP_DIV", "OP_MULT", "OP_MOD", 
			"OP_INC", "OP_DEC", "CRLF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "','", "']'", null, null, null, null, "'return'", 
			"'function'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", 
			"'for'", "'in'", "'=='", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", 
			"'not'", "'+'", "'-'", "'/'", "'*'", "'%'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", 
			"RETURN", "FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", 
			"VAR", "FOR", "IN", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
			"AND", "OR", "NOT", "OP_ADD", "OP_SUB", "OP_DIV", "OP_MULT", "OP_MOD", 
			"OP_INC", "OP_DEC", "CRLF"
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
		"\u0004\u0000#\u00ce\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0003\u0004X\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005_\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"l\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007"+
		"s\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0003\"\u00c9\b\"\u0001\"\u0001\"\u0003"+
		"\"\u00cd\b\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#\u0001\u0000\u0005\u0001\u000019\u0001\u000009"+
		"\u0003\u0000\n\n\r\r\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u00d4\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0001G\u0001\u0000\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005K"+
		"\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tW\u0001\u0000"+
		"\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000"+
		"\u000fm\u0001\u0000\u0000\u0000\u0011t\u0001\u0000\u0000\u0000\u0013{"+
		"\u0001\u0000\u0000\u0000\u0015\u0084\u0001\u0000\u0000\u0000\u0017\u0086"+
		"\u0001\u0000\u0000\u0000\u0019\u0088\u0001\u0000\u0000\u0000\u001b\u008a"+
		"\u0001\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f\u008f"+
		"\u0001\u0000\u0000\u0000!\u0094\u0001\u0000\u0000\u0000#\u0098\u0001\u0000"+
		"\u0000\u0000%\u009c\u0001\u0000\u0000\u0000\'\u009f\u0001\u0000\u0000"+
		"\u0000)\u00a2\u0001\u0000\u0000\u0000+\u00a4\u0001\u0000\u0000\u0000-"+
		"\u00a6\u0001\u0000\u0000\u0000/\u00a9\u0001\u0000\u0000\u00001\u00ac\u0001"+
		"\u0000\u0000\u00003\u00b0\u0001\u0000\u0000\u00005\u00b3\u0001\u0000\u0000"+
		"\u00007\u00b7\u0001\u0000\u0000\u00009\u00b9\u0001\u0000\u0000\u0000;"+
		"\u00bb\u0001\u0000\u0000\u0000=\u00bd\u0001\u0000\u0000\u0000?\u00bf\u0001"+
		"\u0000\u0000\u0000A\u00c1\u0001\u0000\u0000\u0000C\u00c4\u0001\u0000\u0000"+
		"\u0000E\u00cc\u0001\u0000\u0000\u0000GH\u0005=\u0000\u0000H\u0002\u0001"+
		"\u0000\u0000\u0000IJ\u0005[\u0000\u0000J\u0004\u0001\u0000\u0000\u0000"+
		"KL\u0005,\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005]\u0000\u0000"+
		"N\b\u0001\u0000\u0000\u0000OS\u0007\u0000\u0000\u0000PR\u0007\u0001\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TX\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VX\u0007\u0001\u0000\u0000WO\u0001\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X\n\u0001\u0000\u0000\u0000Y]\u0005\"\u0000"+
		"\u0000Z\\\b\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\"\u0000\u0000a\f"+
		"\u0001\u0000\u0000\u0000bc\u0005t\u0000\u0000cd\u0005r\u0000\u0000de\u0005"+
		"u\u0000\u0000el\u0005e\u0000\u0000fg\u0005f\u0000\u0000gh\u0005a\u0000"+
		"\u0000hi\u0005l\u0000\u0000ij\u0005s\u0000\u0000jl\u0005e\u0000\u0000"+
		"kb\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000l\u000e\u0001\u0000"+
		"\u0000\u0000mq\u0007\u0003\u0000\u0000np\u0007\u0004\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0010\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tu\u0005r\u0000\u0000uv\u0005e\u0000\u0000vw\u0005t\u0000"+
		"\u0000wx\u0005u\u0000\u0000xy\u0005r\u0000\u0000yz\u0005n\u0000\u0000"+
		"z\u0012\u0001\u0000\u0000\u0000{|\u0005f\u0000\u0000|}\u0005u\u0000\u0000"+
		"}~\u0005n\u0000\u0000~\u007f\u0005c\u0000\u0000\u007f\u0080\u0005t\u0000"+
		"\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082"+
		"\u0083\u0005n\u0000\u0000\u0083\u0014\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005{\u0000\u0000\u0085\u0016\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"}\u0000\u0000\u0087\u0018\u0001\u0000\u0000\u0000\u0088\u0089\u0005(\u0000"+
		"\u0000\u0089\u001a\u0001\u0000\u0000\u0000\u008a\u008b\u0005)\u0000\u0000"+
		"\u008b\u001c\u0001\u0000\u0000\u0000\u008c\u008d\u0005i\u0000\u0000\u008d"+
		"\u008e\u0005f\u0000\u0000\u008e\u001e\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005e\u0000\u0000\u0090\u0091\u0005l\u0000\u0000\u0091\u0092\u0005s"+
		"\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093 \u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005v\u0000\u0000\u0095\u0096\u0005a\u0000\u0000\u0096\u0097"+
		"\u0005r\u0000\u0000\u0097\"\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"f\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a\u009b\u0005r\u0000"+
		"\u0000\u009b$\u0001\u0000\u0000\u0000\u009c\u009d\u0005i\u0000\u0000\u009d"+
		"\u009e\u0005n\u0000\u0000\u009e&\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"=\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1(\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005<\u0000\u0000\u00a3*\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005>\u0000\u0000\u00a5,\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"<\u0000\u0000\u00a7\u00a8\u0005=\u0000\u0000\u00a8.\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab"+
		"0\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005a\u0000\u0000\u00ad\u00ae\u0005"+
		"n\u0000\u0000\u00ae\u00af\u0005d\u0000\u0000\u00af2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000\u00b2"+
		"4\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4\u00b5\u0005"+
		"o\u0000\u0000\u00b5\u00b6\u0005t\u0000\u0000\u00b66\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005+\u0000\u0000\u00b88\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005-\u0000\u0000\u00ba:\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"/\u0000\u0000\u00bc<\u0001\u0000\u0000\u0000\u00bd\u00be\u0005*\u0000"+
		"\u0000\u00be>\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005%\u0000\u0000\u00c0"+
		"@\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005+\u0000\u0000\u00c2\u00c3\u0005"+
		"+\u0000\u0000\u00c3B\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005-\u0000"+
		"\u0000\u00c5\u00c6\u0005-\u0000\u0000\u00c6D\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0005\r\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0005\n\u0000\u0000\u00cb\u00cd\u0005\r\u0000\u0000\u00cc\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cdF\u0001\u0000"+
		"\u0000\u0000\b\u0000SW]kq\u00c8\u00cc\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}