package lollipop;

import storefront.Sellable;

/**
 * This abstract class defines the framework that all objects of the Lollipop type must follow, also
 * extending the Sellable abstract class that defines behavior for being a Sellable item.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public abstract class Lollipop extends Sellable{
	
//---  Instance Variables   -------------------------------------------------------------------
	
	/** String object representing the flavor of this Lollipop object*/
	private String flavor;
  
	/**
	 * Setter method that assigns the provided String object to be the new flavor of this Lollipop object.
	 * 
	 * @param in - String object representing the new flavor of this Lollipop object.
	 */
	public void setFlavor(String in) {
		flavor = in;
	}
	
//---  Getter Methods   -----------------------------------------------------------------------
	
	/**
	 * Getter method that requests the current flavor of this Lollipop object.
	 * 
	 * @return - Returns a String object representing the flavor of this Lollipop object.
	 */
	
	public String getFlavor() {
		return flavor;
	}
	
//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method prints a description of the Sellable Lollipop item to the terminal.
	 * 
	 */
	
	public void print() {
		System.out.println(getId() + ": " + getName() + ", " + getFlavor() + ": " + getPrice());
	}
	
}
