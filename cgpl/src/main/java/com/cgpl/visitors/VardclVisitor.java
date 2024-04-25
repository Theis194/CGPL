package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.VarDeclaration;

public class VardclVisitor extends CGPLBaseVisitor<VarDeclaration> {
    @Override
    public VarDeclaration visitVardcl(CGPLParser.VardclContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        CGPLParser.ValueContext valueCtx = ctx.value();
        Expression initialValue = null;
        if (valueCtx != null) {
            initialValue = new ExpressionVisitor().visitValue(valueCtx);
        }
        boolean isConst = ctx.VAR() == null;
        return new VarDeclaration(varName, initialValue, isConst);
    }
}