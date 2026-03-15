package StringMethods;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class Stringmethods {

	public static void main(java.lang.String[] args) {
		
		// String Methods
		
		// 1.length();  - to get the length of the string
	
		String s="Welcome";
		System.out.println(s.length());
		
		// 2. Concat() - will join only two strings at a time
		String s1="Hello";
		String s2="GoodMorning";
		//String s3=s1.concat(s2);
		//System.out.println(s3);
		//   or
		System.out.println(s1.concat(s2));
		
		// If you want to join three strings.
		String x="Good";
		String y="Evening";
		String Z="Zoho";
		System.out.println(x.concat(y).concat(Z));
		System.out.println("Welcome".concat("Chennai")); // you can concat without using variable 
		
		// If use + operator in between two strings , it will concat.
		// If use + operator in between two numbers, it will add
		
		// 3.trim()  - reduce spaces right side and left side
		s="  wonder  ";
		System.out.println(s);
		System.out.println("Before trimmin the length is:"+s.length());
		System.out.println(s.trim());
		System.out.println("After trimming the length is:"+s.trim().length());
		
		//4. charAt() - returns a character from the string based on index.
		s="welcome";
		System.out.println(s.charAt(3));
		
		//5. contains() - always returns true/false. sting values are case sensitive because it will treat uppercase and lower case diiferently
		// just check string value is part of the main string;
		
		s="welcome";
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Wel")); // beacuse here 'W' is uppercase.
		System.out.println(s.contains("Come"));// because here 'C' is uppercase
		
		//6. equals() , equalsIgnoreCase()   -  both are used to compare the strings.
		// equals() - are case sensitive , returns true/false
		s1="chennai";
		s2="chennai";
		System.out.println(s1.equals(s2));
		// equalsignorecase() - not case sensitive. returns true/false.
		s1="Chennai";
		s2="chennai";
		System.out.println(s1.equalsIgnoreCase(s2)); // it wil accept upper/lower case
		
		// 7. replace() - used to replace single or (multiple) sequence of characters in the string;
		s1="welcome to java course and java related course and welcome";
		System.out.println(s1.replace('w', 'p'));
		System.out.println(s1.replace("java", "javascript"));
		
		
		// 8.substring() - extract substring from the main string
		// starting index count from 0;
		// ending index count from 1;
		
		s="Selenium";
		System.out.println(s.substring(2,8)); 
		
		// 9. toUpperCase() toLowerCase()
		s1="Beautiful";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		// 10. split() - split the strings into multiple parts based on delimeter.
		
		    s1="abc@gmail.com";
		        String a[]=s1.split("@");
		        System.out.println(a[0]);
		        System.out.println(a[1]);
		        System.out.println(Arrays.toString(a));
		
		//  Example 1
		        
		        s="$15,46,12";
		        // I want to print this as 154612 . what method should we use?
		        System.out.println(s.replace("$","").replace(",", ""));
		        // Here, we use ""- double quotation because empty "" quotation not allowing single quotation
		        
	   // Example 2
		        
		        s="abc,123@xyz";
		        String arr[]=s.split(",");
		        System.out.println(Arrays.toString(arr)); // abc  123@xyz
		        String arq[]=arr[1].split("@"); 
		        System.out.println(Arrays.toString(arq));  // 123  xyz
		        System.out.println(arr[0]);
		        System.out.println(arq[0]);
		        System.out.println(arq[1]);
		        
	// Example 3
		        // which cannot use as delimeter
		        // * , % , ^ , & , ( )
		        
		        s="abc xyz pqr";
		        // here space is delimeter
		        String ax[]=s.split(" "); 
		        System.out.println(Arrays.toString(ax));
		        
   // EXample 4
		        String name="John Kennedy";
		        // I want to check string is part of the main string
		        System.out.println(name.contains("John"));
		        // what if i dont want to change lower case john 
		        System.out.println(name.replace('J','j').contains("john"));
		        System.out.println(name.toLowerCase().contains("john"));
		        
		        
		        
		    
		    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
				
		
		
		
		
		
		

	}

}
