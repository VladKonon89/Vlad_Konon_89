package lesson8;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void hi(){
        System.out.println("Hi, my name is "+this.name+", nice to meet you");
    }

    public void hello(String name){
        System.out.println("Hello "+name+", my name is "+this.name+", nice to meet you");
    }

    public void printMe(){
        System.out.println("Name: "+ name+"\nLast name: "+this.lastName+"\nYear of Birth: "+this.year);
    }
}
