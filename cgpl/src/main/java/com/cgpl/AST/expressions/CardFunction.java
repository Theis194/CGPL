package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.Instruction;

public class CardFunction implements Expression, Instruction{
    private String identifier;
    private String type;

    public CardFunction(String identifier, String type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getValue() {
        return this.identifier;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.identifier + " of " + this.type;
    }

    @Override
    public String getInstructionType() {
        return "CardFunction";
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        if (!symbolTable.hasSymbol(this.identifier)) {
            throw new IllegalArgumentException("Card not found: " + this.identifier);
        } else if (!(symbolTable.getSymbol(this.identifier) instanceof Card)) {
            throw new IllegalArgumentException("Symbol is not a card: " + this.identifier);
        }

        switch (this.type) {
            case "value":
                int cardValue = Integer.parseInt(((Card)symbolTable.getSymbol(identifier)).getValue());
                return new Number(cardValue);

            case "suit":
            return new StringLiteral(((Card)symbolTable.getSymbol(identifier)).getSuit());

            case "color":
                return new StringLiteral(((Card)symbolTable.getSymbol(identifier)).getColor());
                
            case "name":
                return new StringLiteral(((Card)symbolTable.getSymbol(identifier)).getName());
        
            default:
                throw new IllegalArgumentException("Invalid card function type: " + this.type);
        }
    }
}
