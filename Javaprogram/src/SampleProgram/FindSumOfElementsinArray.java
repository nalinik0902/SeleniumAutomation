package SampleProgram;

public class FindSumOfElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mostly we use for loop in array .
		/*
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of array is:" +sum);
		
		*/
		
		// Enhanced FOR Loop
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("The sum of array is:"+sum);
		
	}

}
