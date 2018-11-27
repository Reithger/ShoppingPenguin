package shipping;

import storefront.Sellable;
import java.util.ArrayList;

public abstract class Destination {

	private ArrayList<Sellable> pendingOrders;
	private String countryName;
	
	public void addShippingOder(Sellable sell) {
		pendingOrders.add(sell);
	}
	
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
	
	public String getCountryName() {
		return countryName;
	}
	
	protected void setCountryName(String nameIn) {
		 countryName = nameIn;
	}
	
	public void seePendingOrders() {
		for(Sellable s : pendingOrders) {
			s.print();
		}
	}
	
}
