import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.cgpl.AST;

public class ProgramTest {
    @test
    public void testEmptyProgram() {
        Program program = new Program();
        assertEquals(0, program.getInstructions().size());
    }

    @test
    public void testAddInstruction() {
        Program program = new Program();
        program.addInstruction(new AST.instructions.Instruction());
        assertEquals(1, program.getInstructions().size());
    }

    @test
    public void testGetScope() {
        Program program = new Program();
        assertNotNull(program.getScope());
    }

    @test
    public void testGetInstructions() {
        Program program = new Program();
        assertNotNull(program.getInstructions());
    }


}