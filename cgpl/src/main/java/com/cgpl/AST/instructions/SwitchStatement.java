package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.expressions.Expression;

public class SwitchStatement extends Instruction {
    private Expression switchValue;
    private List<CaseStatement> cases;

    public SwitchStatement(Expression switchValue, List<CaseStatement> cases) {
        this.switchValue = switchValue;
        this.cases = cases;
    }

    public Expression getSwitchValue() {
        return switchValue;
    }

    public List<CaseStatement> getCases() {
        return cases;
    }
}
