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

        } else if (ctx.suitfunction() != null) {
            return new SuitFunctionVisitor().visitSuitfunction(ctx.suitfunction());

        } else if (ctx.boolExpr() != null) {
            // Handle boolean expression
            return new BooleanExpressionVisitor().visitBoolExpr(ctx.boolExpr());

        } else if (ctx.arthexp() != null) {
            // Handle arithmetic expression
            return new ArithmeticExpressionVisitor().visitArthexp(ctx.arthexp());

        } else if (ctx.comparisonExpr() != null) {
            // Handle comparison expression
            return new ComparisonVisitor().visitComparisonExpr(ctx.comparisonExpr());
        
        } else if (ctx.list() != null) {
            // Handle list expression
            return new LinkedListVisitor().visitList(ctx.list());

        } else if (ctx.deck() != null) {
            // Handle deck expression
            return new DeckVisitor().visitDeck(ctx.deck());

        } else if (ctx.card() != null) {
            // Handle card expression
            return new CardVisitor().visitCard(ctx.card());

        } else if (ctx.stringConcat() != null) {
            // Handle string concat expression
            return new StringConcatVisitor().visitStringConcat(ctx.stringConcat());

        } else if (ctx.functionCall() != null) {
            // Handle function call
            return new FunctionCallVisitor<Expression>().visitFunctionCall(ctx.functionCall());

        } else if (ctx.listfunction() != null) {
            // Handle list function
            return new ListFunctionVisitor<Expression>().visitListfunction(ctx.listfunction());
            
        } else if (ctx.deckfunction() != null) {
            // Handle deck function
            return new DeckFunctionVisitor<Expression>().visitDeckfunction(ctx.deckfunction());

        } else if (ctx.cardfunction() != null) {
            // Handle card function
            return new CardFunctionVisitor<Expression>().visitCardfunction(ctx.cardfunction());

        } else if (ctx.playerfunction() != null) {
            // Handle player function
            return new PlayerFunctionVisitor<Expression>().visitPlayerfunction(ctx.playerfunction());
            
        } else if (ctx.player() != null) {
            // Handle player expression
            return new PlayerVisitor().visitPlayer(ctx.player());
            
        }
        return super.visitValue(ctx);
    }
}