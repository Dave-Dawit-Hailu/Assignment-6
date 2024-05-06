

	public class Coffee extends Beverage {
	    private boolean extraShot;
	    private boolean extraSyrup;
	    private final double EXTRA_SHOT_PRICE = 0.50;
	    private final double EXTRA_SYRUP_PRICE = 0.50;

	    // Constructor
	    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
	        super(bevName, Type.COFFEE, size);
	        this.extraShot = extraShot;
	        this.extraSyrup = extraSyrup;
	    }

	    // Getter methods
	    public boolean getExtraShot() {
	        return extraShot;
	    }

	    public boolean getExtraSyrup() {
	        return extraSyrup;
	    }

	    // Override calcPrice method
	    @Override
	    public double calcPrice() {
	        double price = addSizePrice();
	        if (extraShot==true) {
	            price += EXTRA_SHOT_PRICE;
	        }
	        if (extraSyrup==true) {
	            price += EXTRA_SYRUP_PRICE;
	    
			}
	        return price;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return super.toString() + ", " + extraShot + ", " + extraSyrup + ", " + calcPrice();
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
	        Coffee coffee = (Coffee) anotherBev;
	        return super.equals(anotherBev) &&
	                extraShot == coffee.extraShot &&
	                extraSyrup == coffee.extraSyrup;
	    }
	}


