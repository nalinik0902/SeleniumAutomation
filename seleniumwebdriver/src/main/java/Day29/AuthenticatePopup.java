package Day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticatePopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		
		/* somethimes authenticate popup will appear when opening the webpage. 
		until and unless we login , we cannot enter to the webpage
		we cannot locate the username and password field in authenticate popup
		*/
		
		// To handle this uthenticate popup, we are sending username and password along with url 
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");   // admin:admin --> username:password
		                                                                          // url ---->http://the-internet.herokuapp.com/basic_auth
		

	}

}
