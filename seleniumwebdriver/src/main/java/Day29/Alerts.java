package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*
		 whatever element present on alert window, we cannot locate that element. 
		 Then, how to handle the alert ? - we need to switch to alert window 
		 Three types of alerts:
		 1. Regular alert with ok button
		 2. Confirmation alert with ok and cancel button
		 3. Prompt alert with ok and cancel button
		 
		 */
		/*-------------------- Regular alert with ok button------------------------------
		
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     driver.switchTo().alert().accept();
            // or 
     Alert al=driver.switchTo().alert();
       al.accept();   // press the ok button
       al.getText();
       */
       
       /* ------------------- Confirmation alert with ok and cancel button---------------------
       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
       Alert a=driver.switchTo().alert();
       a.getText();
       a.accept();
       // driver.switchTo().alert().dismiss(); // press the cancel button in alert window 
       
        */
		
		// -----------------Prompt alert with ok and cancel button-------------------
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert ale=driver.switchTo().alert();
		ale.sendKeys("welcome");
		ale.accept();
		
       
		
		
		
		
		

	}

}
