package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class SwitchStatement implements Instruction {
    private String instructionType;
    private Expression switchValue;
    private List<CaseStatement> cases;

    public SwitchStatement(Expression switchValue, List<CaseStatement> cases) {
        this.switchValue = switchValue;
        this.cases = cases;
        this.instructionType = "SwitchStatement";
    }

    public Expression getSwitchValue() {
        return switchValue;
    }

    public List<CaseStatement> getCases() {
        return cases;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
