package com.cgpl.AST.expressions;

import java.util.List;

public class ComparisonExpression implements Expression {
    List<Expression> operands;
    String operator;
    String type = "comparison";

    public ComparisonExpression(List<Expression> operands, String operator) {
        this.operands = operands;
        this.operator = operator;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    @Override
    public String getType() {
        return "comparison";
    }

    @Override
    public String toString() {
        return "ComparisonExpression";
    }
}
