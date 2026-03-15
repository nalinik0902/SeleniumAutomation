package JumpingStatement;

public class Break {

	public static void main(String[] args) {
		// print 1 to 10 numbers.
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)           
			{
				break;          // when i value matches 5 , it will come out of the if block because of break statement
			}                   // output will be 1 ,2,3,4
			
			System.out.println(i);
		}

	}

}
