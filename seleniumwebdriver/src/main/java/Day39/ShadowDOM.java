package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	       driver.get("https://books-pwakit.appspot.com/");
	       
	     
	       /* Shadow host -> shadow root -> Element 
	          if element is present in shaow dom, it cannot be accessed by using xpath. 
	          It can only be accessed by CSS Selector
	          */
	      // single shadow dom
	       SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	       Thread.sleep(1000);
	       shadow.findElement(By.cssSelector("#input")).sendKeys("Test");

	}

}
