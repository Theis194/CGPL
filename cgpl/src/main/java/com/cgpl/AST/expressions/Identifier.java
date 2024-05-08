package com.cgpl.AST.expressions;

import com.cgpl.AST.Scope;

public class Identifier implements Expression {
    public String identifier;
    public String type = "identifier";

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.identifier;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(Scope scope) {
        return scope.getVariableValue(this.identifier);
    }
}
