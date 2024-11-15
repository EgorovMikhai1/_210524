package com.app._15_11_2024;

import java.sql.*;

public class JDBCexample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        final String DB_URL = "jdbc:mysql://localhost:3306/libliblib";
        final String USER = "root";
        final String PASS = "123123";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM authors";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
        }
    }
}