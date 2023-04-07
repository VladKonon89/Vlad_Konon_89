package homework8;

import homework7.Cities;

public class App {
    public static <City> void main(String[] args) {
//        Boxers tyson = new Boxers();
//        tyson.lastName = "Tyson";
//        tyson.weight = "the heavyweight division";
//        tyson.year = 1988;
//        tyson.print();
//
//        Boxers usyk = new Boxers();
//        usyk.lastName = "Usyk";
//        usyk.weight = "the cruserweight division";
//        usyk.year = 2021;
//        usyk.print();
//
//        tyson.aboutMe();
//        usyk.aboutMe();

//        Teams shakhtar = new Teams();
//        shakhtar.name="Shakhtar Donetsk";
//        shakhtar.league="Ukrainian championship";
//        shakhtar.money=20.8;
//        shakhtar.cost();
//
//        Teams barcelona = new Teams();
//        barcelona.name = "Barcelona FC";
//        barcelona.league="Spanish Primera";
//        barcelona.money=50.5;
//        barcelona.cost();

        Daughters sofia = new Daughters();
        sofia.name="Sofia";
        sofia.years= 7.6;
        sofia.form= 2;

        Daughters nika = new Daughters();
        nika.name = "Nika";
        nika.years = 5.8;
        nika.form = 1;

//        sofia.hi();
//        sofia.hello("Jane", 7.9);
//        nika.hi();
//        nika.hello("Lucy", 6.3);

        States state = new States();
        state.state= "California";
        state.date= 9;
        state.month= "September";
        state.year = 1850;

        state.admitted();
        state.takenFrom("Mexico.");

        System.out.println("------------------------------");

        States nystate = new States();
        nystate.state = "New York";
        nystate.date = 26;
        nystate.month = "July";
        nystate.year= 1788;

        nystate.admitted();
        nystate.takenFrom("Netherlands");


    }

}
