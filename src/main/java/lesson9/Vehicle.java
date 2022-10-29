package lesson9;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private Color color;

    public Vehicle(String make, String model, int year, Color color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public Vehicle(){}
    public Vehicle(String make, Color color){ // Vehicle(String,Color)
        this.make = make;
        this.color=color;
    }
//    public Vehicle(String model, Color color){ // Vehicle(String,Color)
//
//    }
//    public Vehicle(Color color, String model){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
