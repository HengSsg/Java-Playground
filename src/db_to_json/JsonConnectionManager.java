package db_to_json;

import mysql.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JsonConnectionManager {

    public Connection getConnection() {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/lib";
        String id = "root";
        String pw = "gkgkgk12";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, pw);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


        return conn;
    }
}
