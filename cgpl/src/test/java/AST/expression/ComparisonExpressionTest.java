package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.ComparisonExpression;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Player;
import com.cgpl.AST.expressions.StringLiteral;

public class ComparisonExpressionTest {
    // UNIT
    @Test
    public void TestComparisonExpressionConstructor()
    {
        boolean left = true;
        boolean right = false;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Boolean(left));
            add(new Boolean(right));
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertEquals(comparisonExpression.getOperator(), operator);
        Assertions.assertEquals(comparisonExpression.getOperands(), expressions);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionType()
    {
        ComparisonExpression comparisonExpression = new ComparisonExpression(null, null);
        Assertions.assertEquals(comparisonExpression.getType(), "comparison");
    }

    // UNIT
    @Test
    public void TestComparisonExpressionValue()
    {
        ComparisonExpression comparisonExpression = new ComparisonExpression(null, null);
        Assertions.assertEquals(comparisonExpression.getValue(), null);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionToString()
    {
        ComparisonExpression comparisonExpression = new ComparisonExpression(null, null);
        Assertions.assertEquals(comparisonExpression.toString(), "ComparisonExpression");
    }

    // UNIT
    @Test
    public void TestComparisonExpressionBooleans()
    {
        boolean left = true;
        boolean right = false;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Boolean(left));
            add(new Boolean(right));
        }};
        String operator = "eq";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertEquals((java.lang.Boolean)comparisonExpression.evaluate(null).getValue(), left && right);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionBooleansFailOperator()
    {
        boolean left = true;
        boolean right = false;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Boolean(left));
            add(new Boolean(right));
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertThrows(RuntimeException.class, () -> comparisonExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestComparisonExpressionNumbers()
    {
        Integer left = 1;
        Integer right = 2;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Number(left));
            add(new Number(right));
        }};

        String lt = "lt";
        String gt = "gt";
        String lte = "lte";
        String gte = "gte";
        String eq = "eq";

        ComparisonExpression ltComparisonExpression = new ComparisonExpression(expressions, lt);
        ComparisonExpression gtComparisonExpression = new ComparisonExpression(expressions, gt);
        ComparisonExpression lteComparisonExpression = new ComparisonExpression(expressions, lte);
        ComparisonExpression gteComparisonExpression = new ComparisonExpression(expressions, gte);
        ComparisonExpression eqComparisonExpression = new ComparisonExpression(expressions, eq);

        Assertions.assertEquals((java.lang.Boolean)ltComparisonExpression.evaluate(null).getValue(), left < right);
        Assertions.assertEquals((java.lang.Boolean)gtComparisonExpression.evaluate(null).getValue(), left > right);
        Assertions.assertEquals((java.lang.Boolean)lteComparisonExpression.evaluate(null).getValue(), left <= right);
        Assertions.assertEquals((java.lang.Boolean)gteComparisonExpression.evaluate(null).getValue(), left >= right);
        Assertions.assertEquals((java.lang.Boolean)eqComparisonExpression.evaluate(null).getValue(), left == right);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionInvalidOperands()
    {
        Integer right = 2;

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Player());
            add(new Number(right));
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertThrows(RuntimeException.class, () -> comparisonExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestComparisonExpressionPlayer()
    {
        Player left = new Player();
        Player right = new Player();

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(left);
            add(right);
        }};
        String operator = "eq";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertEquals((java.lang.Boolean)comparisonExpression.evaluate(null).getValue(), left == right);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionPlayerFail()
    {
        Player left = new Player();
        Player right = new Player();

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(left);
            add(right);
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertThrows(RuntimeException.class, () -> comparisonExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestComparisonExpressionString()
    {
        StringLiteral left = new StringLiteral("left");
        StringLiteral right = new StringLiteral("right");

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(left);
            add(right);
        }};
        String operator = "eq";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);

        Assertions.assertEquals((java.lang.Boolean)comparisonExpression.evaluate(null).getValue(), left == right);
    }

    // UNIT
    @Test
    public void TestComparisonExpressionStringFail()
    {
        StringLiteral left = new StringLiteral("left");
        StringLiteral right = new StringLiteral("right");

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(left);
            add(right);
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);
        
        Assertions.assertThrows(RuntimeException.class, () -> comparisonExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestComparisonExpressionNull()
    {
        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(null);
            add(null);
        }};
        String operator = "lt";

        ComparisonExpression comparisonExpression = new ComparisonExpression(expressions, operator);
        
        Assertions.assertThrows(NullPointerException.class, () -> comparisonExpression.evaluate(null));
    }
}
