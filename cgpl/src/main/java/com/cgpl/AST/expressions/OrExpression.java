package com.cgpl.AST.expressions;

import java.util.List;

public class OrExpression extends Expression {
    private List<Expression> operands;
    private String type = "or";

    public OrExpression(List<Expression> operands) {
        this.operands = operands;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    @Override
    public String getType() {
        return "or";
    }

    @Override
    public String toString() {
        return "OrExpression";
    }
}
