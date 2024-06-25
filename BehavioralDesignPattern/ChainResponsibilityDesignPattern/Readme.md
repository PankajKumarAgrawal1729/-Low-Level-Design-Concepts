The ***Chain of Responsibility pattern*** is a behavioral design pattern that allows an object to pass a request along a chain of potential handlers until the request is handled. This pattern decouples the sender of a request from its receivers by allowing multiple objects to handle the request without the sender needing to know which object will handle it.

### Key Concepts

- **Handler**: Defines an interface for handling requests.
- **ConcreteHandler**: Handles the requests it is responsible for, and forwards requests it does not handle to the next handler in the chain.
- **Client**: Initiates the request to a ConcreteHandler object on the chain.

### Example Scenario

Let's consider a scenario where we have different levels of support: a frontline support agent, a manager, and a director. Each has the ability to handle certain types of requests. If a request is beyond their capability, they pass it to the next handler in the chain.

### Implementation in Java

#### Step 1: Define the Handler Interface

```java
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
```

#### Step 2: Create Concrete Handlers

```java
class FrontlineSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("basic issue")) {
            System.out.println("Frontline Support: Handling basic issue.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}

class ManagerSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("intermediate issue")) {
            System.out.println("Manager Support: Handling intermediate issue.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}

class DirectorSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("complex issue")) {
            System.out.println("Director Support: Handling complex issue.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
```

#### Step 3: Create the Client

```java
public class Client {
    public static void main(String[] args) {
        // Create the handlers
        SupportHandler frontline = new FrontlineSupport();
        SupportHandler manager = new ManagerSupport();
        SupportHandler director = new DirectorSupport();

        // Set up the chain
        frontline.setNextHandler(manager);
        manager.setNextHandler(director);

        // Test the chain with different requests
        System.out.println("Sending 'basic issue' request...");
        frontline.handleRequest("basic issue");

        System.out.println("\nSending 'intermediate issue' request...");
        frontline.handleRequest("intermediate issue");

        System.out.println("\nSending 'complex issue' request...");
        frontline.handleRequest("complex issue");

        System.out.println("\nSending 'unknown issue' request...");
        frontline.handleRequest("unknown issue");
    }
}
```

### Output

```
Sending 'basic issue' request...
Frontline Support: Handling basic issue.

Sending 'intermediate issue' request...
Manager Support: Handling intermediate issue.

Sending 'complex issue' request...
Director Support: Handling complex issue.

Sending 'unknown issue' request...
```

In this example:

- `FrontlineSupport` handles basic issues.
- `ManagerSupport` handles intermediate issues.
- `DirectorSupport` handles complex issues.

If a handler cannot process a request, it passes it to the next handler in the chain. If none of the handlers can process the request, it remains unhandled.

### Benefits

- **Decoupling of Sender and Receiver**: The sender does not need to know which handler will process the request.
- **Flexibility in Request Handling**: Handlers can be added or removed without affecting the client.
- **Single Responsibility**: Each handler only processes the requests it is responsible for, adhering to the Single Responsibility Principle.

This pattern is useful in scenarios where multiple objects might handle a request, and the handler is not known in advance. It provides a clear structure for chaining handlers and processing requests in a flexible manner.