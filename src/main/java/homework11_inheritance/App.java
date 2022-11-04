package homework11_inheritance;

public class App {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya","pupkin",10);
        Team rangers = new Team("Rangers","NY",23);
        Couch peterson = new Couch("Jordan","Peterson", 64);

        System.out.println(rangers.getQuantityofPlayers());

    }
}
