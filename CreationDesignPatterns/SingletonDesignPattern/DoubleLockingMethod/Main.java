package CreationDesignPatterns.SingletonDesignPattern.DoubleLockingMethod;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.doSomething();
    }
}
