package entity;

public class Book {

    private Integer id;
    private String title;
    private String printyear;
    private String authorbook;

    public Book(Integer id, String title, String printyear, String authorbook) {
        this.id = id;
        this.title = title;
        this.printyear = printyear;
        this.authorbook = authorbook;
    }

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", title='" + title + '\'' +
                ", printYear='" + printyear + '\'' +
                ", authorBook='" + authorbook + '\'' +
                '}';
    }
}
