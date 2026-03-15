package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		
		// Keyboard actions perform by using actions class
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Good Morning India!");
		Actions a=new Actions(driver);
		// Select the text(Ctrl+A)
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		// I want to copy the text ( ctrl+C)
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// pressing tab key
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// I want to paste the text (Ctrl+v)
		a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		/*
		 ctrl+shift+a
		 
		 keyDown(keys.CONTROL).keyDown(keys.SHIFT).sendkeys("A").keyUp(keys.SHIFT).KeyUp(keys.CONTROL).perform();
		 
		 */
		
		
		
		
		

	}

}
