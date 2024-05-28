package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.SymbolTable;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Card;
import com.cgpl.AST.expressions.CardFunction;
import com.cgpl.AST.expressions.StringLiteral;
import com.cgpl.AST.expressions.Number;

public class CardFunctionTest {
    // UNIT
    @Test
    public void TestCardFunctionConstructor()
    {
        String id = "c";
        String type = "value";

        CardFunction cardFunction = new CardFunction(id, type);

        Assertions.assertEquals(cardFunction.getValue(), id);
        Assertions.assertEquals(cardFunction.getType(), type);
        Assertions.assertEquals(cardFunction.getIdentifier(), cardFunction.getValue());
    }

    // UNIT
    @Test
    public void TestCardFunctionToString()
    {
        String id = "c";
        String type = "value";

        CardFunction cardFunction = new CardFunction(id, type);

        Assertions.assertEquals(cardFunction.toString(), id + " of " + type);
    }

    // UNIT
    @Test
    public void TestCardFunctionInstructionType()
    {
        CardFunction cardFunction = new CardFunction(null, null);
        Assertions.assertEquals(cardFunction.getInstructionType(), "CardFunction");
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionMissingSymbol()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String id = "c";
        String type = "value";

        CardFunction cardFunction = new CardFunction(id, type);
        symbolTable.pushScope(scope);

        Assertions.assertThrows(IllegalArgumentException.class, () -> cardFunction.evaluate(symbolTable));
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionNotCard()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String id = "c";
        String type = "value";

        Number num = new Number(1);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, num, false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> cardFunction.evaluate(symbolTable));
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionInvalidType()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String id = "c";
        String type = "N/A";

        Number num = new Number(1);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, num, false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> cardFunction.evaluate(symbolTable));
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionValue()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String rank = "Ace";
        String suit = "Hearts";
        String id = "c";
        String type = "value";

        Card card = new Card(rank, suit);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, card, false);

        Assertions.assertEquals((java.lang.Number)cardFunction.evaluate(symbolTable).getValue(), card.convertValue());
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionSuit()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String rank = "Ace";
        String suit = "Hearts";
        String id = "c";
        String type = "suit";

        Card card = new Card(rank, suit);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, card, false);

        Assertions.assertEquals(((StringLiteral)cardFunction.evaluate(symbolTable)).getValue(), card.getSuit());
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionColor()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String rank = "Ace";
        String suit = "Hearts";
        String id = "c";
        String type = "color";

        Card card = new Card(rank, suit);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, card, false);

        Assertions.assertEquals(((StringLiteral)cardFunction.evaluate(symbolTable)).getValue(), card.getColor());
    }

    // INTEGRATION
    @Test
    public void TestCardFunctionName()
    {
        Scope scope = new Scope(true);
        SymbolTable symbolTable = new SymbolTable();

        String rank = "Ace";
        String suit = "Hearts";
        String id = "c";
        String type = "name";

        Card card = new Card(rank, suit);

        CardFunction cardFunction = new CardFunction(id, type);

        symbolTable.pushScope(scope);
        symbolTable.addSymbol(id, card, false);

        Assertions.assertEquals(((StringLiteral)cardFunction.evaluate(symbolTable)).getValue(), card.getName());
    }
}
