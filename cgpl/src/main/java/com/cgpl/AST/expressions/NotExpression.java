package com.cgpl.AST.expressions;

import com.cgpl.Interpreter;
import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.FunctionCall;

public class NotExpression implements Expression {
    private Expression expression;
    private String type;

    public NotExpression(Expression expression) {
        this.expression = expression;
        this.type = "not";
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String getType() {
        return this.type;
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
            Interpreter interpreter = new Interpreter(symbolTable);
            FunctionCall functionCall = (FunctionCall) this.expression;
            Boolean result = (Boolean) interpreter.interpretInstruction(functionCall);
            return new Boolean(!result.getValue());
        } else {
            return new Boolean(!((Boolean) this.expression.evaluate(symbolTable)).getValue());
        }
    }
}
