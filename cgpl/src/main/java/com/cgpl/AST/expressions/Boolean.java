package com.cgpl.AST.expressions;

public class Boolean implements Expression{
    public boolean value;
    public String type = "boolean";

    public Boolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    @Override
    public Expression evaluate() {
        return this;
    }
}
