

	public class Customer {
	    private String name;
	    private int age;

	    // Constructor
	    public Customer(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Copy constructor
	    public Customer(Customer c) {
	        this.name = c.getName();
	        this.age = c.getAge();
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }
	}


