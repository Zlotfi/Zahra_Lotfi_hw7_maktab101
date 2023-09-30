package repository;

import connection.JdbcConnection;
import entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class AuthorRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public AuthorRepository() throws SQLException {
    }

    public int save(Author author) throws SQLException {
        String add = "INSERT INTO author(firstName,lastName,age,bookList)VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setInt(3, author.getAge());
        preparedStatement.setString(4, Arrays.toString((String[]) author.getBookList()));
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
