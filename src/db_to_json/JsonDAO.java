package db_to_json;

import java.sql.Connection;

public class JsonDAO {
    JsonConnectionManager connectionManager;

    public JsonDAO() {
        this.connectionManager = new JsonConnectionManager();
    }

    public User_BookDTO selectUserData() {
        User_BookDTO userBookDTO = null;

        Connection conn = connectionManager.getConnection();
        String sql = "select * from user;";


        return userBookDTO;
    }

}
