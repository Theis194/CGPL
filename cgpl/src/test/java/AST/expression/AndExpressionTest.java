package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.SymbolTable;
import com.cgpl.AST.expressions.AndExpression;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.Expression;

public class AndExpressionTest {
    // UNIT
    @Test
    public void TestAndExpressionConstructor()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        AndExpression andExpression = new AndExpression(expressions);

        Assertions.assertEquals(andExpression.getOperands(), expressions);
    }

    // UNIT
    @Test
    public void TestAndExpressionType()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        AndExpression andExpression = new AndExpression(expressions);

        Assertions.assertEquals(andExpression.getType(), "and");
    }

    // UNIT
    @Test
    public void TestAndExpressionToString()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        AndExpression andExpression = new AndExpression(expressions);

        Assertions.assertEquals(andExpression.toString(), "AndExpression");
    }

    // UNIT
    @Test
    public void TestAndExpressionValue()
    {
        List<Expression> expressions = new java.util.ArrayList<>();

        AndExpression andExpression = new AndExpression(expressions);

        Assertions.assertEquals(andExpression.getValue(), null);
    }

    // UNIT
    @Test
    public void TestAndExpressionEvaluate()
    {
        boolean left = true;
        boolean right = true;

        Boolean booleanLeft = new Boolean(left);
        Boolean booleanRight = new Boolean(right);

        List<Expression> expressions = new java.util.ArrayList<>(){{
            add(booleanLeft);
            add(booleanRight);
        }};

        AndExpression andExpression = new AndExpression(expressions);

        Assertions.assertEquals((java.lang.Boolean)(andExpression.evaluate(null).getValue()), left && right);
    }
}
