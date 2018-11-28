package shipping;

import storefront.Sellable;

/**
 * This class serves as a factory, deciding upon the provided input on which type of
 * Destination object to provide to the calling class.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class DestinationFactory {
	
//---  Operations   ---------------------------------------------------------------------------

	/**
	 * This method is a factory, deciding on which type of Destination to provide based on input.
	 * 
	 * @param itemIdentifier - String object representing the type of Destination desired by the calling class.
	 * @return - Returns a Destination object, that being the one matching the provided input. Null if no match.
	 */

	public static Destination getItemDestination(String identifier) {
		switch(identifier) {
			case "Canada": return new Canada();
			case "Antarctica": return new Antarctica();
			case "Australia": return new Australia();
			case "France": return new France();
			default: return null;
		}
	}
	
	/**
	 * This method appends the provided Sellable item to the desired Country as described
	 * by the input String value, using the Factory to acquire the correct Destination object.
	 * 
	 * @param identifier - String object representing the Destination desired by the caller
	 * @param sell - Sellable object representing the item to have be assigned to the desired Destination
	 * @return - Returns a boolean value representing the result of this operation; true if successful, false otherwise
	 */
	
	public static boolean addItemOrder(String identifier, Sellable sell) {
		Destination dest = getItemDestination(identifier);
		if(dest == null)
			return false;
		dest.addShippingOrder(sell);
		return true;
	}
	
}
