import entity.Author;
import entity.Book;
import menu.Menu;
import repository.AuthorRepository;
import repository.BookRepository;
import service.AuthorService;
import service.BookService;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException {
//        AuthorRepository authorRepository = new AuthorRepository();
//        BookRepository bookRepository = new BookRepository();
//        Author author = new Author(null,"jamal","mir sadeghi",90, new String[]{"rahaei"});
//        authorRepository.save(author);
//        Author author = authorRepository.load(1);
//        System.out.println(author.getFirstName());
//        System.out.println(author.getLastName());
//        System.out.println(author.getAge());
//        System.out.println(Arrays.toString(author.getBookList()));
//        BookRepository bookRepository = new BookRepository();
//        Book book = new Book(null,"rahaei","1392","jamal mir sadeghi");
//        bookRepository.save(book);
//        Book book = bookRepository.load(1);
//        System.out.println("book title: " + book.getTitle());
//        System.out.println("printYear book: " + book.getPrintYear());
//        System.out.println("Author book: " + book.getAuthorBook());
//        Book books = new Book(1,"rahaei","1392","jamal mir sadeghi");
//        bookRepository.delete(books);
        // test register and addBook method
//        AuthorService authorService = new AuthorService();
//        authorService.register();
//        BookService bookService = new BookService();
//        bookService.addBook();
//        authorRepository.load(1);
        //test load method----------------------------
//        Author[] authors = new Author[]{authorRepository.load(1)};
//        System.out.println(Arrays.toString(authors));
//        Book[] books = new Book[]{bookRepository.load(2)};
//        System.out.println(Arrays.toString(books));
        Menu menu = new Menu();
        menu.publicMenu();




    }
}
