package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.Interpreter;
import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.Instruction;

public class AndExpression implements Expression {
    List<Expression> operands;
    String type = "and";

    public AndExpression(List<Expression> operands) {
        this.operands = operands;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    @Override
    public String getType() {
        return "and";
    }

    @Override
    public String toString() {
        return "AndExpression";
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        Expression left = operands.get(0).evaluate(symbolTable);
        Expression right = operands.get(1).evaluate(symbolTable);

        if (left instanceof Instruction) {
            Interpreter interpreter = new Interpreter(symbolTable);
            left = interpreter.interpretInstruction((Instruction) left);
        }
        if (right instanceof Instruction) {
            Interpreter interpreter = new Interpreter(symbolTable);
            right = interpreter.interpretInstruction((Instruction) left);
        }

        if (left.getType().equals("Boolean") && right.getType().equals("Boolean")) {
            boolean leftValue = ((Boolean) left).getValue();
            boolean rightValue = ((Boolean) right).getValue();
            return new Boolean(leftValue && rightValue);
        } else {
            throw new RuntimeException("Operands must be of type boolean");
        }
    }
}
