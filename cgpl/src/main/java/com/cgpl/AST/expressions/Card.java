package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public class Card implements Expression {
    private String type = "card";
    private String suit;
    private String value;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        if (suit.equals("Hearts") || suit.equals("Diamonds")) {
            return "Red";
        } else {
            return "Black";
        }
    }

    public String getName() {
        return value + " of " + suit;
    }

    @Override
    public String getValue() {
        return convertValue() + "";
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }

    private int convertValue() {
        switch (value) {
            case "Ace":
                return 1;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
            default:
                return Integer.parseInt(value);
        }
    }
}
