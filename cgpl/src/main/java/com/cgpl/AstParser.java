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
}
