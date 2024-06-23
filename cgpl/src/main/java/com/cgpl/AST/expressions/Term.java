package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.SymbolTable;

public class Term implements Expression{
    private List<Expression> factors;
    private String operator;
    private String type = "term";

    public Term(List<Expression> factors, String operator) {
        this.factors = factors;
        this.operator = operator;
    }

    public List<Expression> getFactors() {
        return factors;
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
        for (Expression factor : factors) {
            result.append(factor.toString());
            result.append(" ");
        }
        return result.toString();
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        Expression left = factors.get(0).evaluate(symbolTable);
        Expression right = factors.get(1).evaluate(symbolTable);

        if (left.getType().equals("number") && right.getType().equals("number")) {
            int leftValue = ((Number) left).getValue();
            int rightValue = ((Number) right).getValue();
            switch (operator) {
                case "*":
                    return new Number(leftValue * rightValue);
                case "/":
                    return new Number(leftValue / rightValue);
                case "%":
                    return new Number(leftValue % rightValue);
            }
        }
        return this;
    }
}
