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
	public static final String[] ruleNames = {
		"program", "instruction", "vardcl", "assignment", "returnstmt", "functionBody", 
		"ifstmt", "forstmt", "whilestmt", "functionCall", "function", "value", 
		"stringConcat", "boolvalue", "andExpr", "orExpr", "boolExpr", "factor", 
		"arthexp", "increment", "decrement", "comparisonExpr", "comparison", "arth_op", 
		"list", "listfunction", "deck", "deckfunction", "card", "switchstmt", 
		"casestmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'['", "']'", "'.'", "'add'", "'remove'", "'get'", 
		"'shuffle'", "'draw'", "'value'", "'suit'", "'color'", "'name'", "'switch'", 
		"'case'", "'default'", "':'", "'and'", "'or'", "'not'", "'return'", "'function'", 
		"'{'", "'}'", "'('", "')'", "'if'", "'else'", "'var'", "'const'", "'for'", 
		"'while'", "'in'", null, null, null, "'break'", null, "'deck'", "'=='", 
		"'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'/'", "'*'", "'%'", "'+'", 
		"'-'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "AND", "OR", "NOT", "RETURN", 
		"FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", "VAR", 
		"KONST", "FOR", "WHILE", "IN", "NUMBER", "STRING", "BOOLEAN", "BREAK", 
		"IDENTIFIER", "DECK", "EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", 
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << DECK))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_DIV) | (1L << OP_MULT) | (1L << OP_MOD) | (1L << OP_ADD) | (1L << OP_SUB))) != 0)) {
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
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_DIV) | (1L << OP_MULT) | (1L << OP_MOD) | (1L << OP_ADD) | (1L << OP_SUB))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << DECK))) != 0)) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\7\b\u0082\n\b"+
		"\f\b\16\b\u0085\13\b\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b"+
		"\3\b\5\b\u0091\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t\3"+
		"\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\3\t\5\t\u00b7\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\5\13\u00c9\n\13\3\13\3\13\3\13\6\13\u00ce\n\13\r\13\16\13\u00cf"+
		"\5\13\u00d2\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00db\n\f\3\f\3\f\5"+
		"\f\u00df\n\f\3\f\3\f\3\f\5\f\u00e4\n\f\7\f\u00e6\n\f\f\f\16\f\u00e9\13"+
		"\f\5\f\u00eb\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\16\3\16\3\16\6\16\u0103\n\16\r\16\16\16"+
		"\u0104\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\7"+
		"\20\u0112\n\20\f\20\16\20\u0115\13\20\3\21\3\21\3\21\7\21\u011a\n\21\f"+
		"\21\16\21\u011d\13\21\3\22\3\22\5\22\u0121\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u012a\n\23\3\24\3\24\3\24\3\24\7\24\u0130\n\24\f\24"+
		"\16\24\u0133\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0147\n\32\f\32\16\32\u014a"+
		"\13\32\3\32\3\32\3\32\3\32\5\32\u0150\n\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0160\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u016e\n\37\r\37"+
		"\16\37\u016f\3\37\3\37\3 \3 \3 \5 \u0177\n \3 \3 \7 \u017b\n \f \16 \u017e"+
		"\13 \3 \3 \5 \u0182\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>\2\t\3\2 !\4\2&&))\3\2+/\3\2\62\66\3\2\b\n\4"+
		"\2\b\t\13\f\3\2\r\20\2\u01a2\2C\3\2\2\2\4h\3\2\2\2\6j\3\2\2\2\bp\3\2\2"+
		"\2\nt\3\2\2\2\fz\3\2\2\2\16}\3\2\2\2\20\u00b6\3\2\2\2\22\u00b8\3\2\2\2"+
		"\24\u00c5\3\2\2\2\26\u00d5\3\2\2\2\30\u00fd\3\2\2\2\32\u00ff\3\2\2\2\34"+
		"\u010c\3\2\2\2\36\u010e\3\2\2\2 \u0116\3\2\2\2\"\u0120\3\2\2\2$\u0129"+
		"\3\2\2\2&\u012b\3\2\2\2(\u0134\3\2\2\2*\u0137\3\2\2\2,\u013a\3\2\2\2."+
		"\u013e\3\2\2\2\60\u0140\3\2\2\2\62\u014f\3\2\2\2\64\u0151\3\2\2\2\66\u0158"+
		"\3\2\2\28\u015a\3\2\2\2:\u0163\3\2\2\2<\u0167\3\2\2\2>\u0176\3\2\2\2@"+
		"B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FG\7\2\2\3G\3\3\2\2\2HI\5\6\4\2IJ\7\67\2\2Ji\3\2\2\2Ki\5\26\f\2Li\5\16"+
		"\b\2Mi\5\20\t\2Ni\5\22\n\2Oi\5<\37\2PQ\58\35\2QR\7\67\2\2Ri\3\2\2\2ST"+
		"\5\64\33\2TU\7\67\2\2Ui\3\2\2\2VW\5:\36\2WX\7\67\2\2Xi\3\2\2\2YZ\5\n\6"+
		"\2Z[\7\67\2\2[i\3\2\2\2\\]\5\b\5\2]^\7\67\2\2^i\3\2\2\2_`\5(\25\2`a\7"+
		"\67\2\2ai\3\2\2\2bc\5*\26\2cd\7\67\2\2di\3\2\2\2ef\5\24\13\2fg\7\67\2"+
		"\2gi\3\2\2\2hH\3\2\2\2hK\3\2\2\2hL\3\2\2\2hM\3\2\2\2hN\3\2\2\2hO\3\2\2"+
		"\2hP\3\2\2\2hS\3\2\2\2hV\3\2\2\2hY\3\2\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2"+
		"\2\2he\3\2\2\2i\5\3\2\2\2jk\t\2\2\2kn\7)\2\2lm\7\3\2\2mo\5\30\r\2nl\3"+
		"\2\2\2no\3\2\2\2o\7\3\2\2\2pq\7)\2\2qr\7\3\2\2rs\5\30\r\2s\t\3\2\2\2t"+
		"u\7\30\2\2uv\5\30\r\2v\13\3\2\2\2wy\5\4\3\2xw\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}~\7\36\2\2~\177\5\30\r\2\177\u0083"+
		"\7\32\2\2\u0080\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0090\7\33\2\2\u0087\u0088\7\37\2\2\u0088\u008c\7\32\2"+
		"\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7\33\2\2\u0090\u0087\3\2\2\2\u0090\u0091\3\2\2\2\u0091\17\3\2\2"+
		"\2\u0092\u0093\7\"\2\2\u0093\u0094\7\34\2\2\u0094\u0095\5\6\4\2\u0095"+
		"\u0096\7\67\2\2\u0096\u0097\5\"\22\2\u0097\u009b\7\67\2\2\u0098\u009c"+
		"\5\4\3\2\u0099\u009c\5(\25\2\u009a\u009c\5*\26\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\35"+
		"\2\2\u009e\u00a2\7\32\2\2\u009f\u00a1\5\4\3\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00b7\3\2\2\2\u00a7"+
		"\u00a8\7\"\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab\7$"+
		"\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7\35\2\2\u00ad\u00b1\7\32\2\2\u00ae"+
		"\u00b0\5\4\3\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\33\2\2\u00b5\u00b7\3\2\2\2\u00b6\u0092\3\2\2\2\u00b6\u00a7\3"+
		"\2\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7\34\2\2\u00ba"+
		"\u00bb\5\"\22\2\u00bb\u00bc\7\35\2\2\u00bc\u00c0\7\32\2\2\u00bd\u00bf"+
		"\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\33"+
		"\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\u00d1\7\34\2\2\u00c7\u00c9"+
		"\5\30\r\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d2\3\2\2\2"+
		"\u00ca\u00cd\5\30\r\2\u00cb\u00cc\7\4\2\2\u00cc\u00ce\5\30\r\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\7\35\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\31\2\2\u00d6"+
		"\u00d7\7)\2\2\u00d7\u00ea\7\34\2\2\u00d8\u00db\7)\2\2\u00d9\u00db\5\30"+
		"\r\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00eb\3\2\2\2\u00dc\u00df\7)\2\2\u00dd\u00df\5\30\r\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\u00e7\3\2\2\2\u00e0\u00e3\7\4\2\2\u00e1"+
		"\u00e4\7)\2\2\u00e2\u00e4\5\30\r\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00da\3\2\2\2\u00ea\u00de\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ee\7\32\2\2\u00ee\u00ef\5\f\7\2\u00ef\u00f0\7"+
		"\33\2\2\u00f0\27\3\2\2\2\u00f1\u00fe\7%\2\2\u00f2\u00fe\7)\2\2\u00f3\u00fe"+
		"\7&\2\2\u00f4\u00fe\5\"\22\2\u00f5\u00fe\5&\24\2\u00f6\u00fe\5\62\32\2"+
		"\u00f7\u00fe\5\64\33\2\u00f8\u00fe\5\66\34\2\u00f9\u00fe\58\35\2\u00fa"+
		"\u00fe\5:\36\2\u00fb\u00fe\5\24\13\2\u00fc\u00fe\5\32\16\2\u00fd\u00f1"+
		"\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u0102\t\3\2\2\u0100\u0101\7\65\2"+
		"\2\u0101\u0103\t\3\2\2\u0102\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\7\34\2\2\u0107"+
		"\u0108\5\"\22\2\u0108\u0109\7\35\2\2\u0109\u010d\3\2\2\2\u010a\u010d\7"+
		"\'\2\2\u010b\u010d\7)\2\2\u010c\u0106\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\35\3\2\2\2\u010e\u0113\5\34\17\2\u010f\u0110\7\25"+
		"\2\2\u0110\u0112\5\34\17\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\37\3\2\2\2\u0115\u0113\3\2\2"+
		"\2\u0116\u011b\5\36\20\2\u0117\u0118\7\26\2\2\u0118\u011a\5\36\20\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c!\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121\5 \21\2\u011f\u0121"+
		"\5,\27\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121#\3\2\2\2\u0122"+
		"\u012a\7%\2\2\u0123\u012a\7)\2\2\u0124\u0125\7\34\2\2\u0125\u0126\5&\24"+
		"\2\u0126\u0127\7\35\2\2\u0127\u012a\3\2\2\2\u0128\u012a\5\24\13\2\u0129"+
		"\u0122\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a%\3\2\2\2\u012b\u0131\5$\23\2\u012c\u012d\5\60\31\2\u012d\u012e"+
		"\5$\23\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\'\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0134\u0135\7)\2\2\u0135\u0136\7\60\2\2\u0136)\3\2\2\2\u0137\u0138\7"+
		")\2\2\u0138\u0139\7\61\2\2\u0139+\3\2\2\2\u013a\u013b\5&\24\2\u013b\u013c"+
		"\5.\30\2\u013c\u013d\5&\24\2\u013d-\3\2\2\2\u013e\u013f\t\4\2\2\u013f"+
		"/\3\2\2\2\u0140\u0141\t\5\2\2\u0141\61\3\2\2\2\u0142\u0143\7\5\2\2\u0143"+
		"\u0148\5\30\r\2\u0144\u0145\7\4\2\2\u0145\u0147\5\30\r\2\u0146\u0144\3"+
		"\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\6\2\2\u014c\u0150\3\2"+
		"\2\2\u014d\u014e\7\5\2\2\u014e\u0150\7\6\2\2\u014f\u0142\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\63\3\2\2\2\u0151\u0152\7)\2\2\u0152\u0153\7\7\2\2"+
		"\u0153\u0154\t\6\2\2\u0154\u0155\7\34\2\2\u0155\u0156\5\30\r\2\u0156\u0157"+
		"\7\35\2\2\u0157\65\3\2\2\2\u0158\u0159\7*\2\2\u0159\67\3\2\2\2\u015a\u015b"+
		"\7)\2\2\u015b\u015c\7\7\2\2\u015c\u015d\t\7\2\2\u015d\u015f\7\34\2\2\u015e"+
		"\u0160\5\30\r\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0162\7\35\2\2\u01629\3\2\2\2\u0163\u0164\7)\2\2\u0164\u0165"+
		"\7\7\2\2\u0165\u0166\t\b\2\2\u0166;\3\2\2\2\u0167\u0168\7\21\2\2\u0168"+
		"\u0169\7\34\2\2\u0169\u016a\5\30\r\2\u016a\u016b\7\35\2\2\u016b\u016d"+
		"\7\32\2\2\u016c\u016e\5> \2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\33"+
		"\2\2\u0172=\3\2\2\2\u0173\u0174\7\22\2\2\u0174\u0177\5\30\r\2\u0175\u0177"+
		"\7\23\2\2\u0176\u0173\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u017c\7\24\2\2\u0179\u017b\5\4\3\2\u017a\u0179\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\7(\2\2\u0180\u0182\7\67\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182?\3\2\2\2%Chnz\u0083\u008c\u0090\u009b\u00a2"+
		"\u00b1\u00b6\u00c0\u00c8\u00cf\u00d1\u00da\u00de\u00e3\u00e7\u00ea\u00fd"+
		"\u0104\u010c\u0113\u011b\u0120\u0129\u0131\u0148\u014f\u015f\u016f\u0176"+
		"\u017c\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}