package com.cgpl;

import com.cgpl.AST.Program;

import com.cgpl.AST.expressions.*;

import com.cgpl.AST.instructions.*;

public class Interpreter {
    private SymbolTable symbolTable;

    public Interpreter() {
        this.symbolTable = new SymbolTable();
    }

    public boolean interpretProgram(Program program) {
        symbolTable.pushScope(program.getScope());
        for (Instruction instruction : program.getInstructions()) {
            interpretInstruction(instruction);
        }
        return true;
    }

    public void interpretInstruction(Instruction instruction) {
        switch (instruction.getInstructionType()) {
            case "VarDeclaration":
                interpretVarDeclaration((VarDeclaration) instruction);
                break;
            case "Assignment":
                interpretAssignment((Assignment) instruction);
                break;
        
            default:
                break;
        }
        throw new RuntimeException("Unknown instruction type: " + instruction.getInstructionType());
    }

    public void interpretVarDeclaration(VarDeclaration varDeclaration) {
            symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate());
    }

    public void interpretAssignment(Assignment assignment) {
        if (assignment.getValue() instanceof FunctionCall){
            Function function = (Function) symbolTable.getSymbol(assignment.getIdentifier());
            interpretFunction(function);
        }
        symbolTable.updateSymbol(assignment.getIdentifier(), assignment.getValue().evaluate());
    }

    public Expression interpretFunction(Function function) {
        symbolTable.pushScope(function.getScope());

        Expression returnValue = null;
        for (Instruction instruction : function.getFunctionBody()) {
            if (instruction.getInstructionType().equals("Return")) {
                returnValue = ((Return) instruction).getValue().evaluate();
            }
            interpretInstruction(instruction);
        }

        symbolTable.popScope();

        return returnValue; // Should return the return value of the function
    }
}
