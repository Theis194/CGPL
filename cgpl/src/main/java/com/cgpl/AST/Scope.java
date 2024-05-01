package com.cgpl.AST;

import java.util.Map;
import java.util.HashMap;

import com.cgpl.AST.expressions.Expression;

public class Scope {
    Map<String, Expression> variables = new HashMap<String, Expression>();

    public void addVariable(String name, Expression value) {
        if (containsVariable(name)) {
            throw new RuntimeException("Variable: " + name + " already defined");
        }
        variables.put(name, value);
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
}
