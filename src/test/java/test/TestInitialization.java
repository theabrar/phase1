package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInitialization {
	public WebDriver driver;

	public void startSession() {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//Matrix//Downloads//geckodriver-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
//
	public void closeSession() {
		driver.quit();
	}
}
