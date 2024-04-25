package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.OrExpression;

public class OrExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public OrExpression visitOrExpr(CGPLParser.OrExprContext ctx) {
        AndExpressionVisitor andExpressionVisitor = new AndExpressionVisitor();
        List<Expression> andExpressions = ctx.andExpr()
                .stream()
                .map(andExpr -> andExpr.accept(andExpressionVisitor))
                .collect(toList());
        return new OrExpression(andExpressions);
    }
}