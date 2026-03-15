package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		
		// Javascript executor is an interface implemented by remote webdriver class
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// If you want to send text to the text box using javascript executor
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Nalini')",name );
		
		// If you want to click on button using java script executor 
		WebElement button=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", button);
		   
		
		
		

	}

}
