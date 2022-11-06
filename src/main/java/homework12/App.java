package homework12;

public class App {
    public static void main(String[] args) {
        Tone red = new Tone("red");
        Color green = new Tone("green");
        System.out.println(green);

        Amount redLitter = new Amount(10,12);
        System.out.println(redLitter.getGreenLitters());

    }
}
