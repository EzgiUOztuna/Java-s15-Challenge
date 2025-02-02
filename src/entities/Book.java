package entities;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Book {
    private long bookId;
    private String author;
    private String name;
    private double price;
    private String status;
    private int edition;
    private LocalDate dateOfPurchase;

    public Book() {

    }
    public Book(long bookId, String author, String name, double price, String status, int edition, LocalDate dateOfPurchase) {
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    //***********************************************************************

    public long getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public int getEdition() {
        return edition;
    }

    //***********************************************************************

    public String getTitle() {
        return name;
    }

    public void changeOwner(){
    }

    public void getOwner() {

    }

    public abstract void display();
    public abstract double calculateFine(int daysLate);

    public void updateStatus() {

    }

    public void setStatus(String status) {
        this.status = status;
    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Double.compare(price, book.price) == 0 && edition == book.edition && Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(status, book.status) && Objects.equals(dateOfPurchase, book.dateOfPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, author, name, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {
        return "entities.Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition=" + edition +
                ", dateOfPurchase=" + dateOfPurchase +
                '}';
    }
}
