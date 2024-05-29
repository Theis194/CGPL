package com.cgpl.AST.instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Expression;

public class FunctionTest {

    // UNIT
    @Test
    public void testGetIdentifier() {
        String identifier = "myFunction";
        List<Expression> arguments = new ArrayList<>();
        List<Instruction> functionBody = new ArrayList<>();
        Scope scope = new Scope();

        Function function = new Function(identifier, arguments, functionBody, scope);

        Assertions.assertEquals(identifier, function.getIdentifier());
    }

    // UNIT
    @Test
    public void testGetArguments() {
        String identifier = "myFunction";
        List<Expression> arguments = new ArrayList<>();
        arguments.add(new Expression());
        arguments.add(new Expression());
        List<Instruction> functionBody = new ArrayList<>();
        Scope scope = new Scope();

        Function function = new Function(identifier, arguments, functionBody, scope);

        Assertions.assertEquals(arguments, function.getArguments());
    }

    // UNIT
    @Test
    public void testGetFunctionBody() {
        String identifier = "myFunction";
        List<Expression> arguments = new ArrayList<>();
        List<Instruction> functionBody = new ArrayList<>();
        functionBody.add(new Instruction());
        functionBody.add(new Instruction());
        Scope scope = new Scope();

        Function function = new Function(identifier, arguments, functionBody, scope);

        Assertions.assertEquals(functionBody, function.getFunctionBody());
    }

    // UNIT
    @Test
    public void testGetScope() {
        String identifier = "myFunction";
        List<Expression> arguments = new ArrayList<>();
        List<Instruction> functionBody = new ArrayList<>();
        Scope scope = new Scope();

        Function function = new Function(identifier, arguments, functionBody, scope);

        Assertions.assertEquals(scope, function.getScope());
    }

    // UNIT
    @Test
    public void testGetInstructionType() {
        String identifier = "myFunction";
        List<Expression> arguments = new ArrayList<>();
        List<Instruction> functionBody = new ArrayList<>();
        Scope scope = new Scope();

        Function function = new Function(identifier, arguments, functionBody, scope);

        Assertions.assertEquals("Function", function.getInstructionType());
    }
}