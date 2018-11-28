package musicslipper;

/**
 * This class extends the MusicSlipper abstract class, specifying of the type BoogieWonderland.
 * 
 * @author Mac Clevinger and Eliot Scott.
 *
 */

public class BoogieWonderland extends MusicSlipper{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** Constant String object representing the Song associated to this MusicSlipper*/
	private static final String SONG = "Dance, Boogie Wonderland";
	/** Constant String object representing the Name associated to this MusicSlipper*/
	private static final String NAME = "Musical Slipper";
	/** Constant String object representing the Price of this MusicSlipper*/
	private static final double PRICE = 22.50;

//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the BoogieWonderland type, assigning default values as
	 * expressed by class constants and assigning a unique Identifier via the IDManager class.
	 * 
	 */
	
	public BoogieWonderland() {
		setSong(SONG);
		setName(NAME);
		setPrice(PRICE);
		setId();
	}
	
}
