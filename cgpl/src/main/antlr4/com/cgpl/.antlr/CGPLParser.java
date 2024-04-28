// Generated from c:/Uni/P4/CGPL/cgpl/src/main/antlr4/com/cgpl/CGPL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CGPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, NOT=7, RETURN=8, FUNCTION=9, 
		LCURLY=10, RCURLY=11, LPAREN=12, RPAREN=13, IF=14, ELSE=15, VAR=16, FOR=17, 
		WHILE=18, IN=19, NUMBER=20, STRING=21, BOOLEAN=22, IDENTIFIER=23, EQUAL=24, 
		LT=25, GT=26, LT_OR_EQUAL=27, GT_OR_EQUAL=28, OP_INC=29, OP_DEC=30, OP_DIV=31, 
		OP_MULT=32, OP_MOD=33, OP_ADD=34, OP_SUB=35, CRLF=36, WS=37;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_functionBody = 5, RULE_ifstmt = 6, RULE_forstmt = 7, 
		RULE_whilestmt = 8, RULE_function = 9, RULE_value = 10, RULE_boolvalue = 11, 
		RULE_andExpr = 12, RULE_orExpr = 13, RULE_boolExpr = 14, RULE_factor = 15, 
		RULE_arthexp = 16, RULE_increment = 17, RULE_decrement = 18, RULE_comparison = 19, 
		RULE_arth_op = 20, RULE_list = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "vardcl", "assignment", "returnstmt", "functionBody", 
			"ifstmt", "forstmt", "whilestmt", "function", "value", "boolvalue", "andExpr", 
			"orExpr", "boolExpr", "factor", "arthexp", "increment", "decrement", 
			"comparison", "arth_op", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "','", "']'", "'and'", "'or'", "'not'", "'return'", 
			"'function'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", 
			"'for'", "'while'", "'in'", null, null, null, null, "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", "'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AND", "OR", "NOT", "RETURN", "FUNCTION", 
			"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "FOR", "WHILE", 
			"IN", "NUMBER", "STRING", "BOOLEAN", "IDENTIFIER", "EQUAL", "LT", "GT", 
			"LT_OR_EQUAL", "GT_OR_EQUAL", "OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", 
			"OP_MOD", "OP_ADD", "OP_SUB", "CRLF", "WS"
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
	public String getGrammarFileName() { return "CGPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CGPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CGPLParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8602368L) != 0)) {
				{
				{
				setState(44);
				instruction();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public VardclContext vardcl() {
			return getRuleContext(VardclContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				vardcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				forstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				returnstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				assignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				increment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				decrement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CGPLParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode CRLF() { return getToken(CGPLParser.CRLF, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VardclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardcl; }
	}

	public final VardclContext vardcl() throws RecognitionException {
		VardclContext _localctx = new VardclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(VAR);
			setState(63);
			match(IDENTIFIER);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(64);
				match(T__0);
				setState(65);
				value();
				}
			}

			setState(68);
			match(CRLF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(CGPLParser.CRLF, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(T__0);
			setState(72);
			value();
			setState(73);
			match(CRLF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CGPLParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(CGPLParser.CRLF, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(RETURN);
			setState(76);
			value();
			setState(77);
			match(CRLF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8602368L) != 0)) {
				{
				{
				setState(79);
				instruction();
				}
				}
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CGPLParser.IF, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CGPLParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IF);
			setState(86);
			value();
			setState(87);
			instruction();
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(88);
				match(ELSE);
				setState(89);
				instruction();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CGPLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public VardclContext vardcl() {
			return getRuleContext(VardclContext.class,0);
		}
		public BoolvalueContext boolvalue() {
			return getRuleContext(BoolvalueContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(CGPLParser.IN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forstmt);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(FOR);
				setState(93);
				match(LPAREN);
				setState(94);
				vardcl();
				setState(95);
				boolvalue();
				setState(96);
				arthexp();
				setState(97);
				match(RPAREN);
				setState(98);
				match(LCURLY);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8602368L) != 0)) {
					{
					{
					setState(99);
					instruction();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(FOR);
				setState(108);
				match(LPAREN);
				setState(109);
				match(IDENTIFIER);
				setState(110);
				match(IN);
				setState(111);
				value();
				setState(112);
				match(RPAREN);
				setState(113);
				match(LCURLY);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8602368L) != 0)) {
					{
					{
					setState(114);
					instruction();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CGPLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public BoolvalueContext boolvalue() {
			return getRuleContext(BoolvalueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WHILE);
			setState(125);
			match(LPAREN);
			setState(126);
			boolvalue();
			setState(127);
			match(RPAREN);
			setState(128);
			match(LCURLY);
			setState(129);
			instruction();
			setState(130);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CGPLParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CGPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CGPLParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FUNCTION);
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(LPAREN);
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(RPAREN);
			setState(137);
			match(LCURLY);
			setState(138);
			functionBody();
			setState(139);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(CGPLParser.STRING, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				boolExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				arthexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolvalueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public TerminalNode BOOLEAN() { return getToken(CGPLParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public BoolvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvalue; }
	}

	public final BoolvalueContext boolvalue() throws RecognitionException {
		BoolvalueContext _localctx = new BoolvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolvalue);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(LPAREN);
				setState(150);
				boolExpr();
				setState(151);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<BoolvalueContext> boolvalue() {
			return getRuleContexts(BoolvalueContext.class);
		}
		public BoolvalueContext boolvalue(int i) {
			return getRuleContext(BoolvalueContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CGPLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CGPLParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			boolvalue();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(158);
				match(AND);
				setState(159);
				boolvalue();
				}
				}
				setState(164);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CGPLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CGPLParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			andExpr();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(166);
				match(OR);
				setState(167);
				andExpr();
				}
				}
				setState(172);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			orExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(LPAREN);
				setState(178);
				arthexp();
				setState(179);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArthexpContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Arth_opContext> arth_op() {
			return getRuleContexts(Arth_opContext.class);
		}
		public Arth_opContext arth_op(int i) {
			return getRuleContext(Arth_opContext.class,i);
		}
		public ArthexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthexp; }
	}

	public final ArthexpContext arthexp() throws RecognitionException {
		ArthexpContext _localctx = new ArthexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arthexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			factor();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0)) {
				{
				{
				setState(184);
				arth_op();
				setState(185);
				factor();
				}
				}
				setState(191);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode OP_INC() { return getToken(CGPLParser.OP_INC, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(OP_INC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode OP_DEC() { return getToken(CGPLParser.OP_DEC, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(OP_DEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CGPLParser.LT, 0); }
		public TerminalNode GT() { return getToken(CGPLParser.GT, 0); }
		public TerminalNode LT_OR_EQUAL() { return getToken(CGPLParser.LT_OR_EQUAL, 0); }
		public TerminalNode GT_OR_EQUAL() { return getToken(CGPLParser.GT_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CGPLParser.EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arth_opContext extends ParserRuleContext {
		public TerminalNode OP_ADD() { return getToken(CGPLParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CGPLParser.OP_SUB, 0); }
		public TerminalNode OP_DIV() { return getToken(CGPLParser.OP_DIV, 0); }
		public TerminalNode OP_MULT() { return getToken(CGPLParser.OP_MULT, 0); }
		public TerminalNode OP_MOD() { return getToken(CGPLParser.OP_MOD, 0); }
		public Arth_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arth_op; }
	}

	public final Arth_opContext arth_op() throws RecognitionException {
		Arth_opContext _localctx = new Arth_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arth_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__1);
				setState(203);
				value();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(204);
					match(T__2);
					setState(205);
					value();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__1);
				setState(214);
				match(T__3);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005"+
		"Q\b\u0005\n\u0005\f\u0005T\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007e\b\u0007\n\u0007\f\u0007h\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007t\b\u0007\n\u0007\f\u0007w\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0094\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00a1\b\f\n\f\f\f\u00a4\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00a9\b\r\n\r\f\r\u00ac\t\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00bc\b\u0010\n\u0010\f\u0010\u00bf\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00cf\b\u0015\n\u0015\f\u0015\u00d2\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d8\b\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0002\u0001\u0000\u0018\u001c\u0001\u0000"+
		"\u001f#\u00df\u0000/\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000"+
		"\u0000\u0004>\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\b"+
		"K\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000"+
		"\u0000\u000ez\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012"+
		"\u0084\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016"+
		"\u009b\u0001\u0000\u0000\u0000\u0018\u009d\u0001\u0000\u0000\u0000\u001a"+
		"\u00a5\u0001\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e"+
		"\u00b5\u0001\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00c0"+
		"\u0001\u0000\u0000\u0000$\u00c3\u0001\u0000\u0000\u0000&\u00c6\u0001\u0000"+
		"\u0000\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00d7\u0001\u0000\u0000\u0000"+
		",.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0000\u0000\u00013\u0001"+
		"\u0001\u0000\u0000\u00004=\u0003\u0004\u0002\u00005=\u0003\u0012\t\u0000"+
		"6=\u0003\f\u0006\u00007=\u0003\u000e\u0007\u00008=\u0003\b\u0004\u0000"+
		"9=\u0003\u0006\u0003\u0000:=\u0003\"\u0011\u0000;=\u0003$\u0012\u0000"+
		"<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000"+
		"\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0003"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0010\u0000\u0000?B\u0005\u0017\u0000"+
		"\u0000@A\u0005\u0001\u0000\u0000AC\u0003\u0014\n\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005$\u0000"+
		"\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005\u0017\u0000\u0000GH\u0005"+
		"\u0001\u0000\u0000HI\u0003\u0014\n\u0000IJ\u0005$\u0000\u0000J\u0007\u0001"+
		"\u0000\u0000\u0000KL\u0005\b\u0000\u0000LM\u0003\u0014\n\u0000MN\u0005"+
		"$\u0000\u0000N\t\u0001\u0000\u0000\u0000OQ\u0003\u0002\u0001\u0000PO\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\u000e\u0000\u0000VW\u0003\u0014\n\u0000WZ\u0003\u0002"+
		"\u0001\u0000XY\u0005\u000f\u0000\u0000Y[\u0003\u0002\u0001\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\r\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0011\u0000\u0000]^\u0005\f\u0000\u0000^_\u0003\u0004\u0002"+
		"\u0000_`\u0003\u0016\u000b\u0000`a\u0003 \u0010\u0000ab\u0005\r\u0000"+
		"\u0000bf\u0005\n\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"\u000b\u0000\u0000j{\u0001\u0000\u0000\u0000kl\u0005\u0011\u0000\u0000"+
		"lm\u0005\f\u0000\u0000mn\u0005\u0017\u0000\u0000no\u0005\u0013\u0000\u0000"+
		"op\u0003\u0014\n\u0000pq\u0005\r\u0000\u0000qu\u0005\n\u0000\u0000rt\u0003"+
		"\u0002\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u000b\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000z\\\u0001\u0000\u0000\u0000zk\u0001\u0000\u0000\u0000{\u000f"+
		"\u0001\u0000\u0000\u0000|}\u0005\u0012\u0000\u0000}~\u0005\f\u0000\u0000"+
		"~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080"+
		"\u0081\u0005\n\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082\u0083"+
		"\u0005\u000b\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\t\u0000\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\u0087\u0005"+
		"\f\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u0089\u0005\r"+
		"\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b\u0003\n\u0005"+
		"\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u0013\u0001\u0000\u0000"+
		"\u0000\u008d\u0094\u0005\u0014\u0000\u0000\u008e\u0094\u0005\u0015\u0000"+
		"\u0000\u008f\u0094\u0003\u001c\u000e\u0000\u0090\u0094\u0003 \u0010\u0000"+
		"\u0091\u0094\u0005\u0017\u0000\u0000\u0092\u0094\u0003*\u0015\u0000\u0093"+
		"\u008d\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u0097"+
		"\u0003\u001c\u000e\u0000\u0097\u0098\u0005\r\u0000\u0000\u0098\u009c\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0005\u0016\u0000\u0000\u009a\u009c\u0005"+
		"\u0017\u0000\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0017\u0001"+
		"\u0000\u0000\u0000\u009d\u00a2\u0003\u0016\u000b\u0000\u009e\u009f\u0005"+
		"\u0005\u0000\u0000\u009f\u00a1\u0003\u0016\u000b\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u0019\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003"+
		"\u0018\f\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a9\u0003\u0018"+
		"\f\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u001d\u0001\u0000\u0000\u0000"+
		"\u00af\u00b6\u0005\u0014\u0000\u0000\u00b0\u00b6\u0005\u0017\u0000\u0000"+
		"\u00b1\u00b2\u0005\f\u0000\u0000\u00b2\u00b3\u0003 \u0010\u0000\u00b3"+
		"\u00b4\u0005\r\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00af"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00bd"+
		"\u0003\u001e\u000f\u0000\u00b8\u00b9\u0003(\u0014\u0000\u00b9\u00ba\u0003"+
		"\u001e\u000f\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be!\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0017"+
		"\u0000\u0000\u00c1\u00c2\u0005\u001d\u0000\u0000\u00c2#\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u00c5\u0005\u001e\u0000"+
		"\u0000\u00c5%\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0000\u0000\u0000"+
		"\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00c9\u0007\u0001\u0000\u0000\u00c9"+
		")\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb\u00d0"+
		"\u0003\u0014\n\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00cf\u0003"+
		"\u0014\n\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000\u00d6\u00d8\u0005\u0004"+
		"\u0000\u0000\u00d7\u00ca\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8+\u0001\u0000\u0000\u0000\u0010/<BRZfuz\u0093\u009b"+
		"\u00a2\u00aa\u00b5\u00bd\u00d0\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}