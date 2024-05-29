package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.StringConcat;
import com.cgpl.AST.expressions.StringLiteral;

public class StringConcatTest {
    // UNIT
    @Test
    public void TestStringConcatConstructor()
    {
        String value = "text";
        StringLiteral stringLiteral = new StringLiteral(value);

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(stringLiteral);
        }};
        
        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertEquals(stringConcat.getExpressions().get(0), stringLiteral);
    }

    // UNIT
    @Test
    public void TestStringConcatToString()
    {
        String hello = "Hello ";
        String world = "World";

        StringLiteral stringHello = new StringLiteral(hello);
        StringLiteral stringWorld = new StringLiteral(world);

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(stringHello);
            add(stringWorld);
        }};
        
        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertEquals(stringConcat.toString(), hello + world);
    }

    // UNIT
    @Test
    public void TestStringConcatType()
    {
        List<Expression> expressions = new java.util.ArrayList<>();
        
        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertEquals(stringConcat.getType(), "stringConcat");
    }

    // UNIT
    @Test
    public void TestStringConcatValue()
    {
        List<Expression> expressions = new java.util.ArrayList<>();
        
        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertEquals(stringConcat.getValue(), null);
    }

    // UNIT
    @Test
    public void TestStringConcatNull()
    {
        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(null);
        }};

        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertThrows(NullPointerException.class, () -> stringConcat.evaluate(null));
    }

    // INTEGRATION
    @Test
    public void TestStringConcatEvaluate()
    {
        String hello = "Hello ";
        String world = "World";

        StringLiteral stringHello = new StringLiteral(hello);
        StringLiteral stringWorld = new StringLiteral(world);

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(stringHello);
            add(stringWorld);
        }};

        StringConcat stringConcat = new StringConcat(expressions);

        Assertions.assertEquals(stringConcat.evaluate(null).getValue(), hello + world);
    }
}
