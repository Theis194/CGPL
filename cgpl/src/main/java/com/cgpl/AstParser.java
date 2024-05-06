package com.cgpl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.cgpl.AST.Program;
import com.cgpl.visitors.ProgramVisitor;

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
