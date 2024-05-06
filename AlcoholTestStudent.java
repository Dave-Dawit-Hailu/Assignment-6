


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AlcoholTestStudent {
	
	 private Alcohol alcoholWeekend;
	    private Alcohol alcoholWeekday;

	    @Before
	    public void setUp() {
	      
	        alcoholWeekend = new Alcohol("Vodka", Size.MEDIUM, true);
	        alcoholWeekday = new Alcohol("Vodka", Size.MEDIUM, false);
	    }

	    @Test
	    public void testCalcPrice() {
	    
	        assertEquals(3.10, alcoholWeekend.calcPrice(), 0.01);
	        assertEquals(2.5, alcoholWeekday.calcPrice(), 0.01);
	    }

	    @Test
	    public void testToString() {
	        
	        String expectedWeekend = "Alcohol Beverage: Vodka, Size: MEDIUM, Weekend Offering: Yes, Price: $3.10";
	        String expectedWeekday = "Alcohol Beverage: Vodka, Size: MEDIUM, Weekend Offering: No, Price: $2.50";
	        assertEquals(expectedWeekend, alcoholWeekend.toString());
	        assertEquals(expectedWeekday, alcoholWeekday.toString());
	    }

	    @Test
	    public void testEquals() {
	        
	        Alcohol anotherWeekendAlcohol = new Alcohol("Vodka", Size.MEDIUM, true);
	        assertTrue(alcoholWeekend.equals(anotherWeekendAlcohol));

	      
	        assertFalse(alcoholWeekend.equals(alcoholWeekday));
	        
	       
	        assertFalse(alcoholWeekend.equals(new Object()));
	    }

	    @Test
	    public void testIsWeekend() {
	        assertTrue(alcoholWeekend.isWeekend());
	        assertFalse(alcoholWeekday.isWeekend());
	    }

	    @Test
	    public void testSetWeekend() {
	        alcoholWeekday.setWeekend(true);
	        assertTrue(alcoholWeekday.isWeekend());
	        alcoholWeekday.setWeekend(false);
	        assertFalse(alcoholWeekday.isWeekend());
	    }
	
	
	

}
