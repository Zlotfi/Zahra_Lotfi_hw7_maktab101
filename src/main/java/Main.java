import entity.Author;
import entity.Book;
import repository.AuthorRepository;
import repository.BookRepository;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException {
//        AuthorRepository authorRepository = new AuthorRepository();
//        Author author = new Author(null,"jamal","mir sadeghi",90, new String[]{"rahaei"});
//        authorRepository.save(author);
//        Author author = authorRepository.load(1);
//        System.out.println(author.getFirstName());
//        System.out.println(author.getLastName());
//        System.out.println(author.getAge());
//        System.out.println(Arrays.toString(author.getBookList()));
        BookRepository bookRepository = new BookRepository();
//        Book book = new Book(null,"rahaei","1392","jamal mir sadeghi");
//        bookRepository.save(book);
        Book book = bookRepository.load(1);
        System.out.println("book title: " + book.getTitle());
        System.out.println("printYear book: " + book.getPrintYear());
        System.out.println("Author book: " + book.getAuthorBook());
    }
}
