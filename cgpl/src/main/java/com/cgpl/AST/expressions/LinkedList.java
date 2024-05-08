package com.cgpl.AST.expressions;

import java.util.List;

public class LinkedList implements Expression { // Name is subject to change
    private List<Expression> list;
    private String type = "list";

    public LinkedList(List<Expression> elements) {
        this.list = elements;
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

    @Override
    public List<Expression> getValue() {
        return this.list;
    }

    @Override
    public Expression evaluate() {
        return this;
    }
}
