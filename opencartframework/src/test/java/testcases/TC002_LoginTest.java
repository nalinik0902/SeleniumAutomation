package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.MyAccountPage;
import testbase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	   
 @Test
 public void LoginTest() {
	try {
		 
	 Homepage hp=new Homepage(driver);
	 hp.clickMyAccount();
	 hp.clickLogin();
	 
	 Loginpage lp=new Loginpage(driver);
	 lp.setEmail(p.getProperty("email"));
	 lp.setPassword(p.getProperty("password"));
	 lp.Login();
	 
	 MyAccountPage ap=new MyAccountPage(driver);
		boolean status= ap.isAccountPageExist();
		//Assert.assertEquals(status, true);
		Assert.assertTrue(status);
	}
	 catch(Exception e) {
		 Assert.fail();
		
		 
		 
	 }
	 
 }
}
