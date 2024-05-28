package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.OrExpression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Number;

public class OrExpressionTest {
    // UNIT
    @Test
    public void TestOrExpressionConstructor()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertEquals(orExpression.getOperands(), expressions);
    }

    // UNIT
    @Test
    public void TestOrExpressionType()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertEquals(orExpression.getType(), "or");
    }

    // UNIT
    @Test
    public void TestOrExpressionToString()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertEquals(orExpression.toString(), "OrExpression");
    }

    // UNIT
    @Test
    public void TestOrExpressionValue()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertEquals(orExpression.getValue(), null);
    }

    // UNIT
    @Test
    public void TestOrExpressionNull()
    {
        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(null);
            add(null);
        }};

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertThrows(NullPointerException.class, () -> orExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestOrExpressionNonBooleanFail()
    {
        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(new Number(1));
            add(new Number(2));
        }};

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertThrows(RuntimeException.class, () -> orExpression.evaluate(null));
    }

    // UNIT
    @Test
    public void TestOrExpressionEvaluate()
    {
        boolean left = true;
        boolean right = false;

        Boolean booleanLeft = new Boolean(left);
        Boolean booleanRight = new Boolean(right);

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(booleanLeft);
            add(booleanRight);
        }};

        OrExpression orExpression = new OrExpression(expressions);

        Assertions.assertEquals((java.lang.Boolean)(orExpression.evaluate(null).getValue()), left || right);
    }
}
