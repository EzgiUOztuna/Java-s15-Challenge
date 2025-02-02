package entities;

import java.util.Arrays;
import java.util.Objects;

public class Reader extends Person {
    private String[] books;

    public Reader() {

    }
    public Reader(String[] books) {
        this.books=books;
    }

    //***********************************************************************

    public String[] getBooks() {
        return books;
    }

    //***********************************************************************

    public void purchaseBook() {

    }

    public void borrowBook() {

    }

    public void returnBook() {

    }

    public void showBook() {

    }

    public void whoYouAre() {

    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Reader reader = (Reader) o;
        return Objects.deepEquals(books, reader.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "entities.Reader{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
