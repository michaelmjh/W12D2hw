import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public int getBooksBorrowed(){
        return this.booksBorrowed.size();
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.lendBook();
        this.booksBorrowed.add(book);
    }
}
