package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Assignment extends Instruction {
    private String identifier;
    private Expression value;

    public Assignment(String identifier, Expression value) {
        this.identifier = identifier;
        this.value = value;
        super.setType("Assignment");
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getValue() {
        return value;
    }
}
