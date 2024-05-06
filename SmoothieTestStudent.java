

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {
	
	  Smoothie smoothie;

	    @Before
	    public void setUp() {
	        smoothie = new Smoothie("Berry", Size.SMALL, 3, true);
	    }

	    @Test
	    public void testCalcPrice()
	    {
	        assertEquals("Total smoothie price", 5.0, smoothie.calcPrice(), 0.01);
	    }

}
