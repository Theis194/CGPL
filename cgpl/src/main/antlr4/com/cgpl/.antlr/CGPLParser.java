// Generated from c://Users//Kristoffer//Desktop//CGPL-1//cgpl//src//main//antlr4//com//cgpl//CGPL.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		AND=39, OR=40, NOT=41, RETURN=42, PRINT=43, FUNCTION=44, LCURLY=45, RCURLY=46, 
		LPAREN=47, RPAREN=48, IF=49, ELSE=50, VAR=51, KONST=52, FOR=53, WHILE=54, 
		IN=55, NUMBER=56, STRING=57, BOOLEAN=58, BREAK=59, DECK=60, PLAYER=61, 
		IDENTIFIER=62, EQUAL=63, LT=64, GT=65, LT_OR_EQUAL=66, GT_OR_EQUAL=67, 
		OP_INC=68, OP_DEC=69, OP_DIV=70, OP_MULT=71, OP_MOD=72, OP_ADD=73, OP_SUB=74, 
		CRLF=75, WS=76;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_breakstmt = 5, RULE_printstmt = 6, RULE_functionBody = 7, 
		RULE_ifstmt = 8, RULE_thenBlock = 9, RULE_elseBlock = 10, RULE_forstmt = 11, 
		RULE_whilestmt = 12, RULE_functionCall = 13, RULE_function = 14, RULE_value = 15, 
		RULE_stringConcat = 16, RULE_boolvalue = 17, RULE_andExpr = 18, RULE_orExpr = 19, 
		RULE_boolExpr = 20, RULE_factor = 21, RULE_arthexp = 22, RULE_increment = 23, 
		RULE_decrement = 24, RULE_comparisonExpr = 25, RULE_comparison = 26, RULE_arth_op = 27, 
		RULE_list = 28, RULE_listfunction = 29, RULE_listfunctionname = 30, RULE_deck = 31, 
		RULE_deckfunction = 32, RULE_deckfunctionname = 33, RULE_card = 34, RULE_cardfunction = 35, 
		RULE_cardfunctionname = 36, RULE_suitfunction = 37, RULE_cardvalue = 38, 
		RULE_player = 39, RULE_playerfunction = 40, RULE_playerfunctionname = 41, 
		RULE_switchstmt = 42, RULE_casestmt = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "vardcl", "assignment", "returnstmt", "breakstmt", 
			"printstmt", "functionBody", "ifstmt", "thenBlock", "elseBlock", "forstmt", 
			"whilestmt", "functionCall", "function", "value", "stringConcat", "boolvalue", 
			"andExpr", "orExpr", "boolExpr", "factor", "arthexp", "increment", "decrement", 
			"comparisonExpr", "comparison", "arth_op", "list", "listfunction", "listfunctionname", 
			"deck", "deckfunction", "deckfunctionname", "card", "cardfunction", "cardfunctionname", 
			"suitfunction", "cardvalue", "player", "playerfunction", "playerfunctionname", 
			"switchstmt", "casestmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'['", "']'", "'.'", "'add'", "'remove'", "'get'", 
			"'size'", "'shuffle'", "'draw'", "'fillDeckFrench'", "'addCard'", "'removeCard'", 
			"'deckSize'", "'of'", "'value'", "'suit'", "'color'", "'name'", "'new'", 
			"'Suit'", "'jack'", "'queen'", "'king'", "'ace'", "'drawCard'", "'discardCard'", 
			"'shuffleHand'", "'getHand'", "'getScore'", "'increaseScore'", "'decreaseScore'", 
			"'getHandSize'", "'switch'", "'case'", "'default'", "':'", "'and'", "'or'", 
			"'not'", "'return'", "'print'", "'function'", "'{'", "'}'", "'('", "')'", 
			"'if'", "'else'", "'var'", "'const'", "'for'", "'while'", "'in'", null, 
			null, null, "'break'", "'Deck'", "'Player'", null, "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", "'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AND", "OR", "NOT", "RETURN", "PRINT", "FUNCTION", 
			"LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", "KONST", 
			"FOR", "WHILE", "IN", "NUMBER", "STRING", "BOOLEAN", "BREAK", "DECK", 
			"PLAYER", "IDENTIFIER", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
				{
				{
				setState(88);
				instruction();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
		public SuitfunctionContext suitfunction() {
			return getRuleContext(SuitfunctionContext.class,0);
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
		public PlayerfunctionContext playerfunction() {
			return getRuleContext(PlayerfunctionContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public BreakstmtContext breakstmt() {
			return getRuleContext(BreakstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
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
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				vardcl();
				setState(97);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				suitfunction();
				setState(101);
				match(CRLF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				ifstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				forstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				whilestmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				switchstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				deckfunction();
				setState(108);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				listfunction();
				setState(111);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				playerfunction();
				setState(114);
				match(CRLF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(116);
				card();
				setState(117);
				match(CRLF);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(119);
				returnstmt();
				setState(120);
				match(CRLF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				breakstmt();
				setState(123);
				match(CRLF);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(125);
				printstmt();
				setState(126);
				match(CRLF);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(128);
				assignment();
				setState(129);
				match(CRLF);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(131);
				increment();
				setState(132);
				match(CRLF);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(134);
				decrement();
				setState(135);
				match(CRLF);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(137);
				functionCall();
				setState(138);
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
	}

	public final VardclContext vardcl() throws RecognitionException {
		VardclContext _localctx = new VardclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==KONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(IDENTIFIER);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(144);
				match(T__0);
				setState(145);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__0);
			setState(150);
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
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(RETURN);
			setState(153);
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
	public static class BreakstmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CGPLParser.BREAK, 0); }
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(BREAK);
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
	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CGPLParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PRINT);
			setState(158);
			match(LPAREN);
			setState(159);
			value();
			setState(160);
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
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
				{
				{
				setState(162);
				instruction();
				}
				}
				setState(167);
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ThenBlockContext thenBlock() {
			return getRuleContext(ThenBlockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CGPLParser.ELSE, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			boolExpr();
			setState(170);
			thenBlock();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(171);
				match(ELSE);
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURLY:
					{
					setState(172);
					elseBlock();
					}
					break;
				case IF:
					{
					setState(173);
					ifstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class ThenBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ThenBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenBlock; }
	}

	public final ThenBlockContext thenBlock() throws RecognitionException {
		ThenBlockContext _localctx = new ThenBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_thenBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LCURLY);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
				{
				{
				setState(179);
				instruction();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LCURLY);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
				{
				{
				setState(188);
				instruction();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_forstmt);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(FOR);
				setState(197);
				match(LPAREN);
				setState(198);
				vardcl();
				setState(199);
				match(CRLF);
				setState(200);
				boolExpr();
				setState(201);
				match(CRLF);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(202);
					assignment();
					}
					break;
				case 2:
					{
					setState(203);
					increment();
					}
					break;
				case 3:
					{
					setState(204);
					decrement();
					}
					break;
				}
				setState(207);
				match(RPAREN);
				setState(208);
				match(LCURLY);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
					{
					{
					setState(209);
					instruction();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(FOR);
				setState(218);
				match(LPAREN);
				setState(219);
				match(IDENTIFIER);
				setState(220);
				match(IN);
				setState(221);
				value();
				setState(222);
				match(RPAREN);
				setState(223);
				match(LCURLY);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
					{
					{
					setState(224);
					instruction();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
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
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(WHILE);
			setState(235);
			match(LPAREN);
			setState(236);
			boolExpr();
			setState(237);
			match(RPAREN);
			setState(238);
			match(LCURLY);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5294575132740681728L) != 0)) {
				{
				{
				setState(239);
				instruction();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(LPAREN);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8574996627150864392L) != 0)) {
					{
					setState(249);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(252);
				value();
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					match(T__1);
					setState(254);
					value();
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			}
			setState(261);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FUNCTION);
			setState(264);
			match(IDENTIFIER);
			setState(265);
			match(LPAREN);
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(266);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(267);
					value();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(270);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(271);
					value();
					}
					break;
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(274);
					match(T__1);
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(275);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(276);
						value();
						}
						break;
					}
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(286);
			match(RPAREN);
			setState(287);
			match(LCURLY);
			setState(288);
			functionBody();
			setState(289);
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
		public ListfunctionContext listfunction() {
			return getRuleContext(ListfunctionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DeckfunctionContext deckfunction() {
			return getRuleContext(DeckfunctionContext.class,0);
		}
		public DeckContext deck() {
			return getRuleContext(DeckContext.class,0);
		}
		public CardfunctionContext cardfunction() {
			return getRuleContext(CardfunctionContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StringConcatContext stringConcat() {
			return getRuleContext(StringConcatContext.class,0);
		}
		public PlayerfunctionContext playerfunction() {
			return getRuleContext(PlayerfunctionContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				listfunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				deck();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				cardfunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(299);
				card();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(300);
				boolExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(301);
				comparisonExpr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(302);
				arthexp();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(303);
				functionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(304);
				stringConcat();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(305);
				playerfunction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(306);
				player();
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
	}

	public final StringConcatContext stringConcat() throws RecognitionException {
		StringConcatContext _localctx = new StringConcatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				match(OP_ADD);
				setState(311);
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
				setState(314); 
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CardfunctionContext cardfunction() {
			return getRuleContext(CardfunctionContext.class,0);
		}
		public DeckfunctionContext deckfunction() {
			return getRuleContext(DeckfunctionContext.class,0);
		}
		public ListfunctionContext listfunction() {
			return getRuleContext(ListfunctionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CGPLParser.NOT, 0); }
		public BoolvalueContext boolvalue() {
			return getRuleContext(BoolvalueContext.class,0);
		}
		public BoolvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvalue; }
	}

	public final BoolvalueContext boolvalue() throws RecognitionException {
		BoolvalueContext _localctx = new BoolvalueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolvalue);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(LPAREN);
				setState(317);
				boolExpr();
				setState(318);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				cardfunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				match(NOT);
				setState(327);
				boolvalue();
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
		enterRule(_localctx, 36, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			boolvalue();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(331);
				match(AND);
				setState(332);
				boolvalue();
				}
				}
				setState(337);
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
		enterRule(_localctx, 38, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			andExpr();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(339);
				match(OR);
				setState(340);
				andExpr();
				}
				}
				setState(345);
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
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_boolExpr);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				comparisonExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				orExpr();
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
		public TerminalNode BOOLEAN() { return getToken(CGPLParser.BOOLEAN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CardfunctionContext cardfunction() {
			return getRuleContext(CardfunctionContext.class,0);
		}
		public DeckfunctionContext deckfunction() {
			return getRuleContext(DeckfunctionContext.class,0);
		}
		public ListfunctionContext listfunction() {
			return getRuleContext(ListfunctionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				cardfunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(357);
				match(LPAREN);
				setState(358);
				arthexp();
				setState(359);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(361);
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
	}

	public final ArthexpContext arthexp() throws RecognitionException {
		ArthexpContext _localctx = new ArthexpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arthexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			factor();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 31L) != 0)) {
				{
				{
				setState(365);
				arth_op();
				setState(366);
				factor();
				}
				}
				setState(372);
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
		enterRule(_localctx, 46, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IDENTIFIER);
			setState(374);
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
		enterRule(_localctx, 48, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IDENTIFIER);
			setState(377);
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
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			arthexp();
			setState(380);
			comparison();
			setState(381);
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_arth_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_list);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__2);
				setState(388);
				value();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(389);
					match(T__1);
					setState(390);
					value();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__2);
				setState(399);
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
		public ListfunctionnameContext listfunctionname() {
			return getRuleContext(ListfunctionnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ListfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listfunction; }
	}

	public final ListfunctionContext listfunction() throws RecognitionException {
		ListfunctionContext _localctx = new ListfunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IDENTIFIER);
			setState(403);
			match(T__4);
			setState(404);
			listfunctionname();
			setState(405);
			match(LPAREN);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8574996627150864392L) != 0)) {
				{
				setState(406);
				value();
				}
			}

			setState(409);
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
	public static class ListfunctionnameContext extends ParserRuleContext {
		public ListfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listfunctionname; }
	}

	public final ListfunctionnameContext listfunctionname() throws RecognitionException {
		ListfunctionnameContext _localctx = new ListfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
	public static class DeckContext extends ParserRuleContext {
		public TerminalNode DECK() { return getToken(CGPLParser.DECK, 0); }
		public DeckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deck; }
	}

	public final DeckContext deck() throws RecognitionException {
		DeckContext _localctx = new DeckContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_deck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		public DeckfunctionnameContext deckfunctionname() {
			return getRuleContext(DeckfunctionnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeckfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckfunction; }
	}

	public final DeckfunctionContext deckfunction() throws RecognitionException {
		DeckfunctionContext _localctx = new DeckfunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_deckfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(IDENTIFIER);
			setState(416);
			match(T__4);
			setState(417);
			deckfunctionname();
			setState(418);
			match(LPAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8574996627150864392L) != 0)) {
				{
				setState(419);
				value();
				}
			}

			setState(422);
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
	public static class DeckfunctionnameContext extends ParserRuleContext {
		public DeckfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckfunctionname; }
	}

	public final DeckfunctionnameContext deckfunctionname() throws RecognitionException {
		DeckfunctionnameContext _localctx = new DeckfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_deckfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
	public static class CardContext extends ParserRuleContext {
		public CardvalueContext cardvalue() {
			return getRuleContext(CardvalueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			cardvalue();
			setState(427);
			match(T__15);
			setState(428);
			match(IDENTIFIER);
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
	public static class CardfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public CardfunctionnameContext cardfunctionname() {
			return getRuleContext(CardfunctionnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public CardfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardfunction; }
	}

	public final CardfunctionContext cardfunction() throws RecognitionException {
		CardfunctionContext _localctx = new CardfunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cardfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(IDENTIFIER);
			setState(431);
			match(T__4);
			setState(432);
			cardfunctionname();
			setState(433);
			match(LPAREN);
			setState(434);
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
	public static class CardfunctionnameContext extends ParserRuleContext {
		public CardfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardfunctionname; }
	}

	public final CardfunctionnameContext cardfunctionname() throws RecognitionException {
		CardfunctionnameContext _localctx = new CardfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cardfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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
	public static class SuitfunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(CGPLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CGPLParser.STRING, i);
		}
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public SuitfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suitfunction; }
	}

	public final SuitfunctionContext suitfunction() throws RecognitionException {
		SuitfunctionContext _localctx = new SuitfunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_suitfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__20);
			setState(439);
			match(T__21);
			setState(440);
			match(LPAREN);
			setState(441);
			match(STRING);
			setState(442);
			match(T__1);
			setState(443);
			match(STRING);
			setState(444);
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
	public static class CardvalueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public CardvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardvalue; }
	}

	public final CardvalueContext cardvalue() throws RecognitionException {
		CardvalueContext _localctx = new CardvalueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cardvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594163757056L) != 0)) ) {
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
	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(CGPLParser.PLAYER, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(PLAYER);
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
	public static class PlayerfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public PlayerfunctionnameContext playerfunctionname() {
			return getRuleContext(PlayerfunctionnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CGPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CGPLParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PlayerfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerfunction; }
	}

	public final PlayerfunctionContext playerfunction() throws RecognitionException {
		PlayerfunctionContext _localctx = new PlayerfunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_playerfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(IDENTIFIER);
			setState(451);
			match(T__4);
			setState(452);
			playerfunctionname();
			setState(453);
			match(LPAREN);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8574996627150864392L) != 0)) {
				{
				setState(454);
				value();
				}
			}

			setState(457);
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
	public static class PlayerfunctionnameContext extends ParserRuleContext {
		public PlayerfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerfunctionname; }
	}

	public final PlayerfunctionnameContext playerfunctionname() throws RecognitionException {
		PlayerfunctionnameContext _localctx = new PlayerfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_playerfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34225520640L) != 0)) ) {
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
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__34);
			setState(462);
			match(LPAREN);
			setState(463);
			value();
			setState(464);
			match(RPAREN);
			setState(465);
			match(LCURLY);
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				casestmt();
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 || _la==T__36 );
			setState(471);
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
	}

	public final CasestmtContext casestmt() throws RecognitionException {
		CasestmtContext _localctx = new CasestmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_casestmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				{
				setState(473);
				match(T__35);
				setState(474);
				value();
				}
				break;
			case T__36:
				{
				setState(475);
				match(T__36);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(478);
			match(T__37);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					instruction();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(485);
				match(BREAK);
				setState(486);
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
		"\u0004\u0001L\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u008d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0005\u0007\u00a4\b\u0007\n\u0007\f\u0007\u00a7\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00af\b\b\u0003\b\u00b1\b\b"+
		"\u0001\t\u0001\t\u0005\t\u00b5\b\t\n\t\f\t\u00b8\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00ce\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00d3\b\u000b\n\u000b\f\u000b\u00d6\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e2\b\u000b\n"+
		"\u000b\f\u000b\u00e5\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e9"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f1"+
		"\b\f\n\f\f\f\u00f4\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00fb\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u0100\b\r\u000b\r\f\r\u0101"+
		"\u0003\r\u0104\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0111\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0116\b\u000e\u0005\u000e\u0118\b\u000e\n\u000e\f\u000e\u011b\t\u000e"+
		"\u0003\u000e\u011d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0134\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0139\b"+
		"\u0010\u000b\u0010\f\u0010\u013a\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0149\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u014e\b\u0012\n\u0012\f\u0012\u0151\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0156\b\u0013\n\u0013"+
		"\f\u0013\u0159\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u015d\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u016b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0171\b\u0016\n\u0016\f\u0016\u0174\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0188"+
		"\b\u001c\n\u001c\f\u001c\u018b\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0191\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0003 \u01a5\b \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01c8\b(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0004"+
		"*\u01d4\b*\u000b*\f*\u01d5\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u01dd"+
		"\b+\u0001+\u0001+\u0005+\u01e1\b+\n+\f+\u01e4\t+\u0001+\u0001+\u0003+"+
		"\u01e8\b+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TV\u0000\t\u0001\u000034\u0002\u000099>>\u0001\u0000?C\u0001\u0000FJ\u0001"+
		"\u0000\u0006\t\u0001\u0000\n\u000f\u0001\u0000\u0011\u0014\u0002\u0000"+
		"\u0017\u001a88\u0001\u0000\u001b\"\u0210\u0000[\u0001\u0000\u0000\u0000"+
		"\u0002\u008c\u0001\u0000\u0000\u0000\u0004\u008e\u0001\u0000\u0000\u0000"+
		"\u0006\u0094\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000\n"+
		"\u009b\u0001\u0000\u0000\u0000\f\u009d\u0001\u0000\u0000\u0000\u000e\u00a5"+
		"\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00b2"+
		"\u0001\u0000\u0000\u0000\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00e8"+
		"\u0001\u0000\u0000\u0000\u0018\u00ea\u0001\u0000\u0000\u0000\u001a\u00f7"+
		"\u0001\u0000\u0000\u0000\u001c\u0107\u0001\u0000\u0000\u0000\u001e\u0133"+
		"\u0001\u0000\u0000\u0000 \u0135\u0001\u0000\u0000\u0000\"\u0148\u0001"+
		"\u0000\u0000\u0000$\u014a\u0001\u0000\u0000\u0000&\u0152\u0001\u0000\u0000"+
		"\u0000(\u015c\u0001\u0000\u0000\u0000*\u016a\u0001\u0000\u0000\u0000,"+
		"\u016c\u0001\u0000\u0000\u0000.\u0175\u0001\u0000\u0000\u00000\u0178\u0001"+
		"\u0000\u0000\u00002\u017b\u0001\u0000\u0000\u00004\u017f\u0001\u0000\u0000"+
		"\u00006\u0181\u0001\u0000\u0000\u00008\u0190\u0001\u0000\u0000\u0000:"+
		"\u0192\u0001\u0000\u0000\u0000<\u019b\u0001\u0000\u0000\u0000>\u019d\u0001"+
		"\u0000\u0000\u0000@\u019f\u0001\u0000\u0000\u0000B\u01a8\u0001\u0000\u0000"+
		"\u0000D\u01aa\u0001\u0000\u0000\u0000F\u01ae\u0001\u0000\u0000\u0000H"+
		"\u01b4\u0001\u0000\u0000\u0000J\u01b6\u0001\u0000\u0000\u0000L\u01be\u0001"+
		"\u0000\u0000\u0000N\u01c0\u0001\u0000\u0000\u0000P\u01c2\u0001\u0000\u0000"+
		"\u0000R\u01cb\u0001\u0000\u0000\u0000T\u01cd\u0001\u0000\u0000\u0000V"+
		"\u01dc\u0001\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0000\u0000\u0001_\u0001\u0001\u0000\u0000\u0000`a\u0003\u0004"+
		"\u0002\u0000ab\u0005K\u0000\u0000b\u008d\u0001\u0000\u0000\u0000c\u008d"+
		"\u0003\u001c\u000e\u0000de\u0003J%\u0000ef\u0005K\u0000\u0000f\u008d\u0001"+
		"\u0000\u0000\u0000g\u008d\u0003\u0010\b\u0000h\u008d\u0003\u0016\u000b"+
		"\u0000i\u008d\u0003\u0018\f\u0000j\u008d\u0003T*\u0000kl\u0003@ \u0000"+
		"lm\u0005K\u0000\u0000m\u008d\u0001\u0000\u0000\u0000no\u0003:\u001d\u0000"+
		"op\u0005K\u0000\u0000p\u008d\u0001\u0000\u0000\u0000qr\u0003P(\u0000r"+
		"s\u0005K\u0000\u0000s\u008d\u0001\u0000\u0000\u0000tu\u0003D\"\u0000u"+
		"v\u0005K\u0000\u0000v\u008d\u0001\u0000\u0000\u0000wx\u0003\b\u0004\u0000"+
		"xy\u0005K\u0000\u0000y\u008d\u0001\u0000\u0000\u0000z{\u0003\n\u0005\u0000"+
		"{|\u0005K\u0000\u0000|\u008d\u0001\u0000\u0000\u0000}~\u0003\f\u0006\u0000"+
		"~\u007f\u0005K\u0000\u0000\u007f\u008d\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\u0006\u0003\u0000\u0081\u0082\u0005K\u0000\u0000\u0082\u008d\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0003.\u0017\u0000\u0084\u0085\u0005K\u0000"+
		"\u0000\u0085\u008d\u0001\u0000\u0000\u0000\u0086\u0087\u00030\u0018\u0000"+
		"\u0087\u0088\u0005K\u0000\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0003\u001a\r\u0000\u008a\u008b\u0005K\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c`\u0001\u0000\u0000\u0000\u008cc\u0001\u0000"+
		"\u0000\u0000\u008cd\u0001\u0000\u0000\u0000\u008cg\u0001\u0000\u0000\u0000"+
		"\u008ch\u0001\u0000\u0000\u0000\u008ci\u0001\u0000\u0000\u0000\u008cj"+
		"\u0001\u0000\u0000\u0000\u008ck\u0001\u0000\u0000\u0000\u008cn\u0001\u0000"+
		"\u0000\u0000\u008cq\u0001\u0000\u0000\u0000\u008ct\u0001\u0000\u0000\u0000"+
		"\u008cw\u0001\u0000\u0000\u0000\u008cz\u0001\u0000\u0000\u0000\u008c}"+
		"\u0001\u0000\u0000\u0000\u008c\u0080\u0001\u0000\u0000\u0000\u008c\u0083"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0003\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0007\u0000\u0000\u0000\u008f\u0092\u0005>\u0000\u0000\u0090\u0091\u0005"+
		"\u0001\u0000\u0000\u0091\u0093\u0003\u001e\u000f\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0005\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005>\u0000\u0000\u0095\u0096\u0005\u0001"+
		"\u0000\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097\u0007\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009a\u0003\u001e\u000f"+
		"\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c\u0005;\u0000\u0000"+
		"\u009c\u000b\u0001\u0000\u0000\u0000\u009d\u009e\u0005+\u0000\u0000\u009e"+
		"\u009f\u0005/\u0000\u0000\u009f\u00a0\u0003\u001e\u000f\u0000\u00a0\u00a1"+
		"\u00050\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u00051\u0000\u0000\u00a9\u00aa\u0003(\u0014"+
		"\u0000\u00aa\u00b0\u0003\u0012\t\u0000\u00ab\u00ae\u00052\u0000\u0000"+
		"\u00ac\u00af\u0003\u0014\n\u0000\u00ad\u00af\u0003\u0010\b\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b6\u0005-\u0000\u0000\u00b3\u00b5\u0003\u0002\u0001\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005.\u0000\u0000\u00ba\u0013\u0001\u0000\u0000\u0000\u00bb\u00bf\u0005"+
		"-\u0000\u0000\u00bc\u00be\u0003\u0002\u0001\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005.\u0000"+
		"\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u00055\u0000\u0000"+
		"\u00c5\u00c6\u0005/\u0000\u0000\u00c6\u00c7\u0003\u0004\u0002\u0000\u00c7"+
		"\u00c8\u0005K\u0000\u0000\u00c8\u00c9\u0003(\u0014\u0000\u00c9\u00cd\u0005"+
		"K\u0000\u0000\u00ca\u00ce\u0003\u0006\u0003\u0000\u00cb\u00ce\u0003.\u0017"+
		"\u0000\u00cc\u00ce\u00030\u0018\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u00050\u0000\u0000\u00d0"+
		"\u00d4\u0005-\u0000\u0000\u00d1\u00d3\u0003\u0002\u0001\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005.\u0000\u0000\u00d8\u00e9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"5\u0000\u0000\u00da\u00db\u0005/\u0000\u0000\u00db\u00dc\u0005>\u0000"+
		"\u0000\u00dc\u00dd\u00057\u0000\u0000\u00dd\u00de\u0003\u001e\u000f\u0000"+
		"\u00de\u00df\u00050\u0000\u0000\u00df\u00e3\u0005-\u0000\u0000\u00e0\u00e2"+
		"\u0003\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005.\u0000\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00c4\u0001\u0000\u0000\u0000\u00e8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"6\u0000\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00ed\u0003(\u0014"+
		"\u0000\u00ed\u00ee\u00050\u0000\u0000\u00ee\u00f2\u0005-\u0000\u0000\u00ef"+
		"\u00f1\u0003\u0002\u0001\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005.\u0000\u0000\u00f6\u0019"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005>\u0000\u0000\u00f8\u0103\u0005"+
		"/\u0000\u0000\u00f9\u00fb\u0003\u001e\u000f\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0104\u0001\u0000"+
		"\u0000\u0000\u00fc\u00ff\u0003\u001e\u000f\u0000\u00fd\u00fe\u0005\u0002"+
		"\u0000\u0000\u00fe\u0100\u0003\u001e\u000f\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fc\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u00050\u0000"+
		"\u0000\u0106\u001b\u0001\u0000\u0000\u0000\u0107\u0108\u0005,\u0000\u0000"+
		"\u0108\u0109\u0005>\u0000\u0000\u0109\u011c\u0005/\u0000\u0000\u010a\u010d"+
		"\u0005>\u0000\u0000\u010b\u010d\u0003\u001e\u000f\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u011d\u0001\u0000\u0000\u0000\u010e\u0111\u0005"+
		">\u0000\u0000\u010f\u0111\u0003\u001e\u000f\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0119\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0005\u0002\u0000\u0000\u0113\u0116\u0005>\u0000"+
		"\u0000\u0114\u0116\u0003\u001e\u000f\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000"+
		"\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u010c\u0001\u0000\u0000\u0000\u011c\u0110\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u00050\u0000\u0000"+
		"\u011f\u0120\u0005-\u0000\u0000\u0120\u0121\u0003\u000e\u0007\u0000\u0121"+
		"\u0122\u0005.\u0000\u0000\u0122\u001d\u0001\u0000\u0000\u0000\u0123\u0134"+
		"\u00058\u0000\u0000\u0124\u0134\u0005>\u0000\u0000\u0125\u0134\u00059"+
		"\u0000\u0000\u0126\u0134\u0003:\u001d\u0000\u0127\u0134\u00038\u001c\u0000"+
		"\u0128\u0134\u0003@ \u0000\u0129\u0134\u0003>\u001f\u0000\u012a\u0134"+
		"\u0003F#\u0000\u012b\u0134\u0003D\"\u0000\u012c\u0134\u0003(\u0014\u0000"+
		"\u012d\u0134\u00032\u0019\u0000\u012e\u0134\u0003,\u0016\u0000\u012f\u0134"+
		"\u0003\u001a\r\u0000\u0130\u0134\u0003 \u0010\u0000\u0131\u0134\u0003"+
		"P(\u0000\u0132\u0134\u0003N\'\u0000\u0133\u0123\u0001\u0000\u0000\u0000"+
		"\u0133\u0124\u0001\u0000\u0000\u0000\u0133\u0125\u0001\u0000\u0000\u0000"+
		"\u0133\u0126\u0001\u0000\u0000\u0000\u0133\u0127\u0001\u0000\u0000\u0000"+
		"\u0133\u0128\u0001\u0000\u0000\u0000\u0133\u0129\u0001\u0000\u0000\u0000"+
		"\u0133\u012a\u0001\u0000\u0000\u0000\u0133\u012b\u0001\u0000\u0000\u0000"+
		"\u0133\u012c\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000"+
		"\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000"+
		"\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u001f\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0007\u0001\u0000\u0000\u0136\u0137\u0005I\u0000\u0000\u0137"+
		"\u0139\u0007\u0001\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b!\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005/\u0000\u0000\u013d\u013e\u0003(\u0014\u0000\u013e\u013f\u00050"+
		"\u0000\u0000\u013f\u0149\u0001\u0000\u0000\u0000\u0140\u0149\u0005:\u0000"+
		"\u0000\u0141\u0149\u0005>\u0000\u0000\u0142\u0149\u0003\u001a\r\u0000"+
		"\u0143\u0149\u0003F#\u0000\u0144\u0149\u0003@ \u0000\u0145\u0149\u0003"+
		":\u001d\u0000\u0146\u0147\u0005)\u0000\u0000\u0147\u0149\u0003\"\u0011"+
		"\u0000\u0148\u013c\u0001\u0000\u0000\u0000\u0148\u0140\u0001\u0000\u0000"+
		"\u0000\u0148\u0141\u0001\u0000\u0000\u0000\u0148\u0142\u0001\u0000\u0000"+
		"\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148\u0144\u0001\u0000\u0000"+
		"\u0000\u0148\u0145\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014f\u0003\"\u0011\u0000"+
		"\u014b\u014c\u0005\'\u0000\u0000\u014c\u014e\u0003\"\u0011\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"%\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0157"+
		"\u0003$\u0012\u0000\u0153\u0154\u0005(\u0000\u0000\u0154\u0156\u0003$"+
		"\u0012\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\'\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015d\u00032\u0019\u0000\u015b\u015d\u0003&\u0013\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d"+
		")\u0001\u0000\u0000\u0000\u015e\u016b\u00058\u0000\u0000\u015f\u016b\u0005"+
		">\u0000\u0000\u0160\u016b\u0005:\u0000\u0000\u0161\u016b\u0003\u001a\r"+
		"\u0000\u0162\u016b\u0003F#\u0000\u0163\u016b\u0003@ \u0000\u0164\u016b"+
		"\u0003:\u001d\u0000\u0165\u0166\u0005/\u0000\u0000\u0166\u0167\u0003,"+
		"\u0016\u0000\u0167\u0168\u00050\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0003\u001a\r\u0000\u016a\u015e\u0001\u0000\u0000\u0000"+
		"\u016a\u015f\u0001\u0000\u0000\u0000\u016a\u0160\u0001\u0000\u0000\u0000"+
		"\u016a\u0161\u0001\u0000\u0000\u0000\u016a\u0162\u0001\u0000\u0000\u0000"+
		"\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000"+
		"\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000"+
		"\u016b+\u0001\u0000\u0000\u0000\u016c\u0172\u0003*\u0015\u0000\u016d\u016e"+
		"\u00036\u001b\u0000\u016e\u016f\u0003*\u0015\u0000\u016f\u0171\u0001\u0000"+
		"\u0000\u0000\u0170\u016d\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173-\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0005>\u0000\u0000\u0176\u0177\u0005D\u0000\u0000\u0177"+
		"/\u0001\u0000\u0000\u0000\u0178\u0179\u0005>\u0000\u0000\u0179\u017a\u0005"+
		"E\u0000\u0000\u017a1\u0001\u0000\u0000\u0000\u017b\u017c\u0003,\u0016"+
		"\u0000\u017c\u017d\u00034\u001a\u0000\u017d\u017e\u0003,\u0016\u0000\u017e"+
		"3\u0001\u0000\u0000\u0000\u017f\u0180\u0007\u0002\u0000\u0000\u01805\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0007\u0003\u0000\u0000\u01827\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0189\u0003\u001e"+
		"\u000f\u0000\u0185\u0186\u0005\u0002\u0000\u0000\u0186\u0188\u0003\u001e"+
		"\u000f\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0005\u0004\u0000\u0000\u018d\u0191\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0005\u0003\u0000\u0000\u018f\u0191\u0005\u0004"+
		"\u0000\u0000\u0190\u0183\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u01919\u0001\u0000\u0000\u0000\u0192\u0193\u0005>\u0000\u0000"+
		"\u0193\u0194\u0005\u0005\u0000\u0000\u0194\u0195\u0003<\u001e\u0000\u0195"+
		"\u0197\u0005/\u0000\u0000\u0196\u0198\u0003\u001e\u000f\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u00050\u0000\u0000\u019a;\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0007\u0004\u0000\u0000\u019c=\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005<\u0000\u0000\u019e?\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005>\u0000\u0000\u01a0\u01a1\u0005\u0005\u0000\u0000\u01a1\u01a2"+
		"\u0003B!\u0000\u01a2\u01a4\u0005/\u0000\u0000\u01a3\u01a5\u0003\u001e"+
		"\u000f\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u00050\u0000"+
		"\u0000\u01a7A\u0001\u0000\u0000\u0000\u01a8\u01a9\u0007\u0005\u0000\u0000"+
		"\u01a9C\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003L&\u0000\u01ab\u01ac"+
		"\u0005\u0010\u0000\u0000\u01ac\u01ad\u0005>\u0000\u0000\u01adE\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005>\u0000\u0000\u01af\u01b0\u0005\u0005\u0000"+
		"\u0000\u01b0\u01b1\u0003H$\u0000\u01b1\u01b2\u0005/\u0000\u0000\u01b2"+
		"\u01b3\u00050\u0000\u0000\u01b3G\u0001\u0000\u0000\u0000\u01b4\u01b5\u0007"+
		"\u0006\u0000\u0000\u01b5I\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u0015"+
		"\u0000\u0000\u01b7\u01b8\u0005\u0016\u0000\u0000\u01b8\u01b9\u0005/\u0000"+
		"\u0000\u01b9\u01ba\u00059\u0000\u0000\u01ba\u01bb\u0005\u0002\u0000\u0000"+
		"\u01bb\u01bc\u00059\u0000\u0000\u01bc\u01bd\u00050\u0000\u0000\u01bdK"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0007\u0007\u0000\u0000\u01bfM\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0005=\u0000\u0000\u01c1O\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005>\u0000\u0000\u01c3\u01c4\u0005\u0005\u0000\u0000"+
		"\u01c4\u01c5\u0003R)\u0000\u01c5\u01c7\u0005/\u0000\u0000\u01c6\u01c8"+
		"\u0003\u001e\u000f\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u00050\u0000\u0000\u01caQ\u0001\u0000\u0000\u0000\u01cb\u01cc\u0007\b"+
		"\u0000\u0000\u01ccS\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005#\u0000\u0000"+
		"\u01ce\u01cf\u0005/\u0000\u0000\u01cf\u01d0\u0003\u001e\u000f\u0000\u01d0"+
		"\u01d1\u00050\u0000\u0000\u01d1\u01d3\u0005-\u0000\u0000\u01d2\u01d4\u0003"+
		"V+\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005.\u0000\u0000"+
		"\u01d8U\u0001\u0000\u0000\u0000\u01d9\u01da\u0005$\u0000\u0000\u01da\u01dd"+
		"\u0003\u001e\u000f\u0000\u01db\u01dd\u0005%\u0000\u0000\u01dc\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e2\u0005&\u0000\u0000\u01df\u01e1\u0003\u0002"+
		"\u0001\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e7\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0005;\u0000\u0000\u01e6\u01e8\u0005K\u0000\u0000"+
		"\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8W\u0001\u0000\u0000\u0000&[\u008c\u0092\u00a5\u00ae\u00b0\u00b6"+
		"\u00bf\u00cd\u00d4\u00e3\u00e8\u00f2\u00fa\u0101\u0103\u010c\u0110\u0115"+
		"\u0119\u011c\u0133\u013a\u0148\u014f\u0157\u015c\u016a\u0172\u0189\u0190"+
		"\u0197\u01a4\u01c7\u01d5\u01dc\u01e2\u01e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}