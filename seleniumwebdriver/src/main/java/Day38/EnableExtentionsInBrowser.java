package Day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtentionsInBrowser {

	public static void main(String[] args) {
		/*
		 Normally when we open the browser through automation, all extentions will be disabled.
		 But, when you open it manually, you can see all the extentions
		 My requirement is to see all the extentions in the browser at run time 
		 we need to follow four steps
		 1. Add CRX extractor plugin to the chromebrowser (Manually)
		 2. Add your extention like (selection hub or any extention ) to the chrome browser (Manually)
		 3. Capture CRX file for the extention you want to enable in the browser at run time .	
		 4. Pass CRX file path in automation script in chrome options. 
		 
		 why we need CRX extractor plugin
		 This CRX extractor plugin is used to extract CRX file for any extentions.
		 you can download CRX extractor and selector hub  from Chrome web store and add to the extention
		 	 
		 */
		ChromeOptions options =new ChromeOptions();
		File file=new File("C:\\Users\\Madhu\\Documents\\crx\\SelectorsHub-Chrome-Web-Store (1).crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
	
		

	}

}
