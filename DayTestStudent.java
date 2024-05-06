

import static org.junit.Assert.*;
import org.junit.Test;

public class DayTestStudent {
	
	@Test
    public void testEnumValuesExist() {
       
        assertNotNull("Enum constant MONDAY should exist", Day.valueOf("MONDAY"));
        assertNotNull("Enum constant TUESDAY should exist", Day.valueOf("TUESDAY"));
        assertNotNull("Enum constant WEDNESDAY should exist", Day.valueOf("WEDNESDAY"));
        assertNotNull("Enum constant THURSDAY should exist", Day.valueOf("THURSDAY"));
        assertNotNull("Enum constant FRIDAY should exist", Day.valueOf("FRIDAY"));
        assertNotNull("Enum constant SATURDAY should exist", Day.valueOf("SATURDAY"));
        assertNotNull("Enum constant SUNDAY should exist", Day.valueOf("SUNDAY"));
    }

    @Test
    public void testEnumValuesCount() {
        
        assertEquals("There should be exactly seven enum constants for Day", 7, Day.values().length);
    }

    @Test
    public void testEnumOrder() {
        
        assertEquals("MONDAY should be the first enum constant", Day.MONDAY, Day.values()[0]);
        assertEquals("TUESDAY should be the second enum constant", Day.TUESDAY, Day.values()[1]);
        assertEquals("WEDNESDAY should be the third enum constant", Day.WEDNESDAY, Day.values()[2]);
        assertEquals("THURSDAY should be the fourth enum constant", Day.THURSDAY, Day.values()[3]);
        assertEquals("FRIDAY should be the fifth enum constant", Day.FRIDAY, Day.values()[4]);
        assertEquals("SATURDAY should be the sixth enum constant", Day.SATURDAY, Day.values()[5]);
        assertEquals("SUNDAY should be the seventh enum constant", Day.SUNDAY, Day.values()[6]);
    }

}
