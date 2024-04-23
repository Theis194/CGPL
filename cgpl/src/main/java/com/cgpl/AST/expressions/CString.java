package com.cgpl.AST.expressions;

public class CString extends Expression { // Name is subject to change
    public String value;
    public String type = "string";

    public CString(String value) {
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
}
