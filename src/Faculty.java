import entities.Book;
import entities.MemberRecord;

import java.time.LocalDate;

public class Faculty extends MemberRecord {
    public Faculty(long memberID, String type, LocalDate dateOfMembership, String noBooksIssued, int maxBookLimit, String name, String address, long phoneNo) {
        super(memberID, type, dateOfMembership, noBooksIssued, maxBookLimit, name, address, phoneNo);
    }

    @Override
    public void borrowBook(Book book) {
        super.borrowBook(book);
    }
}
