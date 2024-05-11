package com.cgpl;

import java.util.List;

import com.cgpl.AST.Program;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.*;
import com.cgpl.AST.expressions.Boolean;
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

    private Expression interpretInstruction(Instruction instruction) {
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
            case "FunctionCall":
                // Handle function calls without assignment/declaration
                interpretFunctionCall((FunctionCall) instruction);
                break;
            case "Return":
                // return statements are handled in the function interpretation
                //interpretReturn((Return) instruction);
                break;
            case "IfStatment":
                return interpretIfStatement((IfStatment) instruction);
            case "WhileStatement":
                return interpretWhileLoop((WhileStatement) instruction);
            case "ForStatement":
                return interpretForLoop((ForStatement) instruction);
            case "ForEachStatement":
                return interpretForLoop((ForStatement) instruction);
            case "SwitchStatement":
                return interpretSwitch((SwitchStatement) instruction);
            default:
                throw new RuntimeException("Unknown instruction type: " + instruction.getInstructionType());
        }
        return null;
    }

    private void interpretVarDeclaration(VarDeclaration varDeclaration) {
        Expression returnValue = null;
        
        // If the value is null then add the variable to the symbol table with a null value
        if (varDeclaration.getValue() == null) {
            symbolTable.addSymbol(varDeclaration.getIdentifier(), null, varDeclaration.isConst());
            return;
        }
        
        System.out.println("varDeclaration: " + varDeclaration.getIdentifier() + " = " + varDeclaration.getValue().evaluate(symbolTable).getValue() + " of type " + varDeclaration.getValue().evaluate(symbolTable).getType() + " added to symbol table");
        // If the value is a function call then interpret the function and assign the return value to the variable
        if (varDeclaration.getValue() instanceof FunctionCall) { 
            FunctionCall functionCall = (FunctionCall) varDeclaration.getValue();
            Function function = (Function) symbolTable.getSymbol(functionCall.getIdentifier());
            returnValue = interpretFunction(function, functionCall.getArguments());

            symbolTable.addSymbol(varDeclaration.getIdentifier(), returnValue, varDeclaration.isConst());
            return;
        }
        // If the value is a not a functin call then assign the value to the new variable
        symbolTable.addSymbol(varDeclaration.getIdentifier(), varDeclaration.getValue().evaluate(symbolTable), varDeclaration.isConst());
    }

    private void interpretAssignment(Assignment assignment) {
        Expression returnValue = null;
        // If the value is a function call then interpret the function and assign the return value to the variable
        if (assignment.getValue() instanceof FunctionCall){
            FunctionCall functionCall = (FunctionCall) assignment.getValue();
            Function function = (Function) symbolTable.getSymbol(functionCall.getIdentifier());
            returnValue = interpretFunction(function, functionCall.getArguments());

            symbolTable.updateSymbol(assignment.getIdentifier(), returnValue);
            return;
        }
        // If the value is a not a functin call then assign the value to the new variable
        symbolTable.updateSymbol(assignment.getIdentifier(), assignment.getValue().evaluate(symbolTable));
    }

    private Expression interpretFunction(Function function, List<Expression> arguments) {
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
            returnValue = interpretInstruction(instruction);
        }

        symbolTable.popScope();

        return returnValue; // Should return the return value of the function
    }

    private Expression interpretIfStatement(IfStatment ifStatement) {
        Expression returnValue = null;
        // Evaluate the condition
        if (((Boolean)ifStatement.getCondition().evaluate(symbolTable)).getValue()) {
            // If the condition is true, execute the then body
            symbolTable.pushScope(ifStatement.getThenScope());
            for (Instruction instruction : ifStatement.getThenBody()) {
                if (instruction.getInstructionType().equals("Return")) {
                    returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                    break;
                }
                returnValue = interpretInstruction(instruction);
            }
            symbolTable.popScope();
        } else {
            // If the condition is false, execute the else body
            symbolTable.pushScope(ifStatement.getElseScope());
            for (Instruction instruction : ifStatement.getElseBody()) {
                if (instruction.getInstructionType().equals("Return")) {
                    returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                    break;
                }
                interpretInstruction(instruction);
            }
            symbolTable.popScope();
        }
        return returnValue;
    }

    private void interpretFunctionCall(FunctionCall functionCall) {
        // Get the function from the symbol table
        Function function = (Function) symbolTable.getSymbol(functionCall.getIdentifier());

        // Interpret the function
        interpretFunction(function, functionCall.getArguments());
    }

    private Expression interpretWhileLoop(WhileStatement whileLoop) {
        Expression returnValue = null;

        boolean condition = ((Boolean)whileLoop.getCondition().evaluate(symbolTable)).getValue();
        // Evaluate the condition
        while (condition) {
            // Execute the body
            symbolTable.pushScope(whileLoop.getScope());
            for (Instruction instruction : whileLoop.getBody()) {
                if (instruction.getInstructionType().equals("Return")) {
                    returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                    break;
                }
                returnValue = interpretInstruction(instruction);
            }
            symbolTable.popScope();
            condition = ((Boolean)whileLoop.getCondition().evaluate(symbolTable)).getValue();
        }
        return returnValue;
    }

    private Expression interpretForLoop(ForStatement forLoop) {
        Expression returnValue = null;
        String loopType = forLoop.getInstructionType();

        if (loopType.equals("ForEachStatement")) {
            LinkedList iterable = (LinkedList) forLoop.getIterable().evaluate(symbolTable);
            symbolTable.pushScope(forLoop.getScope());
            symbolTable.addSymbol(forLoop.getIdentifier(), null, false);
            // Iterate over the elements in the list
            for (Expression element : iterable.getList()) {
                symbolTable.pushScope(new Scope());
                // Assign the element to the loop variable
                symbolTable.updateSymbol(forLoop.getIdentifier(), element);
                // Execute the body
                for (Instruction instruction : forLoop.getBody()) {
                    // If the instruction is a return statement then evaluate the return value and return it
                    if (instruction.getInstructionType().equals("Return")) {
                        returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                        break;
                    }
                    returnValue = interpretInstruction(instruction);
                }
                symbolTable.popScope();
            }
            symbolTable.popScope();
        } else {
            symbolTable.pushScope(forLoop.getScope());
            symbolTable.addSymbol(forLoop.getVarDeclaration().getIdentifier(), forLoop.getVarDeclaration().getValue().evaluate(symbolTable), false);
            
            boolean condition = ((Boolean)forLoop.getCondition().evaluate(symbolTable)).getValue();
            // While the condition is true
            while (condition) {
                symbolTable.pushScope(new Scope());
                // Execute the body
                for (Instruction instruction : forLoop.getBody()) {
                    if (instruction.getInstructionType().equals("Return")) {
                        returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                        break;
                    }
                    returnValue = interpretInstruction(instruction);
                }
                // Interpret the iteration instruction
                interpretInstruction(forLoop.getIteration());
                condition = ((Boolean)forLoop.getCondition().evaluate(symbolTable)).getValue();
                symbolTable.popScope();
            }
            symbolTable.popScope();
        }

        return returnValue;
    }

    private Expression interpretSwitch(SwitchStatement switchStatement) {
        Expression returnValue = null;
        
        // Evaluate the switch value
        Expression switchValue = switchStatement.getSwitchValue().evaluate(symbolTable);
        // Get the case statements
        List<CaseStatement> caseStatements = switchStatement.getCases();
        // Iterate over the case statements
        for (CaseStatement caseStatement : caseStatements) {
            // Evaluate the case value
            Expression caseValue = null;
            if (caseStatement.getCaseValue() != null) {
                caseValue = caseStatement.getCaseValue().evaluate(symbolTable);
            }
            // If the case value is equal to the switch value
            if (caseValue == null || switchValue.getValue().equals(caseValue.getValue())) {
                // Execute the case body
                symbolTable.pushScope(caseStatement.getScope());
                for (Instruction instruction : caseStatement.getInstruction()) {
                    if (instruction.getInstructionType().equals("Return")) {
                        returnValue = ((Return) instruction).getValue().evaluate(symbolTable);
                        break;
                    }
                    returnValue = interpretInstruction(instruction);
                }
                symbolTable.popScope();
                break;
            }
        }

        return returnValue;
    }
}
