package com.cgpl.AST.expressions;

public interface Expression<T> {
    String getType();

    String toString();

    T getValue();

    Expression evaluate();
}
