package Loopingstatement;

public class WhileLoop {

	public static void main(String[] args) {
		
		// Loop statement means statement can be repeated multiple times based upon the condition
		// 1. Initialization, (where to start)
		//   2. Condition , (How many times to repeat)
		//   3. Increment/De(crement  
		
		// While loop syntax
		/*
		Initilization
		while(condition)
		{
			statement
			incre/decrement
		}
		*/
		
		// print 1 to 10
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			
		}
		*/
		
		// print Hello messages 10 times
		
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
			 
		}
		*/
		
		// print even number from 1 to 10
		
		/*
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		*/
		
		// print number from 1 to 10 and find even and print only the even number
		/*
		int i=1;
		while(i<=10) {   // while block can have if condition
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
		*/
		
		// print number from 1 to 10 and print along with odd or even statement
		/*
		int i=1;
		while(i<=10) {
			if(i%2==0)
			{
				System.out.println(i + "is the even number");
			}
			else 
			{
				System.out.println(i + "is the odd number");
			}
			
			i++;
		}
		
		*/
		
		// print 10 to 1
		
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		
		
		
		

	}

}
