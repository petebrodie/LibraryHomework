import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp() {
        library = new Library();
        book = new Book();

    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.remove(book);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, library.bookCount);

    }



}
