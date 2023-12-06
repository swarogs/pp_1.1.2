package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Мария", "Богданова", (byte) 19);
        userService.saveUser("Лиза", "Иванова", (byte) 23);
        userService.saveUser("Егор", "Мелузов", (byte) 20);
        userService.saveUser("Ваня", "Брусницын", (byte) 35);
        userService.getAllUsers();
        userService.removeUserById(4);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
