package Day28;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 navigate.to(url) same as driver.get(url)
		 navigate.back()
		 navigate.forward()
		 navigate.refresh()
		 
		 */
		WebDriver driver=new ChromeDriver();
		/* what is the difference between get(url) and navigate().to(url)
		driver.navigate().to("https:wwww.google.com");
		driver.get("https://www.google.com");
		
		get (url)- accepts url in string format only 
		navigate().to(url) - accepts urls in string format as well as url object format
	
		
		*/ 
		/* URL object creation 
		URL urlobj=new URL("https:www.google.com");
		driver.navigate().to(urlobj);
		*/
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
