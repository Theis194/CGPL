package com.cgpl.visitors;

import java.util.ArrayList;
import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.CGPLParser.InstructionContext;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.IfStatment;
import com.cgpl.AST.instructions.Instruction;

public class IfStatementVisitor extends CGPLBaseVisitor<Instruction> {
    public Instruction visitIfstmt(CGPLParser.IfstmtContext ctx, Scope scope) {
        BooleanExpressionVisitor expressionVisitor = new BooleanExpressionVisitor();
        Expression condition = expressionVisitor.visitBoolExpr(ctx.boolExpr());

        List<Instruction> thenBlock = new ArrayList<>();
        List<Instruction> elseBlock = new ArrayList<>();
        Instruction elseIfInstruction = null;

        // Visit the then block
        for (InstructionContext instruction : ctx.thenBlock().instruction()) {
            thenBlock.add(new InstructionVisitor().visitInstruction(instruction, scope));
        }

        // Check if there is an else block
        if (ctx.ELSE() != null) {
            // Check if the else block is another if statement
            if (ctx.ifstmt() != null) {
                elseIfInstruction = visitIfstmt(ctx.ifstmt(), scope);
            } else {
                // Visit the else block
                for (InstructionContext instruction : ctx.elseBlock().instruction()) {
                    elseBlock.add(new InstructionVisitor().visitInstruction(instruction, scope));
                }
            }
        }

        Scope thenScope = new Scope(false);
        Scope elseScope = new Scope(false);

        // Create the IfStatment with the condition, then block, and else block
        IfStatment ifStatment = new IfStatment(condition, thenBlock, elseBlock, thenScope, elseScope);

        // If there is an else if instruction, add it to the else block of the ifStatment
        if (elseIfInstruction != null) {
            ifStatment.getElseBody().clear();
            ifStatment.getElseBody().add(elseIfInstruction);
        }

        return ifStatment;
    }
}
