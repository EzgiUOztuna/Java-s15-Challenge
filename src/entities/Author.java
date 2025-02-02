package entities;

public class Author extends Person {
    private String[] books;

    public Author(String name, String[] books) {
        super(name);
        this.books=books;

    }
    public Author(String[] books) {
        this.books=books;
    }

    //***********************************************************************

    public String[] getBooks() {
        return books;
    }

    //***********************************************************************

    public void newBook() {

    }

    public void showBook(){

    }

    @Override
    public void whoYouAre() {
        System.out.println("I'm an author. My name is " + getName());

    }
}
