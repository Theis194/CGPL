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