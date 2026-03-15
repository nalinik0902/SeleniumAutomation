package Day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrokenLinks {

	public static void main(String[] args) {
		
		/*
		  What is Broken link?
		  Ans: A broken link is a link which doesn't have any resource in server.
		  How do you know the resource is not in the server?
		  Ans: Based on the status code . If status code > 400 - Broken link
		  If status code < 400 - Not broken link 
		 */
		/*
		 steps
		 1. Capture all the links in webpage.
		 2. Check href contains URL
		 3. capture the value of the href attrribute and send it to the server and get the status code
		 4. status code > 400 - broken link
		    status code < 400 - not broken link 
		 */
		
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       driver.get("http://www.deadlinkcity.com/");
       
       // Step 1: capture all the links from the webpage
       List<WebElement> links=driver.findElements(By.tagName("a"));
       System.out.println("No of links:"+links.size());
       
       //check href have some value(URL)
       int brokenlinks=0;
       for(WebElement link:links) {
    	   String hrefvalue=link.getAttribute("href"); // this will return string type data
    	   
    	   if(hrefvalue==null || hrefvalue.isEmpty()) {
    		   System.out.println("HREF is null or empty so not possible to check");
    		   continue; // it will skip the current value 
    	   }
    		   
    		// hit the url to the server
    		// hrefvalue is in string format . we need to change it to URlOBJECT
    		   try {
    		   URL linkurl=new URL(hrefvalue);
    		   HttpURLConnection connectionlink=(HttpURLConnection) linkurl.openConnection(); // open connection to the server
    		   connectionlink.connect();// connect to the server and send the request
    		   int responsecode=connectionlink.getResponseCode(); // this may return exception so put in try and catch block
    		   if(responsecode>=400) {
    			   System.out.println(hrefvalue+"=======>It's a broken link");
    			   brokenlinks++;
    		   }
    		   else
    			   {
    				   System.out.println(hrefvalue+"======>It's not a broken link");
    			   }
    		   }
    	   
    	   catch(Exception e) {
    		   
    	   }
    		  
       }	
       System.out.println("No of broken links"+brokenlinks);
    	   
    		   
    		   
    		   
	}
}

       
       
                                                                                                                                              	


