package selenium;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import constants.Constants;
import pageHelperMethods.homePage;

public class baseTestSuite {

		WebDriver driver;
		homePage homepage;
		@Parameters("browser")
		@BeforeClass
		public void setUp(String browser) throws Exception
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = driverFactory.getChromeDriver();
				driver.get(Constants.URL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
			}
		}
	    @AfterClass
		public void tearDown() throws Exception {

			driver.close();
		}
		
		public homePage getHomePage() {
			if(homepage == null)
			{
				homepage = PageFactory.initElements(driver,homePage.class);
			}
			return homepage;
}
}
