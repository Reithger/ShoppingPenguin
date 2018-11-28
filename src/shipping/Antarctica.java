package shipping;

/**
 * This class extends the Destination abstract class, specifying as the Destination Antarctica.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Antarctica extends Destination{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the name of this Destination object (country name)*/
	private static final String COUNTRY_NAME = "Antarctica";

//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the Antarctica type, assigning the default constant Country name
	 * and initializing its list of Pending Orders as empty.
	 * 
	 */
	
	public Antarctica() {
		setCountryName(COUNTRY_NAME);
		initializePendingOrders();
	}
}
