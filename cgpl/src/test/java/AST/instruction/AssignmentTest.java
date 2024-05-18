package AST.instruction;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.Assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

    @Test
    public void testGetIdentifier() {
        Expression value = new Number(2);
        Assignment assignment = new Assignment("x", value);
        assertEquals("x", assignment.getIdentifier());
    }

    @Test
    public void testGetValue() {
        Expression value = new Number(2);
        Assignment assignment = new Assignment("x", value);
        assertEquals(value, assignment.getValue());
    }

    @Test
    public void testGetInstructionType() {
        Expression value = new Number(2);
        Assignment assignment = new Assignment("x", value);
        assertEquals("Assignment", assignment.getInstructionType());
    }
}

