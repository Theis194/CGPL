package com.cgpl;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.cgpl.AST.Program;
import com.cgpl.AST.expressions.AndExpression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Identifier;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.OrExpression;
import com.cgpl.AST.expressions.StringLiteral;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.VarDeclaration;

import static java.util.stream.Collectors.toList;

public class AstParser implements ParserCGPL{
    public Program parse(String code) {
        CharStream input = CharStreams.fromString(code);
        CGPLLexer lexer = new CGPLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CGPLParser parser = new CGPLParser(tokens);

        ProgramVisitor programVisitor = new ProgramVisitor();
        Program traverseResult = programVisitor.visit(parser.program());

        return traverseResult;
    }

    private static class ProgramVisitor extends CGPLBaseVisitor<Program> {
        @Override
        public Program visitProgram(CGPLParser.ProgramContext ctx) {
            InstructionVisitor instructionVisitor = new InstructionVisitor();
            List<Instruction> instructions = ctx.instruction()
                .stream()
                .map(instruction -> instruction.accept(instructionVisitor))
                .collect(toList());
            return new Program(instructions);
        }
    }

    private static class InstructionVisitor extends CGPLBaseVisitor<Instruction> {
        @Override
        public Instruction visitInstruction(CGPLParser.InstructionContext ctx) {
            if (ctx.vardcl() != null) {
                return new VardclVisitor().visitVardcl(ctx.vardcl());
            } else if (ctx.konstdcl() != null) {
                // Handle constant declaration
            } else if (ctx.function() != null) {
                // Handle function
            } else if (ctx.ifstmt() != null) {
                // Handle if statement
            } else if (ctx.forstmt() != null) {
                // Handle for statement
            } else if (ctx.returnstmt() != null) {
                // Handle return statement
            } else if (ctx.assignment() != null) {
                // Handle assignment
            } else if (ctx.increment() != null) {
                // Handle increment
            } else if (ctx.decrement() != null) {
                // Handle decrement
            } else if (ctx.functionCall() != null) {
                // Handle function call
            }
            return super.visitInstruction(ctx);
        }
    }

    private static class VardclVisitor extends CGPLBaseVisitor<VarDeclaration> {
        @Override
        public VarDeclaration visitVardcl(CGPLParser.VardclContext ctx) {
            return new VarDeclaration(ctx.IDENTIFIER().getText(), ctx.value().accept(new ExpressionVisitor()));
        }
    }

    private static class ExpressionVisitor extends CGPLBaseVisitor<Expression> {
        @Override
        public Expression visitValue(CGPLParser.ValueContext ctx) {
            if (ctx.NUMBER() != null) {
                return new Number(Integer.parseInt(ctx.NUMBER().getText()));
            } else if (ctx.IDENTIFIER() != null) {
                return new Identifier(ctx.IDENTIFIER().getText());
            } else if (ctx.STRING() != null) {
                return new StringLiteral(ctx.STRING().getText().replaceAll("\"", ""));
            } else if (ctx.boolExpr() != null) {
                return new BooleanExpressionVisitor().visitBoolExpr(ctx.boolExpr());
            } else if (ctx.arthexp() != null) {
                // Handle expression
            } else if (ctx.list() != null) {
                // Handle expression
            } else if (ctx.stringConcat() != null) {
                // Handle expression
            }
            return super.visitValue(ctx);
        }
    }

    private static class BooleanExpressionVisitor extends CGPLBaseVisitor<Expression> {
        @Override
        public Expression visitBoolExpr(CGPLParser.BoolExprContext ctx) {
            return new OrExpressionVisitor().visitOrExpr(ctx.orExpr());
        }
    }

    private static class OrExpressionVisitor extends CGPLBaseVisitor<Expression> {
        @Override
        public OrExpression visitOrExpr(CGPLParser.OrExprContext ctx) {
            AndExpressionVisitor andExpressionVisitor = new AndExpressionVisitor();
            List<Expression> andExpressions = ctx.andExpr()
                .stream()
                .map(andExpr -> andExpr.accept(andExpressionVisitor))
                .collect(toList());
            return new OrExpression(andExpressions);
        }
    }

    private static class AndExpressionVisitor extends CGPLBaseVisitor<Expression> {
        @Override
        public AndExpression visitAndExpr(CGPLParser.AndExprContext ctx) {
            BooleanValueVisitor booleanValueVisitor = new BooleanValueVisitor();
            List<Expression> operands = ctx.boolvalue()
                .stream()
                .map(value -> value.accept(booleanValueVisitor))
                .collect(toList());
            return new AndExpression(operands);
        }
    }

    private static class BooleanValueVisitor extends CGPLBaseVisitor<Expression> {
        @Override
        public Expression visitBoolvalue(CGPLParser.BoolvalueContext ctx) {
            if (ctx.BOOLEAN() != null) {
                return new Boolean(java.lang.Boolean.parseBoolean(ctx.BOOLEAN().getText()));
            } else if (ctx.IDENTIFIER() != null) {
                return new Identifier(ctx.IDENTIFIER().getText());
            } else if (ctx.boolExpr() != null) {
                return ctx.boolExpr().accept(new OrExpressionVisitor());
            } else {
                throw new IllegalArgumentException("Unexpected boolvalue");
            }
        }
    }
}
