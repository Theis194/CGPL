package com.cgpl.AST.instructions;

import com.cgpl.SymbolTable;

public class SuitFunction implements Instruction {
    private String name;
    private String color;
    private String instructionType;

    public SuitFunction(String name, String color) {
        this.name = name;
        this.color = color;
        this.instructionType = "SuitFunction";
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Suit: " + this.name + " Color: " + this.color;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
