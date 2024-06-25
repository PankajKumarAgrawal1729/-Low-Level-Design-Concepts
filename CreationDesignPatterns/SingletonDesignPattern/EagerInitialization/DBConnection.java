package CreationDesignPatterns.SingletonDesignPattern.EagerInitialization;

public class DBConnection {
    private static DBConnection conObject = new DBConnection();
    private DBConnection(){ }

    public static DBConnection getInstance(){
        return conObject; 
    }

    public void connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }
}
 