package com.cgpl.AST.expressions;

import java.util.List;

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
    public Expression evaluate() {
        String result = "";
        for (Expression expression : expressions) {
            if (!expression.getType().equals("string")) {
                throw new RuntimeException("Operands must be of type string");
            }
            result += ((StringLiteral)expression.evaluate()).getValue();
        }
        return new StringLiteral(result);
    }
}
