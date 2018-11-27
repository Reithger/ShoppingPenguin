package shipping;

public class Antarctica extends Destination{

	private static final String COUNTRY_NAME = "Antarctica";
	
	public Antarctica() {
		setCountryName(COUNTRY_NAME);
		initializePendingOrders();
	}
}
