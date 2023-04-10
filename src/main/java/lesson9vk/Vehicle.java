package lesson9vk;

import lesson9.Color;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private Colors color;

    public Vehicle(String make, String model, int year, Colors color) {  //constructor
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Vehicle() {}  //empty constructor
    //constructor can be private

    public Vehicle(String make, Colors color) {  //constructor// signatura Vehicle (String,Colors)
        this.make = make;                        // не можем создватать конструкторы с одинаковой сигнатурой
        this.color = color;
    }
//    public Vehicle(String model, Colors color) {} //constructor// same signatura Vehicle (String,Colors) doesn't work
//    public Vehicle(Colors color, String model){} another signature works fine


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

    public Colors getColors() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
