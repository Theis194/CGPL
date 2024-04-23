package com.cgpl.AST.instructions;

public class Increment extends Instruction {
    private String identifier;

    public Increment(String identifier) {
        this.identifier = identifier;
    }
}
