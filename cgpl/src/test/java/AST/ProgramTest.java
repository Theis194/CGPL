package AST;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.cgpl.AST.Program;
import com.cgpl.AST.instructions.VarDeclaration;
import com.cgpl.AST.expressions.Number;

public class ProgramTest {
    @Test
    public void testEmptyProgram() {
        Program program = new Program();
        assertEquals(0, program.getInstructions().size());
    }

    @Test
    public void testAddInstruction() {
        Program program = new Program();
        program.addInstruction(new VarDeclaration("x", new Number(0), false));
        assertEquals(1, program.getInstructions().size());
    }

    @Test
    public void testGetScope() {
        Program program = new Program();
        assertNotNull(program.getScope());
    }

    @Test
    public void testGetInstructions() {
        Program program = new Program();
        assertNotNull(program.getInstructions());
    }


}