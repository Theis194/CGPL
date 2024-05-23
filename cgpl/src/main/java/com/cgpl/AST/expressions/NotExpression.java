package com.cgpl.AST.expressions;

import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.FunctionCall;

public class NotExpression implements Expression {
    private Expression expression;

    public NotExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String getType() {
        return "not";
    }

    @Override
    public String toString() {
        return "not" + this.expression.toString();
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        if (this.expression instanceof FunctionCall) {
            FunctionCall functionCall = (FunctionCall) this.expression;
            Boolean result = (Boolean) functionCall.evaluate(symbolTable);
            return new Boolean(!result.getValue());
        } else {
            return new Boolean(!((Boolean) this.expression.evaluate(symbolTable)).getValue());
        }
    }
}
