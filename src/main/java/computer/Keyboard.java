package computer;

public class Keyboard {
    private String make;
    private String model;
    //add toString()

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

    public static class VideoAdapter {
        private String gpuModel;
        private String make;
        private String model;
        //complete class: constructor 1, g/s, toString()
    }
}
