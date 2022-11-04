package homework11_example;

public class App {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya","Pupkin", 10);
        Team rangers = new Team("Rangers","NewnYork",1, "NY");

        System.out.println(vasya.getLastName());

    }
}
