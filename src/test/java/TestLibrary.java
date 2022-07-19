import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Ego is the Enemy", "Ryan Holiday", "Non-fiction");
        book2 = new Book("Assassins Apprentice", "Robin Hobb", "Fantasy");
        book3 = new Book("Exit", "Belinda Bauer", "Thriller");
        book4 = new Book("Meditations", "Marcus Aurelius", "Non-fiction");
        book5 = new Book("Malorie", "Josh Malerman", "Horror");

    }

    @Test
    public void testGetStockLevel(){
        assertEquals(0, library.getStockLevel());
    }

    @Test
    public void testAddBookPass(){
        library.addBook(book1);
        assertEquals(1, library.getStockLevel());
    }

    @Test
    public void testAddBookFailFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.getStockLevel());
    }

    @Test
    public void testLendBook(){
        library.addBook(book1);
        library.lendBook();
        assertEquals(0, library.getStockLevel());
    }

    @Test
    public void testGetGenres(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("Non-fiction", 2);
        expectedResult.put("Fantasy", 1);
        expectedResult.put("Thriller", 1);
        assertEquals(expectedResult, library.getGenres());
    }
}
