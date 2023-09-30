package service;

import entity.Author;
import repository.AuthorRepository;

import java.sql.SQLException;

public class AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepository();

    public AuthorService() throws SQLException {
    }

    public void register() throws SQLException {
        Author author = new Author(null,"parvin","etesami",80, new String[]{"divan"});
        int result = authorRepository.save(author);
        if(result != 0)
            System.out.println(author.getFirstName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
