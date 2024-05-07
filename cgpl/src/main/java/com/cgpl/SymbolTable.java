package com.cgpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, Object>> scopes;

    public SymbolTable() {
        this.scopes = new Stack<>();
        this.scopes.push(new HashMap<>());
    }

    public void pushScope() {
        this.scopes.push(new HashMap<>());
    }

    public void popScope() {
        if (this.scopes.size() > 1) {
            this.scopes.pop();
        }
    }

    public void addSymbol(String identifier, Object value) {
        this.scopes.peek().put(identifier, value);
    }

    public Object getSymbol(String identifier) {
        for (int i = this.scopes.size() - 1; i >= 0; i--) {
            Map<String, Object> scope = this.scopes.get(i);
            if (scope.containsKey(identifier)) {
                return scope.get(identifier);
            }
        }
        return null;
    }

    public boolean hasSymbol(String identifier) {
        for (Map<String, Object> scope : this.scopes) {
            if (scope.containsKey(identifier)) {
                return true;
            }
        }
        return false;
    }

    public void removeSymbol(String identifier) {
        this.scopes.peek().remove(identifier);
    }
}