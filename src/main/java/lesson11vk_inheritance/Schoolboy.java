package lesson11vk_inheritance;

public class Schoolboy extends Human {
//    private String name;     // можно убрать поля дублирующиеся из чайлд классов
//    private String lastname;
//    private int year;
    private String major;

    public Schoolboy(String name, String lastname, int year, String major) {
        super(name,lastname,year);  // передаем указанные поля в конструктор базовый(супер) класса Human
        this.major = major;
    }

//    public String getName() {   // можем избавиться от дублирующихся сеттеров и геттеров из базового(супер) класса
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getLastname() {
//        return lastname;
//    }
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//    public int getYear() {
//        return year;
//    }
//    public void setYear(int year) {
//        this.year = year;
//    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
