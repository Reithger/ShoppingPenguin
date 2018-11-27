package storefront;

public class IDManager {

	private static IDManager itself;
	private static int nextIdValue;
	
	private IDManager() {
		itself = this;
		nextIdValue = 0;
	}
	
	public static int getNextId() {
		return nextIdValue++;
	}
	
	public static IDManager getAccessToIDManager() {
		if(itself == null)
			itself = new IDManager();
		return itself;
	}
	
}
