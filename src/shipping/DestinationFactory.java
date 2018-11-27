package shipping;

public class DestinationFactory {
	
	public static Destination getItemDestination(String identifier) {
		switch(identifier) {
			case "Canada": return new Canada();
			case "Antarctica": return new Antarctica();
			case "Australia": return new Australia();
			case "France": return new France();
			default: return null;
		}
	}
	
}
