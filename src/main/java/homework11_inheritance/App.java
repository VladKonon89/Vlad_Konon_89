package homework11_inheritance;

import lesson11vk_inheritance.Teacher;

public class App {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya", "Pupkin",10);
        Team rangers = new Team("Rangers",1,"NewnYork", "NY");

        System.out.println(vasya.getLastName());

    }
}
