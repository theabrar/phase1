package beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetBeanStartSession {
	
	private static final InheritableThreadLocal<WebDriver> threadLocWebDriver = new InheritableThreadLocal<WebDriver>(); 
	public static WebDriver driver;
	
	public static void startSessionBean() {
		
		System.setProperty("webdriver.gecko.driver",
				"C://Users//Matrix//Downloads//geckodriver-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		threadLocWebDriver.set(driver);
		driver.manage().window().maximize();
	}
	
	public static WebDriver driver(){
		return threadLocWebDriver.get();
	}

}
