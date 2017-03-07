package global;
import test.TestInitialization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static beans.GetBeanStartSession.driver;

public class GlobalObject extends TestInitialization implements GlobalInterface{
	
	public void gloWaitFluently(String xpath, int seconds) throws Exception{
		try{
			new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}catch(Exception e){
			throw new Exception("Waiting for element failed "+e.getMessage()+e.getCause());
		}
	}

	public void gloWaitFluentlyForElement(WebElement element, int seconds) throws InterruptedException{
		new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(element));
	}
}
