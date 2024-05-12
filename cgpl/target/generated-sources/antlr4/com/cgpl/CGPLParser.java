// Generated from com\cgpl\CGPL.g4 by ANTLR 4.7.1
package com.cgpl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, AND=31, OR=32, 
		NOT=33, RETURN=34, FUNCTION=35, LCURLY=36, RCURLY=37, LPAREN=38, RPAREN=39, 
		IF=40, ELSE=41, VAR=42, KONST=43, FOR=44, WHILE=45, IN=46, NUMBER=47, 
		STRING=48, BOOLEAN=49, BREAK=50, DECK=51, IDENTIFIER=52, EQUAL=53, LT=54, 
		GT=55, LT_OR_EQUAL=56, GT_OR_EQUAL=57, OP_INC=58, OP_DEC=59, OP_DIV=60, 
		OP_MULT=61, OP_MOD=62, OP_ADD=63, OP_SUB=64, CRLF=65, WS=66;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_functionBody = 5, RULE_ifstmt = 6, RULE_forstmt = 7, 
		RULE_whilestmt = 8, RULE_functionCall = 9, RULE_function = 10, RULE_value = 11, 
		RULE_stringConcat = 12, RULE_boolvalue = 13, RULE_andExpr = 14, RULE_orExpr = 15, 
		RULE_boolExpr = 16, RULE_factor = 17, RULE_arthexp = 18, RULE_increment = 19, 
		RULE_decrement = 20, RULE_comparisonExpr = 21, RULE_comparison = 22, RULE_arth_op = 23, 
		RULE_list = 24, RULE_listfunction = 25, RULE_listfunctionname = 26, RULE_deck = 27, 
		RULE_deckfunction = 28, RULE_deckfunctionname = 29, RULE_card = 30, RULE_cardfunction = 31, 
		RULE_cardfunctionname = 32, RULE_suit = 33, RULE_cardvalue = 34, RULE_switchstmt = 35, 
		RULE_casestmt = 36;
	public static final String[] ruleNames = {
		"program", "instruction", "vardcl", "assignment", "returnstmt", "functionBody", 
		"ifstmt", "forstmt", "whilestmt", "functionCall", "function", "value", 
		"stringConcat", "boolvalue", "andExpr", "orExpr", "boolExpr", "factor", 
		"arthexp", "increment", "decrement", "comparisonExpr", "comparison", "arth_op", 
		"list", "listfunction", "listfunctionname", "deck", "deckfunction", "deckfunctionname", 
		"card", "cardfunction", "cardfunctionname", "suit", "cardvalue", "switchstmt", 
		"casestmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'['", "']'", "'.'", "'add'", "'remove'", "'get'", 
		"'size'", "'shuffle'", "'draw'", "'addCard'", "'removeCard'", "'of'", 
		"'value'", "'suit'", "'color'", "'name'", "'hearts'", "'diamonds'", "'clubs'", 
		"'spades'", "'jack'", "'queen'", "'king'", "'ace'", "'switch'", "'case'", 
		"'default'", "':'", "'and'", "'or'", "'not'", "'return'", "'function'", 
		"'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'const'", "'for'", 
		"'while'", "'in'", null, null, null, "'break'", "'Deck'", null, "'=='", 
		"'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", 
		"'-'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "AND", "OR", "NOT", "RETURN", 
		"FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", 
		"KONST", "FOR", "WHILE", "IN", "NUMBER", "STRING", "BOOLEAN", "BREAK", 
		"DECK", "IDENTIFIER", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
		"OP_INC", "OP_DEC", "OP_DIV", "OP_MULT", "OP_MOD", "OP_ADD", "OP_SUB", 
		"CRLF", "WS"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(74);
				instruction();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				vardcl();
				setState(83);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				forstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				switchstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				deckfunction();
				setState(91);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				listfunction();
				setState(94);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				card();
				setState(97);
				match(CRLF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				returnstmt();
				setState(100);
				match(CRLF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				assignment();
				setState(103);
				match(CRLF);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				increment();
				setState(106);
				match(CRLF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(108);
				decrement();
				setState(109);
				match(CRLF);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(111);
				functionCall();
				setState(112);
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
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==KONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(IDENTIFIER);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(118);
				match(T__0);
				setState(119);
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
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(T__0);
			setState(124);
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
			setState(126);
			match(RETURN);
			setState(127);
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
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(129);
				instruction();
				}
				}
				setState(134);
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
			setState(135);
			match(IF);
			setState(136);
			value();
			setState(137);
			match(LCURLY);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(138);
				instruction();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RCURLY);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(145);
				match(ELSE);
				setState(146);
				match(LCURLY);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(147);
					instruction();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
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
		enterRule(_localctx, 14, RULE_forstmt);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(FOR);
				setState(157);
				match(LPAREN);
				setState(158);
				vardcl();
				setState(159);
				match(CRLF);
				setState(160);
				boolExpr();
				setState(161);
				match(CRLF);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(162);
					assignment();
					}
					break;
				case 2:
					{
					setState(163);
					increment();
					}
					break;
				case 3:
					{
					setState(164);
					decrement();
					}
					break;
				}
				setState(167);
				match(RPAREN);
				setState(168);
				match(LCURLY);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(169);
					instruction();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(FOR);
				setState(178);
				match(LPAREN);
				setState(179);
				match(IDENTIFIER);
				setState(180);
				match(IN);
				setState(181);
				value();
				setState(182);
				match(RPAREN);
				setState(183);
				match(LCURLY);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(184);
					instruction();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
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
			setState(194);
			match(WHILE);
			setState(195);
			match(LPAREN);
			setState(196);
			boolExpr();
			setState(197);
			match(RPAREN);
			setState(198);
			match(LCURLY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(199);
				instruction();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
			setState(207);
			match(IDENTIFIER);
			setState(208);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << DECK) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(209);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(212);
				value();
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					match(T__1);
					setState(214);
					value();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			}
			setState(221);
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
			setState(223);
			match(FUNCTION);
			setState(224);
			match(IDENTIFIER);
			setState(225);
			match(LPAREN);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(226);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(227);
					value();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(230);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(231);
					value();
					}
					break;
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(234);
					match(T__1);
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(235);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(236);
						value();
						}
						break;
					}
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(246);
			match(RPAREN);
			setState(247);
			match(LCURLY);
			setState(248);
			functionBody();
			setState(249);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(CGPLParser.STRING, 0); }
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArthexpContext arthexp() {
			return getRuleContext(ArthexpContext.class,0);
		}
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				comparisonExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				boolExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				arthexp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				listfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				deckfunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(260);
				deck();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(261);
				cardfunction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(262);
				card();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(263);
				functionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(264);
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
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				match(OP_ADD);
				setState(269);
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
				setState(272); 
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(LPAREN);
				setState(275);
				boolExpr();
				setState(276);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
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
			setState(282);
			boolvalue();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(283);
				match(AND);
				setState(284);
				boolvalue();
				}
				}
				setState(289);
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
			setState(290);
			andExpr();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(291);
				match(OR);
				setState(292);
				andExpr();
				}
				}
				setState(297);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				orExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CGPLParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(CGPLParser.BOOLEAN, 0); }
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(LPAREN);
				setState(306);
				arthexp();
				setState(307);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
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
			setState(312);
			factor();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (OP_DIV - 60)) | (1L << (OP_MULT - 60)) | (1L << (OP_MOD - 60)) | (1L << (OP_ADD - 60)) | (1L << (OP_SUB - 60)))) != 0)) {
				{
				{
				setState(313);
				arth_op();
				setState(314);
				factor();
				}
				}
				setState(320);
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
			setState(321);
			match(IDENTIFIER);
			setState(322);
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
			setState(324);
			match(IDENTIFIER);
			setState(325);
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
			setState(327);
			arthexp();
			setState(328);
			comparison();
			setState(329);
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
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << GT) | (1L << LT_OR_EQUAL) | (1L << GT_OR_EQUAL))) != 0)) ) {
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
			setState(333);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (OP_DIV - 60)) | (1L << (OP_MULT - 60)) | (1L << (OP_MOD - 60)) | (1L << (OP_ADD - 60)) | (1L << (OP_SUB - 60)))) != 0)) ) {
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__2);
				setState(336);
				value();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(337);
					match(T__1);
					setState(338);
					value();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__2);
				setState(347);
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
		enterRule(_localctx, 50, RULE_listfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(IDENTIFIER);
			setState(351);
			match(T__4);
			setState(352);
			listfunctionname();
			setState(353);
			match(LPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << DECK) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(354);
				value();
				}
			}

			setState(357);
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
		enterRule(_localctx, 52, RULE_listfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_deck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 56, RULE_deckfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(IDENTIFIER);
			setState(364);
			match(T__4);
			setState(365);
			deckfunctionname();
			setState(366);
			match(LPAREN);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << DECK) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(367);
				value();
				}
			}

			setState(370);
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
		enterRule(_localctx, 58, RULE_deckfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			cardvalue();
			setState(375);
			match(T__13);
			setState(376);
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
		enterRule(_localctx, 62, RULE_cardfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(IDENTIFIER);
			setState(379);
			match(T__4);
			setState(380);
			cardfunctionname();
			setState(381);
			match(LPAREN);
			setState(382);
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
		enterRule(_localctx, 64, RULE_cardfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		enterRule(_localctx, 66, RULE_suit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_cardvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << NUMBER))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__26);
			setState(391);
			match(LPAREN);
			setState(392);
			value();
			setState(393);
			match(RPAREN);
			setState(394);
			match(LCURLY);
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				casestmt();
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 || _la==T__28 );
			setState(400);
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
		enterRule(_localctx, 72, RULE_casestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(402);
				match(T__27);
				setState(403);
				value();
				}
				break;
			case T__28:
				{
				setState(404);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			match(T__29);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(408);
				instruction();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(414);
				match(BREAK);
				setState(415);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3u\n\3"+
		"\3\4\3\4\3\4\3\4\5\4{\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7\u0085\n"+
		"\7\f\7\16\7\u0088\13\7\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\5\b\u009d\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\3\t\7\t\u00ad"+
		"\n\t\f\t\16\t\u00b0\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bc"+
		"\n\t\f\t\16\t\u00bf\13\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00cb\n\n\f\n\16\n\u00ce\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u00d5\n"+
		"\13\3\13\3\13\3\13\6\13\u00da\n\13\r\13\16\13\u00db\5\13\u00de\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\3\f\5\f\u00eb\n\f\3\f\3"+
		"\f\3\f\5\f\u00f0\n\f\7\f\u00f2\n\f\f\f\16\f\u00f5\13\f\5\f\u00f7\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u010c\n\r\3\16\3\16\3\16\6\16\u0111\n\16\r\16\16\16\u0112\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u011b\n\17\3\20\3\20\3\20\7\20\u0120\n"+
		"\20\f\20\16\20\u0123\13\20\3\21\3\21\3\21\7\21\u0128\n\21\f\21\16\21\u012b"+
		"\13\21\3\22\3\22\5\22\u012f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0139\n\23\3\24\3\24\3\24\3\24\7\24\u013f\n\24\f\24\16\24\u0142"+
		"\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u0156\n\32\f\32\16\32\u0159\13\32\3\32"+
		"\3\32\3\32\3\32\5\32\u015f\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n"+
		"\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0173"+
		"\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\6%\u018f\n%\r%\16%\u0190\3%\3%\3&\3&\3&\5&\u0198"+
		"\n&\3&\3&\7&\u019c\n&\f&\16&\u019f\13&\3&\3&\5&\u01a3\n&\3&\2\2\'\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\13"+
		"\3\2,-\4\2\62\62\66\66\3\2\67;\3\2>B\3\2\b\13\3\2\f\17\3\2\21\24\3\2\25"+
		"\30\4\2\31\34\61\61\2\u01c1\2O\3\2\2\2\4t\3\2\2\2\6v\3\2\2\2\b|\3\2\2"+
		"\2\n\u0080\3\2\2\2\f\u0086\3\2\2\2\16\u0089\3\2\2\2\20\u00c2\3\2\2\2\22"+
		"\u00c4\3\2\2\2\24\u00d1\3\2\2\2\26\u00e1\3\2\2\2\30\u010b\3\2\2\2\32\u010d"+
		"\3\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2\2\2 \u0124\3\2\2\2\"\u012e\3\2"+
		"\2\2$\u0138\3\2\2\2&\u013a\3\2\2\2(\u0143\3\2\2\2*\u0146\3\2\2\2,\u0149"+
		"\3\2\2\2.\u014d\3\2\2\2\60\u014f\3\2\2\2\62\u015e\3\2\2\2\64\u0160\3\2"+
		"\2\2\66\u0169\3\2\2\28\u016b\3\2\2\2:\u016d\3\2\2\2<\u0176\3\2\2\2>\u0178"+
		"\3\2\2\2@\u017c\3\2\2\2B\u0182\3\2\2\2D\u0184\3\2\2\2F\u0186\3\2\2\2H"+
		"\u0188\3\2\2\2J\u0197\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\5\6\4\2UV\7C\2\2"+
		"Vu\3\2\2\2Wu\5\26\f\2Xu\5\16\b\2Yu\5\20\t\2Zu\5\22\n\2[u\5H%\2\\]\5:\36"+
		"\2]^\7C\2\2^u\3\2\2\2_`\5\64\33\2`a\7C\2\2au\3\2\2\2bc\5> \2cd\7C\2\2"+
		"du\3\2\2\2ef\5\n\6\2fg\7C\2\2gu\3\2\2\2hi\5\b\5\2ij\7C\2\2ju\3\2\2\2k"+
		"l\5(\25\2lm\7C\2\2mu\3\2\2\2no\5*\26\2op\7C\2\2pu\3\2\2\2qr\5\24\13\2"+
		"rs\7C\2\2su\3\2\2\2tT\3\2\2\2tW\3\2\2\2tX\3\2\2\2tY\3\2\2\2tZ\3\2\2\2"+
		"t[\3\2\2\2t\\\3\2\2\2t_\3\2\2\2tb\3\2\2\2te\3\2\2\2th\3\2\2\2tk\3\2\2"+
		"\2tn\3\2\2\2tq\3\2\2\2u\5\3\2\2\2vw\t\2\2\2wz\7\66\2\2xy\7\3\2\2y{\5\30"+
		"\r\2zx\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|}\7\66\2\2}~\7\3\2\2~\177\5\30\r\2"+
		"\177\t\3\2\2\2\u0080\u0081\7$\2\2\u0081\u0082\5\30\r\2\u0082\13\3\2\2"+
		"\2\u0083\u0085\5\4\3\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\r\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a\u008b\5\30\r\2\u008b\u008f\7&\2\2\u008c\u008e\5\4"+
		"\3\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u009c\7\'"+
		"\2\2\u0093\u0094\7+\2\2\u0094\u0098\7&\2\2\u0095\u0097\5\4\3\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\'\2\2\u009c\u0093\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f\7.\2\2\u009f\u00a0"+
		"\7(\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\5\"\22\2\u00a3"+
		"\u00a7\7C\2\2\u00a4\u00a8\5\b\5\2\u00a5\u00a8\5(\25\2\u00a6\u00a8\5*\26"+
		"\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ae\7&\2\2\u00ab\u00ad\5\4\3\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\'\2\2\u00b2"+
		"\u00c3\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6\7\66"+
		"\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\7)\2\2\u00b9"+
		"\u00bd\7&\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c3\3\2\2\2\u00c2\u009e\3\2"+
		"\2\2\u00c2\u00b3\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6"+
		"\7(\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7)\2\2\u00c8\u00cc\7&\2\2\u00c9"+
		"\u00cb\5\4\3\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\'\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00dd\7(\2"+
		"\2\u00d3\u00d5\5\30\r\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00de\3\2\2\2\u00d6\u00d9\5\30\r\2\u00d7\u00d8\7\4\2\2\u00d8\u00da\5"+
		"\30\r\2\u00d9\u00d7\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d6\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\25\3\2\2\2\u00e1\u00e2"+
		"\7%\2\2\u00e2\u00e3\7\66\2\2\u00e3\u00f6\7(\2\2\u00e4\u00e7\7\66\2\2\u00e5"+
		"\u00e7\5\30\r\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00f7\3\2\2\2\u00e8\u00eb\7\66\2\2\u00e9\u00eb\5\30\r\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f3\3\2\2\2\u00ec\u00ef\7\4"+
		"\2\2\u00ed\u00f0\7\66\2\2\u00ee\u00f0\5\30\r\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\5\f\7\2\u00fb\u00fc"+
		"\7\'\2\2\u00fc\27\3\2\2\2\u00fd\u010c\7\61\2\2\u00fe\u010c\7\66\2\2\u00ff"+
		"\u010c\7\62\2\2\u0100\u010c\5,\27\2\u0101\u010c\5\"\22\2\u0102\u010c\5"+
		"&\24\2\u0103\u010c\5\64\33\2\u0104\u010c\5\62\32\2\u0105\u010c\5:\36\2"+
		"\u0106\u010c\58\35\2\u0107\u010c\5@!\2\u0108\u010c\5> \2\u0109\u010c\5"+
		"\24\13\2\u010a\u010c\5\32\16\2\u010b\u00fd\3\2\2\2\u010b\u00fe\3\2\2\2"+
		"\u010b\u00ff\3\2\2\2\u010b\u0100\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0102"+
		"\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c\31\3\2\2\2\u010d\u0110\t\3\2\2\u010e\u010f"+
		"\7A\2\2\u010f\u0111\t\3\2\2\u0110\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\33\3\2\2\2\u0114\u0115\7(\2\2"+
		"\u0115\u0116\5\"\22\2\u0116\u0117\7)\2\2\u0117\u011b\3\2\2\2\u0118\u011b"+
		"\7\63\2\2\u0119\u011b\7\66\2\2\u011a\u0114\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011a\u0119\3\2\2\2\u011b\35\3\2\2\2\u011c\u0121\5\34\17\2\u011d\u011e"+
		"\7!\2\2\u011e\u0120\5\34\17\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0129\5\36\20\2\u0125\u0126\7\"\2\2\u0126\u0128\5\36\20"+
		"\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a!\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012f\5 \21\2\u012d"+
		"\u012f\5,\27\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f#\3\2\2\2"+
		"\u0130\u0139\7\61\2\2\u0131\u0139\7\66\2\2\u0132\u0139\7\63\2\2\u0133"+
		"\u0134\7(\2\2\u0134\u0135\5&\24\2\u0135\u0136\7)\2\2\u0136\u0139\3\2\2"+
		"\2\u0137\u0139\5\24\13\2\u0138\u0130\3\2\2\2\u0138\u0131\3\2\2\2\u0138"+
		"\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0137\3\2\2\2\u0139%\3\2\2\2"+
		"\u013a\u0140\5$\23\2\u013b\u013c\5\60\31\2\u013c\u013d\5$\23\2\u013d\u013f"+
		"\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\'\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\66\2"+
		"\2\u0144\u0145\7<\2\2\u0145)\3\2\2\2\u0146\u0147\7\66\2\2\u0147\u0148"+
		"\7=\2\2\u0148+\3\2\2\2\u0149\u014a\5&\24\2\u014a\u014b\5.\30\2\u014b\u014c"+
		"\5&\24\2\u014c-\3\2\2\2\u014d\u014e\t\4\2\2\u014e/\3\2\2\2\u014f\u0150"+
		"\t\5\2\2\u0150\61\3\2\2\2\u0151\u0152\7\5\2\2\u0152\u0157\5\30\r\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0156\5\30\r\2\u0155\u0153\3\2\2\2\u0156\u0159\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\7\6\2\2\u015b\u015f\3\2\2\2\u015c\u015d\7\5"+
		"\2\2\u015d\u015f\7\6\2\2\u015e\u0151\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\63\3\2\2\2\u0160\u0161\7\66\2\2\u0161\u0162\7\7\2\2\u0162\u0163\5\66"+
		"\34\2\u0163\u0165\7(\2\2\u0164\u0166\5\30\r\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7)\2\2\u0168\65\3\2\2\2"+
		"\u0169\u016a\t\6\2\2\u016a\67\3\2\2\2\u016b\u016c\7\65\2\2\u016c9\3\2"+
		"\2\2\u016d\u016e\7\66\2\2\u016e\u016f\7\7\2\2\u016f\u0170\5<\37\2\u0170"+
		"\u0172\7(\2\2\u0171\u0173\5\30\r\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7)\2\2\u0175;\3\2\2\2\u0176\u0177"+
		"\t\7\2\2\u0177=\3\2\2\2\u0178\u0179\5F$\2\u0179\u017a\7\20\2\2\u017a\u017b"+
		"\5D#\2\u017b?\3\2\2\2\u017c\u017d\7\66\2\2\u017d\u017e\7\7\2\2\u017e\u017f"+
		"\5B\"\2\u017f\u0180\7(\2\2\u0180\u0181\7)\2\2\u0181A\3\2\2\2\u0182\u0183"+
		"\t\b\2\2\u0183C\3\2\2\2\u0184\u0185\t\t\2\2\u0185E\3\2\2\2\u0186\u0187"+
		"\t\n\2\2\u0187G\3\2\2\2\u0188\u0189\7\35\2\2\u0189\u018a\7(\2\2\u018a"+
		"\u018b\5\30\r\2\u018b\u018c\7)\2\2\u018c\u018e\7&\2\2\u018d\u018f\5J&"+
		"\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\'\2\2\u0193I\3\2\2\2\u0194"+
		"\u0195\7\36\2\2\u0195\u0198\5\30\r\2\u0196\u0198\7\37\2\2\u0197\u0194"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019d\7 \2\2\u019a"+
		"\u019c\5\4\3\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a2\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7\64\2\2\u01a1\u01a3\7C\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3K\3\2\2\2&Otz\u0086\u008f\u0098\u009c\u00a7\u00ae\u00bd\u00c2"+
		"\u00cc\u00d4\u00db\u00dd\u00e6\u00ea\u00ef\u00f3\u00f6\u010b\u0112\u011a"+
		"\u0121\u0129\u012e\u0138\u0140\u0157\u015e\u0165\u0172\u0190\u0197\u019d"+
		"\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}