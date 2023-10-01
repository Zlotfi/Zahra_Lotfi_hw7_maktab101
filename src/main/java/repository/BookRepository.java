package repository;

import connection.JdbcConnection;
import entity.Author;
import entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class BookRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public BookRepository() throws SQLException {
    }

    public int save(String title,String printyear,String authorbook) throws SQLException {
        String add = "INSERT INTO book(title,printyear,authorbook)VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, printyear);
        preparedStatement.setString(3, authorbook);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public Book load(int id) throws SQLException {
        String sql = "SELECT * FROM book WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book = new Book();
        if (resultSet.next()){
            book.setId(resultSet.getInt(1));
            book.setTitle(resultSet.getString(2));
            book.setPrintYear(resultSet.getString(3));
            book.setAuthorBook(resultSet.getString(4));
        }
        Book[] books = new Book[resultSet.getRow()];
        int counter = 0;
        while (resultSet.next()) {
            books[counter] = new Book(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4)
            );
            counter++;
        }
        return book;
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM book WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int result = preparedStatement.executeUpdate();
    }
}
