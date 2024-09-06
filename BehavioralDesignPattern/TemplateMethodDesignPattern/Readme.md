The **Template Method Design Pattern** is a behavioral design pattern that defines the skeleton of an algorithm in a base class but lets the subclasses override specific steps of the algorithm without changing its overall structure.

The key idea is to put the invariant (unchanged) parts of the algorithm in a template method in the base class, while the variant (customizable) parts are defined in abstract methods that the subclasses must implement.

### Key Concepts

- **Template Method**: A method in the base class that defines the algorithm's structure by calling abstract methods (or steps) that are implemented by the subclasses.
- **Abstract Methods**: These are the customizable steps of the algorithm that subclasses will implement.
- **Concrete Subclasses**: These subclasses implement the abstract methods and provide specific behavior.

### Example Scenario

Imagine a system that processes orders for different types of products. The steps to process an order (like validating, packaging, shipping, etc.) are the same, but the way these steps are implemented might vary depending on the type of product (e.g., electronics, furniture, food).

### Implementation in Java

#### Step 1: Define the Abstract Class with the Template Method

```java
abstract class OrderProcessTemplate {
    // Template method defining the steps of the algorithm
    public final void processOrder() {
        validateOrder();
        processPayment();
        shipOrder();
        if (isGift()) {
            wrapGift();
        }
        System.out.println("Order completed.\n");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void validateOrder();
    protected abstract void processPayment();
    protected abstract void shipOrder();

    // Optional method with a default implementation
    protected boolean isGift() {
        return false; // Default behavior
    }

    // Optional method for wrapping gifts
    protected void wrapGift() {
        System.out.println("Order wrapped as a gift.");
    }
}
```

- **Template Method (`processOrder`)**: Defines the steps of the algorithm (e.g., validating, processing payment, shipping). The concrete steps (`validateOrder`, `processPayment`, `shipOrder`) will be defined by subclasses.
- **Optional Methods (`isGift`, `wrapGift`)**: Provides hooks for optional behavior. Subclasses can override `isGift` to customize this behavior.

#### Step 2: Create Concrete Subclasses

```java
class ElectronicsOrder extends OrderProcessTemplate {
    @Override
    protected void validateOrder() {
        System.out.println("Validating electronics order...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment for electronics...");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Shipping electronics order.");
    }
}

class FurnitureOrder extends OrderProcessTemplate {
    @Override
    protected void validateOrder() {
        System.out.println("Validating furniture order...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment for furniture...");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Shipping furniture order.");
    }

    @Override
    protected boolean isGift() {
        return true; // This order is a gift
    }
}
```

- **Concrete Classes (`ElectronicsOrder`, `FurnitureOrder`)**: These classes implement the abstract methods defined in the template and provide specific behaviors for the `validateOrder`, `processPayment`, and `shipOrder` steps. The `FurnitureOrder` class also overrides `isGift` to enable gift-wrapping.

#### Step 3: Client Code to Test the Template Method Pattern

```java
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        OrderProcessTemplate electronicsOrder = new ElectronicsOrder();
        System.out.println("Processing Electronics Order:");
        electronicsOrder.processOrder();  // Processes an electronics order

        OrderProcessTemplate furnitureOrder = new FurnitureOrder();
        System.out.println("Processing Furniture Order:");
        furnitureOrder.processOrder();    // Processes a furniture order with gift-wrapping
    }
}
```

### Output

```
Processing Electronics Order:
Validating electronics order...
Processing payment for electronics...
Shipping electronics order.
Order completed.

Processing Furniture Order:
Validating furniture order...
Processing payment for furniture...
Shipping furniture order.
Order wrapped as a gift.
Order completed.
```

### Explanation

- **Template Method (`processOrder`)**: This method provides a common structure for processing an order. It calls the abstract methods (`validateOrder`, `processPayment`, `shipOrder`) and also includes optional behavior (`wrapGift`).
- **Concrete Classes**: `ElectronicsOrder` and `FurnitureOrder` implement the specific details of the algorithm's steps. `FurnitureOrder` also provides custom behavior by enabling gift-wrapping.
- **Hook Method (`isGift`)**: Allows subclasses to modify part of the behavior (whether or not the order should be gift-wrapped) without changing the overall structure.

### Benefits

- **Code Reusability**: Common algorithm structure is reused in the base class, while the details are handled by the subclasses.
- **Promotes Consistency**: The structure of the algorithm remains the same across different implementations, ensuring that all subclasses follow a consistent flow.
- **Easily Extensible**: New concrete classes can be added with different implementations of the algorithm steps without modifying the template method.

### Drawbacks

- **Inheritance-based**: Since this pattern relies on inheritance, it can lead to tightly coupled classes and make it harder to change the algorithm's flow in the future.
- **Limited Flexibility**: Once the template method is defined, the flow of the algorithm can't be easily changed by the subclasses, making it less flexible in some cases.

### Use Cases

- **Frameworks**: Frameworks often use the Template Method pattern to allow developers to define certain steps while keeping the framework's overall control flow intact.
- **Data Processing Pipelines**: When processing data, the structure of reading, transforming, and saving the data can be shared, while the actual transformations vary.
- **Game Development**: Defining game rules where certain actions (e.g., start, play, end) are fixed, but specific game logic (e.g., scoring, player actions) varies.

### Real-World Example

- **Web Frameworks**: Many web frameworks (e.g., Django, Spring) use the Template Method pattern to define the structure of how HTTP requests are processed. The framework defines the overall flow (e.g., routing, request handling, response sending), while developers provide custom behavior (e.g., controller logic, business rules) by implementing certain hooks or overriding default behavior.

The **Template Method Design Pattern** allows you to define the skeleton of an algorithm in a base class, letting subclasses provide the specifics for certain steps. It promotes code reuse while giving subclasses the flexibility to modify only specific parts of the algorithm.