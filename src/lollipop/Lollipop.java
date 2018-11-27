package lollipop;

import storefront.Sellable;

public abstract class Lollipop extends Sellable{
	
	private String flavor;
	
	public void setFlavor(String in) {
		flavor = in;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void print() {
		System.out.println(getName() + ", " + getFlavor() + ": " + getPrice());
	}
	
}
