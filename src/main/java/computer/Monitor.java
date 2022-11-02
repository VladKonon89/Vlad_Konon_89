package computer;

public class Monitor {
    private int diagonal;
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public Monitor(int diagonal, String make, String model) {
        this.diagonal = diagonal;
        this.make = make;
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
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
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
