package lesson15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        anna.printCount();

        Person david = new Person("David");
        Person steve = new Person("Steve");

        anna.printCount();
        david.printCount();
        steve.printCount();

        Person jane = new Person("Jane");
        anna.printCount();

        Person.print();
        hi();
    }
    public static void hi(){
        System.out.println("hi");
    }
}
