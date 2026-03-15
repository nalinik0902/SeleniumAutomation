package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest_PageFactory {

	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void testlogin() {
		LoginPage_PageFactory lp=new LoginPage_PageFactory(driver);
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.login();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass()
	public void teardown() {
		driver.close();
	}
	
}
