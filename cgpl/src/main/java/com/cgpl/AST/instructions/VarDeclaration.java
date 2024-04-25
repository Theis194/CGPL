package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class VarDeclaration extends Instruction {
    private String identifier;
    private String type;
    private Expression value;
    private boolean isConst;

    public VarDeclaration(String identifier, Expression value, boolean isConst) {
        super.setType("VarDeclaration");
        this.identifier = identifier;
        this.value = value;
        this.isConst = isConst;
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
}
