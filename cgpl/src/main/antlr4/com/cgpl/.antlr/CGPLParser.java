// Generated from d://Programming//CGPL//cgpl//src//main//antlr4//com//cgpl//CGPL.g4 by ANTLR 4.13.1
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
		T__38=39, AND=40, OR=41, NOT=42, RETURN=43, PRINT=44, FUNCTION=45, LCURLY=46, 
		RCURLY=47, LPAREN=48, RPAREN=49, IF=50, ELSE=51, VAR=52, KONST=53, FOR=54, 
		WHILE=55, IN=56, NUMBER=57, STRING=58, BOOLEAN=59, BREAK=60, DECK=61, 
		PLAYER=62, IDENTIFIER=63, EQUAL=64, LT=65, GT=66, LT_OR_EQUAL=67, GT_OR_EQUAL=68, 
		OP_INC=69, OP_DEC=70, OP_DIV=71, OP_MULT=72, OP_MOD=73, OP_ADD=74, OP_SUB=75, 
		CRLF=76, WS=77;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_breakstmt = 5, RULE_printstmt = 6, RULE_functionBody = 7, 
		RULE_ifstmt = 8, RULE_thenBlock = 9, RULE_elseBlock = 10, RULE_forstmt = 11, 
		RULE_whilestmt = 12, RULE_functionCall = 13, RULE_function = 14, RULE_value = 15, 
		RULE_stringConcat = 16, RULE_boolvalue = 17, RULE_andExpr = 18, RULE_orExpr = 19, 
		RULE_boolExpr = 20, RULE_factor = 21, RULE_binary_mult_div_mod = 22, RULE_term = 23, 
		RULE_arthexp = 24, RULE_increment = 25, RULE_decrement = 26, RULE_comparisonExpr = 27, 
		RULE_comparison = 28, RULE_arth_op = 29, RULE_list = 30, RULE_listfunction = 31, 
		RULE_listfunctionname = 32, RULE_deck = 33, RULE_deckfunction = 34, RULE_deckfunctionname = 35, 
		RULE_card = 36, RULE_cardfunction = 37, RULE_cardfunctionname = 38, RULE_suit = 39, 
		RULE_cardvalue = 40, RULE_player = 41, RULE_playerfunction = 42, RULE_playerfunctionname = 43, 
		RULE_switchstmt = 44, RULE_casestmt = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "vardcl", "assignment", "returnstmt", "breakstmt", 
			"printstmt", "functionBody", "ifstmt", "thenBlock", "elseBlock", "forstmt", 
			"whilestmt", "functionCall", "function", "value", "stringConcat", "boolvalue", 
			"andExpr", "orExpr", "boolExpr", "factor", "binary_mult_div_mod", "term", 
			"arthexp", "increment", "decrement", "comparisonExpr", "comparison", 
			"arth_op", "list", "listfunction", "listfunctionname", "deck", "deckfunction", 
			"deckfunctionname", "card", "cardfunction", "cardfunctionname", "suit", 
			"cardvalue", "player", "playerfunction", "playerfunctionname", "switchstmt", 
			"casestmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'['", "']'", "'.'", "'add'", "'remove'", "'get'", 
			"'size'", "'shuffle'", "'draw'", "'addCard'", "'removeCard'", "'deckSize'", 
			"'of'", "'value'", "'suit'", "'color'", "'name'", "'hearts'", "'diamonds'", 
			"'clubs'", "'spades'", "'jack'", "'queen'", "'king'", "'ace'", "'drawCard'", 
			"'discardCard'", "'shuffleHand'", "'getHand'", "'getScore'", "'increaseScore'", 
			"'decreaseScore'", "'getHandSize'", "'switch'", "'case'", "'default'", 
			"':'", "'and'", "'or'", "'not'", "'return'", "'print'", "'function'", 
			"'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'const'", "'for'", 
			"'while'", "'in'", null, null, null, "'break'", "'Deck'", "'Player'", 
			null, "'=='", "'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'/'", "'*'", 
			"'%'", "'+'", "'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "AND", "OR", "NOT", "RETURN", "PRINT", "FUNCTION", 
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
				{
				{
				setState(92);
				instruction();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				vardcl();
				setState(101);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				forstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				switchstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				deckfunction();
				setState(109);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				listfunction();
				setState(112);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				playerfunction();
				setState(115);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				card();
				setState(118);
				match(CRLF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				returnstmt();
				setState(121);
				match(CRLF);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				breakstmt();
				setState(124);
				match(CRLF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
				printstmt();
				setState(127);
				match(CRLF);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				assignment();
				setState(130);
				match(CRLF);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(132);
				increment();
				setState(133);
				match(CRLF);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(135);
				decrement();
				setState(136);
				match(CRLF);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(138);
				functionCall();
				setState(139);
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
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==KONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			match(IDENTIFIER);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(145);
				match(T__0);
				setState(146);
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
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(T__0);
			setState(151);
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
			setState(153);
			match(RETURN);
			setState(154);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitBreakstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitBreakstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitPrintstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PRINT);
			setState(159);
			match(LPAREN);
			setState(160);
			value();
			setState(161);
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
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
				{
				{
				setState(163);
				instruction();
				}
				}
				setState(168);
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
		enterRule(_localctx, 16, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			boolExpr();
			setState(171);
			thenBlock();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(172);
				match(ELSE);
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURLY:
					{
					setState(173);
					elseBlock();
					}
					break;
				case IF:
					{
					setState(174);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterThenBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitThenBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitThenBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenBlockContext thenBlock() throws RecognitionException {
		ThenBlockContext _localctx = new ThenBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_thenBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LCURLY);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
				{
				{
				setState(180);
				instruction();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LCURLY);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
				{
				{
				setState(189);
				instruction();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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
		enterRule(_localctx, 22, RULE_forstmt);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(FOR);
				setState(198);
				match(LPAREN);
				setState(199);
				vardcl();
				setState(200);
				match(CRLF);
				setState(201);
				boolExpr();
				setState(202);
				match(CRLF);
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(203);
					assignment();
					}
					break;
				case 2:
					{
					setState(204);
					increment();
					}
					break;
				case 3:
					{
					setState(205);
					decrement();
					}
					break;
				}
				setState(208);
				match(RPAREN);
				setState(209);
				match(LCURLY);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
					{
					{
					setState(210);
					instruction();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(FOR);
				setState(219);
				match(LPAREN);
				setState(220);
				match(IDENTIFIER);
				setState(221);
				match(IN);
				setState(222);
				value();
				setState(223);
				match(RPAREN);
				setState(224);
				match(LCURLY);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
					{
					{
					setState(225);
					instruction();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
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
		enterRule(_localctx, 24, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(WHILE);
			setState(236);
			match(LPAREN);
			setState(237);
			boolExpr();
			setState(238);
			match(RPAREN);
			setState(239);
			match(LCURLY);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7857593808232382464L) != 0)) {
				{
				{
				setState(240);
				instruction();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IDENTIFIER);
			setState(249);
			match(LPAREN);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1296750819407822840L) != 0)) {
					{
					setState(250);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(253);
				value();
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					match(T__1);
					setState(255);
					value();
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			}
			setState(262);
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FUNCTION);
			setState(265);
			match(IDENTIFIER);
			setState(266);
			match(LPAREN);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(267);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(268);
					value();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(271);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(272);
					value();
					}
					break;
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(275);
					match(T__1);
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(276);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(277);
						value();
						}
						break;
					}
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(287);
			match(RPAREN);
			setState(288);
			match(LCURLY);
			setState(289);
			functionBody();
			setState(290);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				listfunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				deck();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				cardfunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				card();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				boolExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(302);
				comparisonExpr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(303);
				arthexp(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(304);
				functionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(305);
				stringConcat();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(306);
				playerfunction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(307);
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
		enterRule(_localctx, 32, RULE_stringConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				match(OP_ADD);
				setState(312);
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
				setState(315); 
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
		enterRule(_localctx, 34, RULE_boolvalue);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(LPAREN);
				setState(318);
				boolExpr();
				setState(319);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				cardfunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(327);
				match(NOT);
				setState(328);
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
		enterRule(_localctx, 36, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			boolvalue();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(332);
				match(AND);
				setState(333);
				boolvalue();
				}
				}
				setState(338);
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
		enterRule(_localctx, 38, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			andExpr();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(340);
				match(OR);
				setState(341);
				andExpr();
				}
				}
				setState(346);
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
		enterRule(_localctx, 40, RULE_boolExpr);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				comparisonExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				cardfunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				deckfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				match(LPAREN);
				setState(359);
				arthexp(0);
				setState(360);
				match(RPAREN);
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
	public static class Binary_mult_div_modContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(CGPLParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(CGPLParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(CGPLParser.OP_MOD, 0); }
		public Binary_mult_div_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_mult_div_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterBinary_mult_div_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitBinary_mult_div_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitBinary_mult_div_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_mult_div_modContext binary_mult_div_mod() throws RecognitionException {
		Binary_mult_div_modContext _localctx = new Binary_mult_div_modContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binary_mult_div_mod);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				factor();
				setState(365);
				match(OP_MULT);
				setState(366);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				factor();
				setState(369);
				match(OP_DIV);
				setState(370);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				factor();
				setState(373);
				match(OP_MOD);
				setState(374);
				factor();
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Binary_mult_div_modContext binary_mult_div_mod() {
			return getRuleContext(Binary_mult_div_modContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				binary_mult_div_mod();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(CGPLParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CGPLParser.OP_SUB, 0); }
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
		return arthexp(0);
	}

	private ArthexpContext arthexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArthexpContext _localctx = new ArthexpContext(_ctx, _parentState);
		ArthexpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arthexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ArthexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexp);
						setState(385);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(386);
						match(OP_ADD);
						setState(387);
						term();
						}
						break;
					case 2:
						{
						_localctx = new ArthexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexp);
						setState(388);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(389);
						match(OP_SUB);
						setState(390);
						term();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 50, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(IDENTIFIER);
			setState(397);
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
		enterRule(_localctx, 52, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(IDENTIFIER);
			setState(400);
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
		enterRule(_localctx, 54, RULE_comparisonExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			arthexp(0);
			setState(403);
			comparison();
			setState(404);
			arthexp(0);
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
		enterRule(_localctx, 56, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_arth_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_list);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(T__2);
				setState(411);
				value();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(412);
					match(T__1);
					setState(413);
					value();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(T__2);
				setState(422);
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
		enterRule(_localctx, 62, RULE_listfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(IDENTIFIER);
			setState(426);
			match(T__4);
			setState(427);
			listfunctionname();
			setState(428);
			match(LPAREN);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1296750819407822840L) != 0)) {
				{
				setState(429);
				value();
				}
			}

			setState(432);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterListfunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitListfunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitListfunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListfunctionnameContext listfunctionname() throws RecognitionException {
		ListfunctionnameContext _localctx = new ListfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 66, RULE_deck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		enterRule(_localctx, 68, RULE_deckfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(IDENTIFIER);
			setState(439);
			match(T__4);
			setState(440);
			deckfunctionname();
			setState(441);
			match(LPAREN);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1296750819407822840L) != 0)) {
				{
				setState(442);
				value();
				}
			}

			setState(445);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterDeckfunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitDeckfunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitDeckfunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckfunctionnameContext deckfunctionname() throws RecognitionException {
		DeckfunctionnameContext _localctx = new DeckfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_deckfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
		public SuitContext suit() {
			return getRuleContext(SuitContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			cardvalue();
			setState(450);
			match(T__14);
			setState(451);
			suit();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterCardfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitCardfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitCardfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardfunctionContext cardfunction() throws RecognitionException {
		CardfunctionContext _localctx = new CardfunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cardfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(IDENTIFIER);
			setState(454);
			match(T__4);
			setState(455);
			cardfunctionname();
			setState(456);
			match(LPAREN);
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
	public static class CardfunctionnameContext extends ParserRuleContext {
		public CardfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardfunctionname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterCardfunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitCardfunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitCardfunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardfunctionnameContext cardfunctionname() throws RecognitionException {
		CardfunctionnameContext _localctx = new CardfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cardfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
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
	public static class SuitContext extends ParserRuleContext {
		public SuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterSuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitSuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitSuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuitContext suit() throws RecognitionException {
		SuitContext _localctx = new SuitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_suit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
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
	public static class CardvalueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public CardvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterCardvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitCardvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitCardvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardvalueContext cardvalue() throws RecognitionException {
		CardvalueContext _localctx = new CardvalueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cardvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188327514112L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterPlayerfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitPlayerfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitPlayerfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerfunctionContext playerfunction() throws RecognitionException {
		PlayerfunctionContext _localctx = new PlayerfunctionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_playerfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(IDENTIFIER);
			setState(468);
			match(T__4);
			setState(469);
			playerfunctionname();
			setState(470);
			match(LPAREN);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1296750819407822840L) != 0)) {
				{
				setState(471);
				value();
				}
			}

			setState(474);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).enterPlayerfunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGPLListener ) ((CGPLListener)listener).exitPlayerfunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGPLVisitor ) return ((CGPLVisitor<? extends T>)visitor).visitPlayerfunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerfunctionnameContext playerfunctionname() throws RecognitionException {
		PlayerfunctionnameContext _localctx = new PlayerfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_playerfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68451041280L) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__35);
			setState(479);
			match(LPAREN);
			setState(480);
			value();
			setState(481);
			match(RPAREN);
			setState(482);
			match(LCURLY);
			setState(484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				casestmt();
				}
				}
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__36 || _la==T__37 );
			setState(488);
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
		enterRule(_localctx, 90, RULE_casestmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				{
				setState(490);
				match(T__36);
				setState(491);
				value();
				}
				break;
			case T__37:
				{
				setState(492);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(495);
			match(T__38);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					instruction();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(502);
				match(BREAK);
				setState(503);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return arthexp_sempred((ArthexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arthexp_sempred(ArthexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u01fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u008e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0094\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005"+
		"\u0007\u00a5\b\u0007\n\u0007\f\u0007\u00a8\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b0\b\b\u0003\b\u00b2\b\b\u0001\t"+
		"\u0001\t\u0005\t\u00b6\b\t\n\t\f\t\u00b9\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00cf\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00d4\b\u000b\n\u000b\f\u000b\u00d7\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e3\b\u000b\n\u000b"+
		"\f\u000b\u00e6\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ea\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f2\b\f\n\f"+
		"\f\f\u00f5\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00fc\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u0101\b\r\u000b\r\f\r\u0102\u0003\r"+
		"\u0105\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u010e\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0112\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0117\b"+
		"\u000e\u0005\u000e\u0119\b\u000e\n\u000e\f\u000e\u011c\t\u000e\u0003\u000e"+
		"\u011e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0135\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u013a\b\u0010\u000b\u0010"+
		"\f\u0010\u013b\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u014a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u014f\b\u0012\n\u0012\f\u0012\u0152\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0157\b\u0013\n\u0013\f\u0013\u015a\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u015e\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u016b\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0179\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u017d\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0188\b\u0018\n\u0018\f\u0018"+
		"\u018b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u019f\b\u001e\n\u001e\f\u001e\u01a2\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a8\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01af"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01bc\b\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u01d9\b*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0004,\u01e5\b,\u000b,\f,\u01e6\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0003-\u01ee\b-\u0001-\u0001-\u0005-\u01f2"+
		"\b-\n-\f-\u01f5\t-\u0001-\u0001-\u0003-\u01f9\b-\u0001-\u0000\u00010."+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\n\u0001\u000045\u0002"+
		"\u0000::??\u0001\u0000@D\u0001\u0000GK\u0001\u0000\u0006\t\u0001\u0000"+
		"\n\u000e\u0001\u0000\u0010\u0013\u0001\u0000\u0014\u0017\u0002\u0000\u0018"+
		"\u001b99\u0001\u0000\u001c#\u0221\u0000_\u0001\u0000\u0000\u0000\u0002"+
		"\u008d\u0001\u0000\u0000\u0000\u0004\u008f\u0001\u0000\u0000\u0000\u0006"+
		"\u0095\u0001\u0000\u0000\u0000\b\u0099\u0001\u0000\u0000\u0000\n\u009c"+
		"\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e\u00a6\u0001"+
		"\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000\u0000\u0012\u00b3\u0001"+
		"\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000\u0016\u00e9\u0001"+
		"\u0000\u0000\u0000\u0018\u00eb\u0001\u0000\u0000\u0000\u001a\u00f8\u0001"+
		"\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u0134\u0001"+
		"\u0000\u0000\u0000 \u0136\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000"+
		"\u0000\u0000$\u014b\u0001\u0000\u0000\u0000&\u0153\u0001\u0000\u0000\u0000"+
		"(\u015d\u0001\u0000\u0000\u0000*\u016a\u0001\u0000\u0000\u0000,\u0178"+
		"\u0001\u0000\u0000\u0000.\u017c\u0001\u0000\u0000\u00000\u017e\u0001\u0000"+
		"\u0000\u00002\u018c\u0001\u0000\u0000\u00004\u018f\u0001\u0000\u0000\u0000"+
		"6\u0192\u0001\u0000\u0000\u00008\u0196\u0001\u0000\u0000\u0000:\u0198"+
		"\u0001\u0000\u0000\u0000<\u01a7\u0001\u0000\u0000\u0000>\u01a9\u0001\u0000"+
		"\u0000\u0000@\u01b2\u0001\u0000\u0000\u0000B\u01b4\u0001\u0000\u0000\u0000"+
		"D\u01b6\u0001\u0000\u0000\u0000F\u01bf\u0001\u0000\u0000\u0000H\u01c1"+
		"\u0001\u0000\u0000\u0000J\u01c5\u0001\u0000\u0000\u0000L\u01cb\u0001\u0000"+
		"\u0000\u0000N\u01cd\u0001\u0000\u0000\u0000P\u01cf\u0001\u0000\u0000\u0000"+
		"R\u01d1\u0001\u0000\u0000\u0000T\u01d3\u0001\u0000\u0000\u0000V\u01dc"+
		"\u0001\u0000\u0000\u0000X\u01de\u0001\u0000\u0000\u0000Z\u01ed\u0001\u0000"+
		"\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0000\u0000"+
		"\u0001c\u0001\u0001\u0000\u0000\u0000de\u0003\u0004\u0002\u0000ef\u0005"+
		"L\u0000\u0000f\u008e\u0001\u0000\u0000\u0000g\u008e\u0003\u001c\u000e"+
		"\u0000h\u008e\u0003\u0010\b\u0000i\u008e\u0003\u0016\u000b\u0000j\u008e"+
		"\u0003\u0018\f\u0000k\u008e\u0003X,\u0000lm\u0003D\"\u0000mn\u0005L\u0000"+
		"\u0000n\u008e\u0001\u0000\u0000\u0000op\u0003>\u001f\u0000pq\u0005L\u0000"+
		"\u0000q\u008e\u0001\u0000\u0000\u0000rs\u0003T*\u0000st\u0005L\u0000\u0000"+
		"t\u008e\u0001\u0000\u0000\u0000uv\u0003H$\u0000vw\u0005L\u0000\u0000w"+
		"\u008e\u0001\u0000\u0000\u0000xy\u0003\b\u0004\u0000yz\u0005L\u0000\u0000"+
		"z\u008e\u0001\u0000\u0000\u0000{|\u0003\n\u0005\u0000|}\u0005L\u0000\u0000"+
		"}\u008e\u0001\u0000\u0000\u0000~\u007f\u0003\f\u0006\u0000\u007f\u0080"+
		"\u0005L\u0000\u0000\u0080\u008e\u0001\u0000\u0000\u0000\u0081\u0082\u0003"+
		"\u0006\u0003\u0000\u0082\u0083\u0005L\u0000\u0000\u0083\u008e\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u00032\u0019\u0000\u0085\u0086\u0005L\u0000\u0000"+
		"\u0086\u008e\u0001\u0000\u0000\u0000\u0087\u0088\u00034\u001a\u0000\u0088"+
		"\u0089\u0005L\u0000\u0000\u0089\u008e\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0003\u001a\r\u0000\u008b\u008c\u0005L\u0000\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008dd\u0001\u0000\u0000\u0000\u008dg\u0001\u0000\u0000"+
		"\u0000\u008dh\u0001\u0000\u0000\u0000\u008di\u0001\u0000\u0000\u0000\u008d"+
		"j\u0001\u0000\u0000\u0000\u008dk\u0001\u0000\u0000\u0000\u008dl\u0001"+
		"\u0000\u0000\u0000\u008do\u0001\u0000\u0000\u0000\u008dr\u0001\u0000\u0000"+
		"\u0000\u008du\u0001\u0000\u0000\u0000\u008dx\u0001\u0000\u0000\u0000\u008d"+
		"{\u0001\u0000\u0000\u0000\u008d~\u0001\u0000\u0000\u0000\u008d\u0081\u0001"+
		"\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0087\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0003\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090\u0093\u0005"+
		"?\u0000\u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092\u0094\u0003\u001e"+
		"\u000f\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u0096\u0005?\u0000"+
		"\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0098\u0003\u001e\u000f"+
		"\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099\u009a\u0005+\u0000\u0000"+
		"\u009a\u009b\u0003\u001e\u000f\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005<\u0000\u0000\u009d\u000b\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005,\u0000\u0000\u009f\u00a0\u00050\u0000\u0000\u00a0\u00a1\u0003\u001e"+
		"\u000f\u0000\u00a1\u00a2\u00051\u0000\u0000\u00a2\r\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u000f\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u00052\u0000\u0000"+
		"\u00aa\u00ab\u0003(\u0014\u0000\u00ab\u00b1\u0003\u0012\t\u0000\u00ac"+
		"\u00af\u00053\u0000\u0000\u00ad\u00b0\u0003\u0014\n\u0000\u00ae\u00b0"+
		"\u0003\u0010\b\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0011\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b7\u0005.\u0000\u0000\u00b4\u00b6\u0003\u0002"+
		"\u0001\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005/\u0000\u0000\u00bb\u0013\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c0\u0005.\u0000\u0000\u00bd\u00bf\u0003\u0002\u0001\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u00056\u0000\u0000\u00c6\u00c7\u00050\u0000\u0000\u00c7\u00c8\u0003"+
		"\u0004\u0002\u0000\u00c8\u00c9\u0005L\u0000\u0000\u00c9\u00ca\u0003(\u0014"+
		"\u0000\u00ca\u00ce\u0005L\u0000\u0000\u00cb\u00cf\u0003\u0006\u0003\u0000"+
		"\u00cc\u00cf\u00032\u0019\u0000\u00cd\u00cf\u00034\u001a\u0000\u00ce\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u00051\u0000\u0000\u00d1\u00d5\u0005.\u0000\u0000\u00d2\u00d4\u0003\u0002"+
		"\u0001\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005/\u0000\u0000\u00d9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u00056\u0000\u0000\u00db\u00dc\u00050\u0000\u0000\u00dc"+
		"\u00dd\u0005?\u0000\u0000\u00dd\u00de\u00058\u0000\u0000\u00de\u00df\u0003"+
		"\u001e\u000f\u0000\u00df\u00e0\u00051\u0000\u0000\u00e0\u00e4\u0005.\u0000"+
		"\u0000\u00e1\u00e3\u0003\u0002\u0001\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005/\u0000\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00c5\u0001\u0000\u0000\u0000"+
		"\u00e9\u00da\u0001\u0000\u0000\u0000\u00ea\u0017\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u00057\u0000\u0000\u00ec\u00ed\u00050\u0000\u0000\u00ed\u00ee"+
		"\u0003(\u0014\u0000\u00ee\u00ef\u00051\u0000\u0000\u00ef\u00f3\u0005."+
		"\u0000\u0000\u00f0\u00f2\u0003\u0002\u0001\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005/\u0000"+
		"\u0000\u00f7\u0019\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005?\u0000\u0000"+
		"\u00f9\u0104\u00050\u0000\u0000\u00fa\u00fc\u0003\u001e\u000f\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u0105\u0001\u0000\u0000\u0000\u00fd\u0100\u0003\u001e\u000f\u0000\u00fe"+
		"\u00ff\u0005\u0002\u0000\u0000\u00ff\u0101\u0003\u001e\u000f\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u00fb\u0001\u0000\u0000\u0000\u0104"+
		"\u00fd\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u00051\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005-\u0000\u0000\u0109\u010a\u0005?\u0000\u0000\u010a\u011d\u00050"+
		"\u0000\u0000\u010b\u010e\u0005?\u0000\u0000\u010c\u010e\u0003\u001e\u000f"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u011e\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0005?\u0000\u0000\u0110\u0112\u0003\u001e\u000f\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u011a\u0001\u0000\u0000\u0000\u0113\u0116\u0005\u0002\u0000\u0000"+
		"\u0114\u0117\u0005?\u0000\u0000\u0115\u0117\u0003\u001e\u000f\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u010d\u0001\u0000\u0000\u0000\u011d"+
		"\u0111\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u00051\u0000\u0000\u0120\u0121\u0005.\u0000\u0000\u0121\u0122\u0003"+
		"\u000e\u0007\u0000\u0122\u0123\u0005/\u0000\u0000\u0123\u001d\u0001\u0000"+
		"\u0000\u0000\u0124\u0135\u00059\u0000\u0000\u0125\u0135\u0005?\u0000\u0000"+
		"\u0126\u0135\u0005:\u0000\u0000\u0127\u0135\u0003>\u001f\u0000\u0128\u0135"+
		"\u0003<\u001e\u0000\u0129\u0135\u0003D\"\u0000\u012a\u0135\u0003B!\u0000"+
		"\u012b\u0135\u0003J%\u0000\u012c\u0135\u0003H$\u0000\u012d\u0135\u0003"+
		"(\u0014\u0000\u012e\u0135\u00036\u001b\u0000\u012f\u0135\u00030\u0018"+
		"\u0000\u0130\u0135\u0003\u001a\r\u0000\u0131\u0135\u0003 \u0010\u0000"+
		"\u0132\u0135\u0003T*\u0000\u0133\u0135\u0003R)\u0000\u0134\u0124\u0001"+
		"\u0000\u0000\u0000\u0134\u0125\u0001\u0000\u0000\u0000\u0134\u0126\u0001"+
		"\u0000\u0000\u0000\u0134\u0127\u0001\u0000\u0000\u0000\u0134\u0128\u0001"+
		"\u0000\u0000\u0000\u0134\u0129\u0001\u0000\u0000\u0000\u0134\u012a\u0001"+
		"\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134\u012c\u0001"+
		"\u0000\u0000\u0000\u0134\u012d\u0001\u0000\u0000\u0000\u0134\u012e\u0001"+
		"\u0000\u0000\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0130\u0001"+
		"\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u001f\u0001"+
		"\u0000\u0000\u0000\u0136\u0139\u0007\u0001\u0000\u0000\u0137\u0138\u0005"+
		"J\u0000\u0000\u0138\u013a\u0007\u0001\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c!\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u00050\u0000\u0000\u013e\u013f\u0003(\u0014\u0000\u013f"+
		"\u0140\u00051\u0000\u0000\u0140\u014a\u0001\u0000\u0000\u0000\u0141\u014a"+
		"\u0005;\u0000\u0000\u0142\u014a\u0005?\u0000\u0000\u0143\u014a\u0003\u001a"+
		"\r\u0000\u0144\u014a\u0003J%\u0000\u0145\u014a\u0003D\"\u0000\u0146\u014a"+
		"\u0003>\u001f\u0000\u0147\u0148\u0005*\u0000\u0000\u0148\u014a\u0003\""+
		"\u0011\u0000\u0149\u013d\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000"+
		"\u0000\u0000\u0149\u0142\u0001\u0000\u0000\u0000\u0149\u0143\u0001\u0000"+
		"\u0000\u0000\u0149\u0144\u0001\u0000\u0000\u0000\u0149\u0145\u0001\u0000"+
		"\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u014a#\u0001\u0000\u0000\u0000\u014b\u0150\u0003\"\u0011"+
		"\u0000\u014c\u014d\u0005(\u0000\u0000\u014d\u014f\u0003\"\u0011\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151%\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0158\u0003$\u0012\u0000\u0154\u0155\u0005)\u0000\u0000\u0155\u0157\u0003"+
		"$\u0012\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\'\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015e\u00036\u001b\u0000\u015c\u015e\u0003&\u0013\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e"+
		")\u0001\u0000\u0000\u0000\u015f\u016b\u00059\u0000\u0000\u0160\u016b\u0005"+
		"?\u0000\u0000\u0161\u016b\u0005;\u0000\u0000\u0162\u016b\u0003\u001a\r"+
		"\u0000\u0163\u016b\u0003J%\u0000\u0164\u016b\u0003D\"\u0000\u0165\u016b"+
		"\u0003>\u001f\u0000\u0166\u0167\u00050\u0000\u0000\u0167\u0168\u00030"+
		"\u0018\u0000\u0168\u0169\u00051\u0000\u0000\u0169\u016b\u0001\u0000\u0000"+
		"\u0000\u016a\u015f\u0001\u0000\u0000\u0000\u016a\u0160\u0001\u0000\u0000"+
		"\u0000\u016a\u0161\u0001\u0000\u0000\u0000\u016a\u0162\u0001\u0000\u0000"+
		"\u0000\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000"+
		"\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000"+
		"\u0000\u016b+\u0001\u0000\u0000\u0000\u016c\u016d\u0003*\u0015\u0000\u016d"+
		"\u016e\u0005H\u0000\u0000\u016e\u016f\u0003*\u0015\u0000\u016f\u0179\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0003*\u0015\u0000\u0171\u0172\u0005G\u0000"+
		"\u0000\u0172\u0173\u0003*\u0015\u0000\u0173\u0179\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0003*\u0015\u0000\u0175\u0176\u0005I\u0000\u0000\u0176\u0177"+
		"\u0003*\u0015\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u016c\u0001"+
		"\u0000\u0000\u0000\u0178\u0170\u0001\u0000\u0000\u0000\u0178\u0174\u0001"+
		"\u0000\u0000\u0000\u0179-\u0001\u0000\u0000\u0000\u017a\u017d\u0003*\u0015"+
		"\u0000\u017b\u017d\u0003,\u0016\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017d/\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0006\u0018\uffff\uffff\u0000\u017f\u0180\u0003.\u0017\u0000\u0180"+
		"\u0189\u0001\u0000\u0000\u0000\u0181\u0182\n\u0003\u0000\u0000\u0182\u0183"+
		"\u0005J\u0000\u0000\u0183\u0188\u0003.\u0017\u0000\u0184\u0185\n\u0002"+
		"\u0000\u0000\u0185\u0186\u0005K\u0000\u0000\u0186\u0188\u0003.\u0017\u0000"+
		"\u0187\u0181\u0001\u0000\u0000\u0000\u0187\u0184\u0001\u0000\u0000\u0000"+
		"\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a1\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005?\u0000\u0000\u018d\u018e"+
		"\u0005E\u0000\u0000\u018e3\u0001\u0000\u0000\u0000\u018f\u0190\u0005?"+
		"\u0000\u0000\u0190\u0191\u0005F\u0000\u0000\u01915\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u00030\u0018\u0000\u0193\u0194\u00038\u001c\u0000\u0194\u0195"+
		"\u00030\u0018\u0000\u01957\u0001\u0000\u0000\u0000\u0196\u0197\u0007\u0002"+
		"\u0000\u0000\u01979\u0001\u0000\u0000\u0000\u0198\u0199\u0007\u0003\u0000"+
		"\u0000\u0199;\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0003\u0000\u0000"+
		"\u019b\u01a0\u0003\u001e\u000f\u0000\u019c\u019d\u0005\u0002\u0000\u0000"+
		"\u019d\u019f\u0003\u001e\u000f\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u0004\u0000\u0000"+
		"\u01a4\u01a8\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u0003\u0000\u0000"+
		"\u01a6\u01a8\u0005\u0004\u0000\u0000\u01a7\u019a\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8=\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0005?\u0000\u0000\u01aa\u01ab\u0005\u0005\u0000\u0000\u01ab\u01ac"+
		"\u0003@ \u0000\u01ac\u01ae\u00050\u0000\u0000\u01ad\u01af\u0003\u001e"+
		"\u000f\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u00051\u0000"+
		"\u0000\u01b1?\u0001\u0000\u0000\u0000\u01b2\u01b3\u0007\u0004\u0000\u0000"+
		"\u01b3A\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005=\u0000\u0000\u01b5C"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005?\u0000\u0000\u01b7\u01b8\u0005"+
		"\u0005\u0000\u0000\u01b8\u01b9\u0003F#\u0000\u01b9\u01bb\u00050\u0000"+
		"\u0000\u01ba\u01bc\u0003\u001e\u000f\u0000\u01bb\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u00051\u0000\u0000\u01beE\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0007\u0005\u0000\u0000\u01c0G\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0003P(\u0000\u01c2\u01c3\u0005\u000f\u0000\u0000\u01c3\u01c4\u0003N"+
		"\'\u0000\u01c4I\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005?\u0000\u0000"+
		"\u01c6\u01c7\u0005\u0005\u0000\u0000\u01c7\u01c8\u0003L&\u0000\u01c8\u01c9"+
		"\u00050\u0000\u0000\u01c9\u01ca\u00051\u0000\u0000\u01caK\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0007\u0006\u0000\u0000\u01ccM\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0007\u0007\u0000\u0000\u01ceO\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0007\b\u0000\u0000\u01d0Q\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0005>\u0000\u0000\u01d2S\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005"+
		"?\u0000\u0000\u01d4\u01d5\u0005\u0005\u0000\u0000\u01d5\u01d6\u0003V+"+
		"\u0000\u01d6\u01d8\u00050\u0000\u0000\u01d7\u01d9\u0003\u001e\u000f\u0000"+
		"\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u00051\u0000\u0000\u01db"+
		"U\u0001\u0000\u0000\u0000\u01dc\u01dd\u0007\t\u0000\u0000\u01ddW\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0005$\u0000\u0000\u01df\u01e0\u00050\u0000"+
		"\u0000\u01e0\u01e1\u0003\u001e\u000f\u0000\u01e1\u01e2\u00051\u0000\u0000"+
		"\u01e2\u01e4\u0005.\u0000\u0000\u01e3\u01e5\u0003Z-\u0000\u01e4\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005/\u0000\u0000\u01e9Y\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005%\u0000\u0000\u01eb\u01ee\u0003\u001e\u000f"+
		"\u0000\u01ec\u01ee\u0005&\u0000\u0000\u01ed\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f3\u0005\'\u0000\u0000\u01f0\u01f2\u0003\u0002\u0001\u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0005<\u0000\u0000\u01f7\u01f9\u0005L\u0000\u0000\u01f8\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9[\u0001\u0000"+
		"\u0000\u0000)_\u008d\u0093\u00a6\u00af\u00b1\u00b7\u00c0\u00ce\u00d5\u00e4"+
		"\u00e9\u00f3\u00fb\u0102\u0104\u010d\u0111\u0116\u011a\u011d\u0134\u013b"+
		"\u0149\u0150\u0158\u015d\u016a\u0178\u017c\u0187\u0189\u01a0\u01a7\u01ae"+
		"\u01bb\u01d8\u01e6\u01ed\u01f3\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}