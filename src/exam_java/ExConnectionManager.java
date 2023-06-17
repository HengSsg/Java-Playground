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

        try (InputStream input = ExConnectionManager.class.getResourceAsStream("db.properties")) {
            if (input == null) {
                System.out.println("db.properties 파일을 찾을 수 없습니다.");
            }
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

    public Connection getConnection2() {
        Connection conn = null;
        Properties properties = new Properties();

        try (InputStream input = ExConnectionManager.class.getResourceAsStream("db.properties")) {
            properties.load(input);


            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Connection getConnection3() {
        Connection conn = null;
        Properties prop = new Properties();

        try (InputStream input = ExConnectionManager.class.getResourceAsStream("db.properties")) {
            prop.load(input);

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);


        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
