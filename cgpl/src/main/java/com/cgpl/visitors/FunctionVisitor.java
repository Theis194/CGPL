package com.cgpl.visitors;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.instructions.Function;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class FunctionVisitor extends CGPLBaseVisitor<Instruction> {
    public Function visitFunction(CGPLParser.FunctionContext ctx, Scope scope) {
        InstructionVisitor visitor = new InstructionVisitor();
        List<Expression> arguments = ctx.IDENTIFIER()
            .stream()
            .skip(1)
            .map(arg -> new Identifier(arg.getText()))
            .collect(toList());
        if (scope!=null) {
            for (Expression arg : arguments) {
                scope.addVariable(((Identifier) arg).getIdentifier(), arg);
            }
        }

        List<Instruction> functionBody = ctx.functionBody()
            .instruction()
            .stream()
            .map(instruction -> visitor.visitInstruction(instruction, scope))
            .collect(toList());

        return new Function(ctx.IDENTIFIER(0).getText(), arguments, functionBody, scope);
    }

    @Override
    public  Instruction visitFunctionBody(CGPLParser.FunctionBodyContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        return instructionVisitor.visit(ctx);
    }
}
