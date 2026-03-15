package SampleProgram;

public class Reversethenumber {

	public static void main(String[] args) {
		
		int number=1234;
		int rev=0;
		
		while(number!=0)
		{
			rev=rev*10 + number%10;   // this will extract the last digit number
			number=number/10;         // this will remove the last digit 
			
		}
		System.out.println("The reverse number is:" +rev);  // it will print the number 4321

	}

}
