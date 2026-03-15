package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
      
		
		// ChromeOptions can be used to perform headless testing
		// Headless testing perfom the execution in backend
		// we dont see any actions on UI during headless testing
		
		/*
		Advantage of headless testing
		1. fast execution
		2. we can run multiple task since execution run in backend
		Disadvantage:
		1. user cannot see the actions on the ui. so he can't understand flow/funtionality of the test.
		
		*/
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.npmjs.com/package/commerce-sdk");
		String title=driver.getTitle();
		if (title.equals("commerce-sdk"))		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		

	}

}
