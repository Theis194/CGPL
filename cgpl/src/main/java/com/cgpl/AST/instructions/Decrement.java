package com.cgpl.AST.instructions;

public class Decrement implements Instruction{
    private String instructionType;
    private String identifier;

    public Decrement(String identifier) {
        this.identifier = identifier;
        this.instructionType = "Decrement";
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
