package exam_java;

import db_to_json.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExDAO {
    ExConnectionManager exConnectionManager;

    public ExDAO() {
        this.exConnectionManager = new ExConnectionManager();
    }

    public UserDTO2 selectUser() {
        UserDTO2 userDTO = null;
        Connection conn = exConnectionManager.getConnection3();
        String sql = "select * from user limit 1";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                userDTO = new UserDTO2(rs.getInt("id"), rs.getString("name"),
                        rs.getBoolean("status"));

            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userDTO;
    }
}
