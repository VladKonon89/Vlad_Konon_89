package homework11_example;

public class Player {
    protected String name;
    protected String lastName;
    protected int number;

    public Player(String name, String lastName, int number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
