package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Identifier;

public class BooleanValueVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitBoolvalue(CGPLParser.BoolvalueContext ctx) {
        if (ctx.BOOLEAN() != null) {
            return new Boolean(java.lang.Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        } else if (ctx.IDENTIFIER() != null) {
            return new Identifier(ctx.IDENTIFIER().getText());
        } else if (ctx.boolExpr() != null) {
            return ctx.boolExpr().accept(new OrExpressionVisitor());
        } else {
            throw new IllegalArgumentException("Unexpected boolvalue");
        }
    }
}