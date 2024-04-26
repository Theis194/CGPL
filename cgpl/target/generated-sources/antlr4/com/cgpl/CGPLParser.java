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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AND=9, 
		OR=10, NOT=11, RETURN=12, FUNCTION=13, LCURLY=14, RCURLY=15, LPAREN=16, 
		RPAREN=17, IF=18, ELSE=19, VAR=20, KONST=21, FOR=22, IN=23, NUMBER=24, 
		STRING=25, BOOLEAN=26, BREAK=27, IDENTIFIER=28, EQUAL=29, LT=30, GT=31, 
		LT_OR_EQUAL=32, GT_OR_EQUAL=33, OP_INC=34, OP_DEC=35, OP_DIV=36, OP_MULT=37, 
		OP_MOD=38, OP_ADD=39, OP_SUB=40, CRLF=41, WS=42;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_vardcl = 2, RULE_assignment = 3, 
		RULE_returnstmt = 4, RULE_functionBody = 5, RULE_ifstmt = 6, RULE_forstmt = 7, 
		RULE_functionCall = 8, RULE_function = 9, RULE_value = 10, RULE_stringConcat = 11, 
		RULE_boolvalue = 12, RULE_andExpr = 13, RULE_orExpr = 14, RULE_boolExpr = 15, 
		RULE_factor = 16, RULE_arthexp = 17, RULE_increment = 18, RULE_decrement = 19, 
		RULE_comparison = 20, RULE_arth_op = 21, RULE_list = 22, RULE_switchstmt = 23, 
		RULE_casestmt = 24;
	public static final String[] ruleNames = {
		"program", "instruction", "vardcl", "assignment", "returnstmt", "functionBody", 
		"ifstmt", "forstmt", "functionCall", "function", "value", "stringConcat", 
		"boolvalue", "andExpr", "orExpr", "boolExpr", "factor", "arthexp", "increment", 
		"decrement", "comparison", "arth_op", "list", "switchstmt", "casestmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'['", "']'", "'switch'", "'case'", "'default'", "':'", 
		"'and'", "'or'", "'not'", "'return'", "'function'", "'{'", "'}'", "'('", 
		"')'", "'if'", "'else'", "'var'", "'const'", "'for'", "'in'", null, null, 
		null, "'break'", null, "'=='", "'<'", "'>'", "'<='", "'>='", "'++'", "'--'", 
		"'/'", "'*'", "'%'", "'+'", "'-'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "AND", "OR", "NOT", 
		"RETURN", "FUNCTION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "IF", "ELSE", 
		"VAR", "KONST", "FOR", "IN", "NUMBER", "STRING", "BOOLEAN", "BREAK", "IDENTIFIER", 
		"EQUAL", "LT", "GT", "LT_OR_EQUAL", "GT_OR_EQUAL", "OP_INC", "OP_DEC", 
		"OP_DIV", "OP_MULT", "OP_MOD", "OP_ADD", "OP_SUB", "CRLF", "WS"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50);
				instruction();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				vardcl();
				setState(59);
				match(CRLF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				forstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				returnstmt();
				setState(65);
				match(CRLF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				assignment();
				setState(68);
				match(CRLF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				increment();
				setState(71);
				match(CRLF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				decrement();
				setState(74);
				match(CRLF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				functionCall();
				setState(77);
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
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==KONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(IDENTIFIER);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(83);
				match(T__0);
				setState(84);
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
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(T__0);
			setState(89);
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
			setState(91);
			match(RETURN);
			setState(92);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(94);
				instruction();
				}
				}
				setState(99);
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
			setState(100);
			match(IF);
			setState(101);
			value();
			setState(102);
			match(LCURLY);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(103);
				instruction();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RCURLY);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(110);
				match(ELSE);
				setState(111);
				match(LCURLY);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(112);
					instruction();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
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
		public TerminalNode IDENTIFIER() { return getToken(CGPLParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(CGPLParser.IN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CGPLParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CGPLParser.LCURLY, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(IN);
			setState(124);
			value();
			setState(125);
			match(RCURLY);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
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
			match(LCURLY);
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
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(LPAREN);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LPAREN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(136);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(139);
				value();
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					match(T__1);
					setState(141);
					value();
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				}
				break;
			}
			setState(148);
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
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FUNCTION);
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(LPAREN);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(153);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(154);
					value();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(157);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(158);
					value();
					}
					break;
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(161);
					match(T__1);
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(162);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(163);
						value();
						}
						break;
					}
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(173);
			match(RPAREN);
			setState(174);
			match(LCURLY);
			setState(175);
			functionBody();
			setState(176);
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
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				boolExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				arthexp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
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
		enterRule(_localctx, 22, RULE_stringConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(OP_ADD);
				setState(190);
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
				setState(193); 
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
		enterRule(_localctx, 24, RULE_boolvalue);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LPAREN);
				setState(196);
				boolExpr();
				setState(197);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
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
		enterRule(_localctx, 26, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			boolvalue();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(204);
				match(AND);
				setState(205);
				boolvalue();
				}
				}
				setState(210);
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
		enterRule(_localctx, 28, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			andExpr();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(212);
				match(OR);
				setState(213);
				andExpr();
				}
				}
				setState(218);
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
		enterRule(_localctx, 30, RULE_boolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(LPAREN);
				setState(224);
				arthexp();
				setState(225);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
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
		enterRule(_localctx, 34, RULE_arthexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			factor();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_DIV) | (1L << OP_MULT) | (1L << OP_MOD) | (1L << OP_ADD) | (1L << OP_SUB))) != 0)) {
				{
				{
				setState(231);
				arth_op();
				setState(232);
				factor();
				}
				}
				setState(238);
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
		enterRule(_localctx, 36, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			setState(240);
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
		enterRule(_localctx, 38, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
			setState(243);
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
		enterRule(_localctx, 40, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 42, RULE_arth_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 44, RULE_list);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__2);
				setState(250);
				value();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(251);
					match(T__1);
					setState(252);
					value();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__2);
				setState(261);
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
		enterRule(_localctx, 46, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__4);
			setState(265);
			match(LPAREN);
			setState(266);
			value();
			setState(267);
			match(RPAREN);
			setState(268);
			match(LCURLY);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				casestmt();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==T__6 );
			setState(274);
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
		enterRule(_localctx, 48, RULE_casestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(276);
				match(T__5);
				setState(277);
				value();
				}
				break;
			case T__6:
				{
				setState(278);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			match(T__7);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << VAR) | (1L << KONST) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(282);
				instruction();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(288);
				match(BREAK);
				setState(289);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n"+
		"\3\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7b\n\7\f"+
		"\7\16\7e\13\7\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\b"+
		"\7\bt\n\b\f\b\16\bw\13\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082"+
		"\n\t\f\t\16\t\u0085\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n"+
		"\6\n\u0091\n\n\r\n\16\n\u0092\5\n\u0095\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u009e\n\13\3\13\3\13\5\13\u00a2\n\13\3\13\3\13\3\13\5\13\u00a7"+
		"\n\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13\5\13\u00ae\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\r\3\r"+
		"\3\r\6\r\u00c2\n\r\r\r\16\r\u00c3\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cc"+
		"\n\16\3\17\3\17\3\17\7\17\u00d1\n\17\f\17\16\17\u00d4\13\17\3\20\3\20"+
		"\3\20\7\20\u00d9\n\20\f\20\16\20\u00dc\13\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00e7\n\22\3\23\3\23\3\23\3\23\7\23\u00ed\n"+
		"\23\f\23\16\23\u00f0\13\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u0100\n\30\f\30\16\30\u0103\13\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0109\n\30\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0111"+
		"\n\31\r\31\16\31\u0112\3\31\3\31\3\32\3\32\3\32\5\32\u011a\n\32\3\32\3"+
		"\32\7\32\u011e\n\32\f\32\16\32\u0121\13\32\3\32\3\32\5\32\u0125\n\32\3"+
		"\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3"+
		"\2\26\27\4\2\33\33\36\36\3\2\37#\3\2&*\2\u013b\2\67\3\2\2\2\4Q\3\2\2\2"+
		"\6S\3\2\2\2\bY\3\2\2\2\n]\3\2\2\2\fc\3\2\2\2\16f\3\2\2\2\20{\3\2\2\2\22"+
		"\u0088\3\2\2\2\24\u0098\3\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2\2\32\u00cb"+
		"\3\2\2\2\34\u00cd\3\2\2\2\36\u00d5\3\2\2\2 \u00dd\3\2\2\2\"\u00e6\3\2"+
		"\2\2$\u00e8\3\2\2\2&\u00f1\3\2\2\2(\u00f4\3\2\2\2*\u00f7\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u0119\3\2\2\2\64\66\5\4\3"+
		"\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3"+
		"\2\2\2:;\7\2\2\3;\3\3\2\2\2<=\5\6\4\2=>\7+\2\2>R\3\2\2\2?R\5\24\13\2@"+
		"R\5\16\b\2AR\5\20\t\2BC\5\n\6\2CD\7+\2\2DR\3\2\2\2EF\5\b\5\2FG\7+\2\2"+
		"GR\3\2\2\2HI\5&\24\2IJ\7+\2\2JR\3\2\2\2KL\5(\25\2LM\7+\2\2MR\3\2\2\2N"+
		"O\5\22\n\2OP\7+\2\2PR\3\2\2\2Q<\3\2\2\2Q?\3\2\2\2Q@\3\2\2\2QA\3\2\2\2"+
		"QB\3\2\2\2QE\3\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2R\5\3\2\2\2ST\t\2\2"+
		"\2TW\7\36\2\2UV\7\3\2\2VX\5\26\f\2WU\3\2\2\2WX\3\2\2\2X\7\3\2\2\2YZ\7"+
		"\36\2\2Z[\7\3\2\2[\\\5\26\f\2\\\t\3\2\2\2]^\7\16\2\2^_\5\26\f\2_\13\3"+
		"\2\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\r\3\2\2\2ec"+
		"\3\2\2\2fg\7\24\2\2gh\5\26\f\2hl\7\20\2\2ik\5\4\3\2ji\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oy\7\21\2\2pq\7\25\2\2qu\7\20"+
		"\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2"+
		"\2\2xz\7\21\2\2yp\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{|\7\30\2\2|}\7\36\2\2"+
		"}~\7\31\2\2~\177\5\26\f\2\177\u0083\7\21\2\2\u0080\u0082\5\4\3\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\20\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0089\7\36\2\2\u0089\u0094\7\22\2\2\u008a\u008c\5\26"+
		"\f\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0095\3\2\2\2\u008d"+
		"\u0090\5\26\f\2\u008e\u008f\7\4\2\2\u008f\u0091\5\26\f\2\u0090\u008e\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008d\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\23\2\2\u0097\23\3\2\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\7\36\2\2\u009a\u00ad\7\22\2\2\u009b\u009e\7\36\2\2\u009c\u009e"+
		"\5\26\f\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u00ae\3\2\2\2\u009f\u00a2\7\36\2\2\u00a0\u00a2\5\26\f\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a6\7\4\2\2\u00a4"+
		"\u00a7\7\36\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\7\23\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7"+
		"\21\2\2\u00b3\25\3\2\2\2\u00b4\u00bd\7\32\2\2\u00b5\u00bd\7\36\2\2\u00b6"+
		"\u00bd\7\33\2\2\u00b7\u00bd\5 \21\2\u00b8\u00bd\5$\23\2\u00b9\u00bd\5"+
		".\30\2\u00ba\u00bd\5\22\n\2\u00bb\u00bd\5\30\r\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\27\3\2\2\2\u00be\u00c1\t\3\2\2\u00bf\u00c0\7)\2\2\u00c0\u00c2\t\3\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5 \21\2\u00c7"+
		"\u00c8\7\23\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cc\7\34\2\2\u00ca\u00cc\7"+
		"\36\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\33\3\2\2\2\u00cd\u00d2\5\32\16\2\u00ce\u00cf\7\13\2\2\u00cf\u00d1\5\32"+
		"\16\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5\34\17"+
		"\2\u00d6\u00d7\7\f\2\2\u00d7\u00d9\5\34\17\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\37\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\36\20\2\u00de!\3\2\2\2\u00df\u00e7"+
		"\7\32\2\2\u00e0\u00e7\7\36\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5$\23"+
		"\2\u00e3\u00e4\7\23\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\22\n\2\u00e6"+
		"\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7#\3\2\2\2\u00e8\u00ee\5\"\22\2\u00e9\u00ea\5,\27\2\u00ea\u00eb"+
		"\5\"\22\2\u00eb\u00ed\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef%\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f1\u00f2\7\36\2\2\u00f2\u00f3\7$\2\2\u00f3\'\3\2\2\2\u00f4\u00f5"+
		"\7\36\2\2\u00f5\u00f6\7%\2\2\u00f6)\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8"+
		"+\3\2\2\2\u00f9\u00fa\t\5\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7\5\2\2\u00fc"+
		"\u0101\5\26\f\2\u00fd\u00fe\7\4\2\2\u00fe\u0100\5\26\f\2\u00ff\u00fd\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\6\2\2\u0105\u0109\3\2"+
		"\2\2\u0106\u0107\7\5\2\2\u0107\u0109\7\6\2\2\u0108\u00fb\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109/\3\2\2\2\u010a\u010b\7\7\2\2\u010b\u010c\7\22\2\2"+
		"\u010c\u010d\5\26\f\2\u010d\u010e\7\23\2\2\u010e\u0110\7\20\2\2\u010f"+
		"\u0111\5\62\32\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\21\2\2\u0115"+
		"\61\3\2\2\2\u0116\u0117\7\b\2\2\u0117\u011a\5\26\f\2\u0118\u011a\7\t\2"+
		"\2\u0119\u0116\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f"+
		"\7\n\2\2\u011c\u011e\5\4\3\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7\35\2\2\u0123\u0125\7+\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\63\3\2\2\2\37\67QWcluy\u0083\u008b\u0092\u0094\u009d"+
		"\u00a1\u00a6\u00aa\u00ad\u00bc\u00c3\u00cb\u00d2\u00da\u00e6\u00ee\u0101"+
		"\u0108\u0112\u0119\u011f\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}