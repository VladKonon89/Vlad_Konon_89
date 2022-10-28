package lesson9vk;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
//        anna.name = "Anna";
        anna.setName("Anna");
        anna.setYear(1922);
        anna.setLastName("Wilson");

        Person david = new Person("David","Peterson",1996);

        Person steve = new Person();


    }
}
