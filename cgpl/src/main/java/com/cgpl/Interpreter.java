package com.cgpl;

import java.util.List;

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
        String instructionType = instruction.getInstructionType();
        switch (instructionType) {
            case "VarDeclaration":
                interpretVarDeclaration((VarDeclaration) instruction);
                break;
            case "Assignment":
                interpretAssignment((Assignment) instruction);
                break;
            case "Function":
                //interpretFunction((Function) instruction);
                break;
            case "Return":
                //interpretReturn((Return) instruction);
                break;
            default:
                throw new RuntimeException("Unknown instruction type: " + instruction.getInstructionType());
        }
    }

    public void interpretVarDeclaration(VarDeclaration varDeclaration) {
        Expression returnValue = null;
        System.out.println("varDeclaration: " + varDeclaration.getIdentifier() + " = " + varDeclaration.getValue().evaluate(symbolTable).getValue() + " of type " + varDeclaration.getValue().evaluate(symbolTable).getType() + " added to symbol table");
        if (varDeclaration.isConst()) {
            if (varDeclaration.getValue() instanceof FunctionCall){
                FunctionCall functionCall = (FunctionCall) varDeclaration.getValue();
                Function function = (Function) symbolTable.getSymbol(varDeclaration.getIdentifier());
                returnValue = interpretFunction(function, functionCall.getArguments());

                symbolTable.addSymbol(varDeclaration.getIdentifier(), returnValue, true);
                return;
            }
            symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(symbolTable), true);
        } else {
            if (varDeclaration.getValue() instanceof FunctionCall){
                FunctionCall functionCall = (FunctionCall) varDeclaration.getValue();
                Function function = (Function) symbolTable.getSymbol(varDeclaration.getIdentifier());
                returnValue = interpretFunction(function, functionCall.getArguments());

                symbolTable.addSymbol(varDeclaration.getIdentifier(), returnValue, false);
                return;
            }
            symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(symbolTable), false);
        }
    }

    public void interpretAssignment(Assignment assignment) {
        if (assignment.getValue() instanceof FunctionCall){
            FunctionCall functionCall = (FunctionCall) assignment.getValue();
            Function function = (Function) symbolTable.getSymbol(assignment.getIdentifier());
            interpretFunction(function, functionCall.getArguments());
        }
        symbolTable.updateSymbol(assignment.getIdentifier(), assignment.getValue().evaluate(symbolTable));
    }

    public Expression interpretFunction(Function function, List<Expression> arguments) {
        symbolTable.pushScope(function.getScope());

        // Assign the argument values to the function parameters
        for (int i = 0; i < function.getArguments().size(); i++) {
            symbolTable.updateSymbol(((Identifier)function.getArguments().get(i)).getIdentifier(), arguments.get(i).evaluate(symbolTable));
        }

        Expression returnValue = null;
        for (Instruction instruction : function.getFunctionBody()) {
            if (instruction.getInstructionType().equals("Return")) {
                returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
            }
            interpretInstruction(instruction);
        }

        symbolTable.popScope();

        return returnValue; // Should return the return value of the function
    }
}
