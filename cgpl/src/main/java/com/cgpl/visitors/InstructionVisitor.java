package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.Instruction;

public class InstructionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitInstruction(CGPLParser.InstructionContext ctx) {
        if (ctx.vardcl() != null) {
            return new VardclVisitor().visitVardcl(ctx.vardcl());
        } else if (ctx.function() != null) {
            // Handle function
            return new FunctionVisitor().visitFunction(ctx.function());
        } else if (ctx.ifstmt() != null) {
            // Handle if statement
        } else if (ctx.forstmt() != null) {
            // Handle for statement
        } else if (ctx.returnstmt() != null) {
            return new ReturnVisitor().visitReturnstmt(ctx.returnstmt());
        } else if (ctx.assignment() != null) {
            return new AssignmentVisitor().visitAssignment(ctx.assignment());
        } else if (ctx.increment() != null) {
            // Handle increment
        } else if (ctx.decrement() != null) {
            // Handle decrement
        } else if (ctx.functionCall() != null) {
            // Handle function call
        }
        return super.visitInstruction(ctx);
    }
}