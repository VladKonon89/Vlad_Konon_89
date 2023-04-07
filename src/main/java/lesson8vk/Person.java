package lesson8vk;

public class Person {
    public String name;  // поля хранят данные
    public String lastName;
    public int year;

    public void hi(){
        System.out.println("Hi, my name is "+name+", nice to meet you!");
    }

    public void hello(String name){  // эта функция в качестве вргумента берет переменную Name
                                     // this указывает, что NAME относится к объекту класса(обращаемся к разным Неймам)
        System.out.println("Hello "+name+" my name is "+this.name+", nice to meet you!");
    }

    public void printMe(){
        System.out.println("Name "+name+"\nLast name "+this.lastName+"\nYear of Birth " +this.year);

    }
}
