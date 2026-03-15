package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//Constructor
	
	LoginPage (WebDriver driver){
		this.driver=driver;
	}
	
	// Locator
	
	By user_name=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By login_button=By.xpath("//button[normalize-space()='Login']");
	
	
	
	// ActionMethods
	
	public void setusername(String uname) {
		driver.findElement(user_name).sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void login() {
		driver.findElement(login_button).click();
	}
	
	
	

}
