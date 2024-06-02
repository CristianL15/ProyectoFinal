package backend.buenavida.Models;
import java.sql.*;

public class ConecciónDB {
    public static Connection getConnection() {
        Connection connection = null;

        String url = "jdbc:mariadb://localhost:3306/inmobiliaria";
        String user = "root";
        String password = "root";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
        } catch (Exception e) {
            System.out.println("Could not connect to database " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                System.out.println("Connection closed successfully");
            }
        } catch (Exception e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}
