package musicslipper;

/**
 * This class serves as a factory, deciding upon the provided input on which type of
 * MusicSlipper object to provide to the calling class.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class MusicSlipperFactory {
	
//---  Operations   ---------------------------------------------------------------------------
	
	/**
	 * This method is a factory, deciding on which type of MusicSlipper to provide based on input.
	 * 
	 * @param itemIdentifier - String object representing the type of MusicSlipper desired by the calling class.
	 * @return - Returns a MusicSlipper object, that being the one matching the provided input. Null if no match.
	 */

	public static MusicSlipper getMusicSlipper(String itemIdentifier) {
		switch(itemIdentifier) {
			case "b": return new BoogieWonderland();
			case "s": return new SomebodyToLove();
			default: return null;
		}
	}
	
}
