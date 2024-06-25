package CompositeDesignPattern.CalculatorUsingCompositeDesignPattern;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() { 
        int value  = 0;

        switch (operation) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate(); 
                break;
            case SUBSTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate(); 
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate(); 
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate(); 
                break;
        }
        return value;
    }

    
}
