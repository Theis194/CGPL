package AST.expression;

import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.LinkedListLiteral;
import com.cgpl.AST.expressions.StringLiteral;

public class LinkedListLiteralTest {
    // UNIT
    @Test
    public void TestLinkedListLiteralConstructor()
    {
        LinkedList<Expression> list = new java.util.LinkedList<>();

        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(list);

        Assertions.assertEquals(linkedListLiteral.getList(), list);
        Assertions.assertEquals(linkedListLiteral.getValue(), linkedListLiteral.getList());
    }

    // UNIT
    @Test
    public void TestLinkedListlIteralType()
    {
        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(null);
        Assertions.assertEquals(linkedListLiteral.getType(), "list");
    }

    // UNIT
    @Test
    public void TestLinkedListLiteralAdd()
    {
        LinkedList<Expression> list = new java.util.LinkedList<>();

        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(list);

        String value = "value";
        StringLiteral stringLiteral = new StringLiteral(value);

        linkedListLiteral.add(stringLiteral);

        Assertions.assertEquals(linkedListLiteral.get(0), stringLiteral);
    }

    // UNIT
    @Test
    public void TestLinkedListLiteralSize()
    {
        String value = "value";
        StringLiteral stringLiteral = new StringLiteral(value);

        LinkedList<Expression> list = new java.util.LinkedList<>(){{
            add(stringLiteral);
            add(stringLiteral);
            add(stringLiteral);
            add(stringLiteral);
            add(stringLiteral);
            add(stringLiteral);
        }};

        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(list);

        Assertions.assertEquals(linkedListLiteral.size(), list.size());
    }

    // UNIT
    @Test
    public void TestLinkedListLiteralEvaluate()
    {
        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(null);
        Assertions.assertEquals(linkedListLiteral.evaluate(null), linkedListLiteral);
    }

    // UNIT
    @Test
    public void TestLinkedListLiteralRemove()
    {
        LinkedList<Expression> list = new java.util.LinkedList<>();

        LinkedListLiteral linkedListLiteral = new LinkedListLiteral(list);

        String value = "value";
        StringLiteral stringLiteral = new StringLiteral(value);

        linkedListLiteral.add(stringLiteral);

        Assertions.assertEquals(linkedListLiteral.get(0), stringLiteral);

        linkedListLiteral.remove();

        Assertions.assertEquals(linkedListLiteral.size(), 0);

        linkedListLiteral.add(stringLiteral);
        linkedListLiteral.add(stringLiteral);

        linkedListLiteral.remove(1);

        Assertions.assertEquals(linkedListLiteral.get(0), stringLiteral);
    }
}
