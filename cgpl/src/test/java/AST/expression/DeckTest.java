package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Deck;
import com.cgpl.AST.expressions.Card;

public class DeckTest {
    public final static int DECK_SIZE = 0;
    public final static int STANDARD_DECK_SIZE = 52;

    // UNIT
    @Test
    public void TestDeckConstructor()
    {
        Deck deck = new Deck();

        Assertions.assertEquals(deck.getCards().size(), DECK_SIZE);
    }

    // UNIT
    @Test
    public void TestDeckAddCard()
    {
        String name = "Ace";
        String suit = "Hearts";
        
        Card card = new Card(name, suit);
        Deck deck = new Deck();

        deck.addCard(card);

        Assertions.assertEquals(deck.getCards().firstElement().toString(), card.toString());
    }

    // UNIT
    @Test
    public void TestDeckRemoveCard()
    {
        String name = "Ace";
        String suit = "Hearts";
        
        Card card = new Card(name, suit);
        Deck deck = new Deck();

        deck.clear();
        deck.addCard(card);

        Assertions.assertEquals(deck.getCards().firstElement().toString(), card.toString());

        deck.remove(0);

        Assertions.assertTrue(deck.getCards().empty());
    }

    // UNIT
    @Test
    public void TestDeckDrawCard()
    {
        String name = "Ace";
        String suit = "Hearts";
        
        Card card = new Card(name, suit);
        Deck deck = new Deck();

        deck.addCard(card);

        Assertions.assertEquals(deck.drawCard(), card);
    }
    
    // UNIT
    @Test
    public void TestDeckSize()
    {
        String name = "Ace";
        String suit = "Hearts";
        
        Card card = new Card(name, suit);
        Deck deck = new Deck();

        deck.addCard(card);

        Assertions.assertEquals(deck.getCards().size(), DECK_SIZE + 1);
    }

    // UNIT
    @Test
    public void TestDeckType()
    {
        Deck deck = new Deck();

        Assertions.assertEquals(deck.getType(), "deck");
    }

    // UNIT
    @Test
    public void TestDeckValue()
    {
        Deck deck = new Deck();

        Assertions.assertEquals(deck.getValue(), deck.getCards());
    }

    // UNIT
    @Test
    public void TestDeckClear()
    {
        Deck deck = new Deck();

        deck.clear();

        Assertions.assertTrue(deck.getCards().empty());
    }

    // UNIT
    @Test
    public void TestDeckFillDeck()
    {
        Deck deck = new Deck();

        deck.fillDeckFrench();

        Assertions.assertEquals(deck.size(), STANDARD_DECK_SIZE);
    }

    // UNIT
    @Test
    public void TestDeckToString()
    {
        Deck deck = new Deck();

        Assertions.assertEquals(deck.toString(), "deck");
    }

    // UNIT
    @Test
    public void TestDeckEvaluate()
    {
        Deck deck = new Deck();

        Assertions.assertEquals(deck.evaluate(null), deck);
    }
}
