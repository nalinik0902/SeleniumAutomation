package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		
		/*
		 In selenium, a frame is an html element that allows one webpage to be embedded inside another web page. 
		 By default, selenium works only with elements in the main page . it  cannot directly access elements inside a frame.
		 you must switch selenium's focus to the frame first. 
		 
		 switch to the frame using
		 - frame index  - can be used when you have only one frame 
		 - frame name 
		 - frame id
		 - webelement (recommened)
		 driver.switchTo.frame();
		 
		 go back to the main page from the frame 
		 driver.switchTo.defaultContent();
		 
		 
		 
		 */
		// switching to frame 1
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		
		// now, accessing elements in frame 1
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		// come back to main page
		driver.switchTo().defaultContent();
		
		// now moving to frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		// now, accessing element in frame 2 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		
		// Now, moving to frame 3 from frame 2
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		// now, accessing element in frame 3
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome to this site");
		
        // iframe- when one frame contains an another frame 
		// this above frame 3 has an another frame inside 
		
		// switching to the iframe in frame 3
		
		driver.switchTo().frame(0); // using index, since frame 3 has only one frame embedded.
		
		
		
		// now accessing an element in iframe by inspecting for iframe link of frame 3 and copy the link address and open it on new window . now find xpath for that specific element using selectorhub
		// driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		      // or
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",rdbutton);
		driver.switchTo().defaultContent();
	
		//whenever you interact with the element.click or checkbox or link, sometimes you may get -> Element clickable exception and element interrupted exception 
		// In that time, you can use javascript executor
		
	
		/* JavascriptExecutor:
		It is mainly used when selenium webdriver fails to perform actions like click, scroll . 
		Javascriptexecutr directly triggers DOM event without checking element visibility
		*/
		
		
		
		
		
		
		

	}

}
