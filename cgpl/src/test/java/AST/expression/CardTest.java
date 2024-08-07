package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.cgpl.AST.expressions.Card;

public class CardTest {
    // UNIT
    @Test
    public void TestCardConstructor()
    {
        String rank = "Ace";
        String suit = "Hearts";

        Card card = new Card("Ace", "Hearts");

        Assertions.assertEquals(card.getRank(), rank);
        Assertions.assertEquals(card.getSuit(), suit);
    }

    // UNIT
    @Test
    public void TestCardColor()
    {
        String rank = "Ace";
        String hearts = "Hearts";
        String diamonds = "Diamonds";
        String clubs = "Clubs";
        String spades = "Spades";

        String red = "Red";
        String black = "Black";

        Card cardHearts = new Card(rank, hearts);
        Card cardDiamonds = new Card(rank, diamonds);
        Card cardClubs = new Card(rank, clubs);
        Card cardSpades = new Card(rank, spades);

        // Assertions.assertEquals(cardHearts.getColor(), red);
        // Assertions.assertEquals(cardDiamonds.getColor(), red);
        // Assertions.assertEquals(cardClubs.getColor(), black);
        // Assertions.assertEquals(cardSpades.getColor(), black);

        // Assertions.assertEquals(cardHearts.getColor(), cardDiamonds.getColor());
        // Assertions.assertEquals(cardClubs.getColor(), cardSpades.getColor());
    }

    // UNIT
    @Test
    public void TestCardNull()
    {
        // Card card = new Card(null, null);

        // Assertions.assertThrows(NullPointerException.class, () -> card.getColor());
    }

    // UNIT
    @Test
    public void TestCardType()
    {
        String rank = "Ace";
        String suit = "Hearts";

        Card card = new Card(rank, suit);

        Assertions.assertEquals(card.getType(), "card");
    }

    // UNIT
    @Test
    public void TestCardRank()
    {
        String rank = "Ace";
        String suit = "Hearts";

        Card card = new Card(rank, suit);

        Assertions.assertEquals(card.getName(), rank + " of " + suit);
    }

    // UNIT
    @Test
    public void TestCardEvaluate()
    {
        String rank = "Ace";
        String suit = "Hearts";

        Card card = new Card(rank, suit);

        Assertions.assertEquals(card.evaluate(null), card);
    }

    // UNIT
    @Test
    public void TestCardValue()
    {
        String suit = "Hearts";

        Card ace = new Card("Ace", suit);
        Card two = new Card("2", suit);
        Card three = new Card("3", suit);
        Card four = new Card("4", suit);
        Card five = new Card("5", suit);
        Card six = new Card("6", suit);
        Card seven = new Card("7", suit);
        Card eight = new Card("8", suit);
        Card nine = new Card("9", suit);
        Card ten = new Card("10", suit);
        Card jack = new Card("Jack", suit);
        Card queen = new Card("Queen", suit);
        Card king = new Card("King", suit);

        Assertions.assertEquals(ace.getValue(), "1");
        Assertions.assertEquals(two.getValue(), "2");
        Assertions.assertEquals(three.getValue(), "3");
        Assertions.assertEquals(four.getValue(), "4");
        Assertions.assertEquals(five.getValue(), "5");
        Assertions.assertEquals(six.getValue(), "6");
        Assertions.assertEquals(seven.getValue(), "7");
        Assertions.assertEquals(eight.getValue(), "8");
        Assertions.assertEquals(nine.getValue(), "9");
        Assertions.assertEquals(ten.getValue(), "10");
        Assertions.assertEquals(jack.getValue(), "11");
        Assertions.assertEquals(queen.getValue(), "12");
        Assertions.assertEquals(king.getValue(), "13");
    }
}
