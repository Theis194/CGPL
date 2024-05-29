package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public class Boolean implements Expression<java.lang.Boolean>{
    public boolean value;
    public String type = "Boolean";

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
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
