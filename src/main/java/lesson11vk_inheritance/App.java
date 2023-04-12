package lesson11vk_inheritance;

import lesson10vk_composition.Team;

public class App {  // Java не разрешает наследование больше чем из одного класса
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Wilson", 2002, "Math");
        Teacher mrJonson = new Teacher("Alex", "Jonson", 1985, "History");

        System.out.println(anna.getLastName());

    }
}
