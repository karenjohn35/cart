

/* This creates a class necessary for the ShoppingCartManager
 

 Author Karen John
 Date: Feb 20th 2022
  */
public class ItemToPurchase {

	private String itemName;
	   private int itemPrice;
	   private int itemQuantity;
	   private String itemDescription;

	
	public ItemToPurchase() {
	      itemName = "none";
	      itemPrice = 0;
	      itemQuantity = 0;
	      itemDescription = "none";
	      
	   }
	   
	   
	   public ItemToPurchase(String initName,String initDescription, int initPrice, int initQuantity ) {
	      itemName = initName ;
	      itemPrice = initPrice;
	      itemQuantity = initQuantity;
	      itemDescription = initDescription;
	      
	   }
	   
	   
	   public void setName(String nameofItem) {
	      itemName = nameofItem;
	      
	   }
	   
	   public String getName () {
	      return itemName;
	      
	   }
	   
	   public void setPrice( int priceofItem) {
	      itemPrice = priceofItem;
	      
	   }
	   
	   public int getPrice () {
	      return itemPrice;
	      
	   }
	   
	   public void setQuantity ( int quantityofItem) {
	      itemQuantity = quantityofItem;
	      
	      
	      
	   }
	   
	    public int getQuantity () {
	      return itemQuantity;
	      
	   }
	   
	   public void setDescription(String descriptionofItem) {
	      itemDescription = descriptionofItem;
	      
	   }
	   
	   public String getDescription() {
	      return itemDescription;
	      
	   }
	   
	   public void printItemCost() {
	      System.out.println(itemName + itemQuantity + itemPrice + (itemPrice * itemQuantity));
	   }
	   
	   public void printItemDescription()  {
	      System.out.println(itemName + ": " + itemDescription);
	   }
	   
}
