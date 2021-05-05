import java.util.ArrayList;
import java.util.Collection;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();

    }

    public int bookCount() {
        return this.collection.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }

    public int removeBook(Library library) {
        return this.collection.size();

    }
}
