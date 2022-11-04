package homework11_inheritance;

public class App {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya","Pupkin",10);
        Team rangers = new Team("Rangers","NY",23);
        Couch peterson = new Couch("Jordan","Peterson", 64);
        Teammate vova = new Teammate(20,"Petrov","Vova",2.55);
        NewCouch ivanov = new NewCouch("Igor","Ivanov",55,9.10);

        System.out.println(rangers.getQuantityofPlayers());
        vasya.representation();
        ivanov.representation1();

        Player adam = new Player("Adam","Fox",44);
        Team barys = new Team("Barys","Astana", 28);
        Couch tarasov = new Couch("Anatoliy", "Tarasov",88);
        Teammate panarin = new Teammate(15,"Panarin","Artem", 4.22);
        NewCouch sidorov = new NewCouch("Alex","Sidorov",75,11.12);

        System.out.println("My name is "+vasya.name+" and my last name is not "+vova.getLastName());
        System.out.println(panarin.getTime());
        panarin.representation();
        tarasov.representation();
    }
}
