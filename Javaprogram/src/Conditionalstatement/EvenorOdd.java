package Conditionalstatement;

public class EvenorOdd {

	public static void main(String[] args) {
	// Finding even or odd 
	// Even numbers are divible by 2 and returns zero as reminder 
	// Here we are using modular division because it gives reminder value	
		int num=13;
		if(num%2==0)  // this is the condition for finding odd or even
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}
