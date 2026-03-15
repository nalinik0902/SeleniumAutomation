package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_staticWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/webtable/");
		int rows=driver.findElements(By.xpath("//table[@id='myTable']//tbody//tr")).size();
		int columns=driver.findElements(By.xpath("//table[@id='myTable']//th")).size();
		
		// read all rows and columns
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++) {
				String value=driver.findElement(By.xpath("//table[@id='myTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		}

	}

}
