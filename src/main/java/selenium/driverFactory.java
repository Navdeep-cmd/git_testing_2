package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactory {

	public static ChromeDriver getChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/driver/chromedriver.exe");
		return new ChromeDriver();
	}
}
