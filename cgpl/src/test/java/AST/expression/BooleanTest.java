package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Boolean;

public class BooleanTest {
    // UNIT
    @Test
    public void TestBooleanConstructorTrue()
    {
        boolean b = true;
        Boolean bool = new Boolean(b);

        Assertions.assertEquals(bool.getValue(), b);
    }

    // UNIT
    @Test
    public void TestBooleanConstructorFalse()
    {
        boolean b = false;
        Boolean bool = new Boolean(b);

        Assertions.assertEquals(bool.getValue(), b);
    }

    // UNIT
    @Test
    public void TestBooleanType()
    {
        boolean b = true;
        Boolean bool = new Boolean(b);

        Assertions.assertEquals(bool.getType(), "Boolean");
    }

    // UNIT
    @Test
    public void TestBooleanValue()
    {
        boolean bTrue = true;
        boolean bFalse = false;

        Boolean boolTrue = new Boolean(bTrue);
        Boolean boolFalse = new Boolean(bFalse);

        Assertions.assertEquals(boolTrue.getValue(), true);
        Assertions.assertEquals(boolFalse.getValue(), false);
    }
}
