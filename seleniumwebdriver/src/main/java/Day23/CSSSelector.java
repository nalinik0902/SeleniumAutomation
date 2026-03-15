package Day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		/*
		 CSS( cascade styling sheets) Selector 4 thumb rule
		 1.tag id - tag#id
		 2.tag classname - tag.classname
		 3.tag attribute - tag[attribute='value']
		 4.tag class attribute - tag.class[attribute='value']
		 */
		// added selectorhub extension to the browser (Microsoft edge)
		driver.findElement(By.cssSelector("img[title='Flipkart']")).click();    // tag+attribute 
		
		
	
		

	}

}
