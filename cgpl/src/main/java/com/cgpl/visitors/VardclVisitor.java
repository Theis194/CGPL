public static class VardclVisitor extends CGPLBaseVisitor<VarDeclaration> {
    @Override
    public VarDeclaration visitVardcl(CGPLParser.VardclContext ctx) {
        return new VarDeclaration(ctx.IDENTIFIER().getText(), ctx.value().accept(new ExpressionVisitor()));
    }
}