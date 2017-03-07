package test;
import static beans.GetBeanGlobal.gloObj;
import static beans.GetBeanStartSession.driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.junit.Assert;

public class GoogleSearch extends TestInitialization {

	PageObject pgObj = new PageObject();

	@BeforeMethod
	@Override
	public void startSession() {
		// TODO Auto-generated method stub
		super.startSession();
	}

	@AfterMethod
	@Override
	public void closeSession() {
		// TODO Auto-generated method stub
		super.closeSession();
	}

	@Test
	public void testSearch() throws Exception {
		try {
			driver.get("http://www.google.co.uk");
			gloObj().gloWaitFluently("//div[@id='hplogo']", 20);
			System.out.println("Waited for 20 secs");
			
			Assert.assertTrue(pgObj.initElements().googleLogo.isDisplayed());
			Thread.sleep(10000);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
