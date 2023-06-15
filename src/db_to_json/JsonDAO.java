package db_to_json;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JsonDAO {
    JsonConnectionManager connectionManager;

    public JsonDAO() {
        this.connectionManager = new JsonConnectionManager();
    }

    public User_BookDTO selectUserData(int id) {
        User_BookDTO userBookDTO = null;
        ArrayList<BookDataDTO> arr = new ArrayList<>();

        Connection conn = connectionManager.getConnection();
        String sql = "select *\n" +
                "from bookData\n" +
                "inner join user on bookData.user_id = user.id\n" +
                "where user.id = ?;";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            UserDTO userDTO = null;
            while (rs.next()) {
                userDTO = new UserDTO(rs.getInt("id"), rs.getString("name"),
                        rs.getBoolean("status"));
                BookDataDTO bookDataDTO = new BookDataDTO(rs.getInt("no"), rs.getString("bname"),
                        rs.getString("author"), rs.getString("publisher"),
                        rs.getString("rentDate"), rs.getString("returnDate"),
                        rs.getString("imageUrl"), rs.getInt("user_id"));

                arr.add(bookDataDTO);

            }
            userBookDTO = new User_BookDTO(userDTO,arr);


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return userBookDTO;
    }

}
