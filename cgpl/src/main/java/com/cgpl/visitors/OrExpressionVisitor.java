public static class OrExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public OrExpression visitOrExpr(CGPLParser.OrExprContext ctx) {
        AndExpressionVisitor andExpressionVisitor = new AndExpressionVisitor();
        List<Expression> andExpressions = ctx.andExpr()
                .stream()
                .map(andExpr -> andExpr.accept(andExpressionVisitor))
                .collect(toList());
        return new OrExpression(andExpressions);
    }
}