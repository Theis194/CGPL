package AST.instruction;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.Assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// This is a test class for Assignment
public class AssignmentTest {
    // UNIT
    // Test case for getIdentifier method
    @Test
    public void testGetIdentifier() {
        // Create a new number expression
        Expression value = new Number(2);
        // Create a new assignment with identifier "x" and value as the number expression
        Assignment assignment = new Assignment("x", value);
        // Assert that the identifier of the assignment is "x"
        assertEquals("x", assignment.getIdentifier());
    }

    // UNIT
    // Test case for getValue method
    @Test
    public void testGetValue() {
        // Create a new number expression
        Expression value = new Number(2);
        // Create a new assignment with identifier "x" and value as the number expression
        Assignment assignment = new Assignment("x", value);
        // Assert that the value of the assignment is the number expression
        assertEquals(value, assignment.getValue());
    }

    // UNIT
    // Test case for getInstructionType method
    @Test
    public void testGetInstructionType() {
        // Create a new number expression
        Expression value = new Number(2);
        // Create a new assignment with identifier "x" and value as the number expression
        Assignment assignment = new Assignment("x", value);
        // Assert that the instruction type of the assignment is "Assignment"
        assertEquals("Assignment", assignment.getInstructionType());
    }
}