package lesson9vk;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
//        anna.name = "Anna";
        anna.setName("Anna");
        anna.setYear(1922);
        anna.setLastName("Wilson");
        System.out.println(anna.getName());



        Person david = new Person("David","Peterson",1996);

        Person steve = new Person("Steve","Harvey");
        steve.setYear(1998);

//        anna.printMe();
//        david.printMe();
//        steve.printMe();

        Vehicle elenaCar = new Vehicle();
        Vehicle victoriaCar = new Vehicle("BMW", Colors.SILVER);
        Vehicle grigoriiCar = new Vehicle("Honda","Accord", 2010,Colors.BLACK);






//        anna.setYear(1922);
//        anna.setLastName("Wilson");
//
//        Person david = new Person("David","Peterson",1996);
//
//        Person steve = new Person();


    }
}
