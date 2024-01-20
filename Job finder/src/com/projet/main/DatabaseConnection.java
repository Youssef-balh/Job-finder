package com.projet.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3307/scrappingg";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    public static Connection connectToDatabase() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }

    // private static void closeConnection(Connection connection) {
    //     try {
    //         if (connection != null && !connection.isClosed()) {
    //             connection.close();
    //             System.out.println("Connection closed.");
    //         }
    //     } catch (SQLException e) {
    //         System.err.println("Error closing the connection: " + e.getMessage());
    //     }
    // }
}