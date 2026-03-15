package Day27;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
	    
		WebDriver driver=new ChromeDriver();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10)) // waiting 10 seconds for an element to be present on the page
			       .pollingEvery(Duration.ofSeconds(5)) // checks the presence of an element on every 5 seconds 
			       .ignoring(NoSuchElementException.class); // ignore the specific type of exception while waiting for searching an element on the page

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
	

	}

}
