package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class BookTest extends TestNGListeners {
	@Test
	public void opennewsite()
	{
		book.crateaccount();
		book.interemail();
		book.orderbook();
	}

}
