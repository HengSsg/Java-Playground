package db_to_json;

public class BookDataDTO {
    private int no;
    private String name;
    private String author;
    private String publisher;
    private String rentDate;
    private String returnDate;
    private String imageUrl;
    private int user_id;

    public BookDataDTO(int no, String name, String author, String publisher, String rentDate, String returnDate, String imageUrl, int user_id) {
        this.no = no;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.imageUrl = imageUrl;
        this.user_id = user_id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
