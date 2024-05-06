//import static org.junit.jupiter.api.Assertions.*;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {
	
	private BevShop bevShop;
	
	@Before
	public void setUp() {
	    bevShop = new BevShop();
	    bevShop.startNewOrder(10, Day.MONDAY, "Alice", 22); 
	}

  

    @Test
    public void testStartNewOrder_ValidConditions() {
        bevShop.startNewOrder(12, Day.MONDAY, "John", 25);
        assertNotNull("Order should be created", bevShop.getCurrentOrder());
    }

    @Test
    public void testIsValidTime() {
        BevShop shop = new BevShop();
        assertTrue("Should return true for 8 AM", shop.isValidTime(8));
        assertTrue("Should return true for 11 PM", shop.isValidTime(23));
        assertFalse("Should return false for 7 AM", shop.isValidTime(7));
        assertFalse("Should return false for midnight", shop.isValidTime(24));
    }

    @Test
    public void testProcessCoffeeOrder() {
        bevShop.startNewOrder(10, Day.MONDAY, "Alice", 30);
        bevShop.processCoffeeOrder("Espresso", Size.SMALL, true, false);
        assertEquals("Should have 1 beverage", 1, bevShop.getCurrentOrder().getTotalItems());
    }

    @Test
    public void testProcessAlcoholOrder_NotEligibleForMore() {
        bevShop.startNewOrder(10, Day.MONDAY, "Bob", 22);
        // adding 3 alcohol drinks
        for (int i = 0; i < 3; i++) {
            bevShop.processAlcoholOrder("Beer", Size.LARGE);
        }
        bevShop.processAlcoholOrder("Beer", Size.LARGE);
        assertEquals(0, 3, bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
    }

    @Test
    public void testTotalOrderPrice() {
        bevShop.startNewOrder(10, Day.MONDAY, "Dave", 24);
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, false, true);
        bevShop.processAlcoholOrder("Whiskey", Size.SMALL);
        double expectedPrice = 3.0 + 2.0; // 
        assertEquals("Total price should match", expectedPrice, bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()), 0.01);
    }

    @Test
    public void testFindOrder() {
        bevShop.startNewOrder(10, Day.MONDAY, "Eve", 29);
        Order currentOrder = bevShop.getCurrentOrder();
        int orderNo = currentOrder.getOrderNo();
        assertEquals("Should find the order", currentOrder, bevShop.getOrderAtIndex(bevShop.findOrder(orderNo)));
    }

    @Test
    public void testTotalMonthlySale() {
        bevShop.startNewOrder(10, Day.MONDAY, "Frank", 35);
        bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, true, true);
        bevShop.startNewOrder(11, Day.TUESDAY, "Grace", 28);
        bevShop.processSmoothieOrder("Green Mix", Size.SMALL, 2, true);
        double expectedSales = 4.5 + 4.0; 
        assertEquals("Total monthly sales should match", expectedSales, bevShop.totalMonthlySale(), 0.01);
    }
    
    

}
