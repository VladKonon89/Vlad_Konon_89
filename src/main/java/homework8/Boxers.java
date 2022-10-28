package homework8;

public class Boxers {
    public String lastName;
    public String weight;
    public int year;

    public void print() {
        System.out.println(lastName + " became a champ in " + weight + " in " + year);
    }

    public void aboutMe() {
        System.out.println("My last name is " + this.lastName + " I am the champ!");
    }
}
