package AST;

import org.junit.jupiter.api.Test;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.VarDeclaration;
import com.cgpl.visitors.ExpressionVisitor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ScopeTest {
    @Test
    public void testAddVariable() {
        Scope scope = new Scope(true);
        scope.addVariable("x", new Number(1));

        List<Instruction> lst = new ArrayList<>();
        lst.add(new VarDeclaration("y", new Number(1), false));
        scope.addVariable(lst);

        assertTrue(scope.isVariable("x"));
        assertTrue(scope.isVariable("y"));
    }

    @Test
    public void testAddVariableFail() {
        Scope scope = new Scope(true);
        scope.addFunction("f", new Number(1)); // Without the "false" flag
        scope.addFunction("g", new Number(2), true) // With the "true" flag
        assertFalse(scope.isVariable("f"));
        assertFalse(scope.isVariable("g"));
    }

    @Test
    public void testAddDuplicateVariable1() {
        Scope scope = new Scope();
        scope.addVariable("x", new Number(1), false);
        assertThrows(RuntimeException.class, () -> scope.addVariable("x", new Number(2), false));
    }

    @Test
    public void testAddDuplicateVariable2() {
        Scope scope = new Scope();
        List<Instruction> lst = new ArrayList<>();
        lst.add(new varDeclaration("x", new Number(1), false));
        scope.addVariable(lst);
        assertThrows(RuntimeException.class, () -> scope.addVariable(lst));
    }

    @Test
    public void testAddDuplicateVariable3() {
        Scope scope = new Scope();
        List<Instruction> lst = new ArrayList<>();
        lst.add(new varDeclaration("x", new Number(1), false));
        scope.addVariable(lst);
        assertThrows(RuntimeException.class, () -> scope.addVariable("x", new Number(2), false));
    }

    @Test
    public void testAddConstant() {
        Scope scope = new Scope();
        scope.addConstant("NINE", new Number(9), true);
        assertTrue(scope.isConstant("NINE"));
    }

    @Test
    public void testAddConstantFail() {
        Scope scope = new Scope();
        scope.addFunction("f", new Number(1)); // Without the "true" flag
        scope.addFunction("g", new Number(2), false) // With the "false" flag
        assertFalse(scope.isConstant("f"));
        assertFalse(scope.isConstant("g"));
    }

    @Test
    public void testAddFunction() {
        Scope scope = new Scope();
        scope.addFunction("f", new Function());
        assertTrue(scope.isFunction("f"));
    }

    @Test
    public void testUpdateVariable() {
        Scope scope = new Scope();
        scope.addVariable("x", new Number(1), false);
        scope.updateVariable("x", new Number(2));
        assertEquals(new Number(2), scope.getVariableValue("x"));
    }

    @Test
    public void testUpdateVariableFail() {
        Scope scope = new Scope();
        scope.addConstant("x", new Number(1), true);
        assertThrows(RuntimeException.class, () -> scope.updateVariable("x", new Number(2))); // Cannot modify constant
        assertThrows(RuntimeException.class, () -> scope.updateVariable("y", new Number(2))); // Undefined variable
    }

}