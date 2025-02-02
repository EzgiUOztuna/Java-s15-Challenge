import entities.Book;

import java.time.LocalDate;

public class StudyBooks extends Book {

    private String subject;

    public StudyBooks(long book_ID, String author, String name, double price, String status, int edition, LocalDate dateOfPurchase, String subject) {
        super(book_ID, author, name, price, status, edition, dateOfPurchase);
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Study Book: " + getName() + " by " + getAuthor() + ", Subject: " + subject );
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }
}
