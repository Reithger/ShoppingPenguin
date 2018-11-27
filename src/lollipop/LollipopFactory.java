package lollipop;

import storefront.Sellable;

public class LollipopFactory {

	public static Sellable getLollipop(String itemIdentifier) {
		switch(itemIdentifier) {
			case "b": return new Blinky();
			case "c": return new Cleo();
			case "n": return new Nemo();
			default: return null;
		}
	}
	
}
