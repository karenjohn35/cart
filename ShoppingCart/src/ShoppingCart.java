
/* This creates a class necessary for the ShoppingCartManager
 

 Author Karen John
 Date: Feb 20th 2022
  */
import java.util.ArrayList;


import java.util.Scanner;
import java.lang.String;

public class ShoppingCart {
	
	 private String customerName;
	   private String currentDate;
	   private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();
	
	   
	    public ShoppingCart() {
	      customerName = "none";
	      currentDate= "none";
	      
	   }
	   
	   public ShoppingCart(String initCustomerName,String initCurrentDate ) {
	      customerName = initCustomerName;
	      currentDate= initCurrentDate;
	      
	   }
	   
	 public String getCustomerName() {
	      return customerName;
	   }
	   
	   public String getDate() {
	      return currentDate;
	   }
	   
	   public void addItem(ItemToPurchase itemsincart) {
	      cartItems.add(itemsincart);
	      }
	      
	    @SuppressWarnings("resource")
		public void removeItem() {
	      
	    
	      // Search for item in ArrayList
	    	   System.out.println("Enter name of item to remove: ");
	    	  Scanner scnr = new Scanner(System.in); 
	    	  String nameOfItem= scnr.nextLine();
	    	
	    	   
	          
	           // scnr.close();
	            
	            boolean tracker= false;
	     

	      for (ItemToPurchase item: cartItems ) {
	         if (item.getName().equals(nameOfItem)) {
	            cartItems.remove(item); // Remove
	            System.out.print("Removed!");
	            tracker= true;
	            break;
	            
	         }
		     
	        
	         

	       
	      }
	      
	      if (tracker==false) {
	    	  System.out.println("Item not found in cart. Nothing Removed.");
	      }
	      
	    }
	   
	   @SuppressWarnings("resource")
	public void modifyItem() {
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the item you would like to modify");
	      String desiredItem=sc.nextLine();
	      boolean check= false;
	    

	      // Search for item in ArrayList
	    
	     if (cartItems !=null) {
	      for (ItemToPurchase itemsincart: cartItems){
	    	  if (itemsincart.getName().equals(desiredItem)) {
	    		  check=true;
                  
	    	  System.out.println("How much of  " + itemsincart.getName() + " would you like?");
	    	  int quantity= sc.nextInt();
	    	  if(quantity==0) {
	    		  cartItems.remove(itemsincart);
	    		  break;
	    	  }
	    	  else {
	    	  itemsincart.setQuantity(quantity);
	    	  break;
	    	  
	    	  }

	         
	    	  
              
	    	  }
	    	  
	    		
	    	  
	      }
	      
	      if (check==false) {
	    	  System.out.println("Item not found in cart.");
	      }
	    		  
	    	  }
	      
        
	    	  
	      }
	    	  
	      
	   
	   public int getNumItemsInCart() {
	      int numItems = 0;
	      if (cartItems == null) {
	         return numItems;
	         
	      }
	      for (ItemToPurchase itemsincart: cartItems) {
	          numItems += itemsincart.getQuantity();
	         }
	      return numItems;
	         
	   
	         
	         
	      }
	      
	   
	   
	   public int getCostOfCart() {
	      int costItems = 0;
	      if (cartItems == null) {
	         return costItems;
	         
	      }
	      for (ItemToPurchase itemsincart: cartItems){
	    	  
	          costItems += itemsincart.getPrice() *itemsincart.getQuantity();
	      }
	         return costItems;}
	      
	   
	   
	   public void printTotal() {
		   int total= 0;
		   int numberOfItems = 0;
		   
		   
		   
		      for (ItemToPurchase itemsincart: cartItems) {
		    	 numberOfItems =   numberOfItems  + itemsincart.getQuantity();
		    	  
		    	  
		      }
		      
	      System.out.println("Number of Items: " +  numberOfItems  );
	      System.out.println();
	    
	      for (ItemToPurchase itemsincart: cartItems) {
	         
	         total+=  (itemsincart.getPrice()) *(itemsincart.getQuantity());
	         System.out.println(itemsincart.getName() + " " +  + itemsincart.getQuantity()+ " @ $" + itemsincart.getPrice() + " = $" + (total));
	         System.out.println();
	       
	         }
	      if (total == 0) {
		         System.out.println ("SHOPPING CART IS EMPTY");
		         System.out.println();
		         
		      }
	      
	      System.out.print("Total: $" + total);
	      System.out.println();
	      
	   }
	   
	   public void printDescriptions() {
	       for (ItemToPurchase itemsincart: cartItems) {
	         System.out.println( itemsincart.getDescription());
	      
	   }

	   }

}