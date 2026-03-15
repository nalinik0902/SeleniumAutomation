package Day47;

public class AboutPOM {

	/* POM is not a framework , it is basically a design pattern where each webpage is represented as separate class containing webelements/locators and its corresponding action methods.
	   
	   Without POM in automation framework ?  
	     - Code Duplication
	     - If locator change, we must update everywhere
	   With POM in automation framework?
	     - If locator changes, update only in loginpage class 
	     - Code Reusability 
	   Approaches to create Page Object Model
	     - Using Page Factory (Advance POM)
	     - Without using Page Factory
	     Page factory is a predefined class in selenium to create POM.
	     
	     In every page object class , it contains Constructors, locators and action methods
	     
	     Why Constructor Is Used in LoginPage?

        In POM, we pass the WebDriver from Test class to Page class.

👉      Constructor is used to initialize the driver inside that page class.

       Without constructor, your page class will not know which browser driver to use.
       
       Constructor in POM is used to initialize the WebDriver instance so that the page class methods can interact with browser elements.
	     
	 */
}
