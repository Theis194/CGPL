package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Return extends Instruction {
    private Expression value;

    public Return(Expression value) {
        this.value = value;
        super.setType("Return");
    }

    public Expression getValue() {
        return value;
    }
}
