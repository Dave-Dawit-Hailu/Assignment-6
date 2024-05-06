

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class OrderTestStudent {
	 private Order order;

	    @Before
	    public void setUp() {
	        order = new Order(13, Day.WEDNESDAY, new Customer("Alex", 33));
	    }

	    @After
	    public void tearDown() {
	        order = null;
	    }

	    @Test
	    public void testOrderTotalWithOnlyCoffee() {
	        order.addNewBeverage("Espresso", Size.LARGE, true, true);
	        order.addNewBeverage("Cappuccino", Size.MEDIUM, false, true);
	        double expectedTotal = (2.0 + 1.0 + 0.5 + 0.5) + (2.5 + 0.5); 
	        assertEquals(expectedTotal, order.calcOrderTotal(), 0.01);
	    }

	    @Test
	    public void testOrderTotalWithDifferentBeverages() {
	        order.addNewBeverage("Latte", Size.SMALL, true, false);
	        order.addNewBeverage("Wine", Size.SMALL); 
	        order.addNewBeverage("Berry Blast", Size.MEDIUM, 3, true); 
	        double expectedTotal = (2.0 + 0.5) + 2.0 + (2.5 + 3 * 0.5 + 1.5);
	        assertEquals(expectedTotal, order.calcOrderTotal(), 0.01);
	    }

	    @Test
	    public void testBeverageEqualityAcrossOrders() {
	        Order anotherOrder = new Order(9, Day.THURSDAY, new Customer("Sam", 27));
	        order.addNewBeverage("House Blend", Size.SMALL, false, false);
	        anotherOrder.addNewBeverage("House Blend", Size.SMALL, false, false);
	        assertTrue(order.getBeverage(0).equals(anotherOrder.getBeverage(0)));
	    }

	    @Test
	    public void testOrderTotalOnWeekend() {
	        Order weekendOrder = new Order(15, Day.SATURDAY, new Customer("Dana", 29));
	        weekendOrder.addNewBeverage("Cold Brew", Size.SMALL, false, false);
	        weekendOrder.addNewBeverage("Chardonnay", Size.LARGE); 
	        double expectedTotal = 2.0 + (3.0 + 0.60); 
	        assertEquals(expectedTotal, weekendOrder.calcOrderTotal(), 0.01);
	    }

	    @Test
	    public void testAddBeverageIncreasesItemCount() {
	        assertEquals(0, order.getTotalItems());
	        order.addNewBeverage("Iced Tea", Size.SMALL, false, false);
	        assertEquals(1, order.getTotalItems());
	        order.addNewBeverage("Pinot Noir", Size.MEDIUM);
	        assertEquals(2, order.getTotalItems());
	    }

	    @Test
	    public void testFindNumOfBeveType() {
	        order.addNewBeverage("Iced Coffee", Size.SMALL, false, true);
	        order.addNewBeverage("Iced Coffee", Size.LARGE, true, true);
	        order.addNewBeverage("Merlot", Size.MEDIUM);
	        assertEquals(2, order.findNumOfBeveType(Type.COFFEE));
	        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
	    }

}
