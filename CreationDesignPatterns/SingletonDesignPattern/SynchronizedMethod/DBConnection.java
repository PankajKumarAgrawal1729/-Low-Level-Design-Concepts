package CreationDesignPatterns.SingletonDesignPattern.SynchronizedMethod;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    // it is thread safe
    // but if more request threads are comes then it's slow becoz we put lock while
    // one thread use it and in the mean time other are waiting
    synchronized public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public void connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }
}
