package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectandUnselectcheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();    // first three checkboxes are selected
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)    
		{
			if(checkboxes.get(i).isSelected()) {   // only selected checkboxes will be unselected
				checkboxes.get(i).click();         
				
			}
		}
		

	}

}
