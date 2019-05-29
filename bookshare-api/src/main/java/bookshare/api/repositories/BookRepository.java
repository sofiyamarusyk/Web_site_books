package bookshare.api.repositories;

import bookshare.api.entities.BookEntity;

import java.sql.*;
import java.util.List;

public interface BookRepository {
    BookEntity insert(BookEntity book) throws Exception;

    List<BookEntity> selectAll() throws SQLException;
}