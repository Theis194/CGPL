package com.cgpl;

public class Listener extends CGPLBaseListener{
    @Override
    public void enterProgram(CGPLParser.ProgramContext ctx) {
        System.out.println("Entering program");
    }

    @Override
    public void exitProgram(CGPLParser.ProgramContext ctx) {
        System.out.println("Exiting program");
    }

    @Override
    public void enterInstruction(CGPLParser.InstructionContext ctx) {
        System.out.println("Entering instruction");
    }

    @Override
    public void exitInstruction(CGPLParser.InstructionContext ctx) {
        System.out.println("Exiting instruction");
    }

    @Override
    public void enterFunction(CGPLParser.FunctionContext ctx) {
        System.out.println("Entering function");
    }

    @Override
    public void exitFunction(CGPLParser.FunctionContext ctx) {
        System.out.println("Exiting function");
    }

    @Override
    public void enterFunctionBody(CGPLParser.FunctionBodyContext ctx) {
        System.out.println("Entering function body");
    }

    @Override
    public void exitFunctionBody(CGPLParser.FunctionBodyContext ctx) {
        System.out.println("Exiting function body");
    }

    @Override
    public void enterVardcl(CGPLParser.VardclContext ctx) {
        System.out.println("Entering variable declaration");
        System.out.println("Variable identifier: " + ctx.IDENTIFIER());
    }

    @Override
    public void exitVardcl(CGPLParser.VardclContext ctx) {
        System.out.println("Exiting variable declaration");
    }

    @Override
    public void enterIfstmt(CGPLParser.IfstmtContext ctx) {
        System.out.println("Entering if statement");
    }

    @Override
    public void exitIfstmt(CGPLParser.IfstmtContext ctx) {
        System.out.println("Exiting if statement");
    }

    @Override
    public void enterForstmt(CGPLParser.ForstmtContext ctx) {
        System.out.println("Entering for statement");
    }

    @Override
    public void exitForstmt(CGPLParser.ForstmtContext ctx) {
        System.out.println("Exiting for statement");
    }

    @Override
    public void enterBoolexp(CGPLParser.BoolexpContext ctx) {
        System.out.println("Entering boolean expression");
    }

    @Override
    public void exitBoolexp(CGPLParser.BoolexpContext ctx) {
        System.out.println("Exiting boolean expression");
    }

    @Override
    public void enterFactor(CGPLParser.FactorContext ctx) {
        System.out.println("Entering factor");
    }

    @Override
    public void exitFactor(CGPLParser.FactorContext ctx) {
        System.out.println("Exiting factor");
    }

    @Override
    public void enterArthexp(CGPLParser.ArthexpContext ctx) {
        System.out.println("Entering arithmetic expression");
    }

    @Override
    public void exitArthexp(CGPLParser.ArthexpContext ctx) {
        System.out.println("Exiting arithmetic expression");
    }

    @Override
    public void enterIncrement(CGPLParser.IncrementContext ctx) {
        System.out.println("Entering increment");
    }

    @Override
    public void exitIncrement(CGPLParser.IncrementContext ctx) {
        System.out.println("Exiting increment");
    }

    @Override
    public void enterDecrement(CGPLParser.DecrementContext ctx) {
        System.out.println("Entering decrement");
    }

    @Override
    public void exitDecrement(CGPLParser.DecrementContext ctx) {
        System.out.println("Exiting decrement");
    }

    @Override
    public void enterLogical(CGPLParser.LogicalContext ctx) {
        System.out.println("Entering logical expression");
    }

    @Override
    public void exitLogical(CGPLParser.LogicalContext ctx) {
        System.out.println("Exiting logical expression");
    }

    @Override
    public void enterComparison(CGPLParser.ComparisonContext ctx) {
        System.out.println("Entering comparison");
    }

    @Override
    public void exitComparison(CGPLParser.ComparisonContext ctx) {
        System.out.println("Exiting comparison");
    }

    @Override
    public void enterArth_op(CGPLParser.Arth_opContext ctx) {
        System.out.println("Entering arithmetic operator");
    }

    @Override
    public void exitArth_op(CGPLParser.Arth_opContext ctx) {
        System.out.println("Exiting arithmetic operator");
    }

    @Override
    public void enterValue(CGPLParser.ValueContext ctx) {
        System.out.println("Entering value");
    }

    @Override
    public void exitValue(CGPLParser.ValueContext ctx) {
        System.out.println("Exiting value");
    }

    @Override
    public void enterList(CGPLParser.ListContext ctx) {
        System.out.println("Entering list");
    }

    @Override
    public void exitList(CGPLParser.ListContext ctx) {
        System.out.println("Exiting list");
    }
}
