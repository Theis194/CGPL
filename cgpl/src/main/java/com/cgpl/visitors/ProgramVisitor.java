
public static class ProgramVisitor extends CGPLBaseVisitor<Program> {
    @Override
    public Program visitProgram(CGPLParser.ProgramContext ctx) {
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        List<Instruction> instructions = ctx.instruction()
                .stream()
                .map(instruction -> instruction.accept(instructionVisitor))
                .collect(toList());
        return new Program(instructions);
    }
}
