package lollipop;

/**
 * This class extends the Lollipop abstract class for the Blinky type.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Blinky extends Lollipop{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the default name of this Lollipop item*/
	private static final String NAME = "Blinky Lollipop";
	/** String constant value representing the default flavor of this Lollipop item*/
	private static final String FLAVOR = "Blink-licious";
	/** double constant value representing the default price of this Lollipop item*/
	private static final double PRICE = 1.75;
	
//---  Constructors   -------------------------------------------------------------------------

	/**
	 * Constructor for objects of the Blinky type, assigning default constant values
	 * and a unique Id via the IDManager class.
	 * 
	 */
	
	public Blinky() {
		setName(NAME);
		setFlavor(FLAVOR);
		setPrice(PRICE);
		setId();
	}
	
}
