package repository;

import connection.JdbcConnection;
import entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Author load(int authorId) throws SQLException {
        String sql = "SELECT * FROM author WHERE authorId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,authorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        Author author = new Author();
        if (resultSet.next()){
            author.setAuthorId(resultSet.getInt(1));
            author.setFirstName(resultSet.getString(2));
            author.setLastName(resultSet.getString(3));
            author.setAge(resultSet.getInt(4));
            author.setBookList(new String[]{resultSet.getString(5)});
        }
        return author;
    }
}
