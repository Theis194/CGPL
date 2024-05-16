package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.SymbolTable;

public class StringConcat implements Expression {
    private List<Expression> expressions;
    private String type = "stringConcat";

    public StringConcat(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Expression expression : expressions) {
            sb.append(expression.toString());
        }
        return sb.toString();
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        String result = "";
        for (Expression expression : expressions) {
            if (expression.getType().equals("string")) {
                result += ((StringLiteral)expression.evaluate(symbolTable)).getValue();
            } else if (expression.getType().equals("identifier")) {
                Expression evaluatedExpression = expression.evaluate(symbolTable);
                result += evaluatedExpression.toString();
            } else {
                throw new RuntimeException("Operands must be of type string");
            }
        }
        return new StringLiteral(result);
    }
}
