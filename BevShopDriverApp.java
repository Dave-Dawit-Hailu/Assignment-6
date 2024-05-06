
//import static org.junit.jupiter.api.Assumptions.abort;

import java.util.Scanner;


public class BevShopDriverApp {

	public static void main(String[] args) {
		
		// scanner object to scan in user input 
    	Scanner scanner = new Scanner(System.in);
       
    	// creates a BevShop object
        BevShop bevShop = new BevShop();
       
        // total amount for all orders
        double totalAmountForAllOrders = 0.0;

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        
        System.out.println("The minimum age to order alcohol drink is 21");

        // tracks if user wants to put in more orders
        boolean moreOrders = true;
        
        
        // while moreOrders is ture
        while (moreOrders) {
           
        	System.out.println("\nStart please a new order:");
            
        	System.out.print("Would you please enter your name: ");
            
        	// scans in the name
        	String name = scanner.nextLine();

            System.out.print("Would you please enter your age: ");
            
            // scans the age
            int age = Integer.parseInt(scanner.nextLine());

            // creates a new order 
            bevShop.startNewOrder(10, Day.MONDAY, name, age);
            
            // curent active order
            Order currentOrder = bevShop.getCurrentOrder();
            
            // if the current order is null give error message
            if (currentOrder == null) 
            {
                System.out.println("Unable to create order, please ensure it's during business hours.");
                continue;
            }

            System.out.println("Your Total Order for now is 0.0");

            // only allowed to purchase alcohol if age is over or equal to 21
            if (age >= 21) 
            
            {
                // num of alcohol 
            	int alcoholCount = 0;
                
            	// max alcohol limit 3
            	while (alcoholCount < 3) 
            	{
                   
            		System.out.print("Would you please add an alcohol drink (yes/no)? ");
                    
            		
            		if ("yes".equalsIgnoreCase(scanner.nextLine())) 
            		
            		{
                       // a generic order for driver test
            			bevShop.processAlcoholOrder("Generic Alcohol", Size.SMALL);
                        
            			// increments alcohol count after adding alcohol to the order
            			alcoholCount++;
                        
            			// prints the amount of alcohol drinks
            			System.out.println("The current order of drinks is " + alcoholCount);
                        
            			// total price of the order
            			System.out.println("The Total Price on the Order: " + currentOrder.calcOrderTotal());
                        
            			// if reaches the limit
            			if (alcoholCount == 3) 
            			{
            				// give this message
                            System.out.println("You have a maximum alcohol drinks for this order");
                        }
                    } 
            		
            		else 
            		
            		{
                        break;
                    }
                }
            }
            
            else 
            
            {
            	// not allowed to order alcohol
                System.out.println("Your Age is not appropriate for alcohol drink!!");
            }

            // add more beverages  is true
            boolean addMoreBeverages = true;
            
            
           // while it is true
            while (addMoreBeverages) 
            {
               
            	/// add coffee smoothie or end the order
            	System.out.println("Would you please add a COFFEE or a SMOOTHIE to your order? (type 'coffee', 'smoothie', or 'end')");
                
            	String response = scanner.nextLine().toLowerCase();
                
            	// uses switch cases to order
            	switch (response) 
            	{
                    case "coffee":
                    	// generic coffee order for test
                        bevShop.processCoffeeOrder("Regular Coffee", Size.MEDIUM, false, false);
                        break;
                    case "smoothie":
                    	// generic smoothie order for test
                        bevShop.processSmoothieOrder("Berry Smoothie", Size.MEDIUM, 2, false);
                        break;
                    case "end":
                        addMoreBeverages = false;
                        break;
                    default:
                        System.out.println("Invalid option, please choose 'coffee', 'smoothie', or 'end'.");
                        break;
                }
                
            	
            	// prints the total of the order
            	if (!response.equals("end")) 
            	{
                    System.out.println("The Total Price on the Order: " + currentOrder.calcOrderTotal());
                }
            }

            // total items 
            System.out.println("Total items on your order is " + currentOrder.getTotalItems());
            
            // total price of the order
            System.out.println("The Total Price on the Order: " + currentOrder.calcOrderTotal());
            
            // total of all orders combined
            totalAmountForAllOrders += currentOrder.calcOrderTotal();

            // asks to start another order
            System.out.println("Would you like to start another order? (yes/no)");
            
            moreOrders = "yes".equalsIgnoreCase(scanner.nextLine());
        }

        // total of the orders
        System.out.println("Total amount for all Orders: " + totalAmountForAllOrders);
        
        // my name
        System.out.println("\n\nProgrammed by Dave| Dawit Hailu ");
        

        // Close the scanner
        scanner.close();
		    
		
	}
}


	


