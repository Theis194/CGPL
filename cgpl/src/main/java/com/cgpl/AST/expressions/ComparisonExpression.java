package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.SymbolTable;

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
    public Expression evaluate(SymbolTable symbolTable) {
        Expression left = operands.get(0).evaluate(symbolTable);
        Expression right = operands.get(1).evaluate(symbolTable);

        if (left.getType().equals("number") && right.getType().equals("number")) {
            int leftValue = ((Number) left).getValue();
            int rightValue = ((Number) right).getValue();
            switch (operator) {
                case "lt":
                    return new Boolean(leftValue < rightValue);
                case "gt":
                    return new Boolean(leftValue > rightValue);
                case "lte":
                    return new Boolean(leftValue <= rightValue);
                case "gte":
                    return new Boolean(leftValue >= rightValue);
                case "eq":
                    return new Boolean(leftValue == rightValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else {
            throw new RuntimeException("Operands must be of type boolean");
        }
    }
}
