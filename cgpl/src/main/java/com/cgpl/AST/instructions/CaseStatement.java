package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class CaseStatement implements Instruction {
    private String instructionType;
    private Expression caseValue;
    private List<Instruction> instruction;

    public CaseStatement(Expression caseValue, List<Instruction> instruction) {
        this.caseValue = caseValue;
        this.instruction = instruction;
        this.instructionType = "CaseStatement";
    }

    public Expression getCaseValue() {
        return caseValue;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
