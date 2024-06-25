package CreationDesignPatterns.ObjectPoolDesignPattern.Problem;

public class Client {
    public static void main(String[] args) {
        DBConnectionPoolManager poolManager = new DBConnectionPoolManager();
        
        DBConnection dbConnection1 = poolManager.getDBConnection();
        DBConnection dbConnection2 = poolManager.getDBConnection();
        DBConnection dbConnection3 = poolManager.getDBConnection();
        DBConnection dbConnection4 = poolManager.getDBConnection();
        DBConnection dbConnection5 = poolManager.getDBConnection();
        DBConnection dbConnection6 = poolManager.getDBConnection();
        poolManager.getDBConnection();
        poolManager.releaseDBConnection(dbConnection6);

    }
}