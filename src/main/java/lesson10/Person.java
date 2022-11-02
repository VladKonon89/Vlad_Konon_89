package lesson10;

public class Person {
    private String name;
    private String lastName;
    private Address addr;
    private int year;

    public Person(String name, String lastName, Address address, int year) {
        this.name = name;
        this.lastName = lastName;
        this.addr = address;
        this.year = year;
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

    public Address getAddress() {
        return addr;
    }

    public void setAddress(Address address) {
        this.addr = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addr=" + addr +
                ", year=" + year +
                '}';
    }
}
