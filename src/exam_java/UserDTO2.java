package exam_java;

public class UserDTO2 {
    private int id;
    private String username;
    private boolean status;

    public UserDTO2(int id, String username, boolean status) {
        this.id = id;
        this.username = username;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
