package shipping;

import storefront.Sellable;
import java.util.ArrayList;

/**
 * This abstract class defines the framework that all objects of the Destination type must follow,
 * possessing a list of orders associated to it and a name.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public abstract class Destination {

//---  Instance Variables   -------------------------------------------------------------------
	
	/** ArrayList<<r>Sellable> object representing the items being shipped to this Destination*/
	private ArrayList<Sellable> pendingOrders;
	/** String object representing the name of this Destination*/
	private String countryName;
	
//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method adds the provided Sellable object to the list of pending orders associated
	 * to this Destination (as a list of objects being sent to this Destination)
	 * 
	 * @param sell - Sellable object representing the item being associated to this Destination
	 */
	
	public void addShippingOrder(Sellable sell) {
		pendingOrders.add(sell);
	}
	
	/**
	 * This method removes the Sellable object from the list of Sellable items by an int value
	 * representing its ID (that all Sellable objects possess)
	 * 
	 * @param id - int value representing the id of the Sellable item to remove from this Destination.
	 * @return - Returns the Sellable object associated to the provided ind id vaue.
	 */
	
	public Sellable removeShippingOrder(int id) {
		for(int i = 0; i < pendingOrders.size(); i++) {
			Sellable s = pendingOrders.get(i);
			if(s.getId() == id) {
				Sellable item = s;
				pendingOrders.remove(s);
				return item;
			}
		}
		return null;
	}
	
	/**
	 * This method displays the current Sellable objects associated to this Destination.
	 * 
	 */
	
	public void seePendingOrders() {
		for(Sellable s : pendingOrders) {
			s.print();
		}
	}
	
	/**
	 * This method initializes the list of Sellable objects so that the subclasses don't
	 * have to import the Sellable class.
	 * 
	 */
	
	protected void initializePendingOrders() {
		pendingOrders = new ArrayList<Sellable>();
	}
	
//---  Getter Methods   -----------------------------------------------------------------------
	
	/**
	 * Getter method that requests the name of this Destination.
	 * 
	 * @return - Returns a String object representing the name of this Destination object.
	 */
	
	public String getCountryName() {
		return countryName;
	}
	
//---  Setter Methods   -----------------------------------------------------------------------
	
	/**
	 * Setter method that assigns the provided String object as the new name of this Destination.
	 * 
	 * @param nameIn - String object representing the new name of this Destination
	 */
	
	protected void setCountryName(String nameIn) {
		 countryName = nameIn;
	}

}
