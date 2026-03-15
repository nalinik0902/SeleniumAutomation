package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_DynamicTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		
		// Dynamic table with pagination
		// find no.of pages
		List<WebElement >page=driver.findElements(By.xpath("//ul[@class='pagination']//li"));
		page.remove(5);
		page.remove(0);
		
		int page_size=page.size();
		System.out.println(page_size);
		/*
		for(WebElement p:page) {
			System.out.println(p.getText());
		}
		*/
		
		// click on all pages
		for(int p=1;p<=page_size;p++)
		{
			if(p>1) {	
			driver.findElement(By.xpath("//ul[@class='pagination']//a[normalize-space()='+p+']")).click();
			}
			
			
		}
		

	}

}
