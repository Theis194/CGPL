package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Suit;

public class SuitFunctionVisitor extends CGPLBaseVisitor<Suit> {
    @Override
    public Suit visitSuitfunction(CGPLParser.SuitfunctionContext ctx) {
        String name = ctx.STRING(0).getText().replace("\"", ""); // Remove quotes
        String color = ctx.STRING(1).getText().replace("\"", ""); // Remove quotes

        return new Suit(name, color);
    }
}