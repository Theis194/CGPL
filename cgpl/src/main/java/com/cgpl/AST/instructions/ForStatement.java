package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class ForStatement extends Instruction {
    private String identifier;
    private Expression iterable; // This is the list that we are iterating over
    private List<Instruction> body;

    public ForStatement(String identifier, Expression iterable, List<Instruction> body) {
        this.identifier = identifier;
        this.iterable = iterable;
        this.body = body;
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
}
