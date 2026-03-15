package testbase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

    /*BaseClass is a class that contains common setup and teardown methods 
	like browser launch, login, logout, and browser close, which can be reused by all testcase classes.
	*/
	public Logger logger;      // import org.apache.logging.log4j.LogManager; // import org.apache.logging.log4j.LogManager;
	public WebDriver driver;
	public Properties p;
	
	
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException {
		
		// loading config.properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		default:System.out.println("Invalid browser");return;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get(p.getProperty("url"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String randomString() {
		String randomGeneratedString=RandomStringUtils.randomAlphabetic(5);
		return randomGeneratedString;
	}
	public String randomNumber() {
		String randomGeneratedNumber=RandomStringUtils.randomNumeric(10);
		return randomGeneratedNumber;
	}
	
	public String randomAlphaNumeric() {
		String randomGeneratedString=RandomStringUtils.randomAlphabetic(3);
		String randomGeneratedNumber=RandomStringUtils.randomNumeric(3);
		return(randomGeneratedString+"@"+randomGeneratedNumber);
		
	}
}


