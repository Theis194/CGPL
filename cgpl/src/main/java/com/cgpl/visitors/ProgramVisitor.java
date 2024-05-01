package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.Program;
import com.cgpl.AST.Scope;
import com.cgpl.AST.instructions.Instruction;

public class ProgramVisitor extends CGPLBaseVisitor<Program> {
    @Override
    public Program visitProgram(CGPLParser.ProgramContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        Scope scope = new Scope();
        List<Instruction> instructions = ctx.instruction()
                .stream()
                .map(instruction -> instructionVisitor.visitInstruction(instruction, scope))
                .collect(toList());

        return new Program(instructions, scope);
    }
}
