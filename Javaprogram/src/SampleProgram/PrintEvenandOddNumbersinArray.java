package SampleProgram;

public class PrintEvenandOddNumbersinArray {

	public static void main(String[] args) {
		
		
		/*int a[]= {3,2,6,5,8,7};
		
		System.out.println("The even numbers in array are-----------");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			
				System.out.println(a[i]);
			}
		}
		System.out.println("The odd numbers in array are-------------");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2!=0)
        	{
        	
        		System.out.println(a[i]);
        	}
        }
        */
		//using enhance for loop
		int a[]= {3,6,8,4,1,2};
		System.out.println("Even numbers in array-------");
		for(int x:a)
		{
			if(x%2==0)
			{
				System.out.println(x);
			}
		}
		System.out.println("Odd numbers in array --------");
		for(int x:a)
		{
			if(x%2!=0)
			{
				System.out.println(x);
			}
		}
		
	}

}
