package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
	
		
		WebElement el=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(el);
		
		
		// click on date field  - this element inside iframe so we need to switch to iframe 
		
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    
	    // current month and year is displaying in date picker.
	    // I want to select my specific month and year 
	    
	  // this is the month and year to be selected  
	 String month="June";
	 String year="2026";
	 String date="17";
	    
	 while(true)  // we use while loop because we dont know how many times we continue the loop. we continue until it finds specific month and year
	 {
		 String current_month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 String current_year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 
		 if(current_month.equals(month) && current_year.equals(current_year))
		 {
			 break;
		 }
		 
		 else {
			 // click on next arrow button 
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		 }
	 }
	 
	 
	 // next, we need to pick the date from the month and year
	 // Take xpath for all the dates along with the spaces from the date picker. 
	 // Because, on every month , dates are in different rows and empty spaces in different place
	 
	 List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	 
	 for(WebElement dt:dates)
	 {
		if(dt.getText().equals(date)) {
			dt.click();
			break;
		}
	 }
	    
	 // i kept above logic in methods at separate class and calling those methods from different class which has main method
	    
		

	}

}
