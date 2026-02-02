package mate.academy;

import mate.academy.dao.BookDao;
import java.math.BigDecimal;
import mate.academy.lib.Injector;

public class Main {
    private static final Injector injector = Injector.getInstance("jv-jdbc-intro");

    public static void main(String[] args) {
        BookDao bookDao = (BookDao) injector.getInstance(BookDao.class);
        Book book = new Book(1L,"First",new BigDecimal("100.00"));
        Book book2 = new Book(2L,"Second",new BigDecimal("200.00"));
        bookDao.create(book);
        bookDao.create(book2);

        System.out.println(bookDao.findAll());

        bookDao.deleteById(1L);
        System.out.println(bookDao.findAll());

        book2.setPrice(new BigDecimal("400.00"));
        bookDao.update(book2);
        bookDao.findById(2L);
    }
}
