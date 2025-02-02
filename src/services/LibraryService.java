package services;
import entities.Book;
import entities.MemberRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {
    private List<Book> books;
    private Map<Long, MemberRecord> members;

    public Map<Long, MemberRecord> getMembers() {
        return members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public LibraryService() {
        books = new ArrayList<>();
        members = new HashMap<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getName());
    }

    public void removeBook(long bookId){
        books.removeIf(book -> book.getBookId() == bookId);
        System.out.println("Book removed.");
    }

    public Book findBookById(long id){
        for(Book book: books) {
            if(book.getBookId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book book: books){
            if(book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public void borrowBook(MemberRecord member, long bookId) {
        Book book = findBookById(bookId);
        if(book != null) {
            member.borrowBook(book);
        }
    }

    public void returnBook(MemberRecord member, long bookId, int daysLate) {
        Book book = findBookById(bookId);
        if (book != null) {
            member.returnBook(book, daysLate);
        }
    }

}
