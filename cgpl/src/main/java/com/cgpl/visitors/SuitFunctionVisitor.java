package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.SuitFunction;

public class SuitFunctionVisitor extends CGPLBaseVisitor<SuitFunction> {
    @Override
    public SuitFunction visitSuitfunction(CGPLParser.SuitfunctionContext ctx) {
        String name = ctx.STRING(0).getText().replace("\"", ""); // Remove quotes
        String color = ctx.STRING(1).getText().replace("\"", ""); // Remove quotes

        return new SuitFunction(name, color);
    }
}