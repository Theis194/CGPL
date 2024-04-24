package com.cgpl.AST.instructions;

import com.cgpl.AST.expressions.Expression;

public class ConstDeclaration extends Instruction {
    private String identifier;
    private String type;
    private Expression value;

    public ConstDeclaration(String identifier, Expression value) {
        this.identifier = identifier;
        this.value = value;
        super.setType("ConstDeclaration");
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
