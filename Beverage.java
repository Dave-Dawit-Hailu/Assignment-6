

	public abstract class Beverage {
	    private String bevName;
	    private Type type;
	    private Size size;
	    private final double BASE_PRICE = 2.0;
	    private final double SIZE_PRICE = 0.5;

	    // Constructor
	    public Beverage(String bevName, Type type, Size size) {
	        this.bevName = bevName;
	        this.type = type;
	        this.size = size;
	    }

	    // Getter methods
	    public double getBasePrice() {
	        return BASE_PRICE;
	    }

	    public Type getType() {
	        return type;
	    }

	    public String getBevName() {
	        return bevName;
	    }

	    public Size getSize() {
	        return size;
	    }

	    // Abstract method to calculate beverage price
	    public abstract double calcPrice();

	    // Method to add size price to base price
	    public double addSizePrice() {
			double Price=0;
	        if (size.equals(Size.SMALL) ) {
	            Price= BASE_PRICE;
				return Price;
	        } 
			if(size.equals(Size.MEDIUM)) {
	            Price = BASE_PRICE + SIZE_PRICE;
				return Price;
	        }
			if(size.equals(Size.LARGE) ){
				Price = BASE_PRICE +(2.0*SIZE_PRICE);
				return Price;
			}
			return Price;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return bevName + ", " + size;
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
	        Beverage beverage = (Beverage) anotherBev;
	        return bevName.equals(beverage.bevName) &&
	               type == beverage.type &&
	               size == beverage.size;
	    }
	}


