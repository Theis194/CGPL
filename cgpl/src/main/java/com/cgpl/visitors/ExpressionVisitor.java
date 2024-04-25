public static class ExpressionVisitor extends CGPLBaseVisitor<Expression> {
    @Override
    public Expression visitValue(CGPLParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            return new Number(Integer.parseInt(ctx.NUMBER().getText()));
        } else if (ctx.IDENTIFIER() != null) {
            return new Identifier(ctx.IDENTIFIER().getText());
        } else if (ctx.STRING() != null) {
            return new StringLiteral(ctx.STRING().getText().replaceAll("\"", ""));
        } else if (ctx.boolExpr() != null) {
            return new BooleanExpressionVisitor().visitBoolExpr(ctx.boolExpr());
        } else if (ctx.arthexp() != null) {
            // Handle expression
        } else if (ctx.list() != null) {
            // Handle expression
        } else if (ctx.stringConcat() != null) {
            // Handle expression
        }
        return super.visitValue(ctx);
    }
}