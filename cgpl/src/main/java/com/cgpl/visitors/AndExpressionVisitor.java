package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.AndExpression;
import com.cgpl.AST.expressions.Expression;

public class AndExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public AndExpression visitAndExpr(CGPLParser.AndExprContext ctx) {
        BooleanValueVisitor booleanValueVisitor = new BooleanValueVisitor();
        List<Expression> operands = ctx.boolvalue()
                .stream()
                .map(value -> value.accept(booleanValueVisitor))
                .collect(toList());
        return new AndExpression(operands);
    }
}