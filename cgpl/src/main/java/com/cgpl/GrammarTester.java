package com.cgpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class GrammarTester {
    private static final File folder = new File("cgpl\\src\\test\\cgpl");

    public static List<String> offendingFiles = new ArrayList<>();
    public static void main(String[] args) {
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                String fileName = file.getName();
                System.out.println(fileName);
                try {
                    String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
                    CharStream input = CharStreams.fromString(content);
                    parseFile(input, fileName);

                    for (String string : offendingFiles) {
                        System.out.println("Offending file: " + string);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void parseFile(CharStream input, String fileName) {
        CGPLLexer lexer = new CGPLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CGPLParser parser = new CGPLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
                offendingFiles.add(fileName);
            }
        });

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener();

        walker.walk(listener, tree);
    }
}
