package com.cgpl.visitors;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.Program;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.VarDeclaration;

public class ProgramVisitor extends CGPLBaseVisitor<Program> {
    @Override
    public Program visitProgram(CGPLParser.ProgramContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        Scope scope = new Scope();
        List<Instruction> instructions = ctx.instruction()
                .stream()
                .map(instruction -> instructionVisitor.visitInstruction(instruction, scope))
                .collect(toList());
        
        for (Instruction instruction : instructions) {
            if (instruction instanceof VarDeclaration) {
                VarDeclaration varDeclaration = (VarDeclaration) instruction;
                scope.addVariable(varDeclaration.getIdentifier(), (Expression) varDeclaration.getValue());
            }
        }

        return new Program(instructions, scope);
    }
}
