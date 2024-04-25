package com.cgpl.visitors;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.StringConcat;
import com.cgpl.AST.expressions.StringLiteral;

public class StringConcatVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitStringConcat(CGPLParser.StringConcatContext ctx) {
        List<Expression> expressions = new java.util.ArrayList<>();
        for (TerminalNode node : ctx.STRING()) {
            expressions.add(new StringLiteral(node.getText().replaceAll("\"", "")));
        }
        for (TerminalNode node: ctx.IDENTIFIER()) {
            expressions.add(new Identifier(node.getText()));
        }
        return new StringConcat(expressions);
    }
}
