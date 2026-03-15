package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestcaseDemo {

	public static void main(String[] args) {
		// Launch browser
		WebDriver driver=new EdgeDriver();
		// open url
		driver.get("https://www.google.com/");
		// validate title should be Google 
		String actual_title=driver.getTitle();
		if(actual_title.equals("Google")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		driver.quit();
		
		

	}

}
