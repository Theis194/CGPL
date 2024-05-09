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

        // Interpret each instruction in the program
        for (Instruction instruction : program.getInstructions()) {
            interpretInstruction(instruction);
        }
        return true;
    }

    public void interpretInstruction(Instruction instruction) {
        String instructionType = instruction.getInstructionType();

        // Interpret the instruction based on its type
        switch (instructionType) {
            case "VarDeclaration":
                interpretVarDeclaration((VarDeclaration) instruction);
                break;
            case "Assignment":
                interpretAssignment((Assignment) instruction);
                break;
            case "Function":
                // if a function is reached and it is not a function call we do not interpret it
                //interpretFunction((Function) instruction);
                break;
            case "Return":
                // return statements are handled in the function interpretation
                //interpretReturn((Return) instruction);
                break;
            default:
                throw new RuntimeException("Unknown instruction type: " + instruction.getInstructionType());
        }
    }

    public void interpretVarDeclaration(VarDeclaration varDeclaration) {
        Expression returnValue = null;
        System.out.println("varDeclaration: " + varDeclaration.getIdentifier() + " = " + varDeclaration.getValue().evaluate(symbolTable).getValue() + " of type " + varDeclaration.getValue().evaluate(symbolTable).getType() + " added to symbol table");
        
        // If the value is a function call then interpret the function and assign the return value to the variable
        if (varDeclaration.getValue() instanceof FunctionCall) { 
            FunctionCall functionCall = (FunctionCall) varDeclaration.getValue();
            Function function = (Function) symbolTable.getSymbol(varDeclaration.getIdentifier());
            returnValue = interpretFunction(function, functionCall.getArguments());

            symbolTable.addSymbol(varDeclaration.getIdentifier(), returnValue, varDeclaration.isConst());
            return;
        }
        // If the value is a not a functin call then assign the value to the new variable
        symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(symbolTable), varDeclaration.isConst());
    }

    public void interpretAssignment(Assignment assignment) {
        Expression returnValue = null;
        // If the value is a function call then interpret the function and assign the return value to the variable
        if (assignment.getValue() instanceof FunctionCall){
            FunctionCall functionCall = (FunctionCall) assignment.getValue();
            Function function = (Function) symbolTable.getSymbol(assignment.getIdentifier());
            returnValue = interpretFunction(function, functionCall.getArguments());

            symbolTable.updateSymbol(assignment.getIdentifier(), returnValue);
        }
        // If the value is a not a functin call then assign the value to the new variable
        symbolTable.updateSymbol(assignment.getIdentifier(), assignment.getValue().evaluate(symbolTable));
    }

    public Expression interpretFunction(Function function, List<Expression> arguments) {
        symbolTable.pushScope(function.getScope());

        // Assign the argument values to the function parameters
        for (int i = 0; i < function.getArguments().size(); i++) {
            symbolTable.updateSymbol(((Identifier)function.getArguments().get(i)).getIdentifier(), arguments.get(i).evaluate(symbolTable));
        }

        // Interpret the function body
        Expression returnValue = null;
        for (Instruction instruction : function.getFunctionBody()) {
            if (instruction.getInstructionType().equals("Return")) {
                // If the instruction is a return statement then evaluate the return value and return it
                returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
            }
            interpretInstruction(instruction);
        }

        symbolTable.popScope();

        return returnValue; // Should return the return value of the function
    }
}
