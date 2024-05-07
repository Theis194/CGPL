package com.cgpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.cgpl.AST.Program;

public class CGPL {
    public static void main(String[] args) {
        String inputFileName = "varDeclaration.cgpl";
        if (args.length == 1) {
            inputFileName = args[0];
        } else {
            System.out.println("No input file provided");
            System.out.println("Will use varDeclaration.cgpl as default input file");
        }

        String code = readFile("cgpl/src/test/cgpl/varDeclaration.cgpl");
        Program result = new AstParser().parse(code);

        Interpreter interpreter = new Interpreter();
        boolean success = interpreter.interpretProgram(result);
        if (success) {
            System.out.println("Program interpreted successfully");
        } else {
            System.out.println("Program interpretation failed");
        }
    }

    private static String readFile(String path) {
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}