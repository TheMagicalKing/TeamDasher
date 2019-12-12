package Persistance;

import java.sql.*;

/*
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
REMEMBER TO ADD THIS FILE TO .gitignore!!!!!
 */
public class DBCon {

private static String username = "root";
private static String password = "Virk din dumme kælling";
private static String url = "jdbc:mysql://localhost/pokemon?ServerTimezone=UTC";
private static Connection conDB;


    public static Connection getConnectionDB() {
        try {
            conDB = DriverManager.getConnection(url ,username, password);
        } catch (SQLException ex) {
            // log an exception. fro example:
            System.out.println("Failed to create the database connection.");
        }

        return conDB;
    }

}
