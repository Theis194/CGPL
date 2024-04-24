package com.cgpl.AST.instructions;

public abstract class Instruction {
    private String instructionType;

    public String getType() {
        return this.instructionType;
    }

    public void setType(String type) {
        this.instructionType = type;
    }
}
