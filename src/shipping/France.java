package shipping;

/**
 * This class extends the Destination abstract class, specifying as the Destination France.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class France extends Destination{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the name of this Destination object (country name)*/
	private static final String COUNTRY_NAME = "France";
	
//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the France type, assigning the default constant Country name
	 * and initializing its list of Pending Orders as empty.
	 * 
	 */
	
	public France() {
		setCountryName(COUNTRY_NAME);
		initializePendingOrders();
	}
}
