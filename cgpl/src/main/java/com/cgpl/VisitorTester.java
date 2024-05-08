package com.cgpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.cgpl.AST.Program;

public class VisitorTester {
    public static void main(String[] args) {
        String code = readFile("cgpl/src/test/cgpl/function.cgpl");

        final Program result = new AstParser().parse(code);
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        final String json = gson.toJson(result);
        
        try {
            FileWriter writer = new FileWriter("output.json");
            writer.write(json);
            writer.close();
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
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
