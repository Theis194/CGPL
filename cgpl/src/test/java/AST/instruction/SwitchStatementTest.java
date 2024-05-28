package AST.instruction;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.CaseStatement;
import com.cgpl.AST.instructions.SwitchStatement;

public class SwitchStatementTest {
    // UNIT
    @Test
    public void TestSwitchStatementConstructor()
    {
        Integer value = 1;
        Number number = new Number(value);
        List<CaseStatement> cases = new java.util.ArrayList<>();

        SwitchStatement switchStatement = new SwitchStatement(number, cases);

        Assertions.assertEquals(switchStatement.getSwitchValue().getValue(), value);
        Assertions.assertEquals(switchStatement.getCases(), cases);
    }

    // UNIT
    @Test
    public void TestSwitchStatementInstructionType()
    {
        SwitchStatement switchStatement = new SwitchStatement(null, null);
        Assertions.assertEquals(switchStatement.getInstructionType(), "SwitchStatement");
    }
}
