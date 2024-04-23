package com.cgpl.AST;

import java.util.ArrayList;
import java.util.List;

import com.cgpl.AST.instructions.Instruction;

public class Program {
    private List<Instruction> instructions;

    public Program() {
        instructions = new ArrayList<>();
    }

    public Program(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
