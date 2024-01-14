package com.hust.soict.cnpm.group24.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static String database = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyChungCu";
    public static String user = "sa";
    public static String password = "123456789;";

    private static String url = database + ";user=" + user + ";password=" + password + ";encrypt=false;trustServerCertificate=false;";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
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
