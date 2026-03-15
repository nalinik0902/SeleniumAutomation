package Day28;

import java.sql.Time;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closewindow {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // 1st window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();   // 2nd window
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click(); // 3rd window
       
		// if you want to close multiple window at the same Time.
		Set<String> windid=driver.getWindowHandles();
		
		for(String wid:windid)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if (title.equals("OrangeHRM") || title.equals("Human Resources Management Software | HRMS | OrangeHRM"))
			{
				driver.close();
			}
		}
	}

}
