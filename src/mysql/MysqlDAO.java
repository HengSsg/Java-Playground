package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlDAO {

    public void insertCategory(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into category(name)\n" +
                "values(?);";

        try {
            conn = ConnectionManager.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(conn, pstmt, null);
        }
    }
}
