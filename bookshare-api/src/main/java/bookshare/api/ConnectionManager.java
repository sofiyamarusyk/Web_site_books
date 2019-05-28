package bookshare.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/bookshare_db";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "123456";

    private static final String url = "jdbc:postgresql://localhost:5432/bookshare_db";
    private static final String user = "postgres";
    private static final String password = "123456";


    public ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            throw new RuntimeException(e);
        }
    }
}
