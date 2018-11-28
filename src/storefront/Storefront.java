package storefront;

import java.util.ArrayList;
import shipping.*;

/**
 * This class models the general Storefront that permits items to be purchased, added
 * to the store's stock, and for those values to be viewed.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Storefront {

//---  Instance Variables   -------------------------------------------------------------------
	
	/** ArrayList<<r>Sellable> object representing the list of Sellable objects in this Storefront object*/
	ArrayList<Sellable> stock;
	/** ArrayList<<r>Sellable> object representing the list of Sellable objects that have been bought but not delivered*/
	ArrayList<Sellable> pendingOrders;
	
//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the Storefront type that initializes its lists of Stock
	 * and Pending Orders.
	 * 
	 */
	
	public Storefront() {
		stock = new ArrayList<Sellable>();
		pendingOrders = new ArrayList<Sellable>();
	}

//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method instructs the Sellable objects in this object's stock to print representations
	 * of themselves to the terminal, informing a viewer of what is available to purchase.
	 * 
	 */
	
	public void seeAvailability(){
		for(Sellable s : stock) {
			s.print();
		}
	}

	/**
	 * This method instructs the Sellable objects in this object's pending orders to print representations
	 * of themselves to the terminal, informing the viewer of the pending order's.
	 * 
	 */
	
	public void seePendingOrders() {
		for(Sellable s : pendingOrders) {
			s.print();
		}
	}

	/**
	 * This method instructs the Sellable objects in this object's pending orders to print representations
	 * of themselves to the terminal, informing the viewer of the pending order's for the specified Destination.
	 * 
	 * @param country - String object representing the desired Destination from which all shown orders should be from.
	 */
	
	public void seePendingOrders(String country) {
		DestinationFactory.getItemDestination(country).seePendingOrders();
	}
	
	/**
	 * This method processes a request to purchase an item from the Storefront's stock and ship it
	 * to the specified Destination (that is selected via a Factory).
	 * 
	 * @param itemId - int value representing the id of the desired Sellable object in this Storefront
	 * @param country - String object representing the desired Destination to send the selected Sellable object to
	 * @return - Returns a boolean value representing the result of the operation; true if succesful, false otherwise
	 */
	
	public boolean makePurchase(int itemId, String country) {
		//When interact with customer, have class for them that can be deducted funds
		//Assuming that they have the money...
		for(int i = 0; i < stock.size(); i++) {
			Sellable s = stock.get(i);
			if(s.getId() == itemId) {
				boolean shipped = DestinationFactory.addItemOrder(country, s);
				if(shipped) {
					stock.remove(s);
					pendingOrders.add(s);
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}

	/**
	 * This method adds the specified item to the Storefront object's stock of Sellable objects,
	 * processing input in a factory to get the desired item.
	 * 
	 * @param itemIdentifier - String object encoding the representation for a Sellable object.
	 * @return - Returns a boolean value representing the result of this operation; true if successful, false otherwise
	 */
	
	public boolean addItemToStock(String itemIdentifier) {
		Sellable s = ProductFactory.getItem(itemIdentifier);
		if(s == null)
			return false;
		stock.add(s);
		return true;
	}

	/**
	 * This method informs the Storefront that a pending order has been dealt with and
	 * can be removed from the pending orders ArrayList<<r>Sellable>.
	 * 
	 * @param itemId - int value representing the id of the desired item to be removed from the pending orders.
	 * @return - Returns a boolean value representing the result of the operation; true if successful, false otherwise.
	 */
	
	public boolean confirmDelivery(int itemId) {
		for(int i = 0; i < pendingOrders.size(); i++) {
			if(pendingOrders.get(i).getId() == itemId) {
				pendingOrders.remove(pendingOrders.get(i));
				return true;
			}
		}
		return false;
	}
	
}
