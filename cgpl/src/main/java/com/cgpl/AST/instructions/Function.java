package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class Function implements Instruction {
    private String instructionType;
    private String identifier;
    private List<Expression> arguments;
    private List<Instruction> functionBody;
    private Scope scope;

    public Function(String identifier, List<Expression> arguments, List<Instruction> functionBody, Scope scope) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.functionBody = functionBody;
        this.instructionType = "Function";
        this.scope = scope;
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

    public Scope getScope() {
        return scope;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
