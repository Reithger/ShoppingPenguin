package musicslipper;

import storefront.Sellable;

public class MusicSlipperFactory {

	public static Sellable getMusicSlipper(String itemIdentifier) {
		switch(itemIdentifier) {
			case "b": return new BoogieWonderland();
			case "s": return new SomebodyToLove();
			default: return null;
		}
	}
	
}
