package com.cgpl.AST.expressions;

public class Identifier implements Expression {
    public String identifier;
    public String type = "identifier";

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.identifier;
    }
}
