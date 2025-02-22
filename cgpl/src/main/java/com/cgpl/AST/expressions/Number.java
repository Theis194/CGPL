package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public class Number implements Expression<Integer> {
    private int value;
    private String type = "number";

    public Number(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
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
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
