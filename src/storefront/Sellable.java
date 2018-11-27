package storefront;

public abstract class Sellable {

	private IDManager idManager = IDManager.getAccessToIDManager();
	private int id;
	private double price;
	String itemName;
	
	public void setId() {
		id = idManager.getNextId();
	}
	
	public int getId() {
		return id;
	}
	
	public void setPrice(double in) {
		price = in;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String in) {
		itemName = in;
	}
	
	public String getName() {
		return itemName;
	}
	
	public abstract void print();
	
}
