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

    @Override
    public Expression evaluate() {
        Expression left = operands.get(0).evaluate();
        Expression right = operands.get(1).evaluate();

        if (left.getType().equals("boolean") && right.getType().equals("boolean")) {
            boolean leftValue = ((Boolean) left).getValue();
            boolean rightValue = ((Boolean) right).getValue();
            return new Boolean(leftValue || rightValue);
        } else {
            throw new RuntimeException("Operands must be of type boolean");
        }        
    }
}
