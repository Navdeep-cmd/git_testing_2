package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.basePage;

public class homePageFactory extends basePage {

		public homePageFactory(WebDriver driver) {
			super(driver);
			}
		@FindBy(xpath= "//a[contains(text(),'Quiz')]")
		public WebElement quiz;
}
