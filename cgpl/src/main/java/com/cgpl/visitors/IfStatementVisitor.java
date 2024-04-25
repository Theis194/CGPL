package com.cgpl.visitors;

import java.util.ArrayList;
import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.CGPLParser.InstructionContext;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.IfStatment;
import com.cgpl.AST.instructions.Instruction;

public class IfStatementVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitIfstmt(CGPLParser.IfstmtContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        Expression condition = expressionVisitor.visitValue(ctx.value());

        // Get the list of instructions
        List<InstructionContext> instructions = ctx.instruction();

        // Determine the number of instructions in the "then" block
        int thenBlockInstructionCount = ctx.LCURLY(0).getSymbol().getTokenIndex() - ctx.IF().getSymbol().getTokenIndex() - 1;

        List<Instruction> thenBlock = new ArrayList<>();
        List<Instruction> elseBlock = new ArrayList<>();
        // Iterate over the instructions
        for (int i = 0; i < instructions.size(); i++) {
            // If the index is less than the number of instructions in the "then" block
            if (i < thenBlockInstructionCount) {
                // The instruction is part of the "then" block
                thenBlock.add(new InstructionVisitor().visitInstruction(instructions.get(i)));
            } else if (i == thenBlockInstructionCount && ctx.ELSE() != null) {
                // The instruction is part of the "else" block
                elseBlock.add(new InstructionVisitor().visitInstruction(instructions.get(i)));
            }
        }

        return new IfStatment(condition, thenBlock, elseBlock);
    }
}
