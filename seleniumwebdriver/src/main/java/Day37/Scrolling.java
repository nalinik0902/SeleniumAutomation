package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/all-countries.html");
		
		// Scrolling can be handled using JavascriptExecutor
		/*
		  Scrolling can happen in 4 ways
		  1. scrolling down by fixing pixel number
		  2. scrolling down till an element is found
		  3. scrolling all the way to down page
		  4. scrolling all the way to up 
		 */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		 
		// 1. scrolling down by fixing pixel number
		js.executeScript("window.scrollBy(0,900)","");
		// if you want  to it is correctly scroll to the specified pixel
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		*/
		
		/*
		
		// 2. scrolling down till an element is found
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Free online courses']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		*/
		
		/*
		// 3. scrollig till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);"); // ) 0 is starting point  
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		/*
		 
		 /*
		   
		// 4. Scrolling page till up
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
