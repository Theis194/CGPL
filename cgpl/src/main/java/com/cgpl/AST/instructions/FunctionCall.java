package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class FunctionCall implements Instruction {
    private String instructionType;
    private String identifier;
    private List<Expression> arguments;

    public FunctionCall(String identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.instructionType = "FunctionCall";
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
