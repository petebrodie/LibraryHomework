import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower("Pete");
        book = new Book();
        library = new Library();
        library.addBook(book);
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());









    }

}
