package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_main1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/"); 
		
		// This site has date picker which has no dropdown selection for picking month or year
		
		WebElement el=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(el);
		
		
		// click on date field  - this element inside iframe so we need to switch to iframe 
		
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    
	    // current month and year is displaying in date picker.
	    // I want to select my specific month and year 
	    
	  // this is the month and year i want the datepicker to  select  
	 String month="June";
	String year="2026";
 String date="17";
	    
	    // create object of the class where we have method.
	    Datepicker_class1 obj=new Datepicker_class1();
	    obj.Datepicker(driver,month,year,date);

	}

}
