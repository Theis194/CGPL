package com.cgpl;

import com.cgpl.AST.Program;
import com.cgpl.AST.Scope;
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
        String instructionType = instruction.getInstructionType();
        switch (instructionType) {
            case "VarDeclaration":
                interpretVarDeclaration((VarDeclaration) instruction);
                break;
            case "Assignment":
                interpretAssignment((Assignment) instruction);
                break;
        
            default:
                throw new RuntimeException("Unknown instruction type: " + instruction.getInstructionType());
        }
    }

    public void interpretVarDeclaration(VarDeclaration varDeclaration) {
        Scope scope = symbolTable.getCurrentScope();
        System.out.println("varDeclaration: " + varDeclaration.getIdentifier() + " = " + varDeclaration.getValue().evaluate(scope).getValue() + " of type " + varDeclaration.getValue().evaluate(scope).getType() + " added to symbol table");
        if (varDeclaration.isConst()) {
            symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(scope), true);
        } else {
            symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(scope), false);
        }
    }

    public void interpretAssignment(Assignment assignment) {
        Scope scope = symbolTable.getCurrentScope();
        if (assignment.getValue() instanceof FunctionCall){
            Function function = (Function) symbolTable.getSymbol(assignment.getIdentifier());
            interpretFunction(function);
        }
        symbolTable.updateSymbol(assignment.getIdentifier(), assignment.getValue().evaluate(scope));
    }

    public Expression interpretFunction(Function function) {
        symbolTable.pushScope(function.getScope());
        Scope scope = symbolTable.getCurrentScope();

        Expression returnValue = null;
        for (Instruction instruction : function.getFunctionBody()) {
            if (instruction.getInstructionType().equals("Return")) {
                returnValue = ((Return) instruction).getValue().evaluate(scope);
            }
            interpretInstruction(instruction);
        }

        symbolTable.popScope();

        return returnValue; // Should return the return value of the function
    }
}
