package com.cgpl.AST.expressions;

public class Boolean implements Expression<java.lang.Boolean>{
    public boolean value;
    public String type = "boolean";

    public Boolean(boolean value) {
        this.value = value;
    }

    @Override
    public java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(value);
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
