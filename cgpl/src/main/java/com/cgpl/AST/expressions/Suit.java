package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public class Suit implements Expression {
    private String type = "suit";
    private String name;
    private String color;

    public Suit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getValue() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Suit: " + this.name + " Color: " + this.color;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
