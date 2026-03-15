package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		// Locator is used to identify web elements on the web page.
		// id, name, linktext/partiallinktext, classname, tagname
		WebDriver driver=new ChromeDriver();
		// driver.get("https://www.demoblaze.com/index.html");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		/*
		 Classname and tag name are used to identify group of elements example - finding all links in the page 
		 whenever finding an group of elements, use driver.findelements and store this to List<WebElement>
		 */
		
		//Here, i use classname for finding a single element 
		driver.findElement(By.className("lNPl8b")).sendKeys("toys");
		
		// to get all the images link 
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		/*
		Difference between Linktext and partiallinktext:
		1. LinkText - locates an element using the exact visible text
		2. PartialLinktext locates an element using part of the visible text
		3. Both works only for anchor tag <a> 
		4. Partiallinktext has high risk of finding a wrong element
		
		when not to use partiallinktext
		- if multiple links contains the same word. 
		
		*/
		/*
		Difference between driver.findElement() and driver.findElements()
		1. driver.findelement() - returns a single element
		  If element is not found, it throws an exception- NoSuchElementFound
		2. driver.findelements() - returns a multiple elements
		    If element is not found , it returns empty list but no exception. 
		    empty list size - zero will return
		
		*/
		
		
	
		
		
		
		
		
		

	}

}
