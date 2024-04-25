package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class FunctionCall implements Instruction, Expression {
    private String instructionType;
    private String type;
    private String identifier;
    private List<Expression> arguments;

    public FunctionCall(String identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.instructionType = "FunctionCall";
        this.type = "FunctionCall";
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

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "instructionType='" + instructionType + '\'' +
                ", type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
