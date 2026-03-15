package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AccountRegistrationPage;
import pageobject.Homepage;
import testbase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	// public WebDriver driver;
	
	/*@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://tutorialsninja.com/demo/");
	}*/
	
	@Test
	public void CreateAccountRegistration() {
		logger.info("Testcase of Account Registration Started");
		Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		logger.info("Home page completed");
		logger.info("Account Registration Started");
		AccountRegistrationPage register=new AccountRegistrationPage(driver);
		register.setFirstname(randomString().toUpperCase());
		register.setLastname(randomString().toUpperCase());
		register.setEmail(randomString()+"@gmail.com");
		register.setPhonenum(randomNumber());
		String password=randomAlphaNumeric();
		register.setPassword(password);
		register.setPasswordConfirm(password);
		register.Checkoncheckbox();
		register.clickOnContinue();
		String message=register.getConfirmationMsg();
		if(message.equals("Your Account Has Been Created!!!")) {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertFalse(false);
			logger.debug("Debug logs");
			logger.error("Test failed");
		}
		Assert.assertEquals(message, "Your Account Has Been Created!");
		System.out.println(message);
		System.out.println(p.getProperty("completionmessage"));
		
		
	}
	
	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
	 
	// To generate random strings and numbers at run time, we need apache commom io and apache common lang dependency in pom.xml
	
	/*
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
	*/
	
}
