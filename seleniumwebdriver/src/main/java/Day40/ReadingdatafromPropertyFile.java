package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingdatafromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		// pre-requisite - create a file named "config.properties" under Testdata folder.
		// Enter the data in key value format . No datatype, "", . are required . just plain text 
		
		// Location of the propertyfile
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\config.properties");
		
		Properties pf=new Properties();
		// load file, before reading data
		pf.load(fi);
		// read data from property file
		String urllink=pf.getProperty("url");
		String uname=pf.getProperty("username");
		String pwd=pf.getProperty("password");
		String gen=pf.getProperty("gender");
		String age=pf.getProperty("age");		
		
		System.out.println(urllink+" "+uname+" "+pwd+" "+gen+" "+age);
		
		// get only property keys in two ways
		Set<String> keys=pf.stringPropertyNames();
		System.out.println(keys);
		    // or
		Set<Object> allkey=pf.keySet();
		System.out.println(allkey);
		
		// get only values of the key
		Collection<Object> val=pf.values();
		System.out.println(val);
		
		
		
		
		

	}

}
