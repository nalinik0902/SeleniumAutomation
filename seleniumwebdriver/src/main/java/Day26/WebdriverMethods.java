package Day26;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
	
		/* ----Get methods---------- we can use these methods on a web page 
		1. get(url)   - open url on the browser
		2. getTitle()  - returns title of the page
		3. getCurrentUrl() - returns current url of the page
		4. getPageSource() - returns source code of the page
		5. getWindowHandle() - returns id of the single window browser
		6. getWindowHandles() - returns id of the multiple browser window   
		
		*/
	   WebDriver driver=new ChromeDriver();
	   Set<String> windowid=driver.getWindowHandles();
	   System.out.println(windowid);
	   
	   /* --------Conditional methods---------- we use these methods on webelement during validation 
	    it returns true/false
	    
	   1. isdisplayed();
	   WebElement element= driver.findElement(By.xpath("//tagname[@attribute='value']"));
	   syso(element.isdisplayed()); 
	            or
	   boolean elem=driver.findelement(By.xpath("//tagname[@attribute='value']")).isdisplayed();  // it returns true or false
	   syso(elem);       
	   2. isenabled();
	   3. isselected();
	    */
	
	   /* ------------Browser Methods-----------
	    driver.close(); - close only one browser window at a time which is first browser because driver is focusing om first browser
	    driver.quit();  - close multiple browser at a time
	    
	    */
	   
	  
}
}
