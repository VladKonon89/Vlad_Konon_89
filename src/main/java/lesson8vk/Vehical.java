package lesson8vk;

public class Vehical {
    public String make;
    public String model;
    public int year;
    public Colors color;

    public void printInfo(){
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
        System.out.println("Year: "+this.year);

    }

    public void carInfo(){
        System.out.println("Year "+year);
        System.out.println("Color "+color);
        System.out.println("Model "+model);
        System.out.println("Make "+make);
    }
}
