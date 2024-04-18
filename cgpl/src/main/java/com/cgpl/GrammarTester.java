package com.cgpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    private static final File folder = new File(System.getProperty("user.dir") + File.separator + "cgpl\\src\\test\\cgpl");

    public static List<String> testedFiles = new ArrayList<>();
    //public static List<String> offendingFiles = new ArrayList<>();
    public static Map<String, List<String>> offendingFiles = new HashMap<>();
    public static void main(String[] args) {
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                String fileName = file.getName();
                testedFiles.add(fileName);
                System.out.println(fileName);
                try {
                    String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
                    CharStream input = CharStreams.fromString(content);
                    parseFile(input, fileName);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (offendingFiles.isEmpty()) {
            System.out.println("All files passed the test");
        } else {
            System.out.println(offendingFiles.size() + " files failed the test");
            for (String string : testedFiles) {
                if (offendingFiles.containsKey(string)) {
                    System.out.println("Offending file: " + string);
                    for (String error : offendingFiles.get(string)) {
                        System.out.println(error);
                    }
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
                offendingFiles.putIfAbsent(fileName, new ArrayList<>());
                offendingFiles.get(fileName).add("line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener();

        walker.walk(listener, tree);
    }
}
