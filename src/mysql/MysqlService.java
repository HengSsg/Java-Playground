package mysql;

public class MysqlService {
    private final MysqlDAO mysqlDAO;

    public MysqlService() {
        this.mysqlDAO = new MysqlDAO();
    }

    // 카테고리 추가
    public void addCategory(String category) {

        mysqlDAO.insertCategory(category);

    }
}
