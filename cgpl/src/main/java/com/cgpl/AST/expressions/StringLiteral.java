package com.cgpl.AST.expressions;

public class StringLiteral implements Expression { // Name is subject to change
    public String value;
    public String type = "string";

    public StringLiteral(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public Expression evaluate() {
        return this;
    }
}
