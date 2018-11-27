package lollipop;

/**
 * This class extends the Lollipop abstract class for the Cleo type.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Cleo extends Lollipop{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the default name of this Lollipop item*/
	private static final String NAME = "Cleo Lollipop";
	/** String constant value representing the default flavor of this Lollipop item*/
	private static final String FLAVOR = "Cleo-licious";
	/** double constant value representing the default price of this Lollipop item*/
	private static final double PRICE = 1.25;

//---  Constructors   -------------------------------------------------------------------------

	/**
	 * Constructor for objects of the Cleo type, assigning default constant values
	 * and a unique Id via the IDManager class.
	 * 
	 */
	
	public Cleo() {
		setName(NAME);
		setFlavor(FLAVOR);
		setPrice(PRICE);
		setId();
	}
	
}
