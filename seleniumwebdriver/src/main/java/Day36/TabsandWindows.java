package Day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
	  
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//driver.get("https://www.flipkart.com/");
		
		// Normally it opens the first url and then replacing the first url by opening the second url.
		// I want to open these two URL page in two different tabs or two different window 
		//  Selenium 4 supports this new function to open both url in separate tab.
		
		driver.get("https://www.facebook.com/");
		//driver.switchTo().newWindow(WindowType.TAB); // it will open new tab and driver focus on that new tab after opening the first URL
		
		// If you want to open both of the url in two separate window
		driver.switchTo().newWindow(WindowType.WINDOW); // just change the window type as window. it will open the new window
		driver.get("https://www.flipkart.com/");
		
		// If you want to open both of the url in two separate window
		driver.switchTo().newWindow(WindowType.WINDOW); // just change the window type as window. it will open the new window
		
		
	}

}
