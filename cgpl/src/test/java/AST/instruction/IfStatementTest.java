package AST.instruction;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.instructions.IfStatment;
import com.cgpl.AST.instructions.Instruction;

public class IfStatementTest {
    // UNIT
    @Test
    public void TestIfStatementConstructor()
    {
        Scope scope = new Scope(true);

        boolean value = true;
        Boolean condBoolean = new Boolean(value);
        List<Instruction> instructions = new java.util.ArrayList<>();

        IfStatment ifStatment = new IfStatment(condBoolean, instructions, instructions, scope, scope);

        Assertions.assertEquals(ifStatment.getCondition(), condBoolean);
        Assertions.assertEquals(ifStatment.getThenBody(), instructions);
        Assertions.assertEquals(ifStatment.getElseBody(), instructions);
        Assertions.assertEquals(ifStatment.getThenScope(), scope);
        Assertions.assertEquals(ifStatment.getElseScope(), scope);
    }

    // UNIT
    @Test
    public void TsetIfStatementInstructionType()
    {
        IfStatment ifStatment = new IfStatment(null, null, null, null, null);
        Assertions.assertEquals(ifStatment.getInstructionType(), "IfStatment");
    }
}
