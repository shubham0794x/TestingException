import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadingListTest {
    private ReadingList rList = new ReadingList();


    @Test
    public void addBook_passedBookObject_addBookToEndOfList(){
        rList.addBook(new Book(6757,"Harry Potter","JK Rowling", 1998));
        Book sampleBook = new Book(5324,"Iron Man","JK Rowling", 1998);

        assertEquals(sampleBook,rList.getReadingList().get(0));

    }
}
