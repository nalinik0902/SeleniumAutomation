package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {

	// What is the return type of data provider method in selenium
	
	//Data provider is used to run the test multiple times with different data.
	
	//   - Data provider method always returns Two Dimensional Array.
	
	// Dataprovider advantage - without using any looping statements , we can repeat the test methods. 
	// Through dataprovider , we achieve data driven testing
	
	// In real time, we create all DataProvider methods in separate class . 
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	}
	@Test(dataProvider="dp")
	void Testlogin(String email,String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		

		
			
	}
	
	
	@AfterClass
	void teardown(){
		driver.quit();
		
	}
	
	
	
	@DataProvider(name="dp")
	Object[][] logindata() {
		
		Object data[][]= {{"abc@gmail.com","abc@123"},
		                  {"xyz@gmail.com","xyz@123"},
				           {"pqr@gmail.com","pqr@123"},
				           {"nalinik0902@gmail.com","Nalini@0902"}
		                  
		                  };
		
		return data;
		
	}
	
}
