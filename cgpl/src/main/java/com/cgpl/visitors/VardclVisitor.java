package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.instructions.VarDeclaration;

public class VardclVisitor extends CGPLBaseVisitor<VarDeclaration> {
    @Override
    public VarDeclaration visitVardcl(CGPLParser.VardclContext ctx) {
        return new VarDeclaration(ctx.IDENTIFIER().getText(), ctx.value().accept(new ExpressionVisitor()));
    }
}