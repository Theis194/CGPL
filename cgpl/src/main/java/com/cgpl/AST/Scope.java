package com.cgpl.AST;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.Function;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.VarDeclaration;

public class Scope {
    private Map<String, Expression> variables = new HashMap<>();
    private Map<String, Function> functions = new HashMap<>();

    public Scope() {
    }

    public Scope(Scope parentScope) {
        for (Map.Entry<String, Expression> entry : parentScope.variables.entrySet()) {
            variables.put(entry.getKey(), entry.getValue());
        }
    }

    public void addVariable(String name, Expression value) {
        if (containsVariable(name)) {
            throw new RuntimeException("Variable: " + name + " already defined");
        }
        variables.put(name, value);
    }

    public void addVariable(List<Instruction> instructions) {
        for (Instruction instruction : instructions) {
            if (instruction instanceof VarDeclaration) {
                VarDeclaration varDeclaration = (VarDeclaration) instruction;
                addVariable(varDeclaration.getIdentifier(), varDeclaration.getValue());
            }
        }
    }

    public boolean containsVariable(String name) {
        return variables.containsKey(name);
    }

    public Expression getVariableValue(String name) {
        if (!containsVariable(name)) {
            throw new RuntimeException("Undefined variable: " + name);
        }
        return variables.get(name);
    }

    public void updateVariable(String name, Expression value) {
        if (!containsVariable(name)) {
            throw new RuntimeException("Undefined variable: " + name);
        }
        variables.put(name, value);
    }

    public void addFunction(String name, Function function) {
        functions.put(name, function);
    }

    public boolean containsFunction(String name) {
        return functions.containsKey(name);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }

    public Map<String,Expression> getScope() {
        return variables;
    }
}
