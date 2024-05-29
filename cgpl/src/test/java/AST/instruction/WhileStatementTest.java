package AST.instruction;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.WhileStatement;

public class WhileStatementTest {
    // UNIT
    @Test
    public void TestWhileStatementConstructor()
    {
        Scope scope = new Scope(true);
        List<Instruction> instructions = new java.util.ArrayList<>();
        
        boolean value = true;
        Boolean bool = new Boolean(value);

        WhileStatement whileStatement = new WhileStatement(bool, instructions, scope);

        Assertions.assertEquals(whileStatement.getBody(), instructions);
        Assertions.assertEquals(whileStatement.getCondition().getValue(), value);
        Assertions.assertEquals(whileStatement.getScope(), scope);
    }

    // UNIT
    @Test
    public void TestWihleStatementInstructionType()
    {
        WhileStatement whileStatement = new WhileStatement(null, null, null);
        Assertions.assertEquals(whileStatement.getInstructionType(), "WhileStatement");
    }
}
