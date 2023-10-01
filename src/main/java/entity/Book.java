package entity;

public class Book {

    private Integer bookId;
    private String title;
    private String printyear;
    private String authorbook;

    public Book(Integer bookId, String title, String printyear, String authorbook) {
        this.bookId = bookId;
        this.title = title;
        this.printyear = printyear;
        this.authorbook = authorbook;
    }

    public Book() {

    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrintYear() {
        return printyear;
    }

    public void setPrintYear(String printyear) {
        this.printyear = printyear;
    }

    public String getAuthorBook() {
        return authorbook;
    }

    public void setAuthorBook(String authorbook) {
        this.authorbook = authorbook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", printYear='" + printyear + '\'' +
                ", authorBook='" + authorbook + '\'' +
                '}';
    }
}
