package AST.instruction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.StringLiteral;
import com.cgpl.AST.instructions.Print;

public class PrintTest {
    // UNIT
    @Test
    public void TestPrintConstructor()
    {
        String value = "value";
        StringLiteral stringLiteral = new StringLiteral(value);
        Print print = new Print(stringLiteral);

        Assertions.assertEquals(((StringLiteral)print.getValue()).getValue(), value);
    }

    // UNIT
    @Test
    public void TestPrintInstructionType()
    {
        Print print = new Print(null);
        Assertions.assertEquals(print.getInstructionType(), "Print");
    }
}
