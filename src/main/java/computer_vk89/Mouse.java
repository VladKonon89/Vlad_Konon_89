package computer_vk89;

public class Mouse {
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public Mouse(String make, String model) {
        this.make = make;
        this.model = model;
    }

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

    @Override
    public String toString() {
        return "Mouse{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
