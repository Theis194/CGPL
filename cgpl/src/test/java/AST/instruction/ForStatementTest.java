package AST.instruction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.Assignment;
import com.cgpl.AST.instructions.ForStatement;
import com.cgpl.AST.instructions.VarDeclaration;

public class ForStatementTest {

    // Test case for the first constructor and getters
    @Test
    public void testForEachStatement() {
        // Create a new number expression
        Expression iterable = new Number(2);
        // Create a new scope
        Scope scope = new Scope(true);
        // Create a new ForStatement
        ForStatement forStatement = new ForStatement("x", iterable, Arrays.asList(), scope);
        
        // Assert that the identifier, iterable, instruction type, and scope are as expected
        assertEquals("x", forStatement.getIdentifier());
        assertEquals(iterable, forStatement.getIterable());
        assertEquals("ForEachStatement", forStatement.getInstructionType());
        assertEquals(scope, forStatement.getScope());
    }

    // Test case for the second constructor and getters
    @Test
    public void testForStatement() {
        // Create a new number expression
        Expression condition = new Number(2);
        // Create a new VarDeclaration
        VarDeclaration varDeclaration = new VarDeclaration("x", new Number(0), false);
        // Create a new Instruction
        Instruction iteration = new Assignment("x", new Number(1));
        // Create a new scope
        Scope scope = new Scope(true);
        // Create a new ForStatement
        ForStatement forStatement = new ForStatement(varDeclaration, condition, iteration, Arrays.asList(), scope);
        
        // Assert that the varDeclaration, condition, iteration, instruction type, and scope are as expected
        assertEquals(varDeclaration, forStatement.getVarDeclaration());
        assertEquals(condition, forStatement.getCondition());
        assertEquals(iteration, forStatement.getIteration());
        assertEquals("ForStatement", forStatement.getInstructionType());
        assertEquals(scope, forStatement.getScope());
    }
}