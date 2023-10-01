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

    public int save(String firstName,String lastName,int age,String[] bookList) throws SQLException {
        String add = "INSERT INTO author(firstName,lastName,age,bookList)VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1,firstName);
        preparedStatement.setString(2,lastName);
        preparedStatement.setInt(3,age);
        preparedStatement.setString(4, Arrays.toString((String[])bookList));
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public Author load(Integer id) throws SQLException {
        String sql = "SELECT * FROM author WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Author author = new Author();
        if (resultSet.next()) {
            author.setId(resultSet.getInt(1));
            author.setFirstName(resultSet.getString(2));
            author.setLastName(resultSet.getString(3));
            author.setAge(resultSet.getInt(4));
            author.setBookList(new String[]{resultSet.getString(5)});
        }
        Author[] authors = new Author[resultSet.getRow()];
        int counter = 0;
        while (resultSet.next()) {
            authors[counter] = new Author(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    new String[]{resultSet.getString(5)}
            );
            counter++;
        }
        return author;

    }
}


