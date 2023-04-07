package lesson8vk;

public class App {
    public static void main(String[] args) {  // мейн - это программа, которая запускается, все происходит внутри класса мейн
        Person anna = new Person();   // мы создали переменную (или объект) Анна класса Персон
        anna.year=1998;               // класс - это шаблон (по которому мы делаем), он описывает как должен выглядеть объект Персон
        anna.name="Anna";
        anna.lastName="Wilson";

//        System.out.println("Name "+ anna.name+"\nLast name "+anna.lastName+"\nYear of Birth " +anna.year);

        Person david = new Person();  // в одной переменной (объекте) содержится вся инфа
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

        System.out.println();

        Human sonia = new Human();
        sonia.yearBorn = 2014;
        sonia.nickName = "Sonia";
        sonia.surName = "Konon";

        System.out.println("Nickname "+ sonia.nickName+"\nSurname "+sonia.surName+"\nYear of Birth "+sonia.yearBorn);

        Human nika = new Human();
        nika.nickName = "Nika";
        nika.yearBorn = 2017;
        nika.surName = "Konon";

        Human vlad = new Human();
        vlad.surName = "Konon";
        vlad.yearBorn = 1989;
        vlad.nickName = "Vlad";

        Human nata = new Human();
        nata.surName = "Semak";
        nata.nickName = "Nata";

//        System.out.println(nata.nickName);   // распечатает как в эрреях
//        System.out.println(nata.yearBorn);

        System.out.println();

        Vehical vladCar = new Vehical();
        vladCar.make = "Nissan";
        vladCar.year = 2014;
        vladCar.color = Colors.SILVER;
        vladCar.model = "Quash";
        vladCar.model = "Rogue";

        Vehical nastCar = new Vehical();
        nastCar.model = "Journey";
        nastCar.year = 2015;
        nastCar.make = "Dodge";
        nastCar.color = Colors.PINK;

//        vlad.goodMorning();
//        sonia.goodMorning();
//        nika.goodMorning();
//
//        vlad.buy("Alex");

        // методы работают в зависимости от переменной из которой мы их вызываем

//        vladCar.carInfo();
//        nastCar.carInfo();

        vlad.giveInfo();
        sonia.giveInfo();
        nika.giveInfo();

    }
}
