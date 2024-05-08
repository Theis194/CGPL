package com.cgpl.visitors;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.CGPLParser.ComparisonContext;
import com.cgpl.AST.expressions.ComparisonExpression;
import com.cgpl.AST.expressions.Expression;

public class ComparisonVisitor extends CGPLBaseVisitor<Expression>{
    @Override
    public Expression visitComparisonExpr(CGPLParser.ComparisonExprContext ctx) {
        ArithmeticExpressionVisitor visitor = new ArithmeticExpressionVisitor();
        
        List<Expression> operands = ctx.arthexp()
            .stream()
            .map(arthexp -> visitor.visitArthexp(arthexp))
            .collect(toList());
        String operator = getOperator(ctx.comparison());

        return new ComparisonExpression(operands, operator);
    }

    private String getOperator(ComparisonContext ctx) {
        if (ctx.LT() != null) {
            return "lt";
        } else if (ctx.GT() != null) {
            return "gt";
        } else if (ctx.LT_OR_EQUAL() != null) {
            return "lte";
        } else if (ctx.GT_OR_EQUAL() != null) {
            return "gte";
        } else if (ctx.EQUAL() != null) {
            return "eq";
        }
        return null;
    }
}
