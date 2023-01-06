package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class AirCandaTest extends TestNGListeners{
	
	@Test(priority = 1)
	public void cheksiteaircanda()
	{
		canda.bookflight();
	}


}
