package com.cgpl.AST.expressions;

import java.util.Arrays;
import java.util.List;

public class CList extends Expression { // Name is subject to change
    private List<Expression> list;
    private String type = "list";

    public CList(Expression[] elements) {
        this.list = Arrays.asList(elements);
    }

    public List<Expression> getList() {
        return this.list;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
