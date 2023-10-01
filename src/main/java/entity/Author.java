package entity;

import java.util.Arrays;

public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private int age;
    private String[] bookList;

    public Author(Integer id, String firstName, String lastName, int age, String[] bookList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bookList = bookList;
    }

    public Author() {

    }

    public Integer getId() {
        return id;
    }

    public int setId(Integer id) {
        this.id = id;
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getBookList() {
        return bookList;
    }

    public void setBookList(String[] bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", bookList=" + Arrays.toString(bookList) +
                '}';
    }
}
