package lesson11;

public class App {
    public static void main(String[] args) {
        Student anna = new Student("Anna","Wilson",2002,"Math");
        Teacher mrJonson = new Teacher("Alex","Jonson",1985,"History");

        System.out.println(anna.getLastName());

    }
}
