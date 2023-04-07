package lesson9vk;

public class Human {
    private String name1;
    private String lastName1;
    private int year1;

    // чтобы вытаскивать значения из приватов (иметь доступ к полям класса) нужно
    // использовать спец функции ГЕТТЕРЫ (get) и СЕТТЕРЫ (set)
    // Сеттеры ничего не возвращают, поэтому они public VOID

    public void setName1(String name1){  // сеттер это функция, которая дает значение полю
        this.name1=name1;
    }

    // Геттер возвращает
    public String getName1() {
        return name1;
    }

    public void setLastName1(String lastName1){
        this.lastName1=lastName1;
    }

    public void setYear1(int year2){
        year1=year2;
    }

}
