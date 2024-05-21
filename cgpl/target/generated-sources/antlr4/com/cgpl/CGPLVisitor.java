// Generated from com\cgpl\CGPL.g4 by ANTLR 4.7.1
package com.cgpl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CGPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CGPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CGPLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CGPLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(CGPLParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#vardcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardcl(CGPLParser.VardclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CGPLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(CGPLParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(CGPLParser.PrintstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CGPLParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(CGPLParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(CGPLParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(CGPLParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CGPLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CGPLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CGPLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#stringConcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConcat(CGPLParser.StringConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#boolvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolvalue(CGPLParser.BoolvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(CGPLParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(CGPLParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(CGPLParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CGPLParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#arthexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthexp(CGPLParser.ArthexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(CGPLParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(CGPLParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(CGPLParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CGPLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#arth_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArth_op(CGPLParser.Arth_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CGPLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#listfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListfunction(CGPLParser.ListfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#listfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListfunctionname(CGPLParser.ListfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#deck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeck(CGPLParser.DeckContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#deckfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeckfunction(CGPLParser.DeckfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#deckfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeckfunctionname(CGPLParser.DeckfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(CGPLParser.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#cardfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardfunction(CGPLParser.CardfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#cardfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardfunctionname(CGPLParser.CardfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#suit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit(CGPLParser.SuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#cardvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardvalue(CGPLParser.CardvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(CGPLParser.PlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#playerfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerfunction(CGPLParser.PlayerfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#playerfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerfunctionname(CGPLParser.PlayerfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#switchstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchstmt(CGPLParser.SwitchstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGPLParser#casestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasestmt(CGPLParser.CasestmtContext ctx);
}