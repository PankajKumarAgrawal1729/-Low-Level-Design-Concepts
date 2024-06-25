# Single Responsibility Principle (SRP)
### A class should have only one reason to change, meaning it should have only one job or responsibility.

```java
// Violating SRP
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void save() {
        // Code to save user to the database
    }

    public void sendEmail() {
        // Code to send email
    }
}

// Following SRP
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
}

class UserRepository {
    public void save(User user) {
        // Code to save user to the database
    }
}

class EmailService {
    public void sendEmail(User user) {
        // Code to send email
    }
}
```