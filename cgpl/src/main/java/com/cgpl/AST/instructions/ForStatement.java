package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class ForStatement implements Instruction {
    private String instructionType;
    private String identifier;
    private Expression iterable; // This is the list that we are iterating over
    private List<Instruction> body;

    public ForStatement(String identifier, Expression iterable, List<Instruction> body) {
        this.identifier = identifier;
        this.iterable = iterable;
        this.body = body;
        this.instructionType = "ForStatement";
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getIterable() {
        return iterable;
    }

    public List<Instruction> getBody() {
        return body;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
