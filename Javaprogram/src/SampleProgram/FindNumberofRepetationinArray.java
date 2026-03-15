package SampleProgram;

public class FindNumberofRepetationinArray {

	public static void main(String[] args) {
		
		//Find how many duplicates in array
		
		int a[]= {3,4,5,6,3,8,4,2,6,1,6};
		int r=3;   // I want to check how many times the digit 6 is repeated
		int count=0;
		
		/*for(int i=0; i<a.length;i++)
		{
			if(a[i]==r)
			{
				count++;
			}
			
			
		}
		
		System.out.println(count);
		*/
		
		// use enhanced for loop
		for(int x:a)
		{
			if(x==r)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
