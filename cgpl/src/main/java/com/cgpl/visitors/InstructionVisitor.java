package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.Instruction;

public class InstructionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitInstruction(CGPLParser.InstructionContext ctx) {
        if (ctx.vardcl() != null) {
            // Handle variable declaration
            return new VardclVisitor().visitVardcl(ctx.vardcl());

        } else if (ctx.function() != null) {
            // Handle function
            return new FunctionVisitor().visitFunction(ctx.function());

        } else if (ctx.ifstmt() != null) {
            // Handle if statement
            return new IfStatementVisitor().visitIfstmt(ctx.ifstmt());

        } else if (ctx.forstmt() != null) {
            // Handle for statement

        } else if (ctx.returnstmt() != null) {
            // Handle return statement
            return new ReturnVisitor().visitReturnstmt(ctx.returnstmt());

        } else if (ctx.assignment() != null) {
            // Handle assignment
            return new AssignmentVisitor().visitAssignment(ctx.assignment());
            
        } else if (ctx.increment() != null) {
            // Handle increment
            return new AssignmentVisitor().visitIncrement(ctx.increment());

        } else if (ctx.decrement() != null) {
            // Handle decrement
            return new AssignmentVisitor().visitDecrement(ctx.decrement());

        } else if (ctx.functionCall() != null) {
            // Handle function call
            return new FunctionCallVisitor<Instruction>().visitFunctionCall(ctx.functionCall());

        } else if (ctx.switchstmt() != null) {
            // Handle switch statement
            return new SwitchVisitor().visitSwitchstmt(ctx.switchstmt());
            
        } else if (ctx.listfunction() != null) {
            // Handle list function
            return new ListFunctionVisitor<Instruction>().visitListfunction(ctx.listfunction());
            
        } else if (ctx.deckfunction() != null) {
            // Handle deck function
            return new DeckFunctionVisitor<Instruction>().visitDeckfunction(ctx.deckfunction());

        }
        
        return super.visitInstruction(ctx);
    }
}