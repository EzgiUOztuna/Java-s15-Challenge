import entities.Book;

import java.time.LocalDate;

public class Magazines extends Book {

    public Magazines(long bookId, String author, String name, double price, String status, int edition, LocalDate dateOfPurchase) {
        super(bookId, author, name, price, status, edition, dateOfPurchase);
    }

    @Override
    public void display() {
        System.out.println("Magazine: " + getName() + " by " + getAuthor() + ", Edition: " + getEdition());
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }
}
