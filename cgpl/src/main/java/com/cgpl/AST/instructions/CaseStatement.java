package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class CaseStatement implements Instruction {
    private String instructionType;
    private Expression caseValue;
    private List<Instruction> instruction;
    private Scope scope;

    public CaseStatement(Expression caseValue, List<Instruction> instruction) {
        this.caseValue = caseValue;
        this.instruction = instruction;
        this.instructionType = "CaseStatement";
        this.scope = new Scope();
    }

    public Expression getCaseValue() {
        return caseValue;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public Scope getScope() {
        return scope;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
