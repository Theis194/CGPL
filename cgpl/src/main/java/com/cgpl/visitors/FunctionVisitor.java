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
        Scope functionScope = new Scope();
        List<Expression> arguments = ctx.IDENTIFIER()
            .stream()
            .skip(1)
            .map(arg -> new Identifier(arg.getText()))
            .collect(toList());
        if (functionScope!=null) {
            for (Expression arg : arguments) {
                functionScope.addVariable(((Identifier) arg).getIdentifier(), arg);
            }
        }

        List<Instruction> functionBody = ctx.functionBody()
            .instruction()
            .stream()
            .map(instruction -> visitor.visitInstruction(instruction, functionScope))
            .collect(toList());

        Function function = new Function(ctx.IDENTIFIER(0).getText(), arguments, functionBody, functionScope);
        scope.addFunction(ctx.IDENTIFIER(0).getText(), function);
        return function;
    }

    @Override
    public  Instruction visitFunctionBody(CGPLParser.FunctionBodyContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        return instructionVisitor.visit(ctx);
    }
}
