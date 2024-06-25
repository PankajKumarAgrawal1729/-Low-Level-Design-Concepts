# Proxy Design Pattern

### This pattern helps to provide control access to original object

### Provides a surrogate or placeholder for another object to control access to it.

```Java
interface Subject {
    void request();
}

class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject request");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        System.out.println("Proxy request");
        realSubject.request();
    }
}
```