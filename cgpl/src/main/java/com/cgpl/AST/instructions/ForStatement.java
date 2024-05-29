package com.cgpl.AST.instructions;

import java.util.List;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class ForStatement implements Instruction {
    private String instructionType;
    private String identifier;
    private Expression iterable; // This is the list that we are iterating over
    private Instruction iteration; // This is the instruction run every iteration of the loop
    private VarDeclaration varDeclaration;
    private Expression condition;
    private List<Instruction> body;
    private Scope scope;

    public ForStatement(String identifier, Expression iterable, List<Instruction> body, Scope scope) {
        this.identifier = identifier;
        this.iterable = iterable;
        this.body = body;
        this.instructionType = "ForEachStatement";
        this.scope = scope;
    }

    public ForStatement(VarDeclaration vardcl, Expression condition, Instruction iteration, List<Instruction> body, Scope scope)
    {
        this.identifier = null;
        this.iterable = null;
        this.iteration = iteration;
        this.varDeclaration = vardcl;
        this.condition = condition;
        this.body = body;
        this.instructionType = "ForStatement";
        this.scope = scope;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getIterable() {
        return iterable;
    }

    public Instruction getIteration() {
        return iteration;
    }

    public VarDeclaration getVarDeclaration() {
        return varDeclaration;
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
