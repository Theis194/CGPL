package com.cgpl;

import com.cgpl.AST.Program;
import com.cgpl.AST.instructions.Instruction;

public class Interpreter {
    private SymbolTable symbolTable;

    public Interpreter() {
        this.symbolTable = new SymbolTable();
    }

    public boolean interpretProgram(Program program) {
        symbolTable.pushScope();
        for (Instruction instruction : program.getInstructions()) {
            if (!interpretInstruction(instruction)) {
                return false;
            }
        }
        return true;
    }

    public boolean interpretInstruction(Instruction instruction) {
        return instruction.execute();
    }
}
