package homework11_inheritance;

public class Teammate extends Player {
    private double time;

    public Teammate(int number, String lastName, String name, double time) {
        super(name,lastName,number);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
