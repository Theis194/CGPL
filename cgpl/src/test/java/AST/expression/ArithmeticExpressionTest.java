package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.ArithmeticExpression;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.Player;

public class ArithmeticExpressionTest {
    // UNIT
    @Test
    public void TestArithmeticExpressionConstructor()
    {
        Integer left = 1;
        Integer right = 2;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Number(left));
            add(new Number(right));
        }};
        String operator = "+";

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);

        Assertions.assertEquals(arithmeticExpression.getOperator(), operator);
        Assertions.assertEquals(arithmeticExpression.getOperands(), expressions);
    }

    // UNIT
    @Test
    public void TestArithmeticExpressionType()
    {
        List<Expression> expressions = new java.util.ArrayList<>();
        String operator = "+";

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);

        Assertions.assertEquals(arithmeticExpression.getType(), "arithmetic");
    }

    // UNIT
    @Test
    public void TestArithmeticExpressionValue()
    {
        List<Expression> expressions = new java.util.ArrayList<>();
        String operator = "+";

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);

        Assertions.assertEquals(arithmeticExpression.getValue(), null);
    }

    // UNIT
    @Test
    public void TestArtihmeticExpressionToString()
    {
        Integer left = 1;
        Integer right = 2;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Number(left));
            add(new Number(right));
        }};
        String operator = "+";

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);
        
        Assertions.assertEquals(arithmeticExpression.toString(), left + " " + right + " ");
    }

    // UNIT
    @Test
    public void TestArithmeticExpressionEvaluate()
    {
        Integer left = 1;
        Integer right = 2;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Number(left));
            add(new Number(right));
        }};

        String plus = "+";
        String minus = "-";
        String multiplication = "*";
        String division = "/";
        String modulus = "%";

        ArithmeticExpression plusArithmeticExpression = new ArithmeticExpression(expressions, plus);
        ArithmeticExpression minusArithmeticExpression = new ArithmeticExpression(expressions, minus);
        ArithmeticExpression mulitiplicationArithmeticExpression = new ArithmeticExpression(expressions, multiplication);
        ArithmeticExpression divisionArithmeticExpression = new ArithmeticExpression(expressions, division);
        ArithmeticExpression modulusArithmeticExpression = new ArithmeticExpression(expressions, modulus);

        // HAHAHHAHA
        Assertions.assertEquals(((Number)plusArithmeticExpression.evaluate(null)).getValue().intValue(), left + right);
        Assertions.assertEquals(((Number)minusArithmeticExpression.evaluate(null)).getValue().intValue(), left - right);
        Assertions.assertEquals(((Number)mulitiplicationArithmeticExpression.evaluate(null)).getValue().intValue(), left * right);
        Assertions.assertEquals(((Number)divisionArithmeticExpression.evaluate(null)).getValue().intValue(), left / right);
        Assertions.assertEquals(((Number)modulusArithmeticExpression.evaluate(null)).getValue().intValue(), left % right);
    }

    // UNIT TEST
    @Test
    public void TestArithmeticExpressionNull()
    {
        {
            List<Expression> expressions = new java.util.ArrayList<>(){{
                add(null);
                add(null);
            }};
            String operator = "+";
    
            ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);
            
            Assertions.assertThrows(NullPointerException.class, () -> arithmeticExpression.evaluate(null));
        }
    }

    // UNIT TEST
    @Test
    public void TestArithmeticExpressionNaN()
    {
        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Player());
            add(new Player());
        }};
        String operator = "+";

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expressions, operator);
        
        Assertions.assertThrows(RuntimeException.class, () -> arithmeticExpression.evaluate(null));
    }
}
