package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	WebDriver driver;
	//Constructor
	
	LoginPage_PageFactory (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator
	
	//By user_name=By.xpath("//input[@placeholder='Username']");
	//By password=By.xpath("//input[@placeholder='Password']");
	//By login_button=By.xpath("//button[normalize-space()='Login']");
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login;
	
	
	
	
	// ActionMethods
	
	public void setusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void login() {
		login.click();
	}
	
	
	

}
