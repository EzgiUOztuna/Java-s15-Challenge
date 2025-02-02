package entities;

import java.util.Objects;

public class Person {
    private String name;

    public Person() {

    }
    public Person(String name) {
        this.name= name;
    }

    //***********************************************************************

    public String getName(){
        return name;
    }

    //***********************************************************************

    public void whoYouAre() {

    }

    //***********************************************************************


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "entities.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
