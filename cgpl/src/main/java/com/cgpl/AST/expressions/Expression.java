package com.cgpl.AST.expressions;

public interface Expression {
    String getType();

    String toString();

    Expression evaluate();
}
