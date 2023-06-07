package mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    private final Scanner scanner;

    Practice() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
//        practice.practiceService();
        practice.showContents();

    }

    public void practiceService() {
        System.out.println("타이틀 입력");
        String title = scanner.nextLine();
        System.out.println("내용 입력");
        String content = scanner.nextLine();

        practiceDAO(title, content);
    }

    public void practiceDAO(String title, String content) {
        String sql = "insert into contents(title, content) values(?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConnectionManager2();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert conn != null;
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    void showContents() {
        String sql = "select * from contents;";
        ArrayList<Contents> arr;
         arr = showContentsDAO(sql);

         for ( Contents contents : arr) {
             contents.toString();
         }

    }

    ArrayList<Contents> showContentsDAO(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Contents> arr = new ArrayList<>();

        try {
            conn = ConnectionManager2();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int no = rs.getInt("no");
                String title = rs.getString("title");
                String content = rs.getString("content");

                Contents contents = new Contents(no, title, content);
                arr.add(contents);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return arr;
    }

    public Connection ConnectionManager2() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/board";
        String username = "root";
        String password = "gkgkgk12";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }


}
