package entities;
import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String[] books;
    private String[] readers;

    public Library() {

    }
    public Library(String[] books, String[] readers) {
        this.books=books;
        this.readers=readers;
    }

    //***********************************************************************

    public String[] getBooks() {
        return books;
    }

    public String[] getReaders() {
        return readers;
    }

    //***********************************************************************

    public void newBook() {

    }

    public void lendBook() {

    }

    public void takeBackBook() {

    }

    public void showBook() {

    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.deepEquals(books, library.books) && Objects.deepEquals(readers, library.readers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(books), Arrays.hashCode(readers));
    }

    @Override
    public String toString() {
        return "entities.Library{" +
                "books=" + Arrays.toString(books) +
                ", readers=" + Arrays.toString(readers) +
                '}';
    }
}
