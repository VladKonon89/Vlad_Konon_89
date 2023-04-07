package lesson9vk;

public class App1 {
    public static void main(String[] args) {
        Human vlad = new Human();
        // чтобы вытаскивать значения из приватов (иметь доступ к полям класса) нужно
        // использовать спец функции ГЕТТЕРЫ и СЕТТЕРЫ
        // Сеттеры ничего не возвращают, поэтому они public VOID

        vlad.setName1("Vlad");

        System.out.println(vlad.getName1());

        vlad.setYear1();

    }
}

