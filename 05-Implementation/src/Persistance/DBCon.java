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
    private static String password = "";
    private static String url = "jdbc:mysql://localhost/dasherdex?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static Connection conDB;


    public static Connection getConnectionDB() {
        try {
            conDB = DriverManager.getConnection(url, username, password);
            System.out.println("connected");
        } catch (SQLException ex) {
            // log an exception. for example:
            System.out.println("Failed to create the database connection.");
            ex.printStackTrace();
        }

        return conDB;
    }

}
