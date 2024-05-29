package AST;

import java.beans.Expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.SymbolTable;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Boolean;

public class SymbolTableTest {
    // UNIT
    @Test
    public void TestSymbolTableConstructor()
    {
        SymbolTable symbolTable = new SymbolTable();

        Assertions.assertEquals(symbolTable.size(), 0);
    }

    // UNIT
    @Test
    public void TestSymbolTablePushScope()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);

        Assertions.assertEquals(symbolTable.getCurrentScope(), scope);
    }

    // UNIT
    @Test
    public void TestSymbolTablePopScope()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);
        symbolTable.pushScope(scope);

        Assertions.assertEquals(symbolTable.size(), 2);
        Assertions.assertEquals(symbolTable.getCurrentScope(), scope);

        symbolTable.popScope();
        symbolTable.popScope();

        // Cannot pop initial scope
        Assertions.assertEquals(symbolTable.size(), 1);
    }

    // UNIT
    @Test
    public void TestSymbolTableSize()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);

        Assertions.assertEquals(symbolTable.size(), 1);
    }

    // UNIT
    @Test
    public void TestSymbolAddSymbol()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);

        String id = "x";

        boolean isConst = false;
        boolean value = true;
        Boolean bool = new Boolean(value);

        symbolTable.addSymbol(id, bool, isConst);

        Assertions.assertEquals(((Boolean)symbolTable.getSymbol(id)).getValue(), value);
    }

    // UNIT
    @Test
    public void TestSymbolTableUpdateSymbol()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);

        String id = "x";

        boolean isConst = false;
        boolean value = true;
        Boolean bool = new Boolean(value);

        symbolTable.addSymbol(id, bool, isConst);
        Assertions.assertEquals(((Boolean)symbolTable.getSymbol(id)).getValue(), value);

        Boolean newBool = new Boolean(!value);
        symbolTable.updateSymbol(id, newBool);

        Assertions.assertEquals(((Boolean)symbolTable.getSymbol(id)).getValue(), !value);
    }

    // UNIT
    @Test
    public void TestSymbolTableHasSymbol()
    {
        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        symbolTable.pushScope(scope);

        String id = "x";
        String idInvalid = "N/A";

        boolean isConst = false;
        boolean value = true;
        Boolean bool = new Boolean(value);

        symbolTable.addSymbol(id, bool, isConst);

        Assertions.assertEquals(symbolTable.hasSymbol(id), true);
        Assertions.assertEquals(symbolTable.hasSymbol(idInvalid), false);
    }
}
