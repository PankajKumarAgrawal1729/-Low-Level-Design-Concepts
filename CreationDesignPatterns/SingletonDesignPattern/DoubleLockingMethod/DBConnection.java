package CreationDesignPatterns.SingletonDesignPattern.DoubleLockingMethod;

public class DBConnection {
    // with this we face 2 issue in double locking
    // issue 1: if cpu reordering the instruction(for performance purpose) like
    // (create memory pointer -> assign to variable dbConnection -> assign value 10)
    // in that case if after 2nd step some another thread used that object then it
    // want get value = 10 instead of that it get default value

    // issue 2: problem due to multiple core: if we create an object and that store
    // in their cache and it wan't sink with other cache and if any another thread
    // want this object it find object is null in that case it create one more
    // object(becoz it can't find that in their cache )
    // private static DBConnection dbConnection;

    private static volatile DBConnection dbConnection; // solution of double locking is keyword : volatile
    // volatile have 2 properties:
    // 1. it read and write from memory
    // 2. all write operation is dumped in memory
    int value;

    private DBConnection(int value) {
        this.value = value;
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection(10);
                }
            }
        }
        return dbConnection;
    }

    public void doSomething() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doSomething'");
    }
}
