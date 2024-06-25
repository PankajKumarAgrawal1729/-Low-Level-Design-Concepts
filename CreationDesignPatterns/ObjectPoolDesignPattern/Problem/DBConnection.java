package CreationDesignPatterns.ObjectPoolDesignPattern.Problem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection mysqlConnection;

    DBConnection(){
        try {
            mysqlConnection = DriverManager.getConnection("url", "name", "password");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
