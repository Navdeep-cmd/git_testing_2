package pageHelperMethods;

import org.openqa.selenium.WebDriver;

import pageFactory.homePageFactory;

public class homePage extends homePageFactory{
	
		public homePage(WebDriver driver) {
			super(driver);

		}
		public void clickOnQuizButton() {

			clickElement(quiz);
			
		}

}
