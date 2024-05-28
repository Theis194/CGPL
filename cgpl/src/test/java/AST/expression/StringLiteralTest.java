package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.StringLiteral;


public class StringLiteralTest {
    // UNIT
    @Test
    public void TestStringLiteralConstructor()
    {
        String string = "Literal";
        StringLiteral stringLiteral = new StringLiteral(string);

        Assertions.assertEquals(stringLiteral.getValue(), string);
    }

    // UNIT
    @Test
    public void TestStringLiteralType()
    {
        String string = "Literal";
        StringLiteral stringLiteral = new StringLiteral(string);

        Assertions.assertEquals(stringLiteral.getType(), "string");
    }

    // UNIT
    @Test
    public void TestStringLiteralToString()
    {
        String string = "Literal";
        StringLiteral stringLiteral = new StringLiteral(string);

        Assertions.assertEquals(stringLiteral.toString(), string);
        Assertions.assertEquals(stringLiteral.toString(), stringLiteral.getValue());
    }

    // UNIT
    @Test
    public void StringLiteralEvaluate()
    {
        String string = "Literal";
        StringLiteral stringLiteral = new StringLiteral(string);

        Assertions.assertEquals(stringLiteral.evaluate(null), stringLiteral);
    }
}
