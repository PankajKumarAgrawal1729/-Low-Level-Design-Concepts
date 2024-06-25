# Observer Design Pattern
### Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

```Java
interface Observer {
    void update(String state);
}

class ConcreteObserver implements Observer {
    private String observerState;

    public void update(String state) {
        observerState = state;
        System.out.println("Observer state updated to " + observerState);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
```