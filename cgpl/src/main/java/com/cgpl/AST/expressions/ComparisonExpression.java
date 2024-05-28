package com.cgpl.AST.expressions;

import java.util.List;

import com.cgpl.Interpreter;
import com.cgpl.SymbolTable;
import com.cgpl.AST.instructions.Instruction;

public class ComparisonExpression implements Expression {
    List<Expression> operands;
    String operator;
    String type = "comparison";

    public ComparisonExpression(List<Expression> operands, String operator) {
        this.operands = operands;
        this.operator = operator;
    }

    public List<Expression> getOperands() {
        return this.operands;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override
    public String getType() {
        return "comparison";
    }

    @Override
    public String toString() {
        return "ComparisonExpression";
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

        if (left.getType().equals("number") && right.getType().equals("number")) {
            int leftValue = ((Number) left).getValue();
            int rightValue = ((Number) right).getValue();
            switch (operator) {
                case "lt":
                    return new Boolean(leftValue < rightValue);
                case "gt":
                    return new Boolean(leftValue > rightValue);
                case "lte":
                    return new Boolean(leftValue <= rightValue);
                case "gte":
                    return new Boolean(leftValue >= rightValue);
                case "eq":
                    return new Boolean(leftValue == rightValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else if (left.getType().equals("Boolean") && right.getType().equals("Boolean")) {
            boolean leftValue = ((Boolean) left).getValue();
            boolean rightValue = ((Boolean) right).getValue();
            switch (operator) {
                case "eq":
                    return new Boolean(leftValue == rightValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else if (left.getType().equals("string") && right.getType().equals("string")) {
            String leftValue = ((StringLiteral) left).getValue();
            String rightValue = ((StringLiteral) right).getValue();
            switch (operator) {
                case "eq":
                    return new Boolean(leftValue.equals(rightValue));
                default:
                    throw new RuntimeException("Invalid operator");
            }
        } else if (left.getType().equals("player") && right.getType().equals("player")) {
            Player leftValue = (Player) left;
            Player rightValue = (Player) right;

            switch (operator) {
                case "eq":
                    return new Boolean(leftValue == rightValue);
                default:
                    throw new RuntimeException("Invalid operator");
            }
        }else {
            throw new RuntimeException("Operands must be of the same type. Got left type: " + left.getType() + " and right type: " + right.getType() + " with operator: " + operator);
        }
    }
}
