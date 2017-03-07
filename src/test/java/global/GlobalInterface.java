package global;

import org.openqa.selenium.WebElement;

public interface GlobalInterface {
	public void gloWaitFluently(String xpath, int seconds) throws Exception;
	public void gloWaitFluentlyForElement(WebElement element, int seconds) throws InterruptedException;

}
