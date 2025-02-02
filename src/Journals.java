import entities.Book;

import java.time.LocalDate;

public class Journals extends Book {
    private String journalType;

    public Journals(long bookId, String author, String name, double price, String status, int edition, LocalDate dateOfPurchase, String journalType) {
        super(bookId, author, name, price, status, edition, dateOfPurchase);
        this.journalType = journalType;
    }

    @Override
    public void display() {
        System.out.println("Journal: " + getName() + " by " + getAuthor() + ", Type: " + journalType);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1.5;
    }
}
