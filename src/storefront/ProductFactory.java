package storefront;

import lollipop.LollipopFactory;
import musicslipper.MusicSlipperFactory;

/**
 * This class functions as a factory of factories, taking input to decide what kind of
 * Sellable object to provide to the calling class.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class ProductFactory {
	
//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the symbol used for separating key components of input*/
	private static final String DELIMETER = ":";
	
//---  Factory Methods   ----------------------------------------------------------------------
	
	/**
	 * Factory method that uses the provided input to decide on which kind of Sellable item
	 * to further decide on the creation of via sub-factories.
	 * 
	 * @param itemIdentifier - String object representing the input defining what object to generate.
	 * @return - Returns a Sellable object representing the desired object based on input.
	 */
	
	public static Sellable getItem(String itemIdentifier) {
		String[] code = itemIdentifier.split(DELIMETER);
		switch(code[0]) {
			case "l":
				return LollipopFactory.getLollipop(code[1]);
			case "m":
				return MusicSlipperFactory.getMusicSlipper(code[1]);
			default:
				return null;
		}
	}
	
}
