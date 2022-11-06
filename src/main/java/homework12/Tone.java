package homework12;

public class Tone implements Color{
    private String red;


    public Tone(String red) {
        this.red = red;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Tone{" +
                "red='" + red + '\'' +
                '}';
    }

    @Override
    public void mix() {
        System.out.println("I'm mixing colors: "+red+" and "+red);

    }
}
