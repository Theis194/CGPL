package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Print implements Instruction {
    private Expression value;

    public Print(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String getInstructionType() {
        return "Print";
    }
}
