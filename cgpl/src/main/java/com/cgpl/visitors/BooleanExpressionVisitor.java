public static class BooleanExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitBoolExpr(CGPLParser.BoolExprContext ctx) {
        return new OrExpressionVisitor().visitOrExpr(ctx.orExpr());
    }
}