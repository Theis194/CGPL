package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.Return;

public class ReturnVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Return visitReturnstmt(CGPLParser.ReturnstmtContext ctx) {
        return new Return(new ExpressionVisitor().visitValue(ctx.value()));
    }
}