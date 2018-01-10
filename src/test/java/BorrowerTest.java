import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Robert", 5);
        book = new Book();
    }

    @Test
    public void borrowerHasCollectionOfBooks(){
        assertEquals(5, borrower.bookCount());
    }

}


