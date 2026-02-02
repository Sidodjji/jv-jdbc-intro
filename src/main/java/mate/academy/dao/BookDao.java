package mate.academy.dao;

import mate.academy.Book;
import mate.academy.lib.Dao;

import java.util.List;
import java.util.Optional;

@Dao
public interface BookDao {
    Book create(Book book);
    Optional<Book> findById(Long id);
    List<Book> findAll();
    Book update(Book book);
    boolean deleteById(Long id);
}
