


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {

	Coffee coffee;

    @Before
    public void setUp() {
        coffee = new Coffee("Latte", Size.LARGE, true, true);
    }

    @Test
    public void testCalcPrice() {
        assertEquals("Total coffee price", 4.0, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Coffee anotherCoffee = new Coffee("Latte", Size.LARGE, true, true);
        assertTrue("Coffees should be equal", coffee.equals(anotherCoffee));
    }
	
	
}
