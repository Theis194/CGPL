package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.PlayerFunction;

public class PlayerFunctionVisitor<T> extends CGPLBaseVisitor<T> {
    @Override
    public T visitPlayerfunction(CGPLParser.PlayerfunctionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Expression value = null;
        if (ctx.value() != null) {
            value = ctx.value().accept(new ExpressionVisitor());
        }
        String type = ctx.playerfunctionname().getText();
        return (T) new PlayerFunction(identifier, value, type);
    }
}
