package tickets_vk;

public class TicketPrice {
    private double basePrice;
    private int age;

    public TicketPrice(double basePrice, int age){
        this.basePrice = basePrice;
        this.age=age;
    }

    public double calculate(){
        if(age<=2){
            return 0.0;
        }
        if(age<=12){
            return basePrice*0.5;
        }
        if(this.age>65){
            return this.basePrice*0.8;
        }
        return this.basePrice;
    }
}
