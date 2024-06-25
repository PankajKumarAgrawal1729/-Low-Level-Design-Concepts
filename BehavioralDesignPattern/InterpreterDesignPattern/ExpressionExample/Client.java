package BehavioralDesignPattern.InterpreterDesignPattern.ExpressionExample;

public class Client {
    public static void main(String[] args) {
        // initialize the context
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 16);

        // ((a * d) + (b * d))
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),
                new NumberTerminalExpression("d"));
        AbstractExpression expression2 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("b"),
                new NumberTerminalExpression("c"));
        AbstractExpression expression = new SumNonTerminalExpression(expression1, expression2);

        System.out.println(expression1.interpret(context));
        System.out.println(expression2.interpret(context));
        System.out.println(expression.interpret(context));

        // ((a * b) + (c * d))
        AbstractExpression binaryExpression1 = new BinaryNonTerminalExpression(new NumberTerminalExpression("a"),
                new NumberTerminalExpression("d"), "*");
        AbstractExpression binaryExpression2 = new BinaryNonTerminalExpression(new NumberTerminalExpression("b"),
                new NumberTerminalExpression("c"), "*");
        AbstractExpression binaryExpression = new BinaryNonTerminalExpression(binaryExpression1, binaryExpression2,
                "+");

        System.out.println(binaryExpression1.interpret(context));
        System.out.println(binaryExpression2.interpret(context));
        System.out.println(binaryExpression.interpret(context));

    }
}
