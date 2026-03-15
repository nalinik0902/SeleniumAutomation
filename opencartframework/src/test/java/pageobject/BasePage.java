package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	/*
	 create basepage under pageobjects that only have constructors. This will be invoked by every page objects class constructor(Re-Usability)
	 */
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
