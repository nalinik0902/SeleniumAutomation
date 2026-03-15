package SampleProgram;

import java.util.Arrays;

public class PrintingArraysinReverseOrder {

	public static void main(String[] args) {
		
		// Print array elements in reverse order
		
		int a[]= {100,200,300,400,500};
		
		for(int i=a.length-1; i>=0; i--) // staring from 500 
		{
			System.out.println(a[i]);
		}

	}

}
