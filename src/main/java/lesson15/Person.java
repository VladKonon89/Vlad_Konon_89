package lesson15;

public class Person {
    private String name;
    private static int count;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public void printCount() {
        System.out.println(count);
//        hi();
//        print();
    }

    public static void print(){
        System.out.println("Hello");
        hi();
        System.out.println(count);
    }
    public static void hi(){
        System.out.println("Hi");
    }
}
