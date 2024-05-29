package com.cgpl.visitors;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.CaseStatement;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.SwitchStatement;

public class SwitchVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitSwitchstmt(CGPLParser.SwitchstmtContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        Expression switchValue = ctx.value().accept(expressionVisitor);
        List<CaseStatement> cases = ctx.casestmt()
            .stream()
            .map(casestmt -> visitCasestmt(casestmt))
            .map(CaseStatement.class::cast)
            .collect(toList());
        return new SwitchStatement(switchValue, cases);
    }

    @Override
    public Instruction visitCasestmt(CGPLParser.CasestmtContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        if (ctx.value() == null) {
            return new CaseStatement(null, ctx.instruction()
                .stream()
                .map(instruction -> instruction.accept(new InstructionVisitor()))
                .collect(toList()));
        }
        Expression caseValue = ctx.value().accept(expressionVisitor);
        List<Instruction> instructions = ctx.instruction()
            .stream()
            .map(instruction -> instruction.accept(new InstructionVisitor()))
            .collect(toList());
        return new CaseStatement(caseValue, instructions);
    }

}
