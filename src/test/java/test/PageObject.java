package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends TestInitialization {
	//public static WebDriver driver;
	
	@FindBy(id="hplogo")
	WebElement googleLogo;
	
	@FindBy(id="lst-ib")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@value='Google Search']")
	WebElement searchButton;

	@FindBy(xpath="//input[contains(@value,'Feeling Lucky']")
	WebElement luckyButton;
	
	
	public PageObject initElements(){
		return PageFactory.initElements(driver, PageObject.class);
	}
	

}
