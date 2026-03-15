package SampleProgram;

public class FIndLowestNumberinArray {

	public static void main(String[] args) {
		// To find the minimum value in array
		
		int a[]= {10,4,12,8,12};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The minimum value in array is:"+ min);

	}

}
