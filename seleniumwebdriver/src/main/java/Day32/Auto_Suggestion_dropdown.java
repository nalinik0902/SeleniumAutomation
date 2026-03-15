package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("yoyo");
		List<WebElement> option=driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//div[@class='wM6W7d']"));
		System.out.println(option.size());
		for(WebElement op:option)
		{
			String opti=op.getText();
			if(opti.equals("yoyo game")) {
				op.click();
				break;
			}
			
		}

	}

}
