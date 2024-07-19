package com.vti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lesson_10";
        String user = "root";
        String password = "123456";
        return DriverManager.getConnection(url, user, password);
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công: " + connection.getCatalog());
        } catch (SQLException e) {
            System.out.println("Kết nối thất bai: " + e.getMessage());
        }
    }
}
