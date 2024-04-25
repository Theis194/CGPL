package com.cgpl.visitors;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.Function;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;

import java.util.List;

public class FunctionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitFunction(CGPLParser.FunctionContext ctx) {
        FunctionBodyVisitor visitor = new FunctionBodyVisitor();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        List<Expression> arguments = ctx.IDENTIFIER().stream().map(args -> args.accept(expressionVisitor)).toList();
        return new Function(ctx.IDENTIFIER(0).getText(), arguments,visitor.visitFunctionBody(ctx.functionBody()));
    }
}
