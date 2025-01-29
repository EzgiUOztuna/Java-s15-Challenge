import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private long book_ID;
    private String author;
    private String name;
    private double price;
    private String status;
    private int edition;
    private LocalDate dateOfPurchase;

    public Book() {

    }
    public Book(long book_ID, String author, String name, double price, String status, int edition, LocalDate dateOfPurchase) {
        this.book_ID = book_ID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    //***********************************************************************

    public long getBook_ID() {
        return book_ID;
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

    public void getTitle() {

    }

    public void changeOwner(){

    }

    public void getOwner() {

    }

    public void display() {

    }

    public void updateStatus() {

    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return book_ID == book.book_ID && Double.compare(price, book.price) == 0 && edition == book.edition && Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(status, book.status) && Objects.equals(dateOfPurchase, book.dateOfPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_ID, author, name, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_ID=" + book_ID +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition=" + edition +
                ", dateOfPurchase=" + dateOfPurchase +
                '}';
    }


}
