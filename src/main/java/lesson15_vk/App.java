package lesson15_vk;

public class App {
    public static void main(String[] args) {
        /// static могут быть только поля(fields) или методы, но не классы ///

        PersonNonStatic person1 = new PersonNonStatic();
        person1.hello();
        // создал объект класса Персон и из него фызвал функцию hello
        // NonStatic функци принадлежит объекту person1

        PersonStatic.hello();
        // когда вызываем статическую функцию, не создаем объект класса, вызываем сразу из имени класса,
        // PersonStatic - это имя класса
        // Static функция принадлежит классу

        Person.hello();

        Person person2 = new Person("David");
        // person2.ошибка  из объекта нельзя вызвать статическую функцию
//        hi();
        person2.hey();

        Person anna = new Person("Anna");
        Person sam = new Person("Sam");

        anna.setXx("zzzzzzz");

        System.out.println(sam.getXx());
    }

    public static void hi(){
        System.out.println("hi");
    }

}
