package db;
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/player_evaluation";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}