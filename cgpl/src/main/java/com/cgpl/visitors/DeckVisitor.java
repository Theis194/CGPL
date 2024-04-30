package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Deck;
import com.cgpl.AST.expressions.Expression;

public class DeckVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitDeck(CGPLParser.DeckContext ctx) {
        return new Deck();
    }
}
