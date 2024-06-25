package CreationDesignPatterns.SingletonDesignPattern.LazyInitialization;

public class DBConnection {
    private static DBConnection dbConnection;
    private DBConnection(){}

    // it create different object if more than one thread symentenously call this 
    public static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public void connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }
}
