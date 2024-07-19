package com.vti.respository;

import com.vti.entity.User;
import com.vti.util.JDBCUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM users";
        try(
                Connection connection = JDBCUtil.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));
                users.add(user);
            }
            return users;
        }
    }

    public int create(String fullname, String email) throws SQLException {
        String sql = "INSERT INTO users(full_name, email) VALUES (?, ?)";
        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
            pStmt.setString(1, fullname);
            pStmt.setString(2, email);
            return pStmt.executeUpdate();
        }
    }
}
