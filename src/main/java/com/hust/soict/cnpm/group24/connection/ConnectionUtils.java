package com.hust.soict.cnpm.group24.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static String database = "jdbc:sqlserver://localhost:1433;databaseName=HowKteam";
    public static String user = "sa";
    public static String password = "123456789;";

    private static String url = database + ";user=" + user + ";password=" + password + ";encrypt=true;trustServerCertificate=true;";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
