
public class Alcohol extends Beverage{
	
	    private boolean isWeekend;
	    private final double WEEKEND_SURCHARGE = 0.60;

	    // Constructor
	    public Alcohol(String bevName, Size size, boolean isWeekend) {
	        super(bevName, Type.ALCOHOL, size);
	        this.isWeekend = isWeekend;
	    }

	    // Getter method
	    public boolean isWeekend() {
	        return isWeekend;
	    }

	    // Override calcPrice method
	    @Override
	    public double calcPrice() {
	        double price = this.addSizePrice();
	        if (isWeekend==true) {
	            price += WEEKEND_SURCHARGE;
	        }
	        return price;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return String.format("Alcohol Beverage: %s, Size: %s, Weekend Offering: %s, Price: $%.2f",
                    getBevName(), getSize(), isWeekend ? "Yes" : "No", calcPrice());
	    }

	    // Override equals method
	    @Override
	    public boolean equals(Object anotherBev) {
	        if (this == anotherBev) {
	            return true;
	        }
	        if (anotherBev == null || getClass() != anotherBev.getClass()) {
	            return false;
	        }
	        Alcohol alcohol = (Alcohol) anotherBev;
	        return super.equals(anotherBev) && isWeekend == alcohol.isWeekend;
	    }

		public void setWeekend(boolean isWeekend) {
			 this.isWeekend = isWeekend;
			
		}
	}


