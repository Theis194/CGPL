package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class WhileStatement implements Instruction {
    private String instructionType;
    private Expression condition;
    private List<Instruction> body;
    private Scope scope;

    public WhileStatement(Expression condition, List<Instruction> body, Scope scope) {
        this.condition = condition;
        this.body = body;
        this.instructionType = "ForEachStatement";
        this.scope = scope;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Instruction> getBody() {
        return body;
    }

    public Scope getScope() {
        return scope;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
