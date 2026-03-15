package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='monday']")).click();   // selecting specific checkbox
		
		// if you want to select all the checkboxes, find common attributes of that element
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		// to read all elements in list , use for and enhanced for loop 
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		for(WebElement cbox:checkboxes)
		{
			cbox.click();
		}

	}

}
