package storefront;

/**
 * This abstract class provides the framework to model objects that are Sellable.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public abstract class Sellable {

//---  Instance Variables   -------------------------------------------------------------------
	
	/** IDManager object from which new unique ID values are derived*/
	private IDManager idManager = IDManager.getAccessToIDManager();
	/** int value representing the unique id associated to this Sellable object*/
	private int id;
	/** double value representing the price associated to this Sellable object*/
	private double price;
	/** String object representing the name of this Sellable object*/
	String itemName;
	
//---  Operations   ---------------------------------------------------------------------------

	/**
	 * This method instructs the Sellable object to print a representation of itself to the terminal.
	 * 
	 */
	
	public abstract void print();
		
//---  Setter Methods   -----------------------------------------------------------------------

	/**
	 * Setter method that assigns the next unique Identifier to this Sellable object.
	 * 
	 */
	
	public void setId() {
		id = idManager.getNextId();
	}

	/**
	 * Setter method that assigns the provided double value as the price of this Sellable object.
	 * 
	 * @param in - double value representing the new price of this Sellable object.
	 */
	
	public void setPrice(double in) {
		price = in;
	}

	/**
	 * Setter method that assigns the provided name as the new name of this Sellable object.
	 * 
	 * @param in - String object representing the new name of this Sellable object.
	 */
	
	public void setName(String in) {
		itemName = in;
	}
	
//---  Getter Methods   -----------------------------------------------------------------------
	
	/**
	 * Getter method that requests the unique identifier associated to this Sellable object.
	 * 
	 * @return - Returns an integer value representing the unique identifier of this Sellable object.
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * Getter method that requests the price associated to this Sellable object.
	 * 
	 * @return - Returns a double value representing the price of this Sellable object.
	 */
	
	public double getPrice() {
		return price;
	}
	
	/**
	 * Getter method that requests the name associated to this Sellable object.
	 * 
	 * @return - Returns a String object representing the name of this Sellable object.
	 */
	
	public String getName() {
		return itemName;
	}
	
}
