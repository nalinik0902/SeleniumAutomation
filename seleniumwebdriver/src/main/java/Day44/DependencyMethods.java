package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	// In TestNG , If we don't use dependency(dependsOnMethods),each testmethods runs independently. Even if one test fails, others still execute.
	
    // Dependency in TestNG means when one test method depends upon the another test method. 
	// If the methods fails, the dependent method will be skipped(yellow  color)
	// If the method pass, then the dependent method will run successfully.
	

	
	
	@Test(priority=1)
	void testlogin() {
		Assert.assertEquals(1, 4);
	}
	
	@Test(priority=2,dependsOnMethods= {"testlogin"})
	void dashboard() {
		Assert.assertEquals(1, 2);
	}
	
	
	
	
	
	

}
