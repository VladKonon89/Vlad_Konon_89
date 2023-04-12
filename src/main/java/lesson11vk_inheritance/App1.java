package lesson11vk_inheritance;

public class App1 {
    public static void main(String[] args) {
        Schoolboy vlad = new Schoolboy("Vlad","Jones", 2010,"Math");
        Instructor mrSmith = new Instructor("Alex","Smith",1989,"History");

        System.out.println(vlad.getLastname());

    }
}
