import java.util.Objects;

public class Librarian {
    private String name;
    private String password;

    public Librarian() {

    }
    public Librarian(String name, String password){
        this.name=name;
        this.password=password;
    }

    //***********************************************************************

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    //***********************************************************************

    public void searchBook(){

    }

    public void verifyMember(){

    }

    public void issueBook(){

    }

    public void calculateFine(){

    }

    public void createBill(){

    }

    public void returnBook(){

    }

    //***********************************************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Librarian librarian = (Librarian) o;
        return Objects.equals(name, librarian.name) && Objects.equals(password, librarian.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
