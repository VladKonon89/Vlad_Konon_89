package lesson10vk;

public class App {
    public static void main(String[] args) {
//        String a = new String("Hello");
//        char[] xx = {'h','e','l','l','o'};
//        String hello = new String(xx);

        Address annaAddress = new Address("12 Sun str","Irvine",99874,State.CA);
        Person anna = new Person("Anna","Senna",annaAddress, 1985);

//        Address addr = anna.getAddress();
//        String city = addr.getCity();
        String city = anna.getAddress().getCity();  // chain of getters
        System.out.println(city);

        String davidName = "David";
        Address davidAddress = new Address("789 Elm str","Gotham city",33404,State.FL);
        Person david = new Person(davidName,"Maxwell",davidAddress,1994);

        Team blueSquid = new Team(anna,david);
        State davidState = blueSquid.getPlayer().getAddress().getState();
//        System.out.println(davidState);
//
//
//        System.out.println(anna);
//        System.out.println(annaAddress);

        System.out.println(blueSquid);

    }
}
