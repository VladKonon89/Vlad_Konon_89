package computer;

public class Keyboard {
    private String make;
    private String model;
    // add toString()

    public Keyboard(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
