package shipping;

/**
 * This class extends the Destination abstract class, specifying as the Destination Australia.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Australia extends Destination{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the name of this Destination object (country name)*/
	private static final String COUNTRY_NAME = "Australia";

//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the Australia type, assigning the default constant Country name
	 * and initializing its list of Pending Orders as empty.
	 * 
	 */
	
	public Australia() {
		setCountryName(COUNTRY_NAME);
		initializePendingOrders();
	}
}
