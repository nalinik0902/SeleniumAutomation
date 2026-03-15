package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	// ITestListener - is an interface which listens to the test methods
	
	/* Listener in TestNG is used to monitor the test execution and perform actions like
	Capturing screenshots when a test fails,Logging test execution details,Generating custom reports.
	*/
	
	public void onStart(ITestContext context) {                   // It runs before test suite starts
		System.out.println("Test started before execution");
	  }

	
	public void onTestStart(ITestResult result) {                // It runs when the test methods starts
	   System.out.println("Test started bfore test methods");
	  }
	public void onTestSuccess(ITestResult result) {              // It runs when the test passes
	    System.out.println("Test passed");
	  }
	
	public void onTestFailure(ITestResult result) {               // It runs when the test fails
	    System.out.println("Test failed");
	  }
	public void onTestSkipped(ITestResult result) {               // It runs when the test is skipped
	    
	  }
	public void onFinish(ITestContext context) {                  // It runs after all tests finish
	   System.out.println("Test skipped");
	  }


}
