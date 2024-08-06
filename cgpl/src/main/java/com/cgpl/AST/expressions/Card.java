package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public class Card implements Expression {
    private String type = "card";
    private String suit;
    private String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        if (suit.equals("Hearts") || suit.equals("Diamonds")) {
            return "Red";
        } else if (suit.equals("Clubs") || suit.equals("Spades")) {
            return "Black";
        } else {
            return "Unknown";//husk at lave
        }
    }

    public String getRank() {
        return this.rank;
    }

    public String getName() {
        return this.rank + " of " + this.suit;
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
        return rank + " of " + suit;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }

    public int convertValue() {
        switch (rank) {
            case "Ace":
                return 1;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
            default:
                return Integer.parseInt(rank);
        }
    }
}
