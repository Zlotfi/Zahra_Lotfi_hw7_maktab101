package service;

import entity.Author;
import entity.Book;
import repository.BookRepository;

import java.sql.SQLException;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public BookService() throws SQLException {
    }

    public void addBook() throws SQLException {
        Book book = new Book(null,"an sooye marg","1394","jamal sadeghi");
        int result = bookRepository.save(book);
        if(result != 0)
            System.out.println(book.getTitle() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
