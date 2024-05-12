package com.cgpl.visitors;

import java.util.LinkedList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.LinkedListLiteral;
import com.cgpl.AST.expressions.Expression;

public class LinkedListVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitList(CGPLParser.ListContext ctx) {
        LinkedList<Expression> elements = ctx.value()
            .stream()
            .map(value -> value.accept(new ExpressionVisitor()))
            .collect(Collectors.toCollection(LinkedList::new));
        return new LinkedListLiteral(elements);
    }
}
