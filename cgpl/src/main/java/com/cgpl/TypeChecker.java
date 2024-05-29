package com.cgpl;

import com.cgpl.AST.expressions.Expression;

public class TypeChecker {
    public TypeChecker() {
    }

    public boolean checkType(Expression expression, String expectedType) {
        if (expression.getType().equals(expectedType) == false) {
            throw new RuntimeException("Type mismatch: expected " + expectedType + " but got " + expression.getType());
        }
        return true;
    }
}
