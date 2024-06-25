# Liskov Substitution Principle(LSP)
### Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

```Java
// Violating LSP
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

// Following LSP
abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    private void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    public void move() {
        run();
    }

    private void run() {
        System.out.println("Running...");
    }
}
```