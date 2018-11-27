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
		
		
	}

}
