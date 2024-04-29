package com.cgpl.visitors;

import java.util.List;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.ArithmeticExpression;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.Assignment;
import com.cgpl.AST.instructions.Instruction;

public class AssignmentVisitor extends CGPLBaseVisitor<Instruction> {
    @Override
    public Assignment visitAssignment(CGPLParser.AssignmentContext ctx) {
        return new Assignment(ctx.IDENTIFIER().getText(), ctx.value().accept(new ExpressionVisitor()));
    }

    @Override
    public Instruction visitIncrement(CGPLParser.IncrementContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        List<Expression> operands = List.of(new Identifier(identifier), new Number(1));
        ArithmeticExpression expr = new ArithmeticExpression(operands, "+");
        return new Assignment(identifier, expr);
    }

    @Override
    public Instruction visitDecrement(CGPLParser.DecrementContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        List<Expression> operands = List.of(new Identifier(identifier), new Number(1));
        ArithmeticExpression expr = new ArithmeticExpression(operands, "-");
        return new Assignment(identifier, expr);
    }
}
