/* This program adds shopping items to a cart with quantity, price, description, and ite
m name.
 

 Author Karen John
 Date: Feb 20th 2022
  */


import java.util.Scanner;
import java.lang.String;
public class ShoppingCartManager {
	
	
	public static void printMenu(ShoppingCart cart1) {
		   
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println();
		}
	
	
	
	
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in); 
		     String customer;
		     String date;
		     System.out.println("Enter your name");
		     customer =  scnr.next() + scnr.nextLine();
		     System.out.println("Enter the date");
		     date = scnr.next() + scnr.nextLine();
		   ShoppingCart cart1 = new ShoppingCart(customer,date);
		     ItemToPurchase item1 = new ItemToPurchase();
		      char userChoice = 0;
		      
		      if ((userChoice!='a')&& (userChoice!='d') && (userChoice!='i'&& (userChoice!='o'))) {
		    	 	System.out.println("Enter Customer's Name:");
		    	 	System.out.println("Enter Today's Date:");
		    	 	System.out.println();
				     System.out.println("Customer Name: "+ cart1.getCustomerName());
				     System.out.println("Today's Date: " + cart1.getDate());
				     System.out.println();
				     
			    

			   }
			   
		     
		    
		    
		   
		      
			    if((userChoice!='a')&& (userChoice!='d') && (userChoice!='i')&& (userChoice!='o') && (userChoice!='c')&& (userChoice!='q')) {
			     printMenu(cart1);
				  System.out.println("Choose an option:");
				  userChoice= scnr.next().charAt(0); }
		  
		    
		
		    if ((userChoice=='a')|| (userChoice=='d') || (userChoice=='i')||(userChoice=='o')||(userChoice=='q')||(userChoice!='c') ) {
		    	executeMenu(userChoice, cart1, scnr,item1);
		    	
		    	
		    
		    }
		     
		    
			     
			     while ((userChoice=='a')|| (userChoice=='d') || (userChoice=='i')||(userChoice=='o') ||(userChoice=='c')) {
				    	System.out.println();
				       	printMenu(cart1);
			            System.out.println("Choose an option:");
			            userChoice = scnr.next().charAt(0);
			            executeMenu(userChoice, cart1, scnr,item1);
			     
				    }
	}
			     
		     

public static void executeMenu(char c, ShoppingCart cart1, Scanner scnr, ItemToPurchase item) {
 

	 switch(c) { 
		    	 
		    	
	 case 'a':
		           System.out.println("ADD ITEM TO CART");
	       System.out.println("Enter the item name:");
	       	String nameOfItem = scnr.next()+ scnr.nextLine();
	       
	       	item.setName(nameOfItem);
	       	nameOfItem = item.getName();
	       	
	       	
	       	
	       System.out.println("Enter the item description:");
	       	String descriptionOfItem =  scnr.nextLine();
	       	item.setDescription(descriptionOfItem);
	       	descriptionOfItem =item.getDescription(); 
	       	
	       	
	      System.out.println("Enter the item price:");
	       	int priceOfItem = scnr.nextInt();
	       	item.setPrice(priceOfItem);
	       	priceOfItem= item.getPrice();
	       
	       	
	       System.out.println("Enter the item quantity:");
	       	int quantityOfItem = scnr.nextInt();
	       	item.setQuantity(quantityOfItem);
	       	quantityOfItem = item.getQuantity();
	       	
	       	ItemToPurchase item2 = new ItemToPurchase(nameOfItem, descriptionOfItem, priceOfItem,quantityOfItem);
	       	cart1.addItem(item2);
	       	break;
	       	
	    
            
	  
		        
		        
	 case'd': 
		            System.out.println("REMOVE ITEM FROM CART");
		            cart1.removeItem();
		            break;
		               
		            
		          
		         
		         
	 case 'c': 
		        	  
		        	  System.out.println("CHANGE ITEM QUANTITY");
		                 
                  cart1.modifyItem();
                  break;
	               
		        	  
            
		          
	 case 'i':
		              System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
		               cart1.printDescriptions();
		               break;
		               
		               
		              
		           
	 case 'o': 
		            	 System.out.println("OUTPUT SHOPPING CART");
		            	 System.out.println(cart1.getCustomerName()+ "'s Shopping Cart - " + cart1.getDate());
		               cart1.printTotal();
		               break;
		               
		               
	case 'q':
	                  break;
	            
	 }	
	 
	 
		   
 } 
 
}

