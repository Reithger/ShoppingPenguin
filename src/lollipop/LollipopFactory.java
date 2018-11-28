package lollipop;

/**
 * This class serves as a factory, deciding upon the provided input on which type of
 * Lollipop object to provide to the calling class.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class LollipopFactory {
	
//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method is a factory, deciding on which type of Lollipop to provide based on input.
	 * 
	 * @param itemIdentifier - String object representing the type of lollipop desired by the calling class.
	 * @return - Returns a Lollipop object, that being the one matching the provided input. Null if no match.
	 */

	public static Lollipop getLollipop(String itemIdentifier) {
		switch(itemIdentifier) {
			case "b": return new Blinky();
			case "c": return new Cleo();
			case "n": return new Nemo();
			default: return null;
		}
	}
	
}
