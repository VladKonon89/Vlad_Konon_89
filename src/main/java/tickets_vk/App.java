package tickets_vk;

public class App {
    public static void main(String[] args) {
        TicketPrice anna = new TicketPrice(1000,1);
        double price = anna.calculate();
        System.out.println(price);
    }
}
