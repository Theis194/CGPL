package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.ListFunction;

public class ListFunctionVisitor<T> extends CGPLBaseVisitor<T>{
    @Override
    public T visitListfunction(CGPLParser.ListfunctionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Expression value = null;
        if (ctx.value() != null) {
            value = new ExpressionVisitor().visitValue(ctx.value());
        }
        String functionName = ctx.listfunctionname().getText();

        return (T) new ListFunction(identifier, value, functionName);
    }
}
