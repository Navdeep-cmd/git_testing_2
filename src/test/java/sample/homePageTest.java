package sample;

import org.testng.annotations.Test;

import pageHelperMethods.homePage;
import selenium.baseTestSuite;

public class homePageTest extends baseTestSuite{

	@Test
	public void homePageTests() {
		homePage homepage = getHomePage();
		homepage.clickOnQuizButton();
	}
}
