package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePicker3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		
		// Both Month and year is in dropdown
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
        WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select se=new Select(Month);
        se.selectByVisibleText("May");
        
        WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select sel=new Select(Year);
        sel.selectByVisibleText("2026");
        
        //String date="24";
      List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        
      for(WebElement el:dates) {
    	  if(el.getText().equals("24")) {
    		  el.click();
    	  }
    	  
      }
        
        
	}

}
