package Day27;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// This command will applicable to all lines of script till driver.close()
		// whichever script of webelement throws sysnchronization error, it will handle that element and wait till specified time
		// if element found within few seconds, it wont wait till maximum timeout like thread.sleep
		
		
		

	}

}
