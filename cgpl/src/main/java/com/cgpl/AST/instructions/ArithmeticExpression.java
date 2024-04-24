package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class ArithmeticExpression extends Instruction {
    private Expression left;
    private Expression right;
    private String operator;

    public ArithmeticExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        super.setType("ArithmeticExpression");
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
