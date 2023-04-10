package lesson9vk;

public class Car {
    private String make1;
    private String model1;
    private int year1;
    private Colors color;

    public Car(String make1,String model1,int year1,Colors color){
        this.make1=make1;
        this.model1=model1;
        this.year1=year1;
        this.color=color;
    }
    public Car(){}

    public Car(String make1,Colors color){
        this.make1=make1;
        this.color=color;
    }

    public String getMake1(){
        return make1;
    }
    public void setMake1(String make1){
        this.make1=make1;
    }
    public String getModel1(){
        return getModel1();
    }
    public void setModel1(String model1){
        this.model1=model1;
    }
    public int getYear1(){
        return getYear1();
    }
    public void setYear1(int year1){
        this.year1=year1;
    }
    public Colors getColor(){
        return getColor();
    }
    public void setColor(Colors color){
        this.color=color;
    }

    public void printCar(){
        System.out.println("Model "+model1+"\nMake "+make1+"\nYear "+year1+"\nColor "+color);;
    }
}
