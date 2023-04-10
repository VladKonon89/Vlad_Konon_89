package lesson9vk;

public class Human {
    private String name1;
    private String lastName1;
    private int year1;

    // Правило инкапсуляции - ВСЕ ПОЛЯ PRIVATE, к ним нет прямого доступа только через геттеры и сеттеры
    // чтобы вытаскивать значения из приватов (иметь доступ к полям класса) нужно
    // использовать спец функции ГЕТТЕРЫ (get) и СЕТТЕРЫ (set)
    // Сеттеры ничего не возвращают, поэтому они public VOID


    // Конструктор (это метоод/функция), паблик
    public Human (String name1,String lastName1, int year1){
        this.name1=name1;
        this.lastName1=lastName1;
        this.year1=year1;
    }

    public Human(String name1,String lastName1){
        this.name1=name1;
        this.lastName1=lastName1;
    }

    public Human(){}   // Пустой конструктор, обычно он невидимый(дефолтный конструктор), есть в каждом классе
                       // Создается, чтобы не было ошибки в объекте в App1

    public void setName1(String name1){  // сеттер это функция, которая дает значение полю
//        if (name1.trim().length() == 0){
//            throw new IllegalArgumentException("Wrong name");
//        }
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
//        year1=year2;
        if (year2>2023 || year2<1900){   // validation - проверка
            throw new IllegalArgumentException("Wrong year");
        }
        year1=year2;

    }

    public void prinME(){
        System.out.println("Name "+name1+"\nLastname "+this.lastName1+"\nYear "+this.year1);
    }

}
