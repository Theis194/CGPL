package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Number;

public class NumberTest {
    // UNIT
    @Test
    public void TestNumberConstructor()
    {
        Integer num = 0;
        Number number = new Number(num);

        Assertions.assertEquals(number.getValue(), num);
    }

    // UNIT
    @Test
    public void TestNumberType()
    {
        Integer num = 0;
        Number number = new Number(num);

        Assertions.assertEquals(number.getType(), "number");
    }

    // UNIT
    @Test
    public void TestNumberToString()
    {
        Integer num = 0;
        Number number = new Number(num);
        
        Assertions.assertEquals(number.toString(), "0");
    }

    // UNIT
    @Test
    public void TestNumberNull()
    {
        Integer num = null;
        Number number = new Number(num);

        Assertions.assertThrows(NullPointerException.class, () -> number.toString());
    }

    // UNIT
    @Test
    public void TestNumberEvaluate()
    {
        Integer num = 0;
        Number number = new Number(num);

        Assertions.assertEquals(number.evaluate(null), number);
    }
}
