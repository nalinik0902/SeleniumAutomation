package SampleProgram;

public class NumberOfEvenandOddDigitsinNumber {

	public static void main(String[] args) {
		
		int number=12345;
		int even_count=0;
		int odd_count=0;
		
		while(number>0)
		{
			int rem=number%10; // extract last digit
			if(rem%2==0)      // chck the last digit divible by 2 and returns zero
			{
 				even_count++;
			}
			else
			{
				odd_count++;
				
			}
			
			number=number/10;
			
		}
		
		System.out.println("The even number count is:" +even_count);
        System.out.println("The odd number count is:" +odd_count);
	}

}
