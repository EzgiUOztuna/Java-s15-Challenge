import entities.Book;
import entities.MemberRecord;
import services.LibraryService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LibraryService libraryService = new LibraryService();

    public static void main(String[] args) {
        Book studyBook = new StudyBooks(1, "Author A", "Author A0", 25.0, "Available", 5, LocalDate.of(2023,03,5), "Computer Programming");
        Book magazine = new Magazines(2, "Author B", "Author B0", 30.0, "Not Available", 8, LocalDate.now());

        libraryService.addBook(studyBook);
        libraryService.addBook(magazine);

        System.out.println("*****************************************************************************************");

        MemberRecord student = new Student(1, "student", LocalDate.ofYearDay(2025,15), "no", 5, "Ezgi", "Library", 123456789);
        libraryService.getMembers().put(student.getMemberID(), student);

        while(true) {
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
            int option = scanner.nextInt();

            if(option == 1){
                System.out.print("Enter Book ID to borrow: ");
                long bookId = scanner.nextLong();
                libraryService.borrowBook(student, 123456);
            } else if(option == 2) {
                System.out.print("Enter Book ID to return: ");
                long bookId = scanner.nextLong();
                System.out.print("Enter number of days late: ");
                int daysLate = scanner.nextInt();
                libraryService.returnBook(student, 123456, daysLate);
            } else {
                break;
            }
        }
    }
}