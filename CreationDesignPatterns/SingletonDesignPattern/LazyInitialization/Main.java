package CreationDesignPatterns.SingletonDesignPattern.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.connect();
    }
}
