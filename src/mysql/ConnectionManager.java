package mysql;

import java.sql.*;

public class ConnectionManager {

    public static Connection getConnection() {
        Connection con = null;

        String jdbcUrl = "jdbc:mysql://localhost:3306/board";
        String username = "root";
        String password = "gkgkgk12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void closeConnection(Connection con, Statement stmt, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
