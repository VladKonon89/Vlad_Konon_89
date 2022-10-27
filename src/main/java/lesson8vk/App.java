package lesson8vk;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.year=1998;
        anna.name="Anna";
        anna.lastName="Wilson";

//        System.out.println("Name "+ anna.name+"\nLast name "+anna.lastName+"\nYear of Birth " +anna.year);

        Person david = new Person();
        david.name = "David";
        david.year = 1999;
        david.lastName = "Dole";

        Person steve = new Person();
        steve.lastName="Harvey";
        steve.year=1995;
        steve.name="Steve";

        Person alex = new Person();
        alex.lastName="Jonson";
        alex.name="Alex";

//        System.out.println(alex.name);
//        System.out.println(alex.year);

        Vehical kristinaCar =new Vehical();
        kristinaCar.make="Tesla";
        kristinaCar.year=2020;
        kristinaCar.color=Colors.PINK;
        kristinaCar.model = "Model3";
        kristinaCar.model = "Model Y";

        Vehical myCar = new Vehical();
        myCar.model = "Camry";
        myCar.year=2012;
        myCar.make = "Toyota";
        myCar.color = Colors.PINK;


//        anna.hi();
//        david.hi();
//        steve.hi();
//
//        alex.hello("Jane");

//        kristinaCar.printInfo();
//        myCar.printInfo();

        anna.printMe();
        david.printMe();
        steve.printMe();

    }
}
