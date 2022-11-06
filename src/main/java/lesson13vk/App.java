package lesson13vk;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b =a;
        a = 17;
//        System.out.println("b="+b);

        Person anna = new Person("Anna");
        Person student = anna;
        anna.setName("Anita");
//        System.out.println(student.getName());

        Person anita = new Person("Anita");
//        System.out.println(student==anna);
//        System.out.println(anita==anna);

        String str1 = "Hello";
        String str2= "Hello";
//        System.out.println(str2==str1);
//        System.out.println(str2.equals(str1));
        System.out.println(anna.equals(anita));

    }
}
