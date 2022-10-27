package lesson8;

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public Color color;

    public void printInfo(){
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
        System.out.println("Year: "+this.year);
    }
}
