package Conditionalstatement;

public class PositiveandNegativenumbers {

	public static void main(String[] args) {
		// check the number is positive, negative or zero
		// here, we have multiple conditions so we use else if 
		// postive numbers are greater than zero
		// negative numbers are lesser than zero
		
		
		int num=10;
		if(num>0)
		{
			System.out.println("The number is positive");
			
		}
		else if(num<0)
		{
		  System.out.println("The number is negative");	
		}
		
		else
		{
			System.out.println("The number is Zero");
		}

	}

}
