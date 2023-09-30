import entity.Author;
import repository.AuthorRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        AuthorRepository authorRepository = new AuthorRepository();
        Author author = new Author(null,"jamal","mir sadeghi",90, new String[]{"rahaei"});
        authorRepository.save(author);
    }
}
