package homework12;

public class Amount implements Color {
    private int redLittters;
    private int greenLitters;

    public Amount(int redLittters, int greenLitters) {
        this.redLittters = redLittters;
        this.greenLitters = greenLitters;
    }

    public int getRedLittters() {
        return redLittters;
    }

    public void setRedLittters(int redLittters) {
        this.redLittters = redLittters;
    }

    public int getGreenLitters() {
        return greenLitters;
    }

    public void setGreenLitters(int greenLitters) {
        this.greenLitters = greenLitters;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "redLittters=" + redLittters +
                ", greenLitters=" + greenLitters +
                '}';
    }

    @Override
    public void mix() {
        System.out.println("I'm mixing colors in the amount of: "+redLittters+" and "+greenLitters);

    }

    @Override
    public String getColor() {
        return null;
    }
}
