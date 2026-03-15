package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("drop2madhu@gmail.com");
	
		
		driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click();
		driver.navigate().back();
		
		
		

	}

}
