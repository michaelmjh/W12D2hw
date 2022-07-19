import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookStock;
    private int stockCapacity;

    public Library(int stockCapacity){
        this.bookStock = new ArrayList<Book>();
        this.stockCapacity = stockCapacity;
    }

    public int getStockLevel(){
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        if (getStockLevel() < stockCapacity){
            this.bookStock.add(book);
        }
    }

    public Book lendBook() {
        return this.bookStock.remove(0);
    }


    public HashMap<String, Integer> getGenres() {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (Book book: bookStock){
            String genre = book.getGenre();
            if (result.containsKey(genre)){
                result.put(genre, result.get(genre) + 1);
            } else {
                result.put(genre, 1);
            }
        }
        return result;
    }
}
