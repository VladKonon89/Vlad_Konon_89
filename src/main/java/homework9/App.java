package homework9;

public class App {
    public static void main(String[] args) {
        Boxers tyson = new Boxers();
        tyson.setLastname("Tyson");
//        System.out.println(tyson.getLastname());
        tyson.setWeight("heavyweight");
//        System.out.println(tyson.getWeight());
        tyson.setYear(1988);
//        System.out.println(tyson.getYear());
        tyson.print();
        tyson.printMe();

        System.out.println("");

        Boxers canelo = new Boxers("Canelo", "middleweight", 2013);
        canelo.print();
        canelo.printMe();

        ///////////////////////////////////////////////////////////
        System.out.println("");

        Daughters sofia = new Daughters();
        sofia.setName("Sofia");
//        System.out.println(sofia.getName());
        sofia.setForm(2);
//        System.out.println(sofia.getForm());
        sofia.setYears(7.6);
//        System.out.println(sofia.getYears());
        sofia.hi();
        sofia.hello("Jane",7.9);

        System.out.println("");

        Daughters nika = new Daughters("Nika", 1, 5.8);
        nika.hi();
        nika.hello("Lucy", 6.3);

        ////////////////////////////////////////////////
        System.out.println("");

        States state = new States();
        state.setState("California");
        state.setMonth("September");
        state.setDate(9);
        state.setYear(1850);

        state.admitted();
        state.takenFrom("Mexico");

        System.out.println("");

        States nystate = new States("New york","July",26,1788);
        nystate.admitted();
        nystate.takenFrom("Netherlands");

        ////////////////////////////////////////////////////////
        System.out.println("");

        Teams shakhtar = new Teams();
        shakhtar.setName("Shakhtar Donetsk");
        shakhtar.setLeague("Ukrainian championship");
        shakhtar.setMoney(20.8);
        shakhtar.cost();
        
        Teams barcelona = new Teams("Barcelona FC", "Spanish Primera", 50.5);
        barcelona.cost();

    }
}