package AST.instruction;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.AST.instructions.FunctionCall;

public class FunctionCallTest {
    // UNIT
    @Test
    public void TestFunctionCallConstructor()
    {
        String id = "f";
        List<Expression> expressions = new java.util.ArrayList<>();

        FunctionCall functionCall = new FunctionCall(id, expressions);

        Assertions.assertEquals(functionCall.getIdentifier(), id);
        Assertions.assertEquals(functionCall.getArguments(), expressions);
    }

    // UNIT
    @Test
    public void TestFunctionCallInstructionType()
    {
        FunctionCall functionCall = new FunctionCall(null, null);
        Assertions.assertEquals(functionCall.getInstructionType(), "FunctionCall");
    }

    // UNIT
    @Test
    public void TestFunctionCallType()
    {
        FunctionCall functionCall = new FunctionCall(null, null);
        Assertions.assertEquals(functionCall.getType(), "FunctionCall");
    }

    // UNIT
    @Test
    public void TestFunctionCallGetValue()
    {
        FunctionCall functionCall = new FunctionCall(null, null);
        Assertions.assertEquals(functionCall.getValue(), null);
    }

    // UNIT
    @Test
    public void TestFunctionCallToString()
    {
        String id = "f";
        List<Expression> expressions = new java.util.ArrayList<>();

        FunctionCall functionCall = new FunctionCall(id, expressions);

        String expected = "FunctionCall{" +
        "instructionType='" + functionCall.getInstructionType() + '\'' +
        ", type='" + functionCall.getType() + '\'' +
        ", identifier='" + functionCall.getIdentifier() + '\'' +
        ", arguments=" + functionCall.getArguments() +
        '}';

        Assertions.assertEquals(functionCall.toString(), expected);
    }

    // UNIT
    @Test
    public void TestFunctionCallEvaluate()
    {
        FunctionCall functionCall = new FunctionCall(null, null);
        Assertions.assertEquals(functionCall.evaluate(null), functionCall);
    }
}
