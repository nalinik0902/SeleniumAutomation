package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {

	 // open orangeHRM app
	// login
   // close the browser
	
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		}
	@Test(priority=2)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();		
	}
	
	@Test(priority=3)
	void close() {
		driver.close();
	}
	
}
