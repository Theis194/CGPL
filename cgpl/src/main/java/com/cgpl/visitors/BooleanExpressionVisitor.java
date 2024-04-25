package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;

public class BooleanExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitBoolExpr(CGPLParser.BoolExprContext ctx) {
        return new OrExpressionVisitor().visitOrExpr(ctx.orExpr());
    }
}