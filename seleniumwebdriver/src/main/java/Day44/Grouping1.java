package Day44;

import org.testng.annotations.Test;

public class Grouping1 {

	/*
	 Groupings in testng is used to categorize the test methods into different groups like sanity.smoke and regression
	 In TestNG, groups are declared using the groups attribute in @Test, and executed using the <groups> tag inside testng.xml.
	 
	 */
	
	@Test(priority=1,groups= {"smoke"})
	void login() {
		System.out.println("This is Login");
		
	}
	@Test(priority=2,groups= {"sanity"})
	void addtocart() {
	   System.out.println("This is addtocart");	
	}
	@Test(priority=3,groups= {"regression"})
     void logout() {
		System.out.println("This is Logout");
	}
		
	
}
