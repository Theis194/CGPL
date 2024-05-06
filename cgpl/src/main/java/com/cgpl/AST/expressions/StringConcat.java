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
}
