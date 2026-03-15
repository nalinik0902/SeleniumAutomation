package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
   /*
	 1.we use assertions in TestNG Framework 
	 2.Assertions are used to verify the expected results with actual results
	 3.Hard Assertions(Default Assertion) 
	    - It stops the execution immediately if the assertions fails.
	 4.Soft Assertions - It do not stop the execution if assertion fails
	   you must call assertAll() at the end to mark the test as failed. 
	   If you forget assertAll() , the test will show as passed even if assertions fail. 
	      
	*/
	@Test
	void testhardassertion() {
	Assert.assertEquals("xyz","tyz"); // fail
	Assert.assertNotEquals(5,8);  //pass
	Assert.assertTrue(5>4);    // true
	Assert.assertFalse(1>2);  // true
	
	System.out.println("This is Hard Assertion"); 
	
	}
	
	@Test
	void testsoftassertion() {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(5, 3);
		System.out.println("This is soft assertion");
		sa.assertAll();
	}
	
	
	
}
