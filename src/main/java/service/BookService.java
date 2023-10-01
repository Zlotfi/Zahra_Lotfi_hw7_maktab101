package service;

import entity.Author;
import entity.Book;
import repository.BookRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    public BookService() throws SQLException {
    }

//    public void addBook() throws SQLException {
//        Book book = new Book(null,"an sooye marg","1394","jamal sadeghi");
//        int result = bookRepository.save(book);
//        if(result != 0)
//            System.out.println(book.getTitle() + " successfully added to database");
//        else
//            System.out.println("OOps! :(");
//    }

    public void addBook(int id) throws SQLException {
        System.out.println("Please enter your title:");
        String title = scanner.nextLine();

        System.out.println("please enter your printyear:");
        String printyear = scanner.nextLine();

        System.out.println("please enter your authorbook:");
        String authorbook = scanner.nextLine();
        System.out.println("Please enter your book name:");
        int result = bookRepository.save(title,printyear,authorbook);
        if(result != 0)
            System.out.println(title + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
