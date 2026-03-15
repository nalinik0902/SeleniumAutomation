package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		/*
		 1. Static webtable (no.of rows,no.of column and data are stattic values)
		 2. Dynamic Webtable (no .of rows and no.of columns and data are keep changing)
		 3. webtable with pagination ( Table which has pages from 1 to 5 etc )
		 */
		
		// To find all the rows in the static webtable
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("A size of rows:"+rows);
		
		// To find all the columns in the table
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("A size of column:"+columns);
		
				 
		 // to read data from specific row[3] and column[4] - contains numbers
		 String text=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[4]")).getText();
		 System.out.println(text);
		 
		 // Read data from all the rows and columns from the static webtable using nestedloop
		 for(int r=2;r<=rows;r++)
		 {
			 for(int c=1;c<=columns;c++){
					 String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					 System.out.println(value+"\t");  // /t -> tab space 
					 
		 }
		 
		 System.out.println();
		 }
		 
		 // print all book names whose author is mukesh from the webtable
		 
		 for(int r=2; r<=rows;r++) {
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			 if(authorname.equals("Mukesh"))
			 {
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			 
			System.out.println(bookname);
			 }
		 }
		 
		 // find total price of all the book
		 int total=0;
		 for(int r=0;r<=rows;r++) {
			 String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			 total=total+Integer.parseInt(price);
		 }
		 System.out.println(total);
		 
		
		

	}
	}



