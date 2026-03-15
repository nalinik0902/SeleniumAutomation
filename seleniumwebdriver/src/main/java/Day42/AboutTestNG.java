package Day42;

public class AboutTestNG {

	/*
	 TestNG is a java based unit testing tool.
	 TestNG executes the methods in alphabetical order.
	 @Test(priority=num) - controls the order of execution.
	 Priority number can be random numbers not only consecutive number.
	 If you do not provide priority, then default priority value=0.
	 If priority is same , then methods gets executed in alphabetical order.
	 we can also provide negative numbers for priority.
	 
	 we can run multiple test cases using testng xml file. Testng report can also be generated.
	 click on projet -> Testng-> convert to testng->browse for selecting packages where xml file get created
	 you will see test-output folder created under project
	 go to testng xml file and run as testng suite 
	 automatically reports generated in test -output - refresh it 
	 two files to view - Emailable-report.html and index.html
	 
	 Testsuite(group of testcases) - Test cases  - Test steps
	 xml (group of classes which has test cases) - Classes - Test methods
	 
	 To cereate manual xml file- go to package where you have classes - right click - file -create file.xml 
	 
	 
	 
	 Advantages of TestNG:
	 1. Testcases and Test Suites
	 2. Grouping of test cases
	 3. Prioritize
	 4. Parameterization
	 5. Parallel Testing
	 6. Reports
	 
	 Installation
	 1. Go to Help ->marketplace->Search Test NG and install it 
	    some pages will appear in between , choose select all
	 2. Window -> Preferences to check TestNG is added or not
	 3. To configure TestNG in your project- Select right click of your project -> Properties->Java build path-> libraries-> add library->TestNG
	 4. Another way to configure testng to project is adding testng dependencies from mvn repository in pom.xml file 
	 */
}
