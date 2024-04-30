// Generated from com\cgpl\CGPL.g4 by ANTLR 4.7.1
package com.cgpl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CGPLParser}.
 */
public interface CGPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CGPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CGPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CGPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CGPLParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CGPLParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#vardcl}.
	 * @param ctx the parse tree
	 */
	void enterVardcl(CGPLParser.VardclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#vardcl}.
	 * @param ctx the parse tree
	 */
	void exitVardcl(CGPLParser.VardclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CGPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CGPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(CGPLParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(CGPLParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CGPLParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CGPLParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(CGPLParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(CGPLParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(CGPLParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(CGPLParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(CGPLParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(CGPLParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CGPLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CGPLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CGPLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CGPLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CGPLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CGPLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#stringConcat}.
	 * @param ctx the parse tree
	 */
	void enterStringConcat(CGPLParser.StringConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#stringConcat}.
	 * @param ctx the parse tree
	 */
	void exitStringConcat(CGPLParser.StringConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#boolvalue}.
	 * @param ctx the parse tree
	 */
	void enterBoolvalue(CGPLParser.BoolvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#boolvalue}.
	 * @param ctx the parse tree
	 */
	void exitBoolvalue(CGPLParser.BoolvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(CGPLParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(CGPLParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(CGPLParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(CGPLParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CGPLParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CGPLParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CGPLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CGPLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#arthexp}.
	 * @param ctx the parse tree
	 */
	void enterArthexp(CGPLParser.ArthexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#arthexp}.
	 * @param ctx the parse tree
	 */
	void exitArthexp(CGPLParser.ArthexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(CGPLParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(CGPLParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(CGPLParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(CGPLParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(CGPLParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(CGPLParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CGPLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CGPLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#arth_op}.
	 * @param ctx the parse tree
	 */
	void enterArth_op(CGPLParser.Arth_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#arth_op}.
	 * @param ctx the parse tree
	 */
	void exitArth_op(CGPLParser.Arth_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CGPLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CGPLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#listfunction}.
	 * @param ctx the parse tree
	 */
	void enterListfunction(CGPLParser.ListfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#listfunction}.
	 * @param ctx the parse tree
	 */
	void exitListfunction(CGPLParser.ListfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#listfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterListfunctionname(CGPLParser.ListfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#listfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitListfunctionname(CGPLParser.ListfunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#deck}.
	 * @param ctx the parse tree
	 */
	void enterDeck(CGPLParser.DeckContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#deck}.
	 * @param ctx the parse tree
	 */
	void exitDeck(CGPLParser.DeckContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#deckfunction}.
	 * @param ctx the parse tree
	 */
	void enterDeckfunction(CGPLParser.DeckfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#deckfunction}.
	 * @param ctx the parse tree
	 */
	void exitDeckfunction(CGPLParser.DeckfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#deckfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterDeckfunctionname(CGPLParser.DeckfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#deckfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitDeckfunctionname(CGPLParser.DeckfunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(CGPLParser.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(CGPLParser.CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#cardfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterCardfunctionname(CGPLParser.CardfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#cardfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitCardfunctionname(CGPLParser.CardfunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstmt(CGPLParser.SwitchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstmt(CGPLParser.SwitchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGPLParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void enterCasestmt(CGPLParser.CasestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void exitCasestmt(CGPLParser.CasestmtContext ctx);
}