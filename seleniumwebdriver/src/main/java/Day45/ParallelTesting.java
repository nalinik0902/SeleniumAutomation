package Day45;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
     /*
      1. Created test case
      2. Run testcase using xml.file
      3. Pass browser name as parameters from xml file to setup() method
      4. Execute test cases on all browsers one by one (sequential testing)
      5. Execute test cases on all browers in parallel. 
      
      */
	  
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		switch(br)
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		default:System.out.println("Invalid browser");return;
		}
    // driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@Test(priority=1)
	void testlogo()
	{
       boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
       AssertJUnit.assertEquals(status, false);
	}
	@Test(priority=2)
	void tesTitle() {
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void testURL() {
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void teardown() {
		driver.close();
		
	}

}
