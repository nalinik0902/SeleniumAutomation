package StringProgram;

public class ReversetheString {

	public static void main(String[] args) {
		
		// Reverse the string
		// Approach 1 -  using length(), charAt() - string methods
		
		String s= "welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
			 
		}
		System.out.println(rev);
		
		// Approach 2 - converting string into Char type array
		
		String x="Morning";
		String rev1="";
		
		char a[]=x.toCharArray(); // converting string to array format
		
		for(int i=a.length-1;i>=0;i--) // reading values from last value of the array 
		{
			rev1=rev1+a[i];
		}
		System.out.println("The reverse string is:"+rev1);
		
		
		// Approach 3 - using StringBuilder/string buffer - 
		// reverse() method is available only in stringbuilder and stringbuffer class not in normal string class
		StringBuilder z=new StringBuilder("welcome");
		System.out.println(z.reverse());
		
		StringBuffer c=new StringBuffer("hello");
		System.out.println(c.reverse());
		
		// String is immutable in java(we cannot change the existing value)  wherein stringbuilder/stringbuffer is mutable(we can change)
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
