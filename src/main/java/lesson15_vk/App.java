package lesson15_vk;

import lesson11vk_inheritance.Person;

public class App {
    public static void main(String[] args) {
        /// static могут быть только поля(fields) или методы, но не классы ///

        PersonNonStatic person1 = new PersonNonStatic();
        person1.hello();
    }
}
