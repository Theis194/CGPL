package com.cgpl.AST.expressions;

import java.util.List;

public class ArithmeticExpression implements Expression {
    private List<Expression> operands;
    private String operator;
    private String type = "arithmetic";

    public ArithmeticExpression(List<Expression> operands, String operator) {
        this.operands = operands;
        this.operator = operator;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Expression operand : operands) {
            result.append(operand.toString());
            result.append(" ");
        }
        return result.toString();
    }
}
