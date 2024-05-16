package com.cgpl.AST;

import java.util.ArrayList;
import java.util.List;

import com.cgpl.AST.instructions.Instruction;

public class Program {
    private List<Instruction> instructions;
    private Scope scope;

    public Program() {
        instructions = new ArrayList<>();
        scope = new Scope(true);
    }

    public Program(List<Instruction> instructions, Scope scope) {
        this.instructions = instructions;
        this.scope = scope;
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Scope getScope() {
        return scope;
    }
}
