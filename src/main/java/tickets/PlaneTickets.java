package tickets;

public class PlaneTickets {
    private int age;
    private int baseFare;

    public PlaneTickets(int age, int baseFare) {
        this.age = age;
        this.baseFare = baseFare;
    }

    public double calculate(){
        if(age<3){
            return 0;
        }
        if(age<13){
            return baseFare*0.5;
        }
        if(age>65){
            return 0.8*baseFare;
        }
        return baseFare;
    }
}
