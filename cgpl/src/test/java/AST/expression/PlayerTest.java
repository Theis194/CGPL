package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Card;
import com.cgpl.AST.expressions.Player;

public class PlayerTest {
    // UNIT
    @Test
    public void TestPlayerConstruct()
    {
        Player player = new Player();
        Assertions.assertEquals(player.getScore(), 0);
        Assertions.assertTrue(player.getHand().isEmpty());
    }

    // UNIT
    @Test
    public void TestPlayerType()
    {
        Player player = new Player();

        Assertions.assertEquals(player.getType(), "player");
    }

    // UNIT
    @Test
    public void TestPlayerIncreaseScore()
    {
        int score = 10;

        Player player = new Player();

        player.increaseScore(score);
        Assertions.assertEquals(player.getScore(), score);
    }

    // UNIT
    @Test
    public void TestPlayerDecreaseScore()
    {
        int score = 10;

        Player player = new Player();

        player.decreaseScore(score);
        Assertions.assertEquals(player.getScore(), -score);
    }

    // UNIT
    @Test
    public void TestPlayerEvaluate()
    {
        Player player = new Player();

        Assertions.assertEquals(player.evaluate(null), player);
    }

    // UNIT
    @Test
    public void TestPlayerHand()
    {
        Card card = new Card("Ace", "Hearts");

        Player player = new Player();
        player.drawCard(card);

        Assertions.assertEquals(player.getHand().getFirst(), card);

        player.playCard(0);

        Assertions.assertTrue(player.getHand().isEmpty());
    }

    // UNIT
    @Test
    public void TestPlayerValue()
    {
        Player player = new Player();

        Assertions.assertEquals(player.getHand(), player.getValue());
    }

    // UNIT
    @Test
    public void TestPlayerReset()
    {
        int score = 10;
        Card card = new Card("Ace", "Hearts");
        Player player = new Player();

        player.increaseScore(score);
        player.drawCard(card);

        player.reset();

        Assertions.assertEquals(player.getScore(), 0);
        Assertions.assertTrue(player.getHand().isEmpty());
    }
}
