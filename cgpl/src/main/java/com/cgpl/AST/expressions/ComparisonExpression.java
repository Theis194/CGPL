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

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate() {
        Expression left = operands.get(0).evaluate();
        Expression right = operands.get(1).evaluate();

        if (left.getType().equals("boolean") && right.getType().equals("boolean")) {
            boolean leftValue = ((Boolean) left).getValue();
            boolean rightValue = ((Boolean) right).getValue();
            switch (operator) {
                case "and":
                    return new Boolean(leftValue && rightValue);
                case "or":
                    return new Boolean(leftValue || rightValue);
                case "not":
                    return new Boolean(!leftValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else {
            throw new RuntimeException("Operands must be of type boolean");
        }
    }
}
