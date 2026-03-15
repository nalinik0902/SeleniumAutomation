package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		/*
		 Three types of dropdown
		   1.select dropdown
		   2.Bootstrap dropdown
		   3.Hidden dropdown
		  
		1. Use Select dropdown when html has select tagname
		   -> selectbyvisibletext();
		   -> selectbyvalue();
		   -> selectbyindex();
		   
		    */
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// xpath of dropdown field
		WebElement el=driver.findElement(By.xpath("//select[@id='country']"));
		Select se=new Select(el);  // if dom html has select tag, use select class in selenium 
		se.selectByVisibleText("Japan");
		//se.selectByIndex(0);
		//se.selectByValue("japan");
		
		// -----------------------------------------------------------------------//
		
		// capture all the options from the dropdown 
		List<WebElement> options=se.getOptions(); // this will return all the options from the dropbox as a webelemwnt
		System.out.println(options.size());
		
		// if you want to print all the options in dropdown
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText()); 
		}
		
		for(WebElement opt:options)
		{
			opt.getText();
		}
		
		
		
		

	}

}
