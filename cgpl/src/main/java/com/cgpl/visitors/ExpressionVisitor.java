package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.StringLiteral;

public class ExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitValue(CGPLParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            // Handle number
            return new Number(Integer.parseInt(ctx.NUMBER().getText()));
            
        } else if (ctx.IDENTIFIER() != null) {
            // Handle identifier
            return new Identifier(ctx.IDENTIFIER().getText());

        } else if (ctx.STRING() != null) {
            // Handle string
            return new StringLiteral(ctx.STRING().getText().replaceAll("\"", ""));

        } else if (ctx.boolExpr() != null) {
            // Handle boolean expression
            return new BooleanExpressionVisitor().visitBoolExpr(ctx.boolExpr());

        } else if (ctx.arthexp() != null) {
            // Handle arithmetic expression
            return new ArithmeticExpressionVisitor().visitArthexp(ctx.arthexp());

        } else if (ctx.list() != null) {
            // Handle list expression
            return new LinkedListVisitor().visitList(ctx.list());

        } else if (ctx.stringConcat() != null) {
            // Handle string concat expression
            return new StringConcatVisitor().visitStringConcat(ctx.stringConcat());

        } else if (ctx.functionCall() != null) {
            // Handle function call
            return new FunctionCallVisitor<Expression>().visitFunctionCall(ctx.functionCall());

        }
        return super.visitValue(ctx);
    }
}