package untiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets_vk.TicketPrice;

// Unit tests тестируют только public методы в классах, privat не тестируем. 1 test = 1 method

public class TicketTest {
    @Test
    public void ticketPrice_infant_priceIsZero(){
        // Arrange (precondition/given)
        TicketPrice david = new TicketPrice(1000,1);

        // Act (when)
        double price = david.calculate();

        // Assert (then) - static function, сравнивает expected & actual
        Assert.assertEquals(price, 0.0);
    }

    @Test
    public  void ticketPrice_child_priceIs50percent(){
        TicketPrice david = new TicketPrice(1000,8);
        double price = david.calculate();
        Assert.assertEquals(price,500.0);
    }

    @Test
    public void ticketPrice_adult_fullPrice(){
        TicketPrice david = new TicketPrice(1000,28);
        double price = david.calculate();
        Assert.assertEquals(price,1000.0);
    }

    @Test
    public void ticketPrice_senior_priceIs80percent(){
        TicketPrice david = new TicketPrice(1000,68);
        double price = david.calculate();
        Assert.assertEquals(price,800.0);
    }
}
