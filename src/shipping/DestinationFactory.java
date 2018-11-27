package shipping;

import storefront.Sellable;

public class DestinationFactory {
	
	public static Destination getItemDestination(String identifier) {
		switch(identifier) {
			case "Canada": return new Canada();
			case "Antarctica": return new Antarctica();
			case "Australia": return new Australia();
			case "France": return new France();
			default: return null;
		}
	}
	
	public static boolean addItemOrder(String identifier, Sellable sell) {
		Destination dest = getItemDestination(identifier);
		if(dest == null)
			return false;
		dest.addShippingOrder(sell);
		return true;
	}
	
}
