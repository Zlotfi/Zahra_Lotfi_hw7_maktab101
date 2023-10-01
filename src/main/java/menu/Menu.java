package menu;

import entity.Author;
import entity.Book;
import repository.AuthorRepository;
import repository.BookRepository;
import service.AuthorService;
import service.BookService;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final AuthorService authorService = new AuthorService();
    private final AuthorRepository authorRepository = new AuthorRepository();
    private final BookService bookService = new BookService();
    private final BookRepository bookRepository = new BookRepository();

    public Menu() throws SQLException {
    }
    Author author = new Author();
    Book book = new Book();

    public void publicMenu() throws SQLException {
        System.out.println("====================================");
        System.out.println("***Welcome***");
        System.out.println("1- Author");
        System.out.println("2- Book");
        System.out.println("3- Exit");
        System.out.println("Enter your select:");
        int select = scanner.nextInt();
        scanner.nextLine();
        boolean isTrue = true;
        while (isTrue) {
            switch (select) {
                case 1 -> {
                    System.out.println("============================");
                    System.out.println("1- Add Author");
                    System.out.println("2- Load Author");
                    System.out.println("3- Exit");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    switch (number){
                        case 1 -> {
                            assert author != null;
                            authorService.register();
                        }
                        case 2 -> {
                            System.out.println("id:");
                            assert author != null;
                            Author[] authors = new Author[]{authorRepository.load(scanner.nextInt())};
                            System.out.println(Arrays.toString(authors));
                        }
                        case 3 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 2 -> {
                    System.out.println("==============================");
                    System.out.println("1- Add Book");
                    System.out.println("2- Load Book");
                    System.out.println("3- Delete Book");
                    System.out.println("4- Exit");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    switch (num){
                        case 1 -> {
                            assert book != null;
                            bookService.addBook();
                        }
                        case 2 -> {
                            System.out.println("id:");
                            assert book != null;
                            Book[] books = new Book[]{bookRepository.load(scanner.nextInt())};
                            System.out.println(Arrays.toString(books));
                        }
                        case 3 -> {
                            System.out.println("id:");
                            assert book != null;
                            bookRepository.delete(scanner.nextInt());
                            System.out.println("successfully deleted");
                        }
                        case 4 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 3 -> isTrue = false;
                default -> System.out.println("error");
            }
        }
    }
}
