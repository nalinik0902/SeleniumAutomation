package Day27;

public class WebDriverWaitMethods {

	public static void main(String[] args) {
		
		/*
		  synchronization error :
		   when selenium script interacts with webelements before the page or element is fully loaded, synchronization issue occured.
		   
		   1. Nosuchelementexception - Loctor is correct, webpage is not loading ( synchronization error)
		   2. Elementnotfoundexception - Locator is wrong , webpage is working fine
		   In order to avoid this synchronization, we use thread.sleep(5000), Implicitwait and explicitwait.
		   
		   Thread.sleep(5000) is easy to use and has some disadvantage.
		    1. if time is not sufficient it throws an exception
		    2. it will wait till the maximum timeout that we specified eventhough element is found within few seconds 
		    3. we need to mention thread.sleep(5000) multiple times whereever the element has synchronization error.
		    4. It is not recommended to use in automation.
		    
		    
		    
		   
		    
		 */

	}

}
