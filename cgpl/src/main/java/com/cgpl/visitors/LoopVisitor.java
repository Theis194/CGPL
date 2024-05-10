package com.cgpl.visitors;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.ForStatement;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.VarDeclaration;
import com.cgpl.AST.instructions.WhileStatement;
import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;

import java.util.List;

public class LoopVisitor extends CGPLBaseVisitor<Instruction> {
    public Instruction visitWhilestmt(CGPLParser.WhilestmtContext ctx, Scope scope)
    {
        Scope loopScope = new Scope();

        // Get condition expression
        BooleanExpressionVisitor booleanExpressionVisitor = new BooleanExpressionVisitor();
        Expression condExpression = booleanExpressionVisitor.visitBoolExpr(ctx.boolExpr());
        
        // Get instructions
        InstructionVisitor instructionVisitor = new InstructionVisitor();

        List<Instruction> instructions = ctx.instruction()
        .stream()
        .map(instruction -> instructionVisitor.visitInstruction(instruction, loopScope))
        .toList();

        return new WhileStatement(condExpression, instructions, loopScope);
    }

    public Instruction visitForstmt(CGPLParser.ForstmtContext ctx, Scope scope)
    {
        // foreach loop
        if (ctx.IDENTIFIER() != null)
        {
            return visitForeachStmt(ctx, scope);
        }
        else
        // iterative loop
        {
            return visitIterativeStmt(ctx, scope);
        }
    }

    public Instruction visitForeachStmt(CGPLParser.ForstmtContext ctx, Scope scope)
    {
        // New scope
        Scope loopScope = new Scope();

        // Get instructions
        InstructionVisitor instructionVisitor = new InstructionVisitor();

        List<Instruction> instructions = ctx.instruction()
        .stream()
        .map(instruction -> instructionVisitor.visitInstruction(instruction, loopScope))
        .toList();

        // Get container
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        Expression container = ctx.value().accept(expressionVisitor);

        return new ForStatement(ctx.IDENTIFIER().getText(), container, instructions, loopScope);
    }

    public Instruction visitIterativeStmt(CGPLParser.ForstmtContext ctx, Scope scope)
    {
        // Get variable declaration
        VardclVisitor varVisitor = new VardclVisitor();
        VarDeclaration vardcl = varVisitor.visitVardcl(ctx.vardcl());
        Scope loopScope = new Scope();

        // Get condition expression
        BooleanExpressionVisitor booleanExpressionVisitor = new BooleanExpressionVisitor();
        Expression condExpression = booleanExpressionVisitor.visitBoolExpr(ctx.boolExpr());

        // Get iteration instruction
        AssignmentVisitor assignmentVisitor = new AssignmentVisitor();
        Instruction iterationInstruction;
        
        // Check increment
        if (ctx.increment() != null)
        {
            iterationInstruction = assignmentVisitor.visitIncrement(ctx.increment());
        }
        // Check decrement
        else if (ctx.decrement() != null)
        {
            iterationInstruction = assignmentVisitor.visitDecrement(ctx.decrement());
        }
        else if (ctx.assignment() != null)
        // Arithmetic expression
        {
            iterationInstruction = assignmentVisitor.visitAssignment(ctx.assignment());
        }
        else
        {
            throw new IllegalArgumentException("Unexpected assignment instruction");
        }

        // Get body instructions
        InstructionVisitor instructionVisitor = new InstructionVisitor();

        List<Instruction> instructions = ctx.instruction()
        .stream()
        .map(instruction -> instructionVisitor.visitInstruction(instruction, loopScope))
        .toList();

        return new ForStatement(vardcl, condExpression, iterationInstruction, instructions, loopScope);
    }
}