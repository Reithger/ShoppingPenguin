package storefront;

import lollipop.LollipopFactory;
import musicslipper.MusicSlipperFactory;

public class ProductFactory {
	
	private static final String DELIMETER = ":";
	
	public static Sellable getItem(String itemIdentifier) {
		String[] code = itemIdentifier.split(DELIMETER);
		switch(code[0]) {
			case "l":
				return LollipopFactory.getLollipop(code[1]);
			case "m":
				return MusicSlipperFactory.getMusicSlipper(code[1]);
			default:
				return null;
		}
	}
	
}
