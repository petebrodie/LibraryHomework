import java.util.ArrayList;

public class Library {

    public int bookCount;
    private String name;
    private ArrayList<Book> book;

    public Library() {
        this.book = new ArrayList<Book>();

    }

    public void addBook(Book book) {
        this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }


    public Book removeBook() {
        return this.removeBook();
    }

    public void remove(Book book) {
    }

    public void add(Book book) {
    }
}
