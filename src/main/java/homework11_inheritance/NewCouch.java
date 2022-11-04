package homework11_inheritance;

public class NewCouch extends Couch{
    private double date;

    public NewCouch(String name, String lastName, int year,double date) {
        super(name, lastName, year);
        this.date=date;
    }

    public double getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void representation1(){
        System.out.println("Hello, guys, I am "+name+" my number is "+date);
    }
}
