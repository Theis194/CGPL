package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.CardFunction;

public class CardFunctionVisitor<T> extends CGPLBaseVisitor<T> {
    @Override
    public T visitCardfunction(CGPLParser.CardfunctionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String functionName = ctx.cardfunctionname().getText();

        return (T) new CardFunction(identifier, functionName);
    }
}
