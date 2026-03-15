package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		/*
		 Actions class is used to perform mouse actions
		   - Mouseover  (use movetoelement method) 
		   - RightClickk (use Contextclick method)
		   - Doubleclick  (use doubleclick method)
		   - Drag and Drop (use draganddrop method)
		   
		   
		   Actions act=new Actions(driver);
		   act.movetoelement(element).build().perform();
		   act.contextclick(element).perform()
		   act.doubleclick(element)
		   act.draganddrop(element)
		   
		   Difference between perform() and build()
		   Build() - create an action 
		    If you want to create an action and perform it later. then put build () and save it in action type variable
		    Action a=act.doubleclick(element).build()
		    later, if you want to perform
		     a.perform()
		   Perform() - complete an action but in built it will do build operation and complete an action. 
		   
		   Difference between Actions and Action 
		   Actions is a class provided in selenium which is used to perform mouse actions.
		   Action is an interface which is used to store the created actions. 
		   
		   Difference between gettext() and getattribute()
		   gettext() -returns the inner text.
		   getattribute()- returns the value of the attribute.
	   
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		// Double click
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		field1.clear();
		field1.click();
		field1.sendKeys("Aadhya");
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act=new Actions (driver);
		act.doubleClick(button).perform();
		String text=field2.getAttribute("value");
		System.out.println(text);
		if(text.equals("Aadhya")){
			System.out.println("Both field1 and field2 are matching");
			
		}
		else {
			System.out.println("not matching");
		}
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	    //act.dragAndDrop(drag, drop).perform();
	    // or
	    Action a=act.dragAndDrop(drag, drop).build();
	    a.perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
