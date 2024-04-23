package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class Return {
    private Expression value;

    public Return(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }
}
