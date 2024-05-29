package com.cgpl.AST.instructions;

public class Break implements Instruction {
    private String instructionType;

    public Break() {
        this.instructionType = "Break";
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}