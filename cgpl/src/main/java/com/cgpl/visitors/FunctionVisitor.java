package com.cgpl.visitors;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.instructions.Function;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class FunctionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Function visitFunction(CGPLParser.FunctionContext ctx) {
        FunctionBodyVisitor visitor = new FunctionBodyVisitor();
        List<Expression> arguments = ctx.IDENTIFIER()
            .stream()
            .skip(1)
            .map(arg -> new Identifier(arg.getText()))
            .collect(toList());
        return new Function(ctx.IDENTIFIER(0).getText(), arguments, visitor.visitFunctionBody(ctx.functionBody()));
    }
}
