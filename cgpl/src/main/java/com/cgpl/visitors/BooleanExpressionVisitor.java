package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.AndExpression;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.NotExpression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.OrExpression;

public class BooleanExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitBoolExpr(CGPLParser.BoolExprContext ctx) {
        Expression expression = null;
        if (ctx.orExpr() != null) {
            expression = this.visit(ctx.orExpr());
        } else if (ctx.comparisonExpr() != null) {
            expression = new ComparisonVisitor().visitComparisonExpr(ctx.comparisonExpr());
        }
        return expression;
    }
    
    @Override
    public Expression visitOrExpr(CGPLParser.OrExprContext ctx) {
        List<Expression> andExpressions = ctx.andExpr()
            .stream()
            .map(this::visit)
            .collect(toList());

        if (andExpressions.size() == 1) {
            return andExpressions.get(0);
        }

        return new OrExpression(andExpressions);
    }
    
    @Override
    public Expression visitAndExpr(CGPLParser.AndExprContext ctx) {
        List<Expression> operands = ctx.boolvalue()
            .stream()
            .map(this::visit)
            .collect(toList());
        
        if (operands.size() == 1) {
            return operands.get(0);
        }

        return new AndExpression(operands);
    }

    @Override
    public Expression visitBoolvalue(CGPLParser.BoolvalueContext ctx) {
        Expression expression = null;

    if (ctx.BOOLEAN() != null) {
        expression = new Boolean(java.lang.Boolean.parseBoolean(ctx.BOOLEAN().getText()));
    } else if (ctx.IDENTIFIER() != null) {
        expression = new Identifier(ctx.IDENTIFIER().getText());
    } else if (ctx.boolExpr() != null) {
        expression = this.visit(ctx.boolExpr());
    } else {
        throw new IllegalArgumentException("Unexpected boolvalue");
    }

    // Check if the NOT token is present and wrap the expression in a NotExpression if it is
    if (ctx.NOT() != null) {
        expression = new NotExpression(expression);
    }

    return expression;
    }
}