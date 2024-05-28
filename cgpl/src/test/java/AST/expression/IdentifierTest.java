package AST.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.SymbolTable;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Identifier;

public class IdentifierTest {
    // UNIT
    @Test
    public void TestIdentifierConstructor()
    {
        String id = "x";
        Identifier identifier = new Identifier(id);

        Assertions.assertEquals(identifier.getIdentifier(), id);
    }

    // UNIT
    @Test
    public void TestIdentifierType()
    {
        String id = "x";
        Identifier identifier = new Identifier(id);

        Assertions.assertEquals(identifier.getType(), "identifier");
    }

    // UNIT
    @Test
    public void TestIdentifierValue()
    {
        String id = "x";
        Identifier identifier = new Identifier(id);

        Assertions.assertEquals(identifier.getValue(), null);
    }

    // UNIT
    @Test
    public void TestIdentifierToString()
    {
        String id = "x";
        Identifier identifier = new Identifier(id);

        Assertions.assertEquals(identifier.toString(), id);
        Assertions.assertEquals(identifier.toString(), identifier.getIdentifier());
    }

    // INTEGRATION
    @Test
    public void TestIdentifierEvaluate()
    {
        SymbolTable symbolTable = new SymbolTable();
        symbolTable.pushScope(new Scope(true));

        String id = "x";
        Identifier identifier = new Identifier(id);

        symbolTable.addSymbol(id, identifier, false);

        Assertions.assertEquals(identifier.evaluate(symbolTable), identifier);
    }
}
