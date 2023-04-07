package lesson8vk;

public class Human {
    public String nickName;  // поле (field) класса
    public String surName;
    public int yearBorn;

    // функци в классе называется МЕТОД

    public void goodMorning(){
        System.out.println("Good Morning, ma name is "+nickName+" good to see you");
    }

    public void buy(String nickName){
        System.out.println("Buy "+nickName+" my name is "+this.nickName+" see you");
    }

    public void giveInfo(){
        System.out.println("Nickname "+ this.nickName+"\nSurname "+this.surName+"\nYear of Birth "+this.yearBorn);
    }

}
