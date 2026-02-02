package mate.academy;

import mate.academy.dao.BookDao;
import mate.academy.lib.Injector;

import java.math.BigDecimal;

public class Main {
    private static final Injector injector = Injector.getInstance("jv-jdbc-intro");

    public static void main(String[] args) {
        BookDao bookDao = (BookDao) injector.getInstance(BookDao.class);
        Book book = new Book(1L,"First",new BigDecimal("100.00"));
        bookDao.create(book);
        // test other methods from BookDao
    }
}
