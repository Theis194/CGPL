package com.cgpl.AST.expressions;

import java.util.List;

public class OrExpression implements Expression {
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
        return type;
    }

    @Override
    public String toString() {
        return "OrExpression";
    }
}
