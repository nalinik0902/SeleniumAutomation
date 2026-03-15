package SampleProgram;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		
		// palindrome number is the number which remains the name when the digits are reversed.
		
		int num=34513;
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println(org_num + "is palindrome number");
		}
		else
		{
			System.out.println(org_num + "is not palindrome number");
		}
		

		
	}

}
