package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.Break;
import com.cgpl.AST.instructions.Instruction;

public class BreakVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitBreakstmt(CGPLParser.BreakstmtContext ctx) {
        return new Break();
    }
}
