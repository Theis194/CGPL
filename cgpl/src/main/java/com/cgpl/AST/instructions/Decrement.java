package com.cgpl.AST.instructions;

public class Decrement extends Instruction{
    private String identifier;

    public Decrement(String identifier) {
        this.identifier = identifier;
    }
}
