package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtableWithPagination {

	public static void main(String[] args) {
		
		/*
		 To handle the dynamic web table, first we need to find total no.of pages
		 click on pages and read the data from that page
		 
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// Find out the page
		int page_size=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println(page_size);
		// Click on pages - we have 1 to 4 pages
		for(int p=1; p<=page_size;p++) {
			if(p>1)   // because page 1 is already clicked by default . starting from page 2
			{
				driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+p+"]")).click();  
			}
			
			// read data from the pages clicked
			
	        int row_size=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size(); // use tbody in xpath so that header will be skipped
	        for(int i=1;i<=row_size;i++) {
	        	String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[2]")).getText();
	        	//System.out.println(name);
	        	String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[3]")).getText();
	        	//System.out.println(price);
	        	WebElement box=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[4]//input[@type='checkbox']"));
	        	box.click();
	        	
	        	System.out.println(name+"\t"+price);
	        	
	        	
	        }
	        
	        
			
		}
		
		/*
		 in case if no of pages display like " showing 1 to 10 of 19081 (1909 pages)"
		 how to get the page number from this string 
		 
		 String text=driver.findElement(By.xpath("//div[contains(text(),'pages')]")).getText(); // this will return showing 1 to 10 of 19081 (1909 pages)
		   // from this string we need to get only page number . so we use substring along with index of because what if no.of pages changes
		 int no_of_pages=Integer.parseint(text.substring(text.indexof("(")+1,text.indexof("pages")-1)); 
		 
		 */
		
		

		
		

	}

}
