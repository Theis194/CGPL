import org.junit.jupiter.api.Test;

import com.cgpl.CGPLLexer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class LexerTest {

    @Test
    public void testEmptyInput() {
        CharStream input = CharStreams.fromString("");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(Token.EOF, token.getType());
    }

    @Test
    public void testSingleToken() {
        CharStream input = CharStreams.fromString("123");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("123", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testMultipleTokens() {
        CharStream input = CharStreams.fromString("1 + 2 * 3");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("1", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.OP_ADD, token.getType());
        assertEquals("+", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("2", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.OP_MULT, token.getType());
        assertEquals("*", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("3", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testKeywordsAndIdentifiers() {
        CharStream input = CharStreams.fromString("function myFunction return");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.FUNCTION, token.getType());
        assertEquals("function", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("myFunction", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.RETURN, token.getType());
        assertEquals("return", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testOperators() {
        CharStream input = CharStreams.fromString("== < >= ++ --");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.EQUAL, token.getType());
        assertEquals("==", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.LT, token.getType());
        assertEquals("<", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.GT_OR_EQUAL, token.getType());
        assertEquals(">=", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.OP_INC, token.getType());
        assertEquals("++", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.OP_DEC, token.getType());
        assertEquals("--", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testStringLiterals() {
        CharStream input = CharStreams.fromString("\"Hello, World!\"");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.STRING, token.getType());
        assertEquals("\"Hello, World!\"", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testBooleanLiterals() {
        CharStream input = CharStreams.fromString("true false");
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();
        assertEquals(CGPLLexer.BOOLEAN, token.getType());
        assertEquals("true", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.BOOLEAN, token.getType());
        assertEquals("false", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }

    @Test
    public void testCgplFile() throws Exception {
        String filePath = "src/test/cgpl/function.cgpl";
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        CharStream input = CharStreams.fromString(stringBuilder.toString());
        CGPLLexer lexer = new CGPLLexer(input);
        Token token = lexer.nextToken();

        assertEquals(CGPLLexer.FUNCTION, token.getType());
        assertEquals("function", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("test", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.LPAREN, token.getType());
        assertEquals("(", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("var1", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.RPAREN, token.getType());
        assertEquals(")", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.LCURLY, token.getType());
        assertEquals("{", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("var1", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.T__0, token.getType());
        assertEquals("=", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("var1", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.OP_ADD, token.getType());
        assertEquals("+", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("10", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.CRLF, token.getType());
        assertEquals(";", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.RETURN, token.getType());
        assertEquals("return", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("var1", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.CRLF, token.getType());
        assertEquals(";", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.RCURLY, token.getType());
        assertEquals("}", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.VAR, token.getType());
        assertEquals("var", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("test", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.T__0, token.getType());
        assertEquals("=", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.IDENTIFIER, token.getType());
        assertEquals("test", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.LPAREN, token.getType());
        assertEquals("(", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.NUMBER, token.getType());
        assertEquals("5", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.RPAREN, token.getType());
        assertEquals(")", token.getText());
        token = lexer.nextToken();
        assertEquals(CGPLLexer.CRLF, token.getType());
        assertEquals(";", token.getText());
        assertEquals(Token.EOF, lexer.nextToken().getType());
    }
}
