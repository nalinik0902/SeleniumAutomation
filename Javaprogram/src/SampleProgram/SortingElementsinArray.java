package SampleProgram;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		
		int a[]= {100,400,200,500,300};
		
		// Use this command to print all the elements in an array and when you do not want to read all the elements.
		// you dont need to to go FOR loop to get all values in array when you just want to print the elemnets.
		System.out.println("Before sorting---------");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);   //sort elements in an array
		
		System.out.println("AFter sorting------");
		System.out.println(Arrays.toString(a));
		
		// sorting strings
		
		String s[]= {"Dan", "Carmen", "Ruth", "Anayda"};
		
		System.out.println("Before sorting---"+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting---"+ Arrays.toString(s));
		
		
							

	}

}
