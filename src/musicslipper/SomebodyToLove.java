package musicslipper;

/**
 * This class extends the MusicSlipper abstract class, specifying of the type SomebodyToLove.
 * 
 * @author Mac Clevinger and Eliot Scott.
 *
 */

public class SomebodyToLove extends MusicSlipper{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** Constant String object representing the Song associated to this MusicSlipper*/
	private static final String SONG = "Need Somebody to Love Tonight";
	/** Constant String object representing the Name associated to this MusicSlipper*/
	private static final String NAME = "Musical Slipper";
	/** Constant String object representing the Price of this MusicSlipper*/
	private static final double PRICE = 19.99;
	
//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the SomebodyToLove type, assigning default values as
	 * expressed by class constants and assigning a unique Identifier via the IDManager class.
	 * 
	 */
	
	public SomebodyToLove() {
		setSong(SONG);
		setName(NAME);
		setPrice(PRICE);
		setId();
	}
	
}
