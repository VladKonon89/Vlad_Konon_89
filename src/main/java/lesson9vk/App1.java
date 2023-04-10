package lesson9vk;

public class App1 {
    public static void main(String[] args) {
        Human vlad = new Human();   // Объект для пустого (дефолтного) конструктора

        // чтобы вытаскивать значения из приватов (иметь доступ к полям класса) нужно
        // использовать спец функции ГЕТТЕРЫ и СЕТТЕРЫ
        // Сеттеры ничего не возвращают, поэтому они public VOID

        vlad.setName1("Vlad");
        System.out.println(vlad.getName1());
        vlad.setYear1(1900);
        vlad.setLastName1("Konon");

        Human john = new Human("John","Jons", 1987);  // Создам объект для конструктора

        Human steve = new Human("Steve","Harvey");
        steve.setYear1(1998);

//        vlad.prinME();
//        steve.prinME();

        Car vladCar = new Car();
        Car jonCar = new Car("BMW",Colors.BLACK);
        Car nikaCar = new Car("Nissan","Rog",2014, Colors.SILVER );

        jonCar.printCar();
        nikaCar.printCar();

    }
}

