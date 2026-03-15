package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openthelinkinnewtabusingkeyboardactions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		// open the register link in new tab using keyboard actions (Ctrl+clik on element)
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		 Actions ac=new Actions(driver);
		 ac.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		 
		 // switch to register tab window
		 Set<String> win=driver.getWindowHandles();
		 List<String> wi=new ArrayList(win);
		 String w2=wi.get(1);
		 driver.switchTo().window(w2);
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		 driver.switchTo().window(wi.get(0));
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
		 
		 
		 
		 
		 
		

	}

}
