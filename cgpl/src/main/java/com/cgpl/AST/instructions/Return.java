package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Return implements Instruction {
    private String instructionType;
    private Expression value;

    public Return(Expression value) {
        this.value = value;
        this.instructionType = "Return";
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
