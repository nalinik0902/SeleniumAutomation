package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersusingActionsclass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		/*driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
		Actions act=new Actions(driver);
		
	   WebElement slider=driver.findElement(By.xpath("//input[@id='ageInputId']"));
	   System.out.println(slider.getLocation()); // (479,198)
	   act.dragAndDropBy(slider, 460, 198).perform();
	   System.out.println(slider.getLocation());
	   
	   
	   */
		
		// Sliders can be automated through Mouse actions
		Actions a=new Actions(driver);
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		WebElement min_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println(min_slider.getLocation()); // 188,46 (x,y)
		a.dragAndDropBy(min_slider, 230, 46).perform();
		System.out.println(min_slider.getLocation());
		
		WebElement max_slider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println(max_slider.getLocation());
		a.dragAndDropBy(max_slider, -50, 46).perform();
		System.out.println(max_slider.getLocation());

	}

}
