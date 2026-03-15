package Programme;

public class CheckPrimeNumberorNot {

	public static void main(String[] args) {
		
		// Prime number has two condition
		// 1. NUmber should be greater than 1
		// 2. number is divisible by 1 and number itself
		
		int num=4;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
	          System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		
				
	
		}
	  else 
	    {
		System.out.println("The number is not prime number");
		}
	}
}

	


