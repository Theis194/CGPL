package AST.instruction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.StringLiteral;
import com.cgpl.AST.instructions.Return;

public class ReturnTest {
    // UNIT
    @Test
    public void TestReturnConstructor()
    {
        String value = "value";
        StringLiteral stringLiteral = new StringLiteral(value);

        Return ret = new Return(stringLiteral);

        Assertions.assertEquals(((StringLiteral)ret.getValue()).getValue(), value);
    }

    // UNIT
    @Test
    public void TestReturnInstructionType()
    {
        Return ret = new Return(null);

        Assertions.assertEquals(ret.getInstructionType(), "Return");
    }
}
