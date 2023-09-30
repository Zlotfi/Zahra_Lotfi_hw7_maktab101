package entity;

public class Book {

    private Integer bookId;
    private String title;
    private String printYear;
    private String authorBook;

    public Book(Integer bookId, String title, String printYear, String authorBook) {
        this.bookId = bookId;
        this.title = title;
        this.printYear = printYear;
        this.authorBook = authorBook;
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
        return printYear;
    }

    public void setPrintYear(String printYear) {
        this.printYear = printYear;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
}
