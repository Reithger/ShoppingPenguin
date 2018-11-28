package storefront;

/**
 * This class manages the generation of unique integer id values for Sellable items.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class IDManager {

//---  Instance Variables   -------------------------------------------------------------------
	
	/** IDManager object set as static to create consistency between all uses of IDManager*/
	private static IDManager itself;
	/** int value representing the next unique ID that can be assigned to a Sellable object*/
	private static int nextIdValue;
	
//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the IDManager type that sets itself as a parameter
	 * and defaults the first id value to 0. This method is private, as it is not
	 * desired to have this object type generated outside of specific bounds.
	 * 
	 */
	
	private IDManager() {
		itself = this;
		nextIdValue = 0;
	}

//---  Getter Methods   -----------------------------------------------------------------------
	
	/**
	 * Getter method that provides the next unique Id value to the caller, and iterates the
	 * value of nextIdValue for the next time this gets called.
	 * 
	 * @return - Returns an int value representing the unique Id provided to the calling class.
	 */
	
	public static int getNextId() {
		return nextIdValue++;
	}

	/**
	 * Getter method that statically provides access to the static IDManager object stored
	 * by all instances of this object; if no such object exists, call the private constructor.
	 * 
	 * @return - Returns an IDManager object (static, maintains value consistency for unique IDs)
	 */
	
	public static IDManager getAccessToIDManager() {
		if(itself == null)
			itself = new IDManager();
		return itself;
	}
	
}
