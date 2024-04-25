public static class AndExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public AndExpression visitAndExpr(CGPLParser.AndExprContext ctx) {
        BooleanValueVisitor booleanValueVisitor = new BooleanValueVisitor();
        List<Expression> operands = ctx.boolvalue()
                .stream()
                .map(value -> value.accept(booleanValueVisitor))
                .collect(toList());
        return new AndExpression(operands);
    }
}