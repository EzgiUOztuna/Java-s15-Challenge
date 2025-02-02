package entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemberRecord {
    private long memberID;
    private String type;
    private LocalDate dateOfMembership;
    private String noBooksIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private long phoneNo;
    private List<Book> borrowedBooks;

    public MemberRecord(long memberID, String type, LocalDate dateOfMembership, String noBooksIssued, int maxBookLimit, String name, String address, long phoneNo) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.borrowedBooks = new ArrayList<>();
    }

    //***********************************************************************

    public long getMemberID() {
        return memberID;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDateOfMembership() {
        return dateOfMembership;
    }

    public String getNoBooksIssued() {
        return noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    //***********************************************************************

    public void getMember(){

    }

    public void incBookIssued(){

    }

    public void decBookIssued(){

    }

    public void payBill(){

    }

    public void borrowBook(Book book){
        if(borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
            book.setStatus("Borrowed");
            System.out.println("Book borrowed successfully: " + book.getName());
        } else {
            System.out.println("You can't borrow more than 5 books.");
        }
    }

    public void returnBook(Book book, int daysLate){
        if(borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setStatus("Available");

            double fine = book.calculateFine(daysLate);
            System.out.println("Book returned: " + book.getName());
            System.out.println("Fine to pay: " + fine);
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MemberRecord that = (MemberRecord) o;
        return memberID == that.memberID && maxBookLimit == that.maxBookLimit && phoneNo == that.phoneNo && Objects.equals(type, that.type) && Objects.equals(dateOfMembership, that.dateOfMembership) && Objects.equals(noBooksIssued, that.noBooksIssued) && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, type, dateOfMembership, noBooksIssued, maxBookLimit, name, address, phoneNo);
    }

    @Override
    public String toString() {
        return "entities.MemberRecord{" +
                "memberID=" + memberID +
                ", type='" + type + '\'' +
                ", dateOfMembership=" + dateOfMembership +
                ", noBooksIssued='" + noBooksIssued + '\'' +
                ", maxBookLimit=" + maxBookLimit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
