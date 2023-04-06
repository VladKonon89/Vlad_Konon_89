package lesson7;

public class App {
    public static void main(String[] args) {
        Colors car = Colors.RED;   // car - переменная
        System.out.println(car);
        car = Colors.BLUE;
        System.out.println(car);

        car = Colors.WHITE;

        // энумы нужны для ограничения в ошибке, не можем использовать то, что не задано энумом

        SchoolType newDorpHighSchool = SchoolType.PRIVATE;
        System.out.println(newDorpHighSchool);
    }
}



//public class App {
//    public static void main(String[] args) {
//        Colors car = Colors.RED;
//        System.out.println(car);
//        car = Colors.BLUE;
//        System.out.println(car);
//
//        car = Colors.WHITE;
//
//
//        // "RED" "red" "Red" - разные красные для компьютера
//
//        SchoolType newDorpHighSchool = SchoolType.PUBLIC;
//
//    }
//}
