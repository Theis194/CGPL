package com.cgpl.visitors;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.FunctionCall;

public class FunctionCallVisitor<T> extends CGPLBaseVisitor<T> {
    @Override
    public T visitFunctionCall(CGPLParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Expression> arguments = ctx.value()
            .stream()
            .map(value -> (Expression) value.accept(new ExpressionVisitor()))
            .collect(toList());
        return (T) new FunctionCall(functionName, arguments);
    }
}
