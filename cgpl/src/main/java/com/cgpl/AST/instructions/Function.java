package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class Function extends Instruction {
    private String identifier;
    private List<Expression> arguments;
    private List<Instruction> functionBody;

    public Function(String identifier, List<Expression> arguments, List<Instruction> functionBody) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.functionBody = functionBody;
        super.setType("Function");
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public List<Instruction> getFunctionBody() {
        return functionBody;
    }
}
