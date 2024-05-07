package com.cgpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import com.cgpl.AST.Scope;

// Represents the symbol table that contains all the scopes
public class SymbolTable {
    private Stack<Scope> scopes;

    public SymbolTable() {
        this.scopes = new Stack<>();
    }

    // Adds a new scope to the stack
    public void pushScope(Scope scope) {
        this.scopes.push(scope);
    }

    // Removes the current scope from the stack
    public void popScope() {
        if (this.scopes.size() > 1) {
            this.scopes.pop();
        }
    }

    // Adds a symbol to the current scope
    public void addSymbol(String identifier, Scope value) {
        this.scopes.peek().put(identifier, value);
    }

    // Checks if any scope contains the symbol with the given identifier and returns the scope that contains it or null if it doesn't exist
    public Scope getSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsKey(identifier)) {
                return scope.get(identifier);
            }
        }
        return null;
    }

    // Checks if any scope contains the symbol with the given identifier and returns true if it does, false otherwise
    public boolean hasSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsKey(identifier)) {
                return true;
            }
        }
        return false;
    }
    // Removes the symbol with the given identifier from the current scope
    public void removeSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsKey(identifier)) {
                scope.remove(identifier);
            }
        }
    }
}