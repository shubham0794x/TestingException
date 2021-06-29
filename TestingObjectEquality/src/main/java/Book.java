
import java.util.Objects;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int publishYear;

    public Book(){

    }

    public Book(long isbn, String title, String author, int publishYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() ) return false;
        Book book = (Book) o;
        return getPublishYear() == book.getPublishYear() &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", public=" + publishYear +
                '}';
    }

}

