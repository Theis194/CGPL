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
	 * Enter a parse tree produced by {@link CGPLParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp(CGPLParser.BoolexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp(CGPLParser.BoolexpContext ctx);
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
	 * Enter a parse tree produced by {@link CGPLParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(CGPLParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(CGPLParser.LogicalContext ctx);
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
	 * Enter a parse tree produced by {@link CGPLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CGPLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGPLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CGPLParser.ListContext ctx);
}