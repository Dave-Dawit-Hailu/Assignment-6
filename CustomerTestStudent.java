

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {
	 
	
		Customer customer;

	    @Before
	    public void setUp() {
	        customer = new Customer("John", 30);
	    }

	    @Test
	    public void testCustomerDetails() {
	        assertEquals("Name should match", "John", customer.getName());
	        assertEquals("Age should match", 30, customer.getAge());
	    }
	
	
}
