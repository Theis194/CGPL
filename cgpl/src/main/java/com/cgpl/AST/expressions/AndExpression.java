package com.cgpl.AST.expressions;

import java.util.List;

public class AndExpression extends Expression {
    List<Expression> operands;
    String type = "and";

    public AndExpression(List<Expression> operands) {
        this.operands = operands;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    @Override
    public String getType() {
        return "and";
    }

    @Override
    public String toString() {
        return "AndExpression";
    }
}
