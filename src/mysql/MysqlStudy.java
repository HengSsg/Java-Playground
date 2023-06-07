package mysql;

import java.util.Scanner;

public class MysqlStudy {

    private final Scanner scanner;
    private final MysqlService mysqlService;

    public MysqlStudy() {
        this.scanner = new Scanner(System.in);
        this.mysqlService = new MysqlService();
    }

    public static void main(String[] args) {
        MysqlStudy mysqlStudy = new MysqlStudy();
        mysqlStudy.addCategory();

    }

    void addCategory() {
        System.out.println("카테고리 이름을 입력해주세요");
        String category = scanner.nextLine();

        mysqlService.addCategory(category);
    }

    void addContent() {
        String title = null;
        String content = null;

        System.out.println("제목을 입력해주세요");
        title = scanner.nextLine();

        System.out.println("내용을 입력해주세요");
        content = scanner.nextLine();


    }
}

