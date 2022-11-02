package computer;

public class RAM {
    private int size;
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public RAM(int size, String make, String model) {
        this.size = size;
        this.make = make;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "RAM{" +
                "size=" + size +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
