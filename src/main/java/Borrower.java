import java.util.ArrayList;

public class Borrower {

    private String name;
    private int collection;
    private ArrayList<Book> books;

    public Borrower (String name, int collection){
        this.name = name;
        this.collection = collection;
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return collection;
    }
}
