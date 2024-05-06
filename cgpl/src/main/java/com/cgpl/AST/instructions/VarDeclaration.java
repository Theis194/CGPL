package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class VarDeclaration implements Instruction {
    private String instructionType;
    private String identifier;
    private String type;
    private Expression value;
    private boolean isConst;

    public VarDeclaration(String identifier, Expression value, boolean isConst) {
        this.identifier = identifier;
        this.value = value;
        this.isConst = isConst;
        this.instructionType = "VarDeclaration";
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getType() {
        return type;
    }

    public Expression getValue() {
        return value;
    }

    public boolean isConst() {
        return isConst;
    }

    @Override
    public String getInstructionType() {
        return instructionType;
    }
}
