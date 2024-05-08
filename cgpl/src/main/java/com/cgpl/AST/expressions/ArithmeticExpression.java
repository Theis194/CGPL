package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.AST.Scope;

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

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(Scope scope) {
        Expression left = operands.get(0).evaluate(scope);
        Expression right = operands.get(1).evaluate(scope);

        if (left.getType().equals("number") && right.getType().equals("number")) {
            int leftValue = ((Number) left).getValue();
            int rightValue = ((Number) right).getValue();
            switch (operator) {
                case "+":
                    return new Number(leftValue + rightValue);
                case "-":
                    return new Number(leftValue - rightValue);
                case "*":
                    return new Number(leftValue * rightValue);
                case "/":
                    return new Number(leftValue / rightValue);
                case "%":
                    return new Number(leftValue % rightValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else {
            throw new RuntimeException("Operands must be of type number");
        }
    }
}
