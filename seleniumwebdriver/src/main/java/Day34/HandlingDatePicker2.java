package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String M="July";
		String Y="2026";
		String D="18";
		while(true) {
		String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(month.equals(M) && year.equals(Y)) {
			break;
			
		}
		
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:dates) {
			if(dt.getText().equals(D)) {
				dt.click();
			}
		}
		}
		
		
	
	}


