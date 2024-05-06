package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class IfStatment implements Instruction {
    private String instructionType;
    private Expression condition;
    private List<Instruction> thenBody;
    private List<Instruction> elseBody;
    private Scope thenScope;
    private Scope elseScope;

    public IfStatment(Expression condition, List<Instruction> thenBody, List<Instruction> elseBody, Scope thenScope, Scope elseScope) {
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
        this.instructionType = "IfStatment";
        this.thenScope = thenScope;
        this.elseScope = elseScope;
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

    public Scope getThenScope() {
        return thenScope;
    }

    public Scope getElseScope() {
        return elseScope;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
