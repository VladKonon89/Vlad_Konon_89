package homework7;

public class App {
    public static void main(String[] args) {
        Boxers heavyweight = Boxers.TYSON;
        System.out.println(heavyweight);
        heavyweight = Boxers.LEWIS;
        System.out.println(heavyweight);

        Boxers middleweight = Boxers.CANELO;
        System.out.println(middleweight);
        middleweight = Boxers.GOLOVKIN;
        System.out.println(middleweight);

        Boxers welterweight = Boxers.FLOYD;
        System.out.println(welterweight);
        welterweight = Boxers.MANNY;
        System.out.println(welterweight);

        Directions where = Directions.NORTH;
        System.out.println(where);
        where = Directions.EAST;
        System.out.println(where);
        where = Directions.SOUTH;
        System.out.println(where);
        where = Directions.WEST;
        System.out.println(where);


    }
}
