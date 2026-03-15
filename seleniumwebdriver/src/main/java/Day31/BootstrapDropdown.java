package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	// Bootstarp button , we deal with ul,li,a(anchor tag)

	public static void main(String[] args) throws InterruptedException {
	   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.jquery-az.com/bootstrap-tips-tutorials/"); // this url is different than pavan url 
		driver.manage().window().maximize();
		
	     //driver.findElement(By.xpath("//a[text()='Web']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Web']//*[name()='svg']")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='sub-menu']//li[@id='menu-item-7091']//a"));	// this xpath is not working 
		System.out.println(options.size());
		// System.out.println(options);
		for(WebElement opt:options) {
		   String text=opt.getText();
		   System.out.println(text);
		  
		
		}
		
	}
}	
