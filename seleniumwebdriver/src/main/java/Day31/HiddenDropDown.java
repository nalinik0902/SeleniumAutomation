package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// this site has login page so username and password should enter
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// click on PIM 
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		/*
		 
		//--------- select the "job title"----------- dropdown box
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]")).click();
		// select single option from jobtitle dropdown.
		// driver.findElement(By.xpath("//span[normalize-space()='Software Test Engineer']")).click();
		
		// Get all options from Job title dropdown
		List<WebElement> dropdownoptions=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(dropdownoptions.size());
		
		// printing all options from job title dropdown
		for(WebElement op:dropdownoptions) {
			System.out.println(op.getText());
		}
		
		*/
		// ----open the Employment status dropdown
		// driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters'][3]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")).click();
		
		// select single option from employment status dropdown
		//driver.findElement(By.xpath("//span[normalize-space()=\"Full-Time Probation\"]")).click();
		
		// get all the options from employment status dropdown 
		
		List<WebElement> op=driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		System.out.println(op.size());
		
		
		// print all the options 
		for(WebElement opt:op)
		{
			System.out.println(opt.getText());
		}
		
		
		
		
		
		

	}

}
