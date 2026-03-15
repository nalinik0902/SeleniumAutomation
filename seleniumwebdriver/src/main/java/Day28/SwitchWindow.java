package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // 1st window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();   // 2nd window
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();  // 3rd window

		
		
		// switching between two windows. In order to switch from one window to another window we need to get the id of the window by using getwindowhandle() method
		
		Set<String> windowid=driver.getWindowHandles();   // getting id of multiple windows (get windowhandles)
		
		/* How to access specific element in set collection ? converting set into arraylist, here we converting set to arraylist to access specific windowid. 
		
		List<String> winid=new ArrayList(windowid);
		String parent_id=winid.get(0);          
		String child_id=winid.get(1);
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent_id);
		System.out.println(driver.getTitle());
		
		*/
		
		
		// Note- window id keeps change at run time 
		// use enhanced FOR LOOP if you're handling multiple windows id .
		
		for(String wid:windowid)
		{
			String title=driver.switchTo().window(wid).getTitle();   // here you can use getcurrenturl
			if(title.equals("OrangeHRM"))
			{
				 
				System.out.println(driver.getCurrentUrl());
				// here we do operations on respective windowid.
				
			}
		
			
			
		}
		
		//---------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
