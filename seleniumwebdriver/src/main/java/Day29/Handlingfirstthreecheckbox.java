package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingfirstthreecheckbox {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		/* formula for handling checkboxes to select last 3 checkboxes
		 Total no.of checkboxes - how many no .of checkboxes that you want to select
		      7  -   3  = 4 ------> starting index 
		 */
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 // checkboxes.get(4).click();- 
	 /*for(int i=0;i<checkboxes.size();i++) // select all checkboxe using for loop
	 {
		 checkboxes.get(i).click();
	 }
	 */
	 
	 for(WebElement ch:checkboxes) { // select all checkboxes using enhanced for loop
		 ch.click();
		 
	 }
	 
	 
	 /* formula for handling checkboxes to select last 3 checkboxes
	 Total no.of checkboxes - how many no .of checkboxes that you want to select
	      7  -   3  = 4 ------> starting index 
	 
	 // we cant use enhanced for loop for choosing first 3 and last three checkboxes. 
	
		/*for (int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		
		// To select first 3 checkboxes  
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}

*/
	}

}
