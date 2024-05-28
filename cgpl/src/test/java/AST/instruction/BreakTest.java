package AST.instruction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.instructions.Break;

public class BreakTest {
    // UNIT
    @Test
    public void TestBreakType()
    {
        Break _break = new Break();

        Assertions.assertEquals(_break.getInstructionType(), "Break");
    }
}
