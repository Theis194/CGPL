package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Card;
import com.cgpl.AST.expressions.ListFunction;

public class ListFunctionTest {
    // UNIT
    @Test
    public void TestPlayerFunctionConstructor()
    {
        String id = "f";
        String type = "drawCard";
        Card card = new Card("Ace", "Hearts");

        ListFunction listFunction = new ListFunction(id, card, type);
        
        Assertions.assertEquals(listFunction.getIdentifier(), id);
        Assertions.assertEquals(listFunction.getType(), type);
        Assertions.assertEquals(listFunction.getValue(), card);
    }

    // UNIT
    @Test
    public void TestPlayerFunctionToString()
    {
        String id = "d";
        String type = "shuffle";
        Card card = new Card("Ace", "Hearts");

        ListFunction listFunction = new ListFunction(id, card, type);

        Assertions.assertEquals(listFunction.toString(), card.toString());
    }

    // UNIT
    @Test
    public void TestPlayerFunctionInstructionType()
    {
        ListFunction listFunction = new ListFunction(null, null, null);
        Assertions.assertEquals(listFunction.getInstructionType(), "ListFunction");
    }

    // UNIT
    @Test
    public void TestPlayerFunctionEvaluate()
    {
        ListFunction listFunction = new ListFunction(null, null, null);
        Assertions.assertEquals(listFunction.evaluate(null), listFunction);
    }

    // TODO: INTEGRATION interpreter tests
}
