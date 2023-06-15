package db_to_json;

import java.util.ArrayList;

public class User_BookDTO {
    private UserDTO userData;
    private ArrayList<BookDataDTO> bookDataDTOS;

    public User_BookDTO(UserDTO userData, ArrayList<BookDataDTO> bookDataDTOS) {
        this.userData = userData;
        this.bookDataDTOS = bookDataDTOS;
    }

    public UserDTO getUserData() {
        return userData;
    }

    public void setUserData(UserDTO userData) {
        this.userData = userData;
    }

    public ArrayList<BookDataDTO> getBookDataDTOS() {
        return bookDataDTOS;
    }

    public void setBookDataDTOS(ArrayList<BookDataDTO> bookDataDTOS) {
        this.bookDataDTOS = bookDataDTOS;
    }
}
