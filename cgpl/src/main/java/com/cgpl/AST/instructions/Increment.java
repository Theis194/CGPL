package com.cgpl.AST.instructions;

public class Increment implements Instruction {
    private String instructionType;
    private String identifier;

    public Increment(String identifier) {
        this.identifier = identifier;
        this.instructionType = "Increment";
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
