package com.cgpl.visitors;

import java.util.List;
import java.util.ArrayList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.ArithmeticExpression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Term;

public class ArithmeticExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitArthexp(CGPLParser.ArthexpContext ctx) {
        // Base case: if there's only one term, visit that term directly.
        if (ctx.arthexp() == null) {
            return visitTerm(ctx.term());
        }

        List<Expression> operands = new ArrayList<>();
        Expression left = visitArthexp(ctx.arthexp());
        Expression right = visitTerm(ctx.term());
        
        operands.add(left);
        operands.add(right);

        String operator = ctx.OP_ADD() != null ? "+" : "-";

        return new ArithmeticExpression(operands, operator);
    }

    @Override
    public Expression visitTerm(CGPLParser.TermContext ctx) {
        if (ctx.binary_mult_div_mod() != null) {
            return visitBinary_mult_div_mod(ctx.binary_mult_div_mod());
        } else {
            return visitFactor(ctx.factor());
        }
    }

    @Override
    public Expression visitBinary_mult_div_mod(CGPLParser.Binary_mult_div_modContext ctx) {
        List<Expression> operands = ctx.factor().stream().map(this::visitFactor).toList();

        String operator;
        if (ctx.OP_MULT() != null) {
            operator = "*";
        } else if (ctx.OP_DIV() != null) {
            operator = "/";
        } else { // ctx.OP_MOD() != null
            operator = "%";
        }

        return new Term(operands, operator);
    }

    @Override
    public Expression visitFactor(CGPLParser.FactorContext ctx) {
        if (ctx.NUMBER() != null) {
            // Handle number
            return new Number(Integer.parseInt(ctx.NUMBER().getText()));

        } else if (ctx.IDENTIFIER() != null) {
            // Handle identifier
            return new Identifier(ctx.IDENTIFIER().getText());

        } else if (ctx.arthexp() != null) {
            // Handle arithmetic expression
            return visitArthexp(ctx.arthexp());

        } else if (ctx.functionCall() != null) {
            // Handle function call
            return new FunctionCallVisitor<Expression>().visitFunctionCall(ctx.functionCall());
            
        } else if (ctx.BOOLEAN() != null) {
            // Handle boolean
            return new Boolean(java.lang.Boolean.parseBoolean(ctx.BOOLEAN().getText()));

        } else if (ctx.cardfunction() != null) {
            // Handle card function
            return new CardFunctionVisitor<Expression>().visitCardfunction(ctx.cardfunction());
        
        } else if (ctx.deckfunction() != null) {
            // Handle deck function
            return new DeckFunctionVisitor<Expression>().visitDeckfunction(ctx.deckfunction());

        } else if (ctx.listfunction() != null) {
            // Handle list function
            return new ListFunctionVisitor<Expression>().visitListfunction(ctx.listfunction());
            
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
