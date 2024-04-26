package com.cgpl.visitors;

import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.ArithmeticExpression;

public class ArithmeticExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitArthexp(CGPLParser.ArthexpContext ctx) {
        List<Expression> operands = ctx.factor().stream().map(this::visitFactor).toList();

        if (operands.size() == 1) {
            return operands.get(0);
            
        }

        String operator = null;
        if (ctx.arth_op(0) != null) {
            operator = getOperator(ctx.arth_op(0));
        }
        
        return new ArithmeticExpression(operands, operator);
    }

    @Override
    public Expression visitFactor(CGPLParser.FactorContext ctx) {
        if (ctx.NUMBER() != null) {
            return new Number(Integer.parseInt(ctx.NUMBER().getText()));
        } else if (ctx.IDENTIFIER() != null) {
            return new Identifier(ctx.IDENTIFIER().getText());
        } else if (ctx.arthexp() != null) {
            return visitArthexp(ctx.arthexp());
        }
        return null;
    }

    private String getOperator(CGPLParser.Arth_opContext ctx) {
        if (ctx.OP_ADD() != null) {
            return "+";
        } else if (ctx.OP_SUB() != null) {
            return "-";
        } else if (ctx.OP_MULT() != null) {
            return "*";
        } else if (ctx.OP_DIV() != null) {
            return "/";
        } else if (ctx.OP_MOD() != null) {
            return "%";
        }
        return null;
    }
}
