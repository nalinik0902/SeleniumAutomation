package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePicker4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
		//driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown']//div[text()='March']")).click();
		//driver.findElement(By.xpath("//div[@class='react-datepicker__time-box']//li[text()='10:45']")).click();
		
		
		
		
		
		

	}

}
