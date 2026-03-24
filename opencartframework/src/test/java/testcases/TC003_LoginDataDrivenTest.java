package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.MyAccountPage;
import testbase.BaseClass;
import utilities.Dataprovider;


public class TC003_LoginDataDrivenTest extends BaseClass {
	
	
@Test(dataProvider = "LoginData", dataProviderClass = Dataprovider.class)
public void LoginDDT(String username,String password,String status) {
	
	try {
	
// Homepage
	 Homepage hp=new Homepage(driver);
	 hp.clickMyAccount();
	 hp.clickLogin();
	 
// LoginPage
	 Loginpage lp=new Loginpage(driver);
	 lp.setEmail(username);
	 lp.setPassword(password);
	 lp.Login();
	 
// Account page
	 MyAccountPage ap=new MyAccountPage(driver);
		boolean page= ap.isAccountPageExist();
		
		/*
		 Data is valid - Login pass - logout - test pass
		               - login fails - test fails
		               
		 Data is invalid - Login pass - logout - test fail
		                 - login fails - test pass
		 */
		
		 if (status.equalsIgnoreCase("Valid")) {

		        if (page==true) {
		            System.out.println("Valid Test Passed");
		            ap.clickLogout();
		            Assert.assertTrue(true);
		            
		        } else {
		            System.out.println("Valid Test Failed");
		            Assert.assertTrue(false);
		        }

		    } else if (status.equalsIgnoreCase("Invalid")) {

		        if (page==false) {
		            System.out.println("Invalid Test failed");
		           //  ap.clickLogout();
		            Assert.assertTrue(true);
		            
		        } else {
		            System.out.println("Invalid Test passed");
		            Assert.assertTrue(false);
		        }
		    }
	}
		


catch(Exception e) {
	Assert.fail();
}

	

}
}
