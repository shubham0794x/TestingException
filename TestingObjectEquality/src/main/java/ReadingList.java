
import java.util.List;
import java.util.ArrayList;

public class ReadingList {

    private List<Book> readingList = new ArrayList<>();

    public void addBook(Book book){
        readingList.add(book);
    }

    public List<Book> getReadingList() {
        return readingList;
    }
}
