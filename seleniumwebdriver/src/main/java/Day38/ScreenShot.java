package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		// Like Javascriptexecutor, Takescreenshot is also an interface implemented by remotewebdriver
		
		/*
		 Before selenium 4, we could able take screenshot of the whole page 
		 After selenium 4, we can take screenshot of the specific area and webelement
		 
		 */
		
		/*
		// 1. To Take screenshot for the entire page, we use TakesScreenshot interface 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE); // screenshot would be stored as file somewhere in the memory
		File target_file=new File(System.getProperty("user.dir")+"\\screenshot\\sc.png"); // location where you save under the project directory is dynamic,
		source_file.renameTo(target_file); // this copy the screenshot from sourec to target.
		
		// create folder under project directory. 
		//system.getproperty("user.dir") will get the project directory location.under this directory we go to screenshot folder that created . inside of that folder , screenshot.png will get saved
		
		*/
		
		/*
		// 2. Screenshot for specific page
		
		// webelement is also an interface. if want to take specific page or specific element screenshot  we use getscreenshotas method from webelement interface
		
		WebElement ele=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File source=ele.getScreenshotAs(OutputType.FILE);
        File target=new File(System.getProperty("user.dir")+"\\screenshot\\sc1.png");		
        source.renameTo(target);
        
        */
		
		// 3. Screenhot for specific element
		WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source=ele.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshot\\sc2.png");
		source.renameTo(target);
		
        
        
        
	}
	
	

}
