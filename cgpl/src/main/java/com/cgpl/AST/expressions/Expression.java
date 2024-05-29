package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;

public interface Expression<T> {
    String getType();

    String toString();

    T getValue();

    Expression evaluate(SymbolTable symbolTable);
}
