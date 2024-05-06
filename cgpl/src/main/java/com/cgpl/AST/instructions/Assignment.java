package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Assignment implements Instruction {
    private String instructionType;
    private String identifier;
    private Expression value;

    public Assignment(String identifier, Expression value) {
        this.identifier = identifier;
        this.value = value;
        this.instructionType = "Assignment";
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
