package musicslipper;

import storefront.Sellable;

/**
 * This abstract class defines the framework that all objects of the MusicSlipper type must follow, also
 * extending the Sellable abstract class that defines behavior for being a Sellable item.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public abstract class MusicSlipper extends Sellable{

//---  Instance Variables   -------------------------------------------------------------------
	
	/** String object representing the Song associated to this MusicSlipper object*/
	private String song;

//---  Setter Methods   -----------------------------------------------------------------------
	
	/**
	 * Setter method that assigns the provided String object to be the new song of this MusicSlipper object.
	 * 
	 * @param in - String object representing the new song of this MusicSlipper object.
	 */
	
	public void setSong(String in) {
		song = in;
	}

//---  Getter Methods   -----------------------------------------------------------------------
	
	/**
	 * Getter method that requests the current Song of this MusicSlipper object.
	 * 
	 * @return - Returns a String object representing the Song of this MusicSlipper object.
	 */
	
	public String getSong() {
		return song;
	}

//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method prints a description of the Sellable MusicSlipper item to the terminal.
	 * 
	 */
	
	public void print() {
		System.out.println(getId() + ": " + getName() + ", " + getSong() + ": " + getPrice());
	}
	
}
