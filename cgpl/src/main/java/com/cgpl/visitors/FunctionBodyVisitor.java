package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;

public class FunctionBodyVisitor extends CGPLBaseVisitor<List<Instruction>> {
    @Override
    public  List<Instruction> visitFunctionBody(CGPLParser.FunctionBodyContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        return ctx.instruction()
            .stream()
            .map(value -> value.accept(instructionVisitor))
            .toList();
    }
}
