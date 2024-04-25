



public static class BooleanValueVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitBoolvalue(CGPLParser.BoolvalueContext ctx) {
        if (ctx.BOOLEAN() != null) {
            return new Boolean(java.lang.Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        } else if (ctx.IDENTIFIER() != null) {
            return new Identifier(ctx.IDENTIFIER().getText());
        } else if (ctx.boolExpr() != null) {
            return ctx.boolExpr().accept(new OrExpressionVisitor());
        } else {
            throw new IllegalArgumentException("Unexpected boolvalue");
        }
    }
}