package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.Instruction;

public class PlayerFunction implements Expression, Instruction {
    private String identifier;
    private Expression value;
    private String type;

    public PlayerFunction(String identifier, Expression value, String type) {
        this.identifier = identifier;
        this.value = value;
        this.type = type;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public Expression getValue() {
        return this.value;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public String getInstructionType() {
        return "PlayerFunction";
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
