package com.cgpl.AST.expressions;

import java.util.LinkedList;
import java.util.List;

import com.cgpl.SymbolTable;

public class LinkedListLiteral implements Expression { // Name is subject to change
    private LinkedList<Expression> list;
    private String type = "list";

    public LinkedListLiteral(LinkedList<Expression> elements) {
        this.list = elements;
    }

    public List<Expression> getList() {
        return this.list;
    }

    public void add(Expression element) {
        this.list.add(element);
    }

    public Expression remove(int index) {
        return this.list.remove(index);
    }

    public Expression remove() {
        return this.list.remove();
    }

    public int size() {
        return this.list.size();
    }

    public Expression get(int index) {
        return this.list.get(index);
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
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
