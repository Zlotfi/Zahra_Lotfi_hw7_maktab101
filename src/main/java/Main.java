import entity.Author;
import repository.AuthorRepository;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException {
        AuthorRepository authorRepository = new AuthorRepository();
//        Author author = new Author(null,"jamal","mir sadeghi",90, new String[]{"rahaei"});
//        authorRepository.save(author);
        Author author = authorRepository.load(1);
        System.out.println(author.getFirstName());
        System.out.println(author.getLastName());
        System.out.println(author.getAge());
        System.out.println(Arrays.toString(author.getBookList()));
    }
}
