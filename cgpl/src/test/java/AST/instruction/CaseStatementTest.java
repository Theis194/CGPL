package AST.instruction;

import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.*;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CaseStatementTest {

    // UNIT
    @Test
    public void testGetCaseValue() {
        // Create a test case value
        Expression caseValue = new Number(2);

        // Create a CaseStatement instance
        CaseStatement caseStatement = new CaseStatement(caseValue, null);

        // Test the getCaseValue() method
        assertEquals(caseValue, caseStatement.getCaseValue());
    }

    // UNIT
    @Test
    public void testGetInstruction() {
        // Create a test instruction list
        List<Instruction> instructionList = new ArrayList<>();
        // Add test instructions to the list

        // Create a CaseStatement instance
        CaseStatement caseStatement = new CaseStatement(null, instructionList);

        // Test the getInstruction() method
        assertEquals(instructionList, caseStatement.getInstruction());
    }

    // UNIT
    @Test
    public void testGetScope() {
        // Create a CaseStatement instance
        CaseStatement caseStatement = new CaseStatement(null, null);

        // Test the getScope() method
        assertNotNull(caseStatement.getScope());
    }

    @Test
    public void testGetInstructionType() {
        // Create a CaseStatement instance
        CaseStatement caseStatement = new CaseStatement(null, null);

        // Test the getInstructionType() method
        assertEquals("CaseStatement", caseStatement.getInstructionType());
    }
}
