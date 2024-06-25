# Stretagy Design Pattern 
### Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

```Java
interface Strategy {
    void execute();
}

class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Strategy A executed");
    }
}

class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Strategy B executed");
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
```