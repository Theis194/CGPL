package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.PlayerFunction;
import com.cgpl.AST.expressions.Card;

public class PlayerFunctionTest {
    // UNIT
    @Test
    public void TestPlayerFunctionConstructor()
    {
        String id = "f";
        String type = "drawCard";
        Card card = new Card("Ace", "Hearts");

        PlayerFunction playerFunction = new PlayerFunction(id, card, type);
        
        Assertions.assertEquals(playerFunction.getIdentifier(), id);
        Assertions.assertEquals(playerFunction.getType(), type);
        Assertions.assertEquals(playerFunction.getValue(), card);
    }

    // UNIT
    @Test
    public void TestPlayerFunctionToString()
    {
        String id = "d";
        String type = "shuffle";
        Card card = new Card("Ace", "Hearts");

        PlayerFunction playerFunction = new PlayerFunction(id, card, type);

        Assertions.assertEquals(playerFunction.toString(), card.toString());
    }

    // UNIT
    @Test
    public void TestPlayerFunctionInstructionType()
    {
        PlayerFunction playerFunction = new PlayerFunction(null, null, null);
        Assertions.assertEquals(playerFunction.getInstructionType(), "PlayerFunction");
    }

    // UNIT
    @Test
    public void TestPlayerFunctionEvaluate()
    {
        PlayerFunction playerFunction = new PlayerFunction(null, null, null);
        Assertions.assertEquals(playerFunction.evaluate(null), playerFunction);
    }

    // TODO: INTEGRATION interpreter tests
}
