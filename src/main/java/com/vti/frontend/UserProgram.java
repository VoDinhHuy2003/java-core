package com.vti.frontend;

import com.vti.respository.UserRepository;
import com.vti.util.JDBCUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.showMenu();
    }
}
