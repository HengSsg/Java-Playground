package exam_java;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ExConnectionManager {

    public Connection getConnection() {
        Connection conn = null;
        Properties prop = new Properties();

        try (InputStream input = ExConnectionManager.class.getClassLoader().getResourceAsStream("db.properties")) {

            prop.load(input);

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);


        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


        return conn;
    }

}
