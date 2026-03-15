package Day34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker_class1 {
	
	
	
	void Datepicker(WebDriver driver,String month,String year, String date) {
	 while(true)  // we use while loop because we dont know how many times we continue the loop. we continue until it finds specific month and year
	 {
		 String current_month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // month
		 String current_year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  // year
		 
		 if(current_month.equals(month) && current_year.equals(year))
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
	}
	    
}	    
		



