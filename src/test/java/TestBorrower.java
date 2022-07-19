import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book = new Book("Ego is the Enemy", "Ryan Holiday", "Non-fiction");
        library.addBook(book);
    }

    @Test
    public void testGetBooksBorrowed(){
        assertEquals(0, borrower.getBooksBorrowed());
    }

    @Test
    public void testBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.getBooksBorrowed());
    }
}
