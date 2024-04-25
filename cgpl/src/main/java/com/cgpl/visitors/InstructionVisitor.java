public static class InstructionVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Instruction visitInstruction(CGPLParser.InstructionContext ctx) {
        if (ctx.vardcl() != null) {
            return new VardclVisitor().visitVardcl(ctx.vardcl());
        } else if (ctx.konstdcl() != null) {
            // Handle constant declaration
        } else if (ctx.function() != null) {
            // Handle function
        } else if (ctx.ifstmt() != null) {
            // Handle if statement
        } else if (ctx.forstmt() != null) {
            // Handle for statement
        } else if (ctx.returnstmt() != null) {
            // Handle return statement
        } else if (ctx.assignment() != null) {
            // Handle assignment
        } else if (ctx.increment() != null) {
            // Handle increment
        } else if (ctx.decrement() != null) {
            // Handle decrement
        } else if (ctx.functionCall() != null) {
            // Handle function call
        }
        return super.visitInstruction(ctx);
    }
}