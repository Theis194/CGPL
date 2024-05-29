package AST.instruction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.VarDeclaration;

public class VarDeclarationTest {
    // UNIT
    @Test
    public void TestVarDeclarationConstructor()
    {
        Integer value = 1;
        String id = "x";
        boolean isConst = false;
        Number number = new Number(value);

        VarDeclaration varDeclaration = new VarDeclaration(id, number, isConst);

        Assertions.assertEquals(varDeclaration.getIdentifier(), id);
        Assertions.assertEquals(varDeclaration.getValue().getValue(), value);
        Assertions.assertEquals(varDeclaration.isConst(), isConst);
    }

    // UNIT
    @Test
    public void TestVarDeclarationType()
    {
        VarDeclaration varDeclaration = new VarDeclaration(null, null, false);
        Assertions.assertEquals(varDeclaration.getType(), "VarDeclaration");
    }

    // UNIT
    @Test
    public void TestVarDeclarationInstructionType()
    {
        VarDeclaration varDeclaration = new VarDeclaration(null, null, false);
        Assertions.assertEquals(varDeclaration.getInstructionType(), "VarDeclaration");
    }
}
