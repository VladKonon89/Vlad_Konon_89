package homework11_inheritance;

public class Couch extends Player {
    private int year;

    public Couch(String name, String lastName, int year) {
        super(name,lastName);
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
