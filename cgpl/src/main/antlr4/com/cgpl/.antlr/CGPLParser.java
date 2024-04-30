// Generated from c://Users//theis//Programmering//CGPL//cgpl//src//main//antlr4//com//cgpl//CGPL.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, AND=19, OR=20, NOT=21, RETURN=22, FUNCTION=23, LCURLY=24, RCURLY=25, 
		LPAREN=26, RPAREN=27, IF=28, ELSE=29, VAR=30, KONST=31, FOR=32, WHILE=33, 
		IN=34, NUMBER=35, STRING=36, BOOLEAN=37, BREAK=38, IDENTIFIER=39, DECK=40, 
		EQUAL=41, LT=42, GT=43, LT_OR_EQUAL=44, GT_OR_EQUAL=45, OP_INC=46, OP_DEC=47, 
		OP_DIV=48, OP_MULT=49, OP_MOD=50, OP_ADD=51, OP_SUB=52, CRLF=53, WS=54;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_functionBody = 5, RULE_ifstmt = 6, RULE_forstmt = 7, 
		RULE_whilestmt = 8, RULE_functionCall = 9, RULE_function = 10, RULE_value = 11, 
		RULE_stringConcat = 12, RULE_boolvalue = 13, RULE_andExpr = 14, RULE_orExpr = 15, 
		RULE_boolExpr = 16, RULE_factor = 17, RULE_arthexp = 18, RULE_increment = 19, 
		RULE_decrement = 20, RULE_comparisonExpr = 21, RULE_comparison = 22, RULE_arth_op = 23, 
		RULE_list = 24, RULE_listfunction = 25, RULE_deck = 26, RULE_deckfunction = 27, 
		RULE_card = 28, RULE_switchstmt = 29, RULE_casestmt = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "vardcl", "assignment", "returnstmt", "functionBody", 
			"ifstmt", "forstmt", "whilestmt", "functionCall", "function", "value", 
			"stringConcat", "boolvalue", "andExpr", "orExpr", "boolExpr", "factor", 
			"arthexp", "increment", "decrement", "comparisonExpr", "comparison", 
			"arth_op", "list", "listfunction", "deck", "deckfunction", "card", "switchstmt", 
			"casestmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'['", "']'", "'.'", "'add'", "'remove'", "'get'", 
			"'shuffle'", "'draw'", "'value'", "'suit'", "'color'", "'name'", "'switch'", 
			"'case'", "'default'", "':'", "'and'", "'or'", "'not'", "'return'", "'function'", 
			"'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'const'", "'for'", 
			"'while'", "'in'", null, null, null, "'break'", null, "'deck'", "'=='", 
			"'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", 
			"'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "AND", "OR", "NOT", "RETURN", 
			"FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", 
			"KONST", "FOR", "WHILE", "IN", "NUMBER", "STRING", "BOOLEAN", "BREAK", 
			"IDENTIFIER", "DECK", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
			"OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", "OP_MOD", "OP_ADD", "OP_SUB", 
			"CRLF", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
				{
				{
				setState(62);
				instruction();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public TerminalNode CRLF() { return getToken(CGPLParser.CRLF, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public SwitchstmtContext switchstmt() {
			return getRuleContext(SwitchstmtContext.class,0);
		}
		public DeckfunctionContext deckfunction() {
			return getRuleContext(DeckfunctionContext.class,0);
		}
		public ListfunctionContext listfunction() {
			return getRuleContext(ListfunctionContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				vardcl();
				setState(71);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				forstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				switchstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				deckfunction();
				setState(79);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				listfunction();
				setState(82);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				card();
				setState(85);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				returnstmt();
				setState(88);
				match(CRLF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				assignment();
				setState(91);
				match(CRLF);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(93);
				increment();
				setState(94);
				match(CRLF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				decrement();
				setState(97);
				match(CRLF);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(99);
				functionCall();
				setState(100);
				match(CRLF);
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
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode VAR() { return getToken(CGPLParser.VAR, 0); }
		public TerminalNode KONST() { return getToken(CGPLParser.KONST, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VardclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterVardcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitVardcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitVardcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardclContext vardcl() throws RecognitionException {
		VardclContext _localctx = new VardclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==KONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			match(IDENTIFIER);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(106);
				match(T__0);
				setState(107);
				value();
				}
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(T__0);
			setState(112);
			value();
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
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(RETURN);
			setState(115);
			value();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
				{
				{
				setState(117);
				instruction();
				}
				}
				setState(122);
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
		public List<TerminalNode> LCURLY() { return getTokens(CGPLParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(CGPLParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(CGPLParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(CGPLParser.RCURLY, i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			value();
			setState(125);
			match(LCURLY);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
				{
				{
				setState(126);
				instruction();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(RCURLY);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
				match(LCURLY);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
					{
					{
					setState(135);
					instruction();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(RCURLY);
				}
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
		public List<TerminalNode> CRLF() { return getTokens(CGPLParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(CGPLParser.CRLF, i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
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
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forstmt);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(FOR);
				setState(145);
				match(LPAREN);
				setState(146);
				vardcl();
				setState(147);
				match(CRLF);
				setState(148);
				boolExpr();
				setState(149);
				match(CRLF);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(150);
					instruction();
					}
					break;
				case 2:
					{
					setState(151);
					increment();
					}
					break;
				case 3:
					{
					setState(152);
					decrement();
					}
					break;
				}
				setState(155);
				match(RPAREN);
				setState(156);
				match(LCURLY);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
					{
					{
					setState(157);
					instruction();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(FOR);
				setState(166);
				match(LPAREN);
				setState(167);
				match(IDENTIFIER);
				setState(168);
				match(IN);
				setState(169);
				value();
				setState(170);
				match(RPAREN);
				setState(171);
				match(LCURLY);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
					{
					{
					setState(172);
					instruction();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
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
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(WHILE);
			setState(183);
			match(LPAREN);
			setState(184);
			boolExpr();
			setState(185);
			match(RPAREN);
			setState(186);
			match(LCURLY);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
				{
				{
				setState(187);
				instruction();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(LPAREN);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1889852719112L) != 0)) {
					{
					setState(197);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(200);
				value();
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					match(T__1);
					setState(202);
					value();
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			}
			setState(209);
			match(RPAREN);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FUNCTION);
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(LPAREN);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(214);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(215);
					value();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(218);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(219);
					value();
					}
					break;
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(222);
					match(T__1);
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(223);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(224);
						value();
						}
						break;
					}
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(234);
			match(RPAREN);
			setState(235);
			match(LCURLY);
			setState(236);
			functionBody();
			setState(237);
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
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(CGPLParser.STRING, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListfunctionContext listfunction() {
			return getRuleContext(ListfunctionContext.class,0);
		}
		public DeckContext deck() {
			return getRuleContext(DeckContext.class,0);
		}
		public DeckfunctionContext deckfunction() {
			return getRuleContext(DeckfunctionContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StringConcatContext stringConcat() {
			return getRuleContext(StringConcatContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				boolExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				arthexp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				deck();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
				deckfunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				card();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(249);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(250);
				stringConcat();
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
	public static class StringConcatContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(CGPLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CGPLParser.STRING, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CGPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CGPLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(CGPLParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(CGPLParser.OP_ADD, i);
		}
		public StringConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterStringConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitStringConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitStringConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConcatContext stringConcat() throws RecognitionException {
		StringConcatContext _localctx = new StringConcatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(OP_ADD);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OP_ADD );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterBoolvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitBoolvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitBoolvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvalueContext boolvalue() throws RecognitionException {
		BoolvalueContext _localctx = new BoolvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolvalue);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(LPAREN);
				setState(261);
				boolExpr();
				setState(262);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			boolvalue();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(269);
				match(AND);
				setState(270);
				boolvalue();
				}
				}
				setState(275);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			andExpr();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(277);
				match(OR);
				setState(278);
				andExpr();
				}
				}
				setState(283);
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
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolExpr);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				orExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				comparisonExpr();
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(LPAREN);
				setState(291);
				arthexp();
				setState(292);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				functionCall();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterArthexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitArthexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitArthexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArthexpContext arthexp() throws RecognitionException {
		ArthexpContext _localctx = new ArthexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arthexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			factor();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724278030336L) != 0)) {
				{
				{
				setState(298);
				arth_op();
				setState(299);
				factor();
				}
				}
				setState(305);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IDENTIFIER);
			setState(307);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
			setState(310);
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
	public static class ComparisonExprContext extends ParserRuleContext {
		public List<ArthexpContext> arthexp() {
			return getRuleContexts(ArthexpContext.class);
		}
		public ArthexpContext arthexp(int i) {
			return getRuleContext(ArthexpContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			arthexp();
			setState(313);
			comparison();
			setState(314);
			arthexp();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68169720922112L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterArth_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitArth_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitArth_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arth_opContext arth_op() throws RecognitionException {
		Arth_opContext _localctx = new Arth_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arth_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724278030336L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__2);
				setState(321);
				value();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(322);
					match(T__1);
					setState(323);
					value();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__2);
				setState(332);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public ListfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterListfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitListfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitListfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListfunctionContext listfunction() throws RecognitionException {
		ListfunctionContext _localctx = new ListfunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(T__4);
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			match(LPAREN);
			setState(339);
			value();
			setState(340);
			match(RPAREN);
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
	public static class DeckContext extends ParserRuleContext {
		public TerminalNode DECK() { return getToken(CGPLParser.DECK, 0); }
		public DeckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterDeck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitDeck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitDeck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckContext deck() throws RecognitionException {
		DeckContext _localctx = new DeckContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(DECK);
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
	public static class DeckfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeckfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterDeckfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitDeckfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitDeckfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckfunctionContext deckfunction() throws RecognitionException {
		DeckfunctionContext _localctx = new DeckfunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deckfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IDENTIFIER);
			setState(345);
			match(T__4);
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
			match(LPAREN);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1889852719112L) != 0)) {
				{
				setState(348);
				value();
				}
			}

			setState(351);
			match(RPAREN);
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
	public static class CardContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(IDENTIFIER);
			setState(354);
			match(T__4);
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
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
	public static class SwitchstmtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public List<CasestmtContext> casestmt() {
			return getRuleContexts(CasestmtContext.class);
		}
		public CasestmtContext casestmt(int i) {
			return getRuleContext(CasestmtContext.class,i);
		}
		public SwitchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterSwitchstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitSwitchstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitSwitchstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__14);
			setState(358);
			match(LPAREN);
			setState(359);
			value();
			setState(360);
			match(RPAREN);
			setState(361);
			match(LCURLY);
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				casestmt();
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 || _la==T__16 );
			setState(367);
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
	public static class CasestmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(CGPLParser.BREAK, 0); }
		public TerminalNode CRLF() { return getToken(CGPLParser.CRLF, 0); }
		public CasestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterCasestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitCasestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitCasestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestmtContext casestmt() throws RecognitionException {
		CasestmtContext _localctx = new CasestmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_casestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(369);
				match(T__15);
				setState(370);
				value();
				}
				break;
			case T__16:
				{
				setState(371);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374);
			match(T__17);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566142992384L) != 0)) {
				{
				{
				setState(375);
				instruction();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(381);
				match(BREAK);
				setState(382);
				match(CRLF);
				}
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

	public static final String _serializedATN =
		"\u0004\u00016\u0182\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006"+
		"\f\u0006\u0083\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001\u0006\u0003"+
		"\u0006\u008f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009f\b\u0007"+
		"\n\u0007\f\u0007\u00a2\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00ae\b\u0007\n\u0007\f\u0007\u00b1\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00bd\b\b\n\b\f\b\u00c0\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c7\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u00cc"+
		"\b\t\u000b\t\f\t\u00cd\u0003\t\u00d0\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d9\b\n\u0001\n\u0001\n\u0003\n\u00dd"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0005\n\u00e4\b\n\n\n\f"+
		"\n\u00e7\t\n\u0003\n\u00e9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00fc\b\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u0101\b\f\u000b"+
		"\f\f\f\u0102\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010b"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0110\b\u000e\n\u000e"+
		"\f\u000e\u0113\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0118\b\u000f\n\u000f\f\u000f\u011b\t\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u011f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0128\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u012e\b\u0012\n\u0012\f\u0012"+
		"\u0131\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0145\b\u0018\n\u0018\f\u0018\u0148\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014e\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u015e\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u016c\b\u001d\u000b"+
		"\u001d\f\u001d\u016d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0175\b\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0179"+
		"\b\u001e\n\u001e\f\u001e\u017c\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0180\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<\u0000\u0007\u0001\u0000\u001e\u001f\u0002\u0000$$\'\'\u0001\u0000"+
		")-\u0001\u000004\u0001\u0000\u0006\b\u0002\u0000\u0006\u0007\t\n\u0001"+
		"\u0000\u000b\u000e\u01a0\u0000A\u0001\u0000\u0000\u0000\u0002f\u0001\u0000"+
		"\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000"+
		"\br\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f{\u0001\u0000"+
		"\u0000\u0000\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000"+
		"\u0000\u0000\u0012\u00c3\u0001\u0000\u0000\u0000\u0014\u00d3\u0001\u0000"+
		"\u0000\u0000\u0016\u00fb\u0001\u0000\u0000\u0000\u0018\u00fd\u0001\u0000"+
		"\u0000\u0000\u001a\u010a\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000"+
		"\u0000\u0000\u001e\u0114\u0001\u0000\u0000\u0000 \u011e\u0001\u0000\u0000"+
		"\u0000\"\u0127\u0001\u0000\u0000\u0000$\u0129\u0001\u0000\u0000\u0000"+
		"&\u0132\u0001\u0000\u0000\u0000(\u0135\u0001\u0000\u0000\u0000*\u0138"+
		"\u0001\u0000\u0000\u0000,\u013c\u0001\u0000\u0000\u0000.\u013e\u0001\u0000"+
		"\u0000\u00000\u014d\u0001\u0000\u0000\u00002\u014f\u0001\u0000\u0000\u0000"+
		"4\u0156\u0001\u0000\u0000\u00006\u0158\u0001\u0000\u0000\u00008\u0161"+
		"\u0001\u0000\u0000\u0000:\u0165\u0001\u0000\u0000\u0000<\u0174\u0001\u0000"+
		"\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0000\u0000"+
		"\u0001E\u0001\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002\u0000GH\u0005"+
		"5\u0000\u0000Hg\u0001\u0000\u0000\u0000Ig\u0003\u0014\n\u0000Jg\u0003"+
		"\f\u0006\u0000Kg\u0003\u000e\u0007\u0000Lg\u0003\u0010\b\u0000Mg\u0003"+
		":\u001d\u0000NO\u00036\u001b\u0000OP\u00055\u0000\u0000Pg\u0001\u0000"+
		"\u0000\u0000QR\u00032\u0019\u0000RS\u00055\u0000\u0000Sg\u0001\u0000\u0000"+
		"\u0000TU\u00038\u001c\u0000UV\u00055\u0000\u0000Vg\u0001\u0000\u0000\u0000"+
		"WX\u0003\b\u0004\u0000XY\u00055\u0000\u0000Yg\u0001\u0000\u0000\u0000"+
		"Z[\u0003\u0006\u0003\u0000[\\\u00055\u0000\u0000\\g\u0001\u0000\u0000"+
		"\u0000]^\u0003&\u0013\u0000^_\u00055\u0000\u0000_g\u0001\u0000\u0000\u0000"+
		"`a\u0003(\u0014\u0000ab\u00055\u0000\u0000bg\u0001\u0000\u0000\u0000c"+
		"d\u0003\u0012\t\u0000de\u00055\u0000\u0000eg\u0001\u0000\u0000\u0000f"+
		"F\u0001\u0000\u0000\u0000fI\u0001\u0000\u0000\u0000fJ\u0001\u0000\u0000"+
		"\u0000fK\u0001\u0000\u0000\u0000fL\u0001\u0000\u0000\u0000fM\u0001\u0000"+
		"\u0000\u0000fN\u0001\u0000\u0000\u0000fQ\u0001\u0000\u0000\u0000fT\u0001"+
		"\u0000\u0000\u0000fW\u0001\u0000\u0000\u0000fZ\u0001\u0000\u0000\u0000"+
		"f]\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000"+
		"\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000\u0000il\u0005"+
		"\'\u0000\u0000jk\u0005\u0001\u0000\u0000km\u0003\u0016\u000b\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000"+
		"\u0000no\u0005\'\u0000\u0000op\u0005\u0001\u0000\u0000pq\u0003\u0016\u000b"+
		"\u0000q\u0007\u0001\u0000\u0000\u0000rs\u0005\u0016\u0000\u0000st\u0003"+
		"\u0016\u000b\u0000t\t\u0001\u0000\u0000\u0000uw\u0003\u0002\u0001\u0000"+
		"vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y\u000b\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{|\u0005\u001c\u0000\u0000|}\u0003\u0016\u000b\u0000"+
		"}\u0081\u0005\u0018\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u008e"+
		"\u0005\u0019\u0000\u0000\u0085\u0086\u0005\u001d\u0000\u0000\u0086\u008a"+
		"\u0005\u0018\u0000\u0000\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0005\u0019\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		" \u0000\u0000\u0091\u0092\u0005\u001a\u0000\u0000\u0092\u0093\u0003\u0004"+
		"\u0002\u0000\u0093\u0094\u00055\u0000\u0000\u0094\u0095\u0003 \u0010\u0000"+
		"\u0095\u0099\u00055\u0000\u0000\u0096\u009a\u0003\u0002\u0001\u0000\u0097"+
		"\u009a\u0003&\u0013\u0000\u0098\u009a\u0003(\u0014\u0000\u0099\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001b\u0000\u0000\u009c\u00a0\u0005\u0018\u0000\u0000\u009d\u009f\u0003"+
		"\u0002\u0001\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6\u00a7\u0005\u001a"+
		"\u0000\u0000\u00a7\u00a8\u0005\'\u0000\u0000\u00a8\u00a9\u0005\"\u0000"+
		"\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000\u00aa\u00ab\u0005\u001b\u0000"+
		"\u0000\u00ab\u00af\u0005\u0018\u0000\u0000\u00ac\u00ae\u0003\u0002\u0001"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0019\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u0090\u0001\u0000\u0000\u0000\u00b4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b5\u000f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005!\u0000\u0000"+
		"\u00b7\u00b8\u0005\u001a\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9"+
		"\u00ba\u0005\u001b\u0000\u0000\u00ba\u00be\u0005\u0018\u0000\u0000\u00bb"+
		"\u00bd\u0003\u0002\u0001\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0019\u0000\u0000\u00c2"+
		"\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\'\u0000\u0000\u00c4\u00cf"+
		"\u0005\u001a\u0000\u0000\u00c5\u00c7\u0003\u0016\u000b\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d0"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003\u0016\u000b\u0000\u00c9\u00ca"+
		"\u0005\u0002\u0000\u0000\u00ca\u00cc\u0003\u0016\u000b\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u001b\u0000\u0000\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0017\u0000\u0000\u00d4\u00d5\u0005\'\u0000\u0000\u00d5\u00e8\u0005"+
		"\u001a\u0000\u0000\u00d6\u00d9\u0005\'\u0000\u0000\u00d7\u00d9\u0003\u0016"+
		"\u000b\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00e9\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0005\'\u0000\u0000\u00db\u00dd\u0003\u0016\u000b"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e5\u0001\u0000\u0000\u0000\u00de\u00e1\u0005\u0002\u0000"+
		"\u0000\u00df\u00e2\u0005\'\u0000\u0000\u00e0\u00e2\u0003\u0016\u000b\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00d8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00dc\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u001b\u0000\u0000\u00eb\u00ec\u0005\u0018\u0000\u0000"+
		"\u00ec\u00ed\u0003\n\u0005\u0000\u00ed\u00ee\u0005\u0019\u0000\u0000\u00ee"+
		"\u0015\u0001\u0000\u0000\u0000\u00ef\u00fc\u0005#\u0000\u0000\u00f0\u00fc"+
		"\u0005\'\u0000\u0000\u00f1\u00fc\u0005$\u0000\u0000\u00f2\u00fc\u0003"+
		" \u0010\u0000\u00f3\u00fc\u0003$\u0012\u0000\u00f4\u00fc\u00030\u0018"+
		"\u0000\u00f5\u00fc\u00032\u0019\u0000\u00f6\u00fc\u00034\u001a\u0000\u00f7"+
		"\u00fc\u00036\u001b\u0000\u00f8\u00fc\u00038\u001c\u0000\u00f9\u00fc\u0003"+
		"\u0012\t\u0000\u00fa\u00fc\u0003\u0018\f\u0000\u00fb\u00ef\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f0\u0001\u0000\u0000\u0000\u00fb\u00f1\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u0017\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0007\u0001\u0000\u0000\u00fe\u00ff\u00053\u0000"+
		"\u0000\u00ff\u0101\u0007\u0001\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0019\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\u001a\u0000\u0000\u0105\u0106\u0003 \u0010\u0000"+
		"\u0106\u0107\u0005\u001b\u0000\u0000\u0107\u010b\u0001\u0000\u0000\u0000"+
		"\u0108\u010b\u0005%\u0000\u0000\u0109\u010b\u0005\'\u0000\u0000\u010a"+
		"\u0104\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u001b\u0001\u0000\u0000\u0000\u010c"+
		"\u0111\u0003\u001a\r\u0000\u010d\u010e\u0005\u0013\u0000\u0000\u010e\u0110"+
		"\u0003\u001a\r\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u001d\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0119\u0003\u001c\u000e\u0000\u0115\u0116\u0005"+
		"\u0014\u0000\u0000\u0116\u0118\u0003\u001c\u000e\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u001f\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011f\u0003"+
		"\u001e\u000f\u0000\u011d\u011f\u0003*\u0015\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f!\u0001\u0000\u0000"+
		"\u0000\u0120\u0128\u0005#\u0000\u0000\u0121\u0128\u0005\'\u0000\u0000"+
		"\u0122\u0123\u0005\u001a\u0000\u0000\u0123\u0124\u0003$\u0012\u0000\u0124"+
		"\u0125\u0005\u001b\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126"+
		"\u0128\u0003\u0012\t\u0000\u0127\u0120\u0001\u0000\u0000\u0000\u0127\u0121"+
		"\u0001\u0000\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0126"+
		"\u0001\u0000\u0000\u0000\u0128#\u0001\u0000\u0000\u0000\u0129\u012f\u0003"+
		"\"\u0011\u0000\u012a\u012b\u0003.\u0017\u0000\u012b\u012c\u0003\"\u0011"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012a\u0001\u0000\u0000"+
		"\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130%\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\'\u0000\u0000\u0133"+
		"\u0134\u0005.\u0000\u0000\u0134\'\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005\'\u0000\u0000\u0136\u0137\u0005/\u0000\u0000\u0137)\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0003$\u0012\u0000\u0139\u013a\u0003,\u0016\u0000"+
		"\u013a\u013b\u0003$\u0012\u0000\u013b+\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0007\u0002\u0000\u0000\u013d-\u0001\u0000\u0000\u0000\u013e\u013f\u0007"+
		"\u0003\u0000\u0000\u013f/\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0003"+
		"\u0000\u0000\u0141\u0146\u0003\u0016\u000b\u0000\u0142\u0143\u0005\u0002"+
		"\u0000\u0000\u0143\u0145\u0003\u0016\u000b\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0004"+
		"\u0000\u0000\u014a\u014e\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0003"+
		"\u0000\u0000\u014c\u014e\u0005\u0004\u0000\u0000\u014d\u0140\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e1\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005\'\u0000\u0000\u0150\u0151\u0005\u0005\u0000\u0000"+
		"\u0151\u0152\u0007\u0004\u0000\u0000\u0152\u0153\u0005\u001a\u0000\u0000"+
		"\u0153\u0154\u0003\u0016\u000b\u0000\u0154\u0155\u0005\u001b\u0000\u0000"+
		"\u01553\u0001\u0000\u0000\u0000\u0156\u0157\u0005(\u0000\u0000\u01575"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0005\'\u0000\u0000\u0159\u015a\u0005"+
		"\u0005\u0000\u0000\u015a\u015b\u0007\u0005\u0000\u0000\u015b\u015d\u0005"+
		"\u001a\u0000\u0000\u015c\u015e\u0003\u0016\u000b\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005\u001b\u0000\u0000\u01607\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162\u0163\u0005\u0005\u0000"+
		"\u0000\u0163\u0164\u0007\u0006\u0000\u0000\u01649\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u000f\u0000\u0000\u0166\u0167\u0005\u001a\u0000\u0000"+
		"\u0167\u0168\u0003\u0016\u000b\u0000\u0168\u0169\u0005\u001b\u0000\u0000"+
		"\u0169\u016b\u0005\u0018\u0000\u0000\u016a\u016c\u0003<\u001e\u0000\u016b"+
		"\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0019\u0000\u0000\u0170"+
		";\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0010\u0000\u0000\u0172\u0175"+
		"\u0003\u0016\u000b\u0000\u0173\u0175\u0005\u0011\u0000\u0000\u0174\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u017a\u0005\u0012\u0000\u0000\u0177\u0179"+
		"\u0003\u0002\u0001\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c"+
		"\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017f\u0001\u0000\u0000\u0000\u017c\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0005&\u0000\u0000\u017e\u0180\u0005"+
		"5\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180=\u0001\u0000\u0000\u0000#Aflx\u0081\u008a\u008e\u0099"+
		"\u00a0\u00af\u00b4\u00be\u00c6\u00cd\u00cf\u00d8\u00dc\u00e1\u00e5\u00e8"+
		"\u00fb\u0102\u010a\u0111\u0119\u011e\u0127\u012f\u0146\u014d\u015d\u016d"+
		"\u0174\u017a\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}