package SampleProgram;

public class FindLargestNUmberinArray {

	public static void main(String[] args) {
		
		// To find the maximum value in array
		
		int a[]= {20,40,80,100,150};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("The maximum number is:" +max);

	}

}
