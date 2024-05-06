

	public class Smoothie extends Beverage {
	    private int numOfFruits;
	    private boolean addProtein;
	    private final double FRUIT_PRICE = 0.50;
	    private final double PROTEIN_PRICE = 1.50;

	    // Constructor
	    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
	        super(bevName, Type.SMOOTHIE, size);
	        this.numOfFruits = numOfFruits;
	        this.addProtein = addProtein;
	    }

	    // Getter methods
	    public int getNumOfFruits() {
	        return numOfFruits;
	    }

	    public boolean getAddProtein() {
	        return addProtein;
	    }

	    // Override calcPrice method
	    @Override
	    public double calcPrice() {
	        double price = addSizePrice();
	        price += numOfFruits * FRUIT_PRICE;
			
	        if (addProtein==true) {
	            price += PROTEIN_PRICE;
	        }
	        return price;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return super.toString() + ", " + addProtein + ", " + numOfFruits + ", " + calcPrice();
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
	        Smoothie smoothie = (Smoothie) anotherBev;
	        return super.equals(anotherBev) &&
	                numOfFruits == smoothie.numOfFruits &&
	                addProtein == smoothie.addProtein;
	    }
	}


