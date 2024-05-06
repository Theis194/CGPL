package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.DeckFunction;
import com.cgpl.AST.expressions.Expression;

public class DeckFunctionVisitor<T> extends CGPLBaseVisitor<T>{
    @Override
    public T visitDeckfunction(CGPLParser.DeckfunctionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Expression value = ctx.value().accept(new ExpressionVisitor());
        String functionName = ctx.deckfunctionname().getText();

        return (T) new DeckFunction(identifier, value, functionName);
    }
}
