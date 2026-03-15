package SampleProgram;

import java.lang.reflect.Array;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		
		// pre requisite
		// 1. Array should not have duplicate.
		// 2. Array no need to be in sorted order
		// 3. Array should have proper range
		
		int a[]= {1,2,4,5};
		// to find the missing number, first you need to find the sum of elements in array
		// then, find the all the numbers between first and last numbers
		// then, substract sum2-sum1. That is the missing number.
		
		int sum1=0; 
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("Sum of elements in an array" +sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
			
		}
		System.out.println("Sum of range of elements in an array:" +sum2);
		System.out.println("Missing number is"+(sum2-sum1));
		
		


	}

}
