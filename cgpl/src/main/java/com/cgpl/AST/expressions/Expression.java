package com.cgpl.AST.expressions;

import com.cgpl.AST.Scope;

public interface Expression<T> {
    String getType();

    String toString();

    T getValue();

    Expression evaluate(Scope scope);
}
