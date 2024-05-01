package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class IfStatment implements Instruction {
    private String instructionType;
    private Expression condition;
    private List<Instruction> thenBody;
    private List<Instruction> elseBody;
    private Scope scope;

    public IfStatment(Expression condition, List<Instruction> thenBody, List<Instruction> elseBody, Scope scope) {
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
        this.instructionType = "IfStatment";
        this.scope = scope;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Instruction> getThenBody() {
        return thenBody;
    }

    public List<Instruction> getElseBody() {
        return elseBody;
    }

    public Scope getScope() {
        return scope;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
