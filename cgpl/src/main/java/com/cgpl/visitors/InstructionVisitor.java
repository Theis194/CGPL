package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.Scope;
import com.cgpl.AST.instructions.Instruction;

public class InstructionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitInstruction(CGPLParser.InstructionContext ctx) {
        return this.visitInstruction(ctx, null);
    }

    public Instruction visitInstruction(CGPLParser.InstructionContext ctx, Scope scope) {
        if (ctx.vardcl() != null) {
            // Handle variable declaration
            return new VardclVisitor().visitVardcl(ctx.vardcl());

        } else if (ctx.function() != null) {
            // Check if the current scope is program scope
            if (!scope.isProgramScope()) {
                throw new RuntimeException("Function declaration is only allowed in the program scope");
            }
            // Handle function
            return new FunctionVisitor().visitFunction(ctx.function(), scope);

        } else if (ctx.suitfunction() != null){
            return new SuitFunctionVisitor().visitSuitfunction(ctx.suitfunction());
            
        }else if (ctx.ifstmt() != null) {
            // Handle if statement
            return new IfStatementVisitor().visitIfstmt(ctx.ifstmt(), scope);

        } else if (ctx.forstmt() != null) {
            // Handle for statement
            return new LoopVisitor().visitForstmt(ctx.forstmt(), scope);

        } else if (ctx.whilestmt() != null) {
            // Handle while statement
            return new LoopVisitor().visitWhilestmt(ctx.whilestmt(), scope);
        } else if (ctx.returnstmt() != null) {
            // Handle return statement
            return new ReturnVisitor().visitReturnstmt(ctx.returnstmt());

        } else if (ctx.printstmt() != null) {
            // Handle print statement
            return new PrintVisitor().visitPrintstmt(ctx.printstmt());

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

        } else if (ctx.playerfunction() != null) {
            // Handle player function
            return new PlayerFunctionVisitor<Instruction>().visitPlayerfunction(ctx.playerfunction());
            
        } else if (ctx.breakstmt() != null) {
            // Handle break statement
            return new BreakVisitor().visitBreakstmt(ctx.breakstmt());
            
        }
        
        return super.visitInstruction(ctx);
    }
}