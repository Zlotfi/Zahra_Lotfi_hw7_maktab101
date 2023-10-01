package service;

import entity.Author;
import repository.AuthorRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepository();
    Scanner scanner = new Scanner(System.in);

    public AuthorService() throws SQLException {
    }

//    public void register() throws SQLException {
//        Author author = new Author(null,"jamal","sadeghi",67, new String[]{"divan"});
//        int result = authorRepository.save(author);
//        if(result != 0)
//            System.out.println(author.getFirstName() + " successfully added to database");
//        else
//            System.out.println("OOps! :(");
//    }

//    public void register(Author author) throws SQLException {
//        int result = authorRepository.save(author);
//        if(result != 0)
//            System.out.println(author.getFirstName() + " successfully added to database");
//        else
//            System.out.println("OOps! :(");
//    }

    public void register(int id) throws SQLException {
        System.out.println("Please enter your firstName:");
        String firstName = scanner.nextLine();

        System.out.println("please enter your lastName:");
        String lastName = scanner.nextLine();

        System.out.println("please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your book name:");
        String[] bookList = new String[]{scanner.toString()};
        int result = authorRepository.save(firstName,lastName,age,bookList);
        if(result != 0)
            System.out.println(firstName + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

}
