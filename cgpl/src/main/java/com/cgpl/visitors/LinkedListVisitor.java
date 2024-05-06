package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.LinkedList;
import com.cgpl.AST.expressions.Expression;

public class LinkedListVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitList(CGPLParser.ListContext ctx) {
        List<Expression> elements = ctx.value()
            .stream()
            .map(value -> value.accept(new ExpressionVisitor()))
            .collect(toList());
        return new LinkedList(elements);
    }
}
