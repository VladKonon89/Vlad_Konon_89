package lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;

        int[]numbers = {1,3,2};

        try {
            System.out.println("In try block before problem");
            int c = a/b;
            numbers[1] = 12;
            System.out.println("In try block after problem");
//            throw new IllegalCallerException("Wrong!");
        } catch (ArithmeticException err){
            System.out.println("In the catch block");
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("Catch ALL Errors");
        } finally {
            System.out.println("Will run in ANY case");
        }

        System.out.println("Program finished successfully");

        final int az = 50;
//        az = 90;
    }
}
