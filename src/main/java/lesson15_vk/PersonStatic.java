package lesson15_vk;

public class PersonStatic {
    public static void hello(){
        System.out.println("Hello - static");

        // когда вызываем статическую функцию, не создаем объект класса, вызываем сразу из имени класса,
        // PersonStatic - это имя класса
        // Static функция принадлежит классу
        // Из статических функций можно вызвать ТОЛЬКО статические поля(fields) или другие СТАТИЧЕСКИЕ фуекции
    }
}
