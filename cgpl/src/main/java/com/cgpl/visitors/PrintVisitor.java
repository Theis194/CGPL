package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.Print;

public class PrintVisitor extends CGPLBaseVisitor<Instruction>{
    @Override
    public Print visitPrintstmt(CGPLParser.PrintstmtContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor();
        Expression expression = expressionVisitor.visitValue(ctx.value());
        return new Print(expression);
    }
}
