package com.cgpl;

import java.util.List;

import com.cgpl.AST.Program;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.*;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.*;

public class Interpreter {
    private SymbolTable symbolTable;

    public Interpreter() {
        this.symbolTable = new SymbolTable();
    }

    public Interpreter(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean interpretProgram(Program program) {
        symbolTable.pushScope(program.getScope());

        // Interpret each instruction in the program
        for (Instruction instruction : program.getInstructions()) {
            interpretInstruction(instruction);
        }
        return true;
    }

    public Expression interpretInstruction(Instruction instruction) {
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
                return interpretFunctionCall((FunctionCall) instruction);
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
            case "CardFunction":
                return interpretCardFunction((CardFunction) instruction);
            case "DeckFunction":
                return interpretDeckFunction((DeckFunction) instruction);
            case "ListFunction":
                return interpretListFunction((ListFunction) instruction);
            case "Print":
                return interpretPrint((Print) instruction);
            case "PlayerFunction":
                return interpretPlayerFunction((PlayerFunction) instruction);
            case "SuitFunction":
                return interpretSuitFunction((SuitFunction) instruction);
            case "Break":
                throw new BreakStatementException();
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

        // if the value is a list function then interpret the list function and assign the return value to the variable
        if (varDeclaration.getValue() instanceof Instruction) {
            Instruction instruction = (Instruction)varDeclaration.getValue();
            returnValue = interpretInstruction(instruction);
            symbolTable.addSymbol(varDeclaration.getIdentifier(), returnValue, varDeclaration.isConst());
            return;
        }
        
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
        System.out.println("varDeclaration: " + varDeclaration.getIdentifier() + " = " + varDeclaration.getValue().evaluate(symbolTable).getValue() + " of type " + varDeclaration.getValue().evaluate(symbolTable).getType() + " added to symbol table");
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
        symbolTable.pushScope(new Scope(function.getScope()));

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
                break;
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

    private Expression interpretFunctionCall(FunctionCall functionCall) {
        // Get the function from the symbol table
        Function function = (Function) symbolTable.getSymbol(functionCall.getIdentifier());

        // Interpret the function
        return interpretFunction(function, functionCall.getArguments());
    }

    private Expression interpretWhileLoop(WhileStatement whileLoop) {
        Expression returnValue = null;

        boolean condition = ((Boolean)whileLoop.getCondition().evaluate(symbolTable)).getValue();
        // Evaluate the condition
        while (condition) {
            try {
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
            } catch (BreakStatementException e) {
                break;
            }
        }
        return returnValue;
    }

    private Expression interpretForLoop(ForStatement forLoop) {
        Expression returnValue = null;
        String loopType = forLoop.getInstructionType();

        if (loopType.equals("ForEachStatement")) {
            LinkedListLiteral iterable = (LinkedListLiteral) forLoop.getIterable().evaluate(symbolTable);
            symbolTable.pushScope(forLoop.getScope());
            symbolTable.addSymbol(forLoop.getIdentifier(), null, false);
            // Iterate over the elements in the list
            for (Expression element : iterable.getList()) {
                try {
                    symbolTable.pushScope(new Scope(false));
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
                } catch (BreakStatementException e) {
                    break;
                }
            }
            symbolTable.popScope();
        } else {
            symbolTable.pushScope(forLoop.getScope());
            symbolTable.addSymbol(forLoop.getVarDeclaration().getIdentifier(), forLoop.getVarDeclaration().getValue().evaluate(symbolTable), false);
            
            boolean condition = ((Boolean)forLoop.getCondition().evaluate(symbolTable)).getValue();
            // While the condition is true
            while (condition) {
                try {
                    symbolTable.pushScope(new Scope(false));
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
                } catch (BreakStatementException e) {
                    break;
                }
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

    private Expression interpretCardFunction(CardFunction cardFunction) {
        Expression returnValue = null;

        // Get the identifier of the card function
        String identifier = cardFunction.getIdentifier();
        if (!symbolTable.hasSymbol(identifier)) {
            throw new IllegalArgumentException("Card not found: " + identifier);
        } else if (!(symbolTable.getSymbol(identifier) instanceof Card)) {
            throw new IllegalArgumentException("Symbol is not a card: " + identifier);
        }

        // Get the card from the symbol table
        Card card = (Card) symbolTable.getSymbol(identifier);
        // Get the suit from the symbol table
        Suit suit = (Suit) symbolTable.getSymbol(card.getSuit());

        // Get the type of card function
        String type = cardFunction.getType();
        switch (type) {
            case "value":
                returnValue = new Number(Integer.parseInt(card.getValue()));
                break;
            case "suit":
                returnValue = new StringLiteral(suit.getName());
                break;
            case "color":
                returnValue = new StringLiteral(suit.getColor());
                break;
            case "name":
                returnValue = new StringLiteral(card.toString());
                break;
        
            default:
                throw new RuntimeException("Unknown card function type: " + type);
        }

        return returnValue;
    }

    private Expression interpretDeckFunction(DeckFunction deckFunction) {
        Expression returnValue = null;

        // Get the identifier of the deck function
        String identifier = deckFunction.getIdentifier();
        if (!symbolTable.hasSymbol(identifier)) {
            throw new IllegalArgumentException("Deck not found: " + identifier);
        } else if (!(symbolTable.getSymbol(identifier) instanceof Deck)) {
            throw new IllegalArgumentException("Symbol is not a deck: " + identifier);
        }

        // Get the deck from the symbol table
        Deck deck = (Deck) symbolTable.getSymbol(identifier);

        Expression value = null;
        if (deckFunction.getValue() != null) {
            value = deckFunction.getValue().evaluate(symbolTable);
        }

        // Get the type of deck function
        String type = deckFunction.getType();
        switch (type) {
            case "shuffle":
                deck.shuffle();
                break;
            case "draw":
                returnValue = deck.drawCard();
                break;
            case "addCard":
                if (value == null) throw new RuntimeException("Value cannot be null");
                deck.addCard((Card) deckFunction.getValue().evaluate(symbolTable));
                returnValue = deck;
                break;
            case "removeCard":
                if (value == null) throw new RuntimeException("Value cannot be null");
                deck.remove(((Number)deckFunction.getValue().evaluate(symbolTable)).getValue().intValue());
                returnValue = deck;
                break;
            case "deckSize":
                returnValue = new Number(deck.size());
                break;
            case "fillDeckFrench":
                Suit[] suits = {new Suit("Hearts", "Red"), new Suit("Diamonds", "Red"), new Suit("Clubs", "Black"), new Suit("Spades", "Black")};
            
                for (Suit suit : suits) {
                    symbolTable.addSymbol(suit.getName(), suit, false);
                }
                deck.fillDeckFrench();
                returnValue = deck;
                break;
            case "fillDeckColor":
                StringLiteral color = (StringLiteral) deckFunction.getValue();
                List<Suit> suitsWithColor = symbolTable.getSuitsByColor(color.toString());
                deck.fillDeckColor(suitsWithColor);
                returnValue = deck;
                break;
        
            default:
                throw new RuntimeException("Unknown deck function type: " + type);
        }

        return returnValue;
    }

    private Expression interpretListFunction(ListFunction listFunction) {
        Expression returnValue = null;

        // Get the identifier of the list function
        String identifier = listFunction.getIdentifier();
        if (!symbolTable.hasSymbol(identifier)) {
            throw new IllegalArgumentException("List not found: " + identifier);
        } else if (!(symbolTable.getSymbol(identifier) instanceof LinkedListLiteral)) {
            throw new IllegalArgumentException("Symbol is not a list: " + identifier);
        }

        // Get the list from the symbol table
        LinkedListLiteral list = (LinkedListLiteral) symbolTable.getSymbol(identifier);

        Expression value = null;
        if (listFunction.getValue() != null) {
            value = listFunction.getValue().evaluate(symbolTable);
        }

        // Get the type of list function
        String type = listFunction.getType();
        switch (type) {
            case "add":
                if (value == null) throw new RuntimeException("Value cannot be null");
                list.add(value);
                returnValue = list;
                break;
            case "remove":
                if (value == null) {
                    returnValue = list.remove();
                    break;
                }
                returnValue = list.remove(((Number)value).getValue());
                break;
            case "get":
                if (value == null) throw new RuntimeException("Value cannot be null");
                returnValue = list.get(((Number)value).getValue().intValue());
                break;
            case "size":
                returnValue = new Number(list.size());
                break;
        
            default:
                throw new RuntimeException("Unknown list function type: " + type);
        }

        return returnValue;
    }

    private Expression interpretPrint(Print print) {
        Expression value = print.getValue();
        if (value == null) {
            throw new RuntimeException("Value cannot be null");
        }

        if (value instanceof FunctionCall) {
            FunctionCall functionCall = (FunctionCall) value;
            Function function = (Function) symbolTable.getSymbol(functionCall.getIdentifier());
            value = interpretFunction(function, functionCall.getArguments());
        } else {
            value = value.evaluate(symbolTable);
        }

        System.out.println(value.toString());
        return value;
    }

    private Expression interpretSuitFunction(SuitFunction suitfunction){
        String identifier = suitfunction.getName();
        Suit suit = new Suit(suitfunction.getName(), suitfunction.getColor());
        if (!symbolTable.hasSymbol(identifier)) {
            symbolTable.addSymbol(identifier, suit, false);
        } else if (symbolTable.hasSymbol(identifier)) {
            throw new IllegalArgumentException("Suit with given name already exists");
        }

        return suit;
    }

    private Expression interpretPlayerFunction(PlayerFunction playerFunction) {
        Expression returnValue = null;

        // Get the identifier of the player function
        String identifier = playerFunction.getIdentifier();
        if (!symbolTable.hasSymbol(identifier)) {
            throw new IllegalArgumentException("Player not found: " + identifier);
        } else if (!(symbolTable.getSymbol(identifier) instanceof Player)) {
            throw new IllegalArgumentException("Symbol is not a player: " + identifier);
        }

        // Get the player from the symbol table
        Player player = (Player) symbolTable.getSymbol(identifier);

        Expression value = null;
        if (playerFunction.getValue() != null) {
            value = playerFunction.getValue().evaluate(symbolTable);
        }

        // Get the type of player function
        String type = playerFunction.getType();
        switch (type) {
            case "drawCard":
                if (value == null) throw new RuntimeException("Value cannot be null");
                player.drawCard((Card) value);
                break;
            case "discardCard":
                if (value == null) throw new RuntimeException("Value cannot be null");
                returnValue = player.discardCard(((Number)value).getValue().intValue());
                break;
            case "increaseScore":
                if (value == null) throw new RuntimeException("Value cannot be null");
                returnValue = new Number(player.increaseScore(((Number)value).getValue().intValue()));
                break;
            case "decreaseScore":
                if (value == null) throw new RuntimeException("Value cannot be null");
                returnValue = new Number(player.decreaseScore(((Number)value).getValue().intValue()));
                break;
            case "getScore":
                returnValue = new Number(player.getScore());
                break;
            case "getHandSize":
                returnValue = new Number(player.getHand().size());
                break;
            case "getHand":
                returnValue = new LinkedListLiteral(player.getHand());
                break;
            case "shuffleHand":
                returnValue = new LinkedListLiteral(player.shuffleHand());
                break;
        
            default:
                throw new RuntimeException("Unknown player function type: " + type);
        }

        return returnValue;
    }
}
