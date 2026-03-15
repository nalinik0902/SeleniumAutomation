package Day40;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingdatafromexcelusingExcelUtil {

	public static void main(String[] args) throws Exception {
		
		// Data driven testing is executing the test cases with different sets of input. 
		
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	       driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	       
	       String filepath=System.getProperty("user.dir")+"\\Testdata\\CD.xlsx";
	       int row=ExcelUtil.getrowcount(filepath, "Sheet1");
	       
	       for(int i=1; i<=row;i++)
	       {    
	    	   //Read data from excel
	    	  String Princ= ExcelUtil.getcelldata(filepath, "Sheet1", i, 0);
	    	  String lengthofcd= ExcelUtil.getcelldata(filepath, "Sheet1", i, 1);
	    	  String roi= ExcelUtil.getcelldata(filepath, "Sheet1", i, 2);
	    	  String compounding= ExcelUtil.getcelldata(filepath, "Sheet1", i, 3);
	    	  String exp_mvalue= ExcelUtil.getcelldata(filepath, "Sheet1", i, 4);
	    	  
	    	  // passing data to webpage
	    	  driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
	    	  driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(Princ);
	    	  driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
	    	  driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(lengthofcd);
	    	  driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
	    	  driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(roi);
	    	  
	    	  
	    	  //driver.findElement(By.xpath("//div[@class='mat-mdc-text-field-wrapper mdc-text-field mdc-text-field--filled']")).clear();
	    	  
	    	  //WebElement comp=driver.findElement(By.xpath("//div[@class='mat-mdc-text-field-wrapper mdc-text-field mdc-text-field--filled']"));
	    	  //comp.sendKeys(compounding);
	    	  
	    	  
	    	  
	    	  
	    	   
	    	   
	    	   
	       }
	       
	       
	       
		

	}

}
