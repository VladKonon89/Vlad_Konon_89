package lesson15_vk;

public class Person {
    private String name;  // переменная = variable
    private static String xx;  // static общее поле

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void hello(){  //функция
        System.out.println("hello - static");
        // System.out.println(name);ошибка - name is not static now
        System.out.println(xx); //works
    }

    public void hey(){
        System.out.println(this.name);
        System.out.println(xx);
        hello();
    }
    // THIS - это объект класса
    public void setXx(String x){
        xx=x;
    }
    public String getXx(){
        return xx;
    }
}
