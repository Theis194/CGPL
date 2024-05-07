package com.cgpl;

import java.util.Stack;

import com.cgpl.AST.expressions.Expression;
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
    public void addSymbol(String identifier, Expression value) {
        this.scopes.peek().addVariable(identifier, value);
    }

    // Checks if any scope contains the symbol with the given identifier and returns the scope that contains it or null if it doesn't exist
    public Object getSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsVariable(identifier)) {
                return scope.getVariableValue(identifier);

            } else if (scope.containsFunction(identifier)) {
                return scope.getFunction(identifier);
            }
        }
        return null;
    }

    public void updateSymbol(String identifier, Expression value) {
        for (Scope scope : this.scopes) {
            if (scope.containsVariable(identifier)) {
                scope.updateVariable(identifier, value);
            }
        }
    }

    // Checks if any scope contains the symbol with the given identifier and returns true if it does, false otherwise
    public boolean hasSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsVariable(identifier)) {
                return true;
            }
        }
        return false;
    }
    /* unsure why you would want to remove a variable from the symbol table
    // Removes the symbol with the given identifier from the current scope
    public void removeSymbol(String identifier) {
        for (Scope scope : this.scopes) {
            if (scope.containsVariable(identifier)) {
                scope.remove(identifier);
            }
        }
    } */
}