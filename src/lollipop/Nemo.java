package lollipop;

/**
 * This class extends the Lollipop abstract class for the Nemo type.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Nemo extends Lollipop{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the default name of this Lollipop item*/
	private static final String NAME = "Nemo Lollipop";
	/** String constant value representing the default flavor of this Lollipop item*/
	private static final String FLAVOR = "Dory-licious";
	/** double constant value representing the default price of this Lollipop item*/
	private static final double PRICE = 1.50;
	
//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the Nemo type, assigning default constant values
	 * and a unique Id via the IDManager class.
	 * 
	 */
	
	public Nemo() {
		setName(NAME);
		setFlavor(FLAVOR);
		setPrice(PRICE);
		setId();
	}
	
}
