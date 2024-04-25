package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.Assignment;
import com.cgpl.AST.instructions.Instruction;

public class AssignmentVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Assignment visitAssignment(CGPLParser.AssignmentContext ctx) {
        return new Assignment(ctx.IDENTIFIER().getText(), ctx.value().accept(new ExpressionVisitor()));
    }
}
