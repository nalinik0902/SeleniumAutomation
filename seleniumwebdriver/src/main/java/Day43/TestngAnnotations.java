package Day43;

public class TestngAnnotations {

	/*
	   Annotation tells TestNG what to do and when to do . It controls the execution flow of test methods.
	   
	   @Test - this will marks a method as a test case to be executed
	   @BeforeSuite- Runs once before the entire test suite starts
	   @AfterSuite - Runs once after the entire test suite finishes
	   @BeforTest - Runs before any test methods inside the <test> tag in testng.xml
	   @AfterTest   - Runs after the test methodss insie the <test> tag in testng.xml
       @BeforeClass - Runs once before the first test methods in a class
	   @AfterClass- Runs once after all the test methods in a class finish.
	   @BeforeMethod- Runs before each test metthod
	   @AfterMethod - Runs after each test method.
	   
	   
	   Easy to Remember
	   Suite -> project level - start and end of whole project 
	   Test level - Insid xml file < test tag>  - start and end of each test section
	   Class - class level- start and end of the class
	   Methods - beforetest ->test-> After test
	   
	   
	   
	  
	   //-----------------------------------------
	   
	   Execution order of TestNG
	     - BeforeSuite  
	     - BeforeTest
	     - BeforeClass
	     - BeforeMethod
	     - Test
	     - Aftermethod
	     - AfterClass
	     - AfterTest
	     - AfterSuite
	   
	   
	   
	 */
}
