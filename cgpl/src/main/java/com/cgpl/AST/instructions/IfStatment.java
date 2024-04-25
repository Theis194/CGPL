package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class IfStatment implements Instruction {
    private String instructionType;
    private Expression condition;
    private List<Instruction> thenBody;
    private List<Instruction> elseBody;

    public IfStatment(Expression condition, List<Instruction> thenBody, List<Instruction> elseBody) {
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
        this.instructionType = "IfStatment";
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

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
