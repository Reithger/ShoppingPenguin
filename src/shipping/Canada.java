package shipping;

/**
 * This class extends the Destination abstract class, specifying as the Destination Canada.
 * 
 * @author Mac Clevinger and Eliot Scott
 *
 */

public class Canada extends Destination{

//---  Constant Values   ----------------------------------------------------------------------
	
	/** String constant value representing the name of this Destination object (country name)*/
	private static final String COUNTRY_NAME = "Canada";

//---  Constructors   -------------------------------------------------------------------------
	
	/**
	 * Constructor for objects of the Canada type, assigning the default constant Country name
	 * and initializing its list of Pending Orders as empty.
	 * 
	 */
	
	public Canada() {
		setCountryName(COUNTRY_NAME);
		initializePendingOrders();
	}
	
}
