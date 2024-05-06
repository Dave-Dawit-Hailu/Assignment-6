

	import java.util.ArrayList;
	import java.util.Random;

	public class Order implements OrderInterface, Comparable<Order> {
	    private int orderNo;
	    private int orderTime;
	    private Day orderDay;
	    private Customer customer;
	    private ArrayList<Beverage> beverages;

	    // Constructor
	    public Order(int orderTime, Day orderDay, Customer cust) {
	        this.orderNo = generateOrder();
	        this.orderTime = orderTime;
	        this.orderDay = orderDay;
	        this.customer = cust;
	        this.beverages = new ArrayList<>();
	    }

	    // Automatically generate order number
	    public int generateOrder() {
	        Random rand = new Random();
	        return rand.nextInt(80001) + 10000; // Random number between 10000 and 90000
	    }

	    // Getter method for order number
	    public int getOrderNo() {
	        return orderNo;
	    }

	    // Getter method for order time
	    public int getOrderTime() {
	        return orderTime;
	    }

	    // Getter method for order day
	    public Day getOrderDay() {
	        return orderDay;
	    }

	    // Getter method for customer
	    public Customer getCustomer() {
	        return customer;
	    }

	    // Getter method for day
	    public Day getDay() {
	        return orderDay;
	    }

	    // Check if it is a weekend
	    public boolean isWeekend() {
	        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
	    }

	    // Getter method for beverage
	    public Beverage getBeverage(int itemNo) {
	        if (itemNo >= 0 && itemNo < beverages.size()) {
	            return beverages.get(itemNo);
	        }
	        return null;
	    }

	    // Getter method for total items
	    public int getTotalItems() {
	        return beverages.size();
	    }

	    // Add coffee order to this order
	    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
	        Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
	        beverages.add(coffee);
	    }

	    // Add alcohol order to this order
	    public void addNewBeverage(String bevName, Size size) {
	        Alcohol alcohol = new Alcohol(bevName, size, isWeekend());
	        beverages.add(alcohol);
	    }

	    // Add Smoothie beverage to this order
	    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
	        Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
	        beverages.add(smoothie);
	    }

	    // Calculate total order price
	    public double calcOrderTotal() {
	        double total = 0;
	        for (Beverage beverage : beverages) {
	            total += beverage.calcPrice();
	        }
	        return total;
	    }

	    // Find number of beverages of same type in an order
	    public int findNumOfBeveType(Type type) {
	        int count = 0;
	        for (Beverage beverage : beverages) {
	            if (beverage.getType() == type) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // String representation of the order
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Order No: ").append(orderNo).append("\n");
	        sb.append("Time: ").append(orderTime).append("\n");
	        sb.append("Day: ").append(orderDay).append("\n");
	        sb.append("Customer: ").append(customer.toString()).append("\n");
	        sb.append("Beverages:\n");
	        for (Beverage beverage : beverages) {
	            sb.append(beverage.toString()).append("\n");
	        }
	        return sb.toString();
	    }

	    // Compare two orders based on order time
	    @Override
	    public int compareTo(Order anotherOrder) {
	        return Integer.compare(this.orderTime, anotherOrder.getOrderTime());
	    }
	}


