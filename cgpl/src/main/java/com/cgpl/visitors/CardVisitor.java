package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Card;

public class CardVisitor extends CGPLBaseVisitor<Card>{
    @Override
    public Card visitCard(CGPLParser.CardContext ctx) {
        String value = ctx.cardvalue().getText();
        String suit = ctx.IDENTIFIER().getText();
        return new Card(value, suit);
    }
}
