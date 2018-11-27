package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import lollipop.*;
import musicslipper.*;
import shipping.*;
import storefront.*;

class JUnitTest {

	@Test
	void test() {
		//Storefront testing
		Storefront stor = new Storefront();
		assertEquals(stor.addItemToStock("l:n"), true);
		assertEquals(stor.addItemToStock("bad"), false);
		assertEquals(stor.addItemToStock("m:b"), true);
		assertNotEquals(stor.addItemToStock("m:z"), true);
		assertEquals(stor.makePurchase(1, "Canada"), true);
		assertEquals(stor.makePurchase(1, "Canada"), false);
		assertEquals(stor.makePurchase(0, "Austria"), false);
		assertEquals(stor.makePurchase(0, "Australia"), true);
		
		//Destination testing
		Canada can = (Canada)DestinationFactory.getItemDestination("Canada");
		assertEquals(can.getCountryName(), "Canada");
		assertEquals(DestinationFactory.getItemDestination("Can"), null);
		
		//Lollipop testing
		
		Blinky blink = (Blinky)LollipopFactory.getLollipop("b");
		assertEquals(blink.getFlavor(), "Blink-licious");
		assertEquals(blink.getName(), "Blinky Lollipop");
		assertEquals(blink.getId(), 2);
		assertEquals(blink.getPrice(), 1.75);
		assertEquals(LollipopFactory.getLollipop("s"), null);
		
		//MusicSlipper testing
		
		BoogieWonderland bW = (BoogieWonderland)MusicSlipperFactory.getMusicSlipper("b");
		assertEquals(bW.getName(), "Musical Slipper");
		assertEquals(bW.getSong(), "Dance, Boogie Wonderland");
		assertEquals(bW.getId(), 3);
		assertEquals(bW.getPrice(), 22.50);
		assertEquals(MusicSlipperFactory.getMusicSlipper("les"), null);
		
	}

}
