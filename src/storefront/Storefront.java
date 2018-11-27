package storefront;

import java.util.ArrayList;
import shipping.*;

public class Storefront {

	ArrayList<Sellable> stock;
	ArrayList<Sellable> pendingOrders;
	
	public Storefront() {
		stock = new ArrayList<Sellable>();
		pendingOrders = new ArrayList<Sellable>();
	}
	
	public void seeAvailability(){
		for(Sellable s : stock) {
			s.print();
		}
	}
	
	public boolean makePurchase(int itemId) {
		//When interact with customer, have class for them that can be deducted funds
		//Assuming that they have the money...
		for(int i = 0; i < stock.size(); i++) {
			Sellable s = stock.get(i);
			if(s.getId() == itemId) {
				stock.remove(s);
				pendingOrders.
				add(s);
				return true;
			}
		}
		return false;
	}
	
	public void addItemToStock(String itemIdentifier) {
		Sellable s = ProductFactory.getItem(itemIdentifier);
		if(s == null)
			throw new IllegalArgumentException("Invalid item identity in input");
		stock.add(s);
	}

	public void seePendingOrders() {
		for(Sellable s : pendingOrders) {
			s.print();
		}
	}
	
	public void seePendingOrders(String country) {
		DestinationFactory.getItemDestination(country).seePendingOrders();
	}
	
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
