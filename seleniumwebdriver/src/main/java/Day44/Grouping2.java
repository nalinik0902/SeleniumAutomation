package Day44;

import org.testng.annotations.Test;

public class Grouping2 {
	@Test(priority=1,groups= {"smoke"})
	void payment() {
		System.out.println("This is payment");
		
	}
	@Test(priority=2,groups= {"sanity"})
	void PDP() {
	   System.out.println("This is PDP");	
	}
	@Test(priority=3,groups= {"sanity","regression"})
     void logo() {
		System.out.println("This is Logo");
	}
		
	
}
