package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.DeckFunction;
import com.cgpl.AST.expressions.Card;

public class DeckFunctionTest {
    // UNIT
    @Test
    public void TestDeckFunctionConstructor()
    {
        String id = "d";
        String type = "shuffle";
        Card card = new Card("Ace", "Hearts");

        DeckFunction deckFunction = new DeckFunction(id, card, type);

        Assertions.assertEquals(deckFunction.getIdentifier(), id);
        Assertions.assertEquals(deckFunction.getType(), type);
        Assertions.assertEquals(deckFunction.getValue(), card);
    }

    // UNIT
    @Test
    public void TestDeckFunctionToString()
    {
        String id = "d";
        String type = "shuffle";
        Card card = new Card("Ace", "Hearts");

        DeckFunction deckFunction = new DeckFunction(id, card, type);

        Assertions.assertEquals(deckFunction.toString(), card.toString());
    }

    // UNIT
    @Test
    public void TestDeckFunctionInstructionType()
    {
        DeckFunction deckFunction = new DeckFunction(null, null, null);
        Assertions.assertEquals(deckFunction.getInstructionType(), "DeckFunction");
    }

    // UNIT
    @Test
    public void TestDeckFunctionEvaluate()
    {
        DeckFunction deckFunction = new DeckFunction(null, null, null);
        Assertions.assertEquals(deckFunction.evaluate(null), deckFunction);
    }

    // TODO: INTEGRATION interpreter tests
}
