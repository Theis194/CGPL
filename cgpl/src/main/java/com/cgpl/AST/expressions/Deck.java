package com.cgpl.AST.expressions;

public class Deck implements Expression {
    String type = "deck";

    @Override
    public String getType() {
        return this.type;
    }
}