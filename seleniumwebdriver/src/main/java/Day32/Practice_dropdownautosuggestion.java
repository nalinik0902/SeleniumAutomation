package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_dropdownautosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Gen");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> ops=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		System.out.println(ops.size());
		
		for(WebElement opt:ops)
		{
			String txt=opt.getText();
			if(txt.equals("Generation Z"))
			{
				opt.click();
				break;
			}
		}
		
		
	}

}
