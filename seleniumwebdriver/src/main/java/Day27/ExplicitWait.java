package Day27;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
       WebDriver driver=new ChromeDriver();
       // Below,  we declare explicitwait by creating object of the class 'webdriverwait'
       WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(5));
       // whenever synchronization occur for any webelement, mention the below command . 
       // Also, finding an element is inclusive in explicit wait . you dont need to specify the driver.findelement xpath again.
       WebElement element=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
       // this above condition will check and wait until the visibility of the locator , if true, it returns webelement
       element.sendKeys("mobile");
       
	}

}
