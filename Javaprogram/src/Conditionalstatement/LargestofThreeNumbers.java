package Conditionalstatement;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		// Find the largest of three numbers - to find the largest number fisrt we need to compare one number with other two numbers
		// Here we use Logical operator && 
		
		/*int a=30, b=100, c=20;
		
		if(a>b && a>c)
		{
			System.out.println("A is the largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is the largest number");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is the largest number");
		}
	}*/
		
		
		
		// Largest of two numbers using tenary operator
		
		int a=30, b=20;
		
		int largest=(a>b) ? a : b;
		System.out.println("The largest number is:" +largest);

}
}
