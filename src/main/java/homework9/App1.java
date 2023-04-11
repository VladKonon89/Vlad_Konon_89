package homework9;

import java.util.concurrent.Callable;

public class App1 {
    public static void main(String[] args) {
        City prague = new City();
        prague.setCityName("Prague");
//        System.out.println(prague.getCityName());  // распечатать
        prague.setCountry("Czech Rep");
        prague.setYearFounded(950);
        prague.setTemp(20.8);
        prague.printInfo();

        City vienna = new City("Vienna", "Austria", 500, 23.9);
        vienna.printInfo();

        System.out.println("-------------");

        Provinces alberta = new Provinces();
        alberta.setProvince("Alberta");
        alberta.setCapital("Edmonton");
        alberta.setIncome(10090.03);
        alberta.setYear(2023);
        alberta.printInfo2();

        Provinces ontario = new Provinces("Ontario","Toronto",90000.30,2022);
        ontario.printInfo2();

        System.out.println("-------------");

        Kids sofia = new Kids();
        sofia.setAge(8);
        sofia.setName("Sofia");
        sofia.printKids();

        Kids nika = new Kids("Nika",6);
        nika.printKids();



    }
}
