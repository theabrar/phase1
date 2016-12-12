package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch extends TestInitialization {

	CommonObject cmnObj = new CommonObject();
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
			cmnObj.cmnWaitFluently("//div[@id='hplogo']", 20);
			
			Assert.assertTrue(pgObj.initElements().googleLogo.isDisplayed());
			Thread.sleep(10000);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
