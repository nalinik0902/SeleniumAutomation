package StringProgram;

public class CheckStringisPalindromeorNot {

	public static void main(String[] args) {
		
		String s="madam";
		String org_string=s;
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			System.out.println(rev);
		
		
	    if(org_string.equals(rev))
	    {
	    	System.out.println(org_string +" is the palindrome string");
	    	
	    }
	    else
	    {
	    	System.out.println(org_string +"is not the palindrome string ");
	    }

	}

}
