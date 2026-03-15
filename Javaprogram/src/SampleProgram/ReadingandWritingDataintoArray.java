package SampleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingDataintoArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];  // I want to write five elements into the array
		
		Scanner sc=new Scanner(System.in); // Taking input at runtime
		// INstead of printing syso for 5 times to take value of the array, using for loop 
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a value for the position:"+i);
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array elements:"+Arrays.toString(a));

	}

}
