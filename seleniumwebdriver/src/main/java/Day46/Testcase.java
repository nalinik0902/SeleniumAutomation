package Day46;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase {
	
	@Test(priority=1)
	void login() {
		System.out.println("This is Login");
		
	}
	@Test(priority=2)
	void addtocart() {
	   Assert.assertEquals(4, 3);
	}
	@Test(priority=3,dependsOnMethods="addtocart")
     void logout() {
		System.out.println("This is logout");
	}

}
