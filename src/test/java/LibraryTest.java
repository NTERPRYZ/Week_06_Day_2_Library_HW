import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Central Library", 100);
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canStockBooks(){
        library.stock(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void getBookCapacity(){
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void numberOfBookSpaceLeft() {
        for (int i = 0; i<90; i++) {
            library.stock(book); }
        assertEquals(10, library.freeStockCount());

    }

    @Test
    public void cantTakeInMoreBooksThanCapacity(){
        for (int i = 0; i<110; i++) {
            library.stock(book); }
        assertEquals(0, library.freeStockCount());
    }
}
