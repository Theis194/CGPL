package AST.expression;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cgpl.AST.expressions.Expression;
import com.cgpl.SymbolTable;
import com.cgpl.AST.Scope;
import com.cgpl.AST.expressions.Boolean;
import com.cgpl.AST.expressions.NotExpression;
import com.cgpl.AST.expressions.Number;
import com.cgpl.AST.instructions.FunctionCall;
import com.cgpl.AST.instructions.Instruction;
import com.cgpl.AST.instructions.Return;
import com.cgpl.AST.instructions.VarDeclaration;
import com.cgpl.AST.instructions.Function;

public class NotExpressionTest {
    // UNIT
    @Test
    public void TestNotExpressionConstructor()
    {
        boolean bool = true;
        Boolean expression = new Boolean(bool);

        NotExpression notexpExpression = new NotExpression(expression);

        Assertions.assertEquals(notexpExpression.getExpression(), expression);
    }

    // UNIT
    @Test
    public void TestNotExpressionType()
    {
        NotExpression notexpExpression = new NotExpression(null);
        Assertions.assertEquals(notexpExpression.getType(), "not");
    }

    // UNIT
    @Test
    public void TestNotExpressionToString()
    {
        boolean bool = true;
        Boolean expression = new Boolean(bool);

        NotExpression notexpExpression = new NotExpression(expression);

        Assertions.assertEquals(notexpExpression.toString(), "not" + expression.toString());
    }

    // UNIT
    @Test
    public void TestNotExpressionValue()
    {
        NotExpression notexpExpression = new NotExpression(null);
        Assertions.assertEquals(notexpExpression.getValue(), null);
    }
    
    // UNIT
    @Test
    public void TestNotExpressionBoolean()
    {
        boolean value = true;
        Boolean expression = new Boolean(value);

        NotExpression notexpExpression = new NotExpression(expression);

        Assertions.assertEquals((java.lang.Boolean)notexpExpression.evaluate(null).getValue(), !value);
    }

    // INTEGRATION
    @Test
    public void TestNotExpressionFunctionCall()
    {
        boolean value = true;
        Boolean bool = new Boolean(value);

        SymbolTable symbolTable = new SymbolTable();
        Scope scope = new Scope(true);

        String id = "f";
        List<Expression> expressions = new java.util.ArrayList<>();
        List<Instruction> instructions = new java.util.ArrayList<>(){{
            add(new Return(bool));
        }};

        Function function = new Function(id, expressions, instructions, new Scope(scope));
        FunctionCall functionCall = new FunctionCall(id, expressions);
        NotExpression notExpression = new NotExpression(functionCall);

        scope.addFunction(id, function);
        symbolTable.pushScope(scope);

        Assertions.assertEquals((java.lang.Boolean)notExpression.evaluate(symbolTable).getValue(), !value);
    }
}
