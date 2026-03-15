package Day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		/*
		 xpath - is an address of an webelement
		 Types of Xpath:
		 1. Absolute Xpath(full xpath)  - begins with rootnode
		 2. Relative xpath(partial xpath)  - directly jump to an element using attributes
		 
		 Absolute xpath - htmla/body/header/div/input
		 Relative xpath- //tagname[@attribute='value']
		 
		 Relative xpath will be preferred. 
		 syntax- //tagname[@attribute='value'] - single attribute
		              //*[@attribute='value'] - if you dont know the tag name , put * 
		 multiple attribute ->  //tagname[@attribute='value'][@attribute='value']
		 
		 Difference between Absolute xpath and Relative Xpath
		 1. Absolute xpath starts with / - represents root node
		    Relative xpath starts with // 
		 2. Absolute xpath do not use attributes
		    Relative xpath works with attributes
		 3. Absolute xpath traverse through each node until it finds an element
		    Relative xpath directly jump and find element by using attribute
		           
		 */
		
		//xpath with and , or operator
		//tagname[@attribute='value' and @attribute='value'] both attribute should be matched in order to locate an element
		//tagname[@attribute='value' or @attribute='value'] atleast one of the attribute should match to locate an element
		
		// xpath with text() method  - innertext
		//tag[text()='value of the text']
		// if element is not having attribute, still we can locate an element using text() method if innertext is available
		
		// linktext(which has href) can be innertext
		 // but all innertext maynot be linktext
		
		// capture the text'
		String text=driver.findElement(By.xpath("//tagname[text()='value")).getText();
		System.out.println(text);
		
		// in order to handle the dynamic elements( value of the attribute keeps changing), we use contains and starts with method 
		  
		
		// xpath with contains  - search an attribute value anywhere in the word "search"
		driver.findElement(By.xpath("//tagname[contains(@attribute,'sea')]")).sendKeys("phone");   // attribute value is search . 
		
		// xpath with starts-with - search an attribute value from starting of the word "searh"
		driver.findElement(By.xpath("//tagname[starts-with(@attribute,'sea')]")).sendKeys("phone"); // attribute value is search
		
		/* chained xpath
		sometimes when attribute and innertext is not available to locate elements, we can see parent has any attribute, if parent also dont have attribute move to next parent.
		div[@id='logo']/a/dev
		 
		
		*/
		/*
		Difference between css selector and xpath
		css selector- search an element from top to bottom approach
		xpath - Navigate throughout the DOM to search an element top to bottom and bottom to top with help of xpath axes
		
		
		
		*/
		
		
		
		
		
		
		

	}

}
